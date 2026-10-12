// One-off tool: rebuild the testtube texture at 16x16 with a transparent
// background, then emit one copy per potion effect with a recoloured liquid.
// Run from the project root with:
//   "C:/Program Files/nodejs/node.exe" tools/make_testtubes.js
const fs = require("fs");
const zlib = require("zlib");
const path = require("path");

const DIR = "src/main/resources/assets/morefood/textures/item";
const SRC = path.join(DIR, "testtube_source.png");
const SIZE = 16;

// ---- PNG decode -----------------------------------------------------------
function decode(file) {
  const b = fs.readFileSync(file);
  let off = 8, W, H, ct, idat = [];
  while (off < b.length) {
    const len = b.readUInt32BE(off);
    const type = b.toString("ascii", off + 4, off + 8);
    const d = b.slice(off + 8, off + 8 + len);
    if (type === "IHDR") { W = d.readUInt32BE(0); H = d.readUInt32BE(4); ct = d[9]; }
    if (type === "IDAT") idat.push(d);
    if (type === "IEND") break;
    off += 12 + len;
  }
  const raw = zlib.inflateSync(Buffer.concat(idat));
  const ch = ct === 6 ? 4 : ct === 2 ? 3 : 0;
  if (!ch) throw new Error("unsupported colour type " + ct);
  const stride = W * ch, out = Buffer.alloc(H * stride);
  let p = 0;
  for (let y = 0; y < H; y++) {
    const f = raw[p++];
    for (let x = 0; x < stride; x++) {
      const rv = raw[p++];
      const a = x >= ch ? out[y * stride + x - ch] : 0;
      const bb = y > 0 ? out[(y - 1) * stride + x] : 0;
      const c = x >= ch && y > 0 ? out[(y - 1) * stride + x - ch] : 0;
      let v;
      switch (f) {
        case 0: v = rv; break;
        case 1: v = rv + a; break;
        case 2: v = rv + bb; break;
        case 3: v = rv + ((a + bb) >> 1); break;
        case 4: {
          const pa = Math.abs(bb - c), pb = Math.abs(a - c), pc = Math.abs(a + bb - 2 * c);
          v = rv + (pa <= pb && pa <= pc ? a : pb <= pc ? bb : c);
          break;
        }
        default: throw new Error("filter " + f);
      }
      out[y * stride + x] = v & 255;
    }
  }
  return { W, H, ch, stride, px: (x, y) => {
    const i = y * stride + x * ch;
    return [out[i], out[i + 1], out[i + 2], ch === 4 ? out[i + 3] : 255];
  }};
}

// ---- PNG encode -----------------------------------------------------------
function crc32(buf) {
  let c, table = [];
  for (let n = 0; n < 256; n++) {
    c = n;
    for (let k = 0; k < 8; k++) c = c & 1 ? 0xedb88320 ^ (c >>> 1) : c >>> 1;
    table[n] = c >>> 0;
  }
  let crc = 0xffffffff;
  for (const byte of buf) crc = table[(crc ^ byte) & 255] ^ (crc >>> 8);
  return (crc ^ 0xffffffff) >>> 0;
}
function chunk(type, data) {
  const len = Buffer.alloc(4); len.writeUInt32BE(data.length);
  const td = Buffer.concat([Buffer.from(type, "ascii"), data]);
  const crc = Buffer.alloc(4); crc.writeUInt32BE(crc32(td));
  return Buffer.concat([len, td, crc]);
}
function encode(W, H, rgba) {
  const ihdr = Buffer.alloc(13);
  ihdr.writeUInt32BE(W, 0); ihdr.writeUInt32BE(H, 4);
  ihdr[8] = 8; ihdr[9] = 6; ihdr[10] = 0; ihdr[11] = 0; ihdr[12] = 0;
  const stride = W * 4;
  const raw = Buffer.alloc(H * (stride + 1));
  for (let y = 0; y < H; y++) {
    raw[y * (stride + 1)] = 0; // filter none
    rgba.copy(raw, y * (stride + 1) + 1, y * stride, (y + 1) * stride);
  }
  return Buffer.concat([
    Buffer.from([0x89, 0x50, 0x4e, 0x47, 0x0d, 0x0a, 0x1a, 0x0a]),
    chunk("IHDR", ihdr),
    chunk("IDAT", zlib.deflateSync(raw, { level: 9 })),
    chunk("IEND", Buffer.alloc(0)),
  ]);
}

// ---- build the 16x16 base sprite -----------------------------------------
const src = decode(SRC);

