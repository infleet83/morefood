package name.modid.Datagen;

import name.modid.Item.ModItem;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        // Testtubes keep their own texture: one model per testtube.
        itemModelGenerators.generateFlatItem(ModItem.Testtube, ModelTemplates.FLAT_ITEM);


        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfDensity, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfWeakness, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfHealing, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfRegeneration, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfStrength, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfSwiftness, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfLeaping, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfFireResistance, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfWaterBreathing, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfNightVision, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfInvisibility, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfSlowFalling, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfTheTurtleMaster, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfPoison, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfHarming, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfSlowness, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfWindCharging, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfOozing, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfWeaving, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItem.TesttubeOfInfestation, ModelTemplates.FLAT_ITEM);

        copyBase(itemModelGenerators, Base.COOKED_CHICKEN, ModItem.CookedChickenWithWeakness,
                ModItem.CookedChickenWithHealing, ModItem.CookedChickenWithRegeneration,
                ModItem.CookedChickenWithStrength, ModItem.CookedChickenWithSwiftness,
                ModItem.CookedChickenWithLeaping, ModItem.CookedChickenWithFireResistance,
                ModItem.CookedChickenWithWaterBreathing, ModItem.CookedChickenWithNightVision,
                ModItem.CookedChickenWithInvisibility, ModItem.CookedChickenWithSlowFalling,
                ModItem.CookedChickenWithTheTurtleMaster, ModItem.CookedChickenWithPoison,
                ModItem.CookedChickenWithHarming, ModItem.CookedChickenWithSlowness,
                ModItem.CookedChickenWithWindCharging, ModItem.CookedChickenWithOozing,
                ModItem.CookedChickenWithWeaving, ModItem.CookedChickenWithInfestation);

        copyBase(itemModelGenerators, Base.COOKED_MUTTON, ModItem.CookedMuttonWithWeakness,
                ModItem.CookedMuttonWithHealing, ModItem.CookedMuttonWithRegeneration,
                ModItem.CookedMuttonWithStrength, ModItem.CookedMuttonWithSwiftness,
                ModItem.CookedMuttonWithLeaping, ModItem.CookedMuttonWithFireResistance,
                ModItem.CookedMuttonWithWaterBreathing, ModItem.CookedMuttonWithNightVision,
                ModItem.CookedMuttonWithInvisibility, ModItem.CookedMuttonWithSlowFalling,
                ModItem.CookedMuttonWithTheTurtleMaster, ModItem.CookedMuttonWithPoison,
                ModItem.CookedMuttonWithHarming, ModItem.CookedMuttonWithSlowness,
                ModItem.CookedMuttonWithWindCharging, ModItem.CookedMuttonWithOozing,
                ModItem.CookedMuttonWithWeaving, ModItem.CookedMuttonWithInfestation);

        copyBase(itemModelGenerators, Base.COOKED_PORKCHOP, ModItem.CookedPorkchopWithWeakness,
                ModItem.CookedPorkchopWithHealing, ModItem.CookedPorkchopWithRegeneration,
                ModItem.CookedPorkchopWithStrength, ModItem.CookedPorkchopWithSwiftness,
                ModItem.CookedPorkchopWithLeaping, ModItem.CookedPorkchopWithFireResistance,
                ModItem.CookedPorkchopWithWaterBreathing, ModItem.CookedPorkchopWithNightVision,
                ModItem.CookedPorkchopWithInvisibility, ModItem.CookedPorkchopWithSlowFalling,
                ModItem.CookedPorkchopWithTheTurtleMaster, ModItem.CookedPorkchopWithPoison,
                ModItem.CookedPorkchopWithHarming, ModItem.CookedPorkchopWithSlowness,
                ModItem.CookedPorkchopWithWindCharging, ModItem.CookedPorkchopWithOozing,
                ModItem.CookedPorkchopWithWeaving, ModItem.CookedPorkchopWithInfestation);

        copyBase(itemModelGenerators, Base.COOKED_BEEF, ModItem.CookedBeefWithWeakness,
                ModItem.CookedBeefWithHealing, ModItem.CookedBeefWithRegeneration,
                ModItem.CookedBeefWithStrength, ModItem.CookedBeefWithSwiftness,
                ModItem.CookedBeefWithLeaping, ModItem.CookedBeefWithFireResistance,
                ModItem.CookedBeefWithWaterBreathing, ModItem.CookedBeefWithNightVision,
                ModItem.CookedBeefWithInvisibility, ModItem.CookedBeefWithSlowFalling,
                ModItem.CookedBeefWithTheTurtleMaster, ModItem.CookedBeefWithPoison,
                ModItem.CookedBeefWithHarming, ModItem.CookedBeefWithSlowness,
                ModItem.CookedBeefWithWindCharging, ModItem.CookedBeefWithOozing,
                ModItem.CookedBeefWithWeaving, ModItem.CookedBeefWithInfestation);

        copyBase(itemModelGenerators, Base.COOKED_RABBIT, ModItem.CookedRabbitWithWeakness,
                ModItem.CookedRabbitWithHealing, ModItem.CookedRabbitWithRegeneration,
                ModItem.CookedRabbitWithStrength, ModItem.CookedRabbitWithSwiftness,
                ModItem.CookedRabbitWithLeaping, ModItem.CookedRabbitWithFireResistance,
                ModItem.CookedRabbitWithWaterBreathing, ModItem.CookedRabbitWithNightVision,
                ModItem.CookedRabbitWithInvisibility, ModItem.CookedRabbitWithSlowFalling,
                ModItem.CookedRabbitWithTheTurtleMaster, ModItem.CookedRabbitWithPoison,
                ModItem.CookedRabbitWithHarming, ModItem.CookedRabbitWithSlowness,
                ModItem.CookedRabbitWithWindCharging, ModItem.CookedRabbitWithOozing,
                ModItem.CookedRabbitWithWeaving, ModItem.CookedRabbitWithInfestation);

        copyBase(itemModelGenerators, Base.COOKED_COD, ModItem.CookedCodWithWeakness,
                ModItem.CookedCodWithHealing, ModItem.CookedCodWithRegeneration,
                ModItem.CookedCodWithStrength, ModItem.CookedCodWithSwiftness,
                ModItem.CookedCodWithLeaping, ModItem.CookedCodWithFireResistance,
                ModItem.CookedCodWithWaterBreathing, ModItem.CookedCodWithNightVision,
                ModItem.CookedCodWithInvisibility, ModItem.CookedCodWithSlowFalling,
                ModItem.CookedCodWithTheTurtleMaster, ModItem.CookedCodWithPoison,
                ModItem.CookedCodWithHarming, ModItem.CookedCodWithSlowness,
                ModItem.CookedCodWithWindCharging, ModItem.CookedCodWithOozing,
                ModItem.CookedCodWithWeaving, ModItem.CookedCodWithInfestation);

        copyBase(itemModelGenerators, Base.COOKED_SALMON, ModItem.CookedSalmonWithWeakness,
                ModItem.CookedSalmonWithHealing, ModItem.CookedSalmonWithRegeneration,
                ModItem.CookedSalmonWithStrength, ModItem.CookedSalmonWithSwiftness,
                ModItem.CookedSalmonWithLeaping, ModItem.CookedSalmonWithFireResistance,
                ModItem.CookedSalmonWithWaterBreathing, ModItem.CookedSalmonWithNightVision,
                ModItem.CookedSalmonWithInvisibility, ModItem.CookedSalmonWithSlowFalling,
                ModItem.CookedSalmonWithTheTurtleMaster, ModItem.CookedSalmonWithPoison,
                ModItem.CookedSalmonWithHarming, ModItem.CookedSalmonWithSlowness,
                ModItem.CookedSalmonWithWindCharging, ModItem.CookedSalmonWithOozing,
                ModItem.CookedSalmonWithWeaving, ModItem.CookedSalmonWithInfestation);

        copyBase(itemModelGenerators, Base.APPLE, ModItem.AppleWithWeakness,
                ModItem.AppleWithHealing, ModItem.AppleWithRegeneration,
                ModItem.AppleWithStrength, ModItem.AppleWithSwiftness,
                ModItem.AppleWithLeaping, ModItem.AppleWithFireResistance,
                ModItem.AppleWithWaterBreathing, ModItem.AppleWithNightVision,
                ModItem.AppleWithInvisibility, ModItem.AppleWithSlowFalling,
                ModItem.AppleWithTheTurtleMaster, ModItem.AppleWithPoison,
                ModItem.AppleWithHarming, ModItem.AppleWithSlowness,
                ModItem.AppleWithWindCharging, ModItem.AppleWithOozing,
                ModItem.AppleWithWeaving, ModItem.AppleWithInfestation);

        copyBase(itemModelGenerators, Base.SWEET_BERRIES, ModItem.SweetBerriesWithWeakness,
                ModItem.SweetBerriesWithHealing, ModItem.SweetBerriesWithRegeneration,
                ModItem.SweetBerriesWithStrength, ModItem.SweetBerriesWithSwiftness,
                ModItem.SweetBerriesWithLeaping, ModItem.SweetBerriesWithFireResistance,
                ModItem.SweetBerriesWithWaterBreathing, ModItem.SweetBerriesWithNightVision,
                ModItem.SweetBerriesWithInvisibility, ModItem.SweetBerriesWithSlowFalling,
                ModItem.SweetBerriesWithTheTurtleMaster, ModItem.SweetBerriesWithPoison,
                ModItem.SweetBerriesWithHarming, ModItem.SweetBerriesWithSlowness,
                ModItem.SweetBerriesWithWindCharging, ModItem.SweetBerriesWithOozing,
                ModItem.SweetBerriesWithWeaving, ModItem.SweetBerriesWithInfestation);

        copyBase(itemModelGenerators, Base.GLOW_BERRIES, ModItem.GlowBerriesWithWeakness,
                ModItem.GlowBerriesWithHealing, ModItem.GlowBerriesWithRegeneration,
                ModItem.GlowBerriesWithStrength, ModItem.GlowBerriesWithSwiftness,
                ModItem.GlowBerriesWithLeaping, ModItem.GlowBerriesWithFireResistance,
                ModItem.GlowBerriesWithWaterBreathing, ModItem.GlowBerriesWithNightVision,
                ModItem.GlowBerriesWithInvisibility, ModItem.GlowBerriesWithSlowFalling,
                ModItem.GlowBerriesWithTheTurtleMaster, ModItem.GlowBerriesWithPoison,
                ModItem.GlowBerriesWithHarming, ModItem.GlowBerriesWithSlowness,
                ModItem.GlowBerriesWithWindCharging, ModItem.GlowBerriesWithOozing,
                ModItem.GlowBerriesWithWeaving, ModItem.GlowBerriesWithInfestation);

        copyBase(itemModelGenerators, Base.MELON_SLICE, ModItem.MelonSliceWithWeakness,
                ModItem.MelonSliceWithHealing, ModItem.MelonSliceWithRegeneration,
                ModItem.MelonSliceWithStrength, ModItem.MelonSliceWithSwiftness,
                ModItem.MelonSliceWithLeaping, ModItem.MelonSliceWithFireResistance,
                ModItem.MelonSliceWithWaterBreathing, ModItem.MelonSliceWithNightVision,
                ModItem.MelonSliceWithInvisibility, ModItem.MelonSliceWithSlowFalling,
                ModItem.MelonSliceWithTheTurtleMaster, ModItem.MelonSliceWithPoison,
                ModItem.MelonSliceWithHarming, ModItem.MelonSliceWithSlowness,
                ModItem.MelonSliceWithWindCharging, ModItem.MelonSliceWithOozing,
                ModItem.MelonSliceWithWeaving, ModItem.MelonSliceWithInfestation);

        copyBase(itemModelGenerators, Base.CARROT, ModItem.CarrotWithWeakness,
                ModItem.CarrotWithHealing, ModItem.CarrotWithRegeneration,
                ModItem.CarrotWithStrength, ModItem.CarrotWithSwiftness,
                ModItem.CarrotWithLeaping, ModItem.CarrotWithFireResistance,
                ModItem.CarrotWithWaterBreathing, ModItem.CarrotWithNightVision,
                ModItem.CarrotWithInvisibility, ModItem.CarrotWithSlowFalling,
                ModItem.CarrotWithTheTurtleMaster, ModItem.CarrotWithPoison,
                ModItem.CarrotWithHarming, ModItem.CarrotWithSlowness,
                ModItem.CarrotWithWindCharging, ModItem.CarrotWithOozing,
                ModItem.CarrotWithWeaving, ModItem.CarrotWithInfestation);

        copyBase(itemModelGenerators, Base.POTATO, ModItem.PotatoWithWeakness,
                ModItem.PotatoWithHealing, ModItem.PotatoWithRegeneration,
                ModItem.PotatoWithStrength, ModItem.PotatoWithSwiftness,
                ModItem.PotatoWithLeaping, ModItem.PotatoWithFireResistance,
                ModItem.PotatoWithWaterBreathing, ModItem.PotatoWithNightVision,
                ModItem.PotatoWithInvisibility, ModItem.PotatoWithSlowFalling,
                ModItem.PotatoWithTheTurtleMaster, ModItem.PotatoWithPoison,
                ModItem.PotatoWithHarming, ModItem.PotatoWithSlowness,
                ModItem.PotatoWithWindCharging, ModItem.PotatoWithOozing,
                ModItem.PotatoWithWeaving, ModItem.PotatoWithInfestation);

        copyBase(itemModelGenerators, Base.BAKED_POTATO, ModItem.BakedPotatoWithWeakness,
                ModItem.BakedPotatoWithHealing, ModItem.BakedPotatoWithRegeneration,
                ModItem.BakedPotatoWithStrength, ModItem.BakedPotatoWithSwiftness,
                ModItem.BakedPotatoWithLeaping, ModItem.BakedPotatoWithFireResistance,
                ModItem.BakedPotatoWithWaterBreathing, ModItem.BakedPotatoWithNightVision,
                ModItem.BakedPotatoWithInvisibility, ModItem.BakedPotatoWithSlowFalling,
                ModItem.BakedPotatoWithTheTurtleMaster, ModItem.BakedPotatoWithPoison,
                ModItem.BakedPotatoWithHarming, ModItem.BakedPotatoWithSlowness,
                ModItem.BakedPotatoWithWindCharging, ModItem.BakedPotatoWithOozing,
                ModItem.BakedPotatoWithWeaving, ModItem.BakedPotatoWithInfestation);

        copyBase(itemModelGenerators, Base.BEETROOT, ModItem.BeetrootWithWeakness,
                ModItem.BeetrootWithHealing, ModItem.BeetrootWithRegeneration,
                ModItem.BeetrootWithStrength, ModItem.BeetrootWithSwiftness,
                ModItem.BeetrootWithLeaping, ModItem.BeetrootWithFireResistance,
                ModItem.BeetrootWithWaterBreathing, ModItem.BeetrootWithNightVision,
                ModItem.BeetrootWithInvisibility, ModItem.BeetrootWithSlowFalling,
                ModItem.BeetrootWithTheTurtleMaster, ModItem.BeetrootWithPoison,
                ModItem.BeetrootWithHarming, ModItem.BeetrootWithSlowness,
                ModItem.BeetrootWithWindCharging, ModItem.BeetrootWithOozing,
                ModItem.BeetrootWithWeaving, ModItem.BeetrootWithInfestation);

        copyBase(itemModelGenerators, Base.DRIED_KELP, ModItem.DriedKelpWithWeakness,
                ModItem.DriedKelpWithHealing, ModItem.DriedKelpWithRegeneration,
                ModItem.DriedKelpWithStrength, ModItem.DriedKelpWithSwiftness,
                ModItem.DriedKelpWithLeaping, ModItem.DriedKelpWithFireResistance,
                ModItem.DriedKelpWithWaterBreathing, ModItem.DriedKelpWithNightVision,
                ModItem.DriedKelpWithInvisibility, ModItem.DriedKelpWithSlowFalling,
                ModItem.DriedKelpWithTheTurtleMaster, ModItem.DriedKelpWithPoison,
                ModItem.DriedKelpWithHarming, ModItem.DriedKelpWithSlowness,
                ModItem.DriedKelpWithWindCharging, ModItem.DriedKelpWithOozing,
                ModItem.DriedKelpWithWeaving, ModItem.DriedKelpWithInfestation);

        copyBase(itemModelGenerators, Base.BREAD, ModItem.BreadWithWeakness,
                ModItem.BreadWithHealing, ModItem.BreadWithRegeneration,
                ModItem.BreadWithStrength, ModItem.BreadWithSwiftness,
                ModItem.BreadWithLeaping, ModItem.BreadWithFireResistance,
                ModItem.BreadWithWaterBreathing, ModItem.BreadWithNightVision,
                ModItem.BreadWithInvisibility, ModItem.BreadWithSlowFalling,
                ModItem.BreadWithTheTurtleMaster, ModItem.BreadWithPoison,
                ModItem.BreadWithHarming, ModItem.BreadWithSlowness,
                ModItem.BreadWithWindCharging, ModItem.BreadWithOozing,
                ModItem.BreadWithWeaving, ModItem.BreadWithInfestation);

        copyBase(itemModelGenerators, Base.COOKIE, ModItem.CookieWithWeakness,
                ModItem.CookieWithHealing, ModItem.CookieWithRegeneration,
                ModItem.CookieWithStrength, ModItem.CookieWithSwiftness,
                ModItem.CookieWithLeaping, ModItem.CookieWithFireResistance,
                ModItem.CookieWithWaterBreathing, ModItem.CookieWithNightVision,
                ModItem.CookieWithInvisibility, ModItem.CookieWithSlowFalling,
                ModItem.CookieWithTheTurtleMaster, ModItem.CookieWithPoison,
                ModItem.CookieWithHarming, ModItem.CookieWithSlowness,
                ModItem.CookieWithWindCharging, ModItem.CookieWithOozing,
                ModItem.CookieWithWeaving, ModItem.CookieWithInfestation);
    }


    private static void copyBase(ItemModelGenerators generators, Item base, Item... variants) {
        for (Item variant : variants) {
            generators.generateFlatItem(variant, base, ModelTemplates.FLAT_ITEM);
        }
    }

    private static final class Base {
        static final Item APPLE = Items.APPLE;
        static final Item SWEET_BERRIES = Items.SWEET_BERRIES;
        static final Item GLOW_BERRIES = Items.GLOW_BERRIES;
        static final Item MELON_SLICE = Items.MELON_SLICE;
        static final Item CARROT = Items.CARROT;
        static final Item POTATO = Items.POTATO;
        static final Item BAKED_POTATO = Items.BAKED_POTATO;
        static final Item BEETROOT = Items.BEETROOT;
        static final Item DRIED_KELP = Items.DRIED_KELP;
        static final Item BREAD = Items.BREAD;
        static final Item COOKIE = Items.COOKIE;
        static final Item COOKED_CHICKEN = Items.COOKED_CHICKEN;
        static final Item COOKED_MUTTON = Items.COOKED_MUTTON;
        static final Item COOKED_PORKCHOP = Items.COOKED_PORKCHOP;
        static final Item COOKED_BEEF = Items.COOKED_BEEF;
        static final Item COOKED_RABBIT = Items.COOKED_RABBIT;
        static final Item COOKED_COD = Items.COOKED_COD;
        static final Item COOKED_SALMON = Items.COOKED_SALMON;
    }
}