// Tube geometry measured from the source (see notes in the repo history).
const TUBE = { x0: 389, x1: 634, y0: 246, y1: 870 };
const tw = TUBE.x1 - TUBE.x0 + 1;
const th = TUBE.y1 - TUBE.y0 + 1;

// The tube is tall and narrow. Fit it into 16x16 preserving aspect, centring.
const scale = Math.min(SIZE / tw, SIZE / th);
const outW = Math.max(1, Math.round(tw * scale));
const outH = Math.max(1, Math.round(th * scale));
const offX = Math.floor((SIZE - outW) / 2);
const offY = Math.floor((SIZE - outH) / 2);

const base = Buffer.alloc(SIZE * SIZE * 4, 0); // transparent

// For each destination pixel, sample the source region it covers (box average).
for (let dy = 0; dy < outH; dy++) {
  for (let dx = 0; dx < outW; dx++) {
    const sx0 = TUBE.x0 + Math.floor((dx * tw) / outW);
    const sx1 = TUBE.x0 + Math.floor(((dx + 1) * tw) / outW);
    const sy0 = TUBE.y0 + Math.floor((dy * th) / outH);
    const sy1 = TUBE.y0 + Math.floor(((dy + 1) * th) / outH);
    let r = 0, g = 0, b = 0, n = 0, liquid = 0;
    for (let y = sy0; y < sy1; y++) {
      for (let x = sx0; x < sx1; x++) {
        const [pr, pg, pb] = src.px(x, y);
        r += pr; g += pg; b += pb; n++;
        if (pb - pr > 8) liquid++; // blue-ish => the liquid
      }
    }
    if (!n) continue;
    r /= n; g /= n; b /= n;
    const lum = (r + g + b) / 3;
    // Anything lighter than the outline that is not liquid is background:
    // the tube wall reads ~198, same as the checkerboard, so only the dark
    // outline and the blue liquid are kept.
    const isOutline = lum < 150;
    const isLiquid = liquid / n > 0.35;
    if (!isOutline && !isLiquid) continue;
    const i = ((offY + dy) * SIZE + (offX + dx)) * 4;
    base[i] = Math.round(r); base[i + 1] = Math.round(g); base[i + 2] = Math.round(b); base[i + 3] = 255;
  }
}

// ---- per-effect liquid colours -------------------------------------------
// [name, [r,g,b], how strongly to blend over the original liquid]
const EFFECTS = [
  ["awkwardness",  [122, 128, 132]],
  ["mundanity",    [150, 150, 150]],
  ["density",      [ 74,  86, 104]],
  ["weakness",     [140, 150,  74]],
  ["healing",      [255, 132, 196]],
  ["regeneration", [226, 104, 200]],
  ["strength",     [176,  42,  42]],
  ["swiftness",    [ 86, 206, 232]],
  ["leaping",      [140, 226, 132]],
  ["fire_resistance", [244, 140,  54]],
  ["water_breathing", [ 46,  94, 206]],
  ["night_vision", [216, 176,  56]],
  ["invisibility", [226, 240, 246]],
  ["slow_falling", [162, 206, 236]],
  ["the_turtle_master", [ 56, 178, 168]],
  ["poison",       [ 92, 196,  62]],
  ["harming",      [128,  32,  56]],
  ["slowness",     [136, 118, 104]],
  ["wind_charging", [222, 238, 252]],
  ["oozing",       [158, 226,  74]],
  ["weaving",      [136, 120, 176]],
  ["infestation",  [204, 190,  92]],
];

function tint(buf, rgb) {
  const out = Buffer.from(buf);
  for (let i = 0; i < SIZE * SIZE; i++) {
    const o = i * 4;
    if (!out[o + 3]) continue;
    const r = out[o], g = out[o + 1], b = out[o + 2];
    if (b - r <= 8) continue; // not liquid -> keep outline/highlight
    // keep the shading: multiply the effect colour by the pixel's brightness
    const lum = (r + g + b) / 3 / 200;
    out[o]     = Math.min(255, Math.round(rgb[0] * lum));
    out[o + 1] = Math.min(255, Math.round(rgb[1] * lum));
    out[o + 2] = Math.min(255, Math.round(rgb[2] * lum));
  }
  return out;
}

// ---- write -----------------------------------------------------------------
fs.writeFileSync(path.join(DIR, "testtube.png"), encode(SIZE, SIZE, base));
let made = 0;
for (const [name, rgb] of EFFECTS) {
  const tinted = tint(base, rgb);
  fs.writeFileSync(path.join(DIR, `testtube_of_${name}.png`), encode(SIZE, SIZE, tinted));
  made++;
}
console.log("wrote testtube.png (16x16, transparent)");
console.log("wrote", made, "effect variants");
