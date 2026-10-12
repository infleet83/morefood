package name.modid.Item;

import name.modid.Morefood;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItem {

    public static final Item Testtube = registerItem( "testtube", Item::new);
    public static final Item TesttubeOfAwkwardness = registerItem("testtube_of_awkwardness",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfMundanity = registerItem("testtube_of_mundanity",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfDensity = registerItem("testtube_of_density",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfWeakness = registerItem("testtube_of_weakness",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfHealing = registerItem("testtube_of_healing",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfRegeneration = registerItem("testtube_of_regeneration",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfStrength = registerItem("testtube_of_strength",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfSwiftness = registerItem("testtube_of_swiftness",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfLeaping = registerItem("testtube_of_leaping",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfFireResistance = registerItem("testtube_of_fire_resistance",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfWaterBreathing = registerItem("testtube_of_water_breathing",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfNightVision = registerItem("testtube_of_night_vision",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfInvisibility = registerItem("testtube_of_invisibility",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfSlowFalling = registerItem("testtube_of_slow_falling",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfTheTurtleMaster = registerItem("testtube_of_the_turtle_master",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfPoison = registerItem("testtube_of_poison",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfHarming = registerItem("testtube_of_harming",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfSlowness = registerItem("testtube_of_slowness",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfWindCharging = registerItem("testtube_of_wind_charging",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfOozing = registerItem("testtube_of_oozing",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfWeaving = registerItem("testtube_of_weaving",
            properties -> new Item(properties.craftRemainder(Testtube)));
    public static final Item TesttubeOfInfestation = registerItem("testtube_of_infestation",
            properties -> new Item(properties.craftRemainder(Testtube)));

    // Cooked Chicken

    public static final Item CookedChickenWithAwkwardness = registerItem("cooked_chicken_with_awkwardness", Item::new);
    public static final Item CookedChickenWithMundanity = registerItem("cooked_chicken_with_mundanity", Item::new);
    public static final Item CookedChickenWithDensity = registerItem("cooked_chicken_with_density", Item::new);
    public static final Item CookedChickenWithWeakness = registerItem("cooked_chicken_with_weakness", Item::new);
    public static final Item CookedChickenWithHealing = registerItem("cooked_chicken_with_healing", Item::new);
    public static final Item CookedChickenWithRegeneration = registerItem("cooked_chicken_with_regeneration", Item::new);
    public static final Item CookedChickenWithStrength = registerItem("cooked_chicken_with_strength", Item::new);
    public static final Item CookedChickenWithSwiftness = registerItem("cooked_chicken_with_swiftness", Item::new);
    public static final Item CookedChickenWithLeaping = registerItem("cooked_chicken_with_leaping", Item::new);
    public static final Item CookedChickenWithFireResistance = registerItem("cooked_chicken_with_fire_resistance", Item::new);
    public static final Item CookedChickenWithWaterBreathing = registerItem("cooked_chicken_with_water_breathing", Item::new);
    public static final Item CookedChickenWithNightVision = registerItem("cooked_chicken_with_night_vision", Item::new);
    public static final Item CookedChickenWithInvisibility = registerItem("cooked_chicken_with_invisibility", Item::new);
    public static final Item CookedChickenWithSlowFalling = registerItem("cooked_chicken_with_slow_falling", Item::new);
    public static final Item CookedChickenWithTheTurtleMaster = registerItem("cooked_chicken_with_the_turtle_master", Item::new);
    public static final Item CookedChickenWithPoison = registerItem("cooked_chicken_with_poison", Item::new);
    public static final Item CookedChickenWithHarming = registerItem("cooked_chicken_with_harming", Item::new);
    public static final Item CookedChickenWithSlowness = registerItem("cooked_chicken_with_slowness", Item::new);
    public static final Item CookedChickenWithWindCharging = registerItem("cooked_chicken_with_wind_charging", Item::new);
    public static final Item CookedChickenWithOozing = registerItem("cooked_chicken_with_oozing", Item::new);
    public static final Item CookedChickenWithWeaving = registerItem("cooked_chicken_with_weaving", Item::new);
    public static final Item CookedChickenWithInfestation = registerItem("cooked_chicken_with_infestation", Item::new);

    // Cooked Mutton

    public static final Item CookedMuttonWithAwkwardness = registerItem("cooked_mutton_with_awkwardness", Item::new);
    public static final Item CookedMuttonWithMundanity = registerItem("cooked_mutton_with_mundanity", Item::new);
    public static final Item CookedMuttonWithDensity = registerItem("cooked_mutton_with_density", Item::new);
    public static final Item CookedMuttonWithWeakness = registerItem("cooked_mutton_with_weakness", Item::new);
    public static final Item CookedMuttonWithHealing = registerItem("cooked_mutton_with_healing", Item::new);
    public static final Item CookedMuttonWithRegeneration = registerItem("cooked_mutton_with_regeneration", Item::new);
    public static final Item CookedMuttonWithStrength = registerItem("cooked_mutton_with_strength", Item::new);
    public static final Item CookedMuttonWithSwiftness = registerItem("cooked_mutton_with_swiftness", Item::new);
    public static final Item CookedMuttonWithLeaping = registerItem("cooked_mutton_with_leaping", Item::new);
    public static final Item CookedMuttonWithFireResistance = registerItem("cooked_mutton_with_fire_resistance", Item::new);
    public static final Item CookedMuttonWithWaterBreathing = registerItem("cooked_mutton_with_water_breathing", Item::new);
    public static final Item CookedMuttonWithNightVision = registerItem("cooked_mutton_with_night_vision", Item::new);
    public static final Item CookedMuttonWithInvisibility = registerItem("cooked_mutton_with_invisibility", Item::new);
    public static final Item CookedMuttonWithSlowFalling = registerItem("cooked_mutton_with_slow_falling", Item::new);
    public static final Item CookedMuttonWithTheTurtleMaster = registerItem("cooked_mutton_with_the_turtle_master", Item::new);
    public static final Item CookedMuttonWithPoison = registerItem("cooked_mutton_with_poison", Item::new);
    public static final Item CookedMuttonWithHarming = registerItem("cooked_mutton_with_harming", Item::new);
    public static final Item CookedMuttonWithSlowness = registerItem("cooked_mutton_with_slowness", Item::new);
    public static final Item CookedMuttonWithWindCharging = registerItem("cooked_mutton_with_wind_charging", Item::new);
    public static final Item CookedMuttonWithOozing = registerItem("cooked_mutton_with_oozing", Item::new);
    public static final Item CookedMuttonWithWeaving = registerItem("cooked_mutton_with_weaving", Item::new);
    public static final Item CookedMuttonWithInfestation = registerItem("cooked_mutton_with_infestation", Item::new);

    // Cooked Porkchop

    public static final Item CookedPorkchopWithAwkwardness = registerItem("cooked_porkchop_with_awkwardness", Item::new);
    public static final Item CookedPorkchopWithMundanity = registerItem("cooked_porkchop_with_mundanity", Item::new);
    public static final Item CookedPorkchopWithDensity = registerItem("cooked_porkchop_with_density", Item::new);
    public static final Item CookedPorkchopWithWeakness = registerItem("cooked_porkchop_with_weakness", Item::new);
    public static final Item CookedPorkchopWithHealing = registerItem("cooked_porkchop_with_healing", Item::new);
    public static final Item CookedPorkchopWithRegeneration = registerItem("cooked_porkchop_with_regeneration", Item::new);
    public static final Item CookedPorkchopWithStrength = registerItem("cooked_porkchop_with_strength", Item::new);
    public static final Item CookedPorkchopWithSwiftness = registerItem("cooked_porkchop_with_swiftness", Item::new);
    public static final Item CookedPorkchopWithLeaping = registerItem("cooked_porkchop_with_leaping", Item::new);
    public static final Item CookedPorkchopWithFireResistance = registerItem("cooked_porkchop_with_fire_resistance", Item::new);
    public static final Item CookedPorkchopWithWaterBreathing = registerItem("cooked_porkchop_with_water_breathing", Item::new);
    public static final Item CookedPorkchopWithNightVision = registerItem("cooked_porkchop_with_night_vision", Item::new);
    public static final Item CookedPorkchopWithInvisibility = registerItem("cooked_porkchop_with_invisibility", Item::new);
    public static final Item CookedPorkchopWithSlowFalling = registerItem("cooked_porkchop_with_slow_falling", Item::new);
    public static final Item CookedPorkchopWithTheTurtleMaster = registerItem("cooked_porkchop_with_the_turtle_master", Item::new);
    public static final Item CookedPorkchopWithPoison = registerItem("cooked_porkchop_with_poison", Item::new);
    public static final Item CookedPorkchopWithHarming = registerItem("cooked_porkchop_with_harming", Item::new);
    public static final Item CookedPorkchopWithSlowness = registerItem("cooked_porkchop_with_slowness", Item::new);
    public static final Item CookedPorkchopWithWindCharging = registerItem("cooked_porkchop_with_wind_charging", Item::new);
    public static final Item CookedPorkchopWithOozing = registerItem("cooked_porkchop_with_oozing", Item::new);
    public static final Item CookedPorkchopWithWeaving = registerItem("cooked_porkchop_with_weaving", Item::new);
    public static final Item CookedPorkchopWithInfestation = registerItem("cooked_porkchop_with_infestation", Item::new);

    // Cooked Beef

    public static final Item CookedBeefWithAwkwardness = registerItem("cooked_beef_with_awkwardness", Item::new);
    public static final Item CookedBeefWithMundanity = registerItem("cooked_beef_with_mundanity", Item::new);
    public static final Item CookedBeefWithDensity = registerItem("cooked_beef_with_density", Item::new);
    public static final Item CookedBeefWithWeakness = registerItem("cooked_beef_with_weakness", Item::new);
    public static final Item CookedBeefWithHealing = registerItem("cooked_beef_with_healing", Item::new);
    public static final Item CookedBeefWithRegeneration = registerItem("cooked_beef_with_regeneration", Item::new);
    public static final Item CookedBeefWithStrength = registerItem("cooked_beef_with_strength", Item::new);
    public static final Item CookedBeefWithSwiftness = registerItem("cooked_beef_with_swiftness", Item::new);
    public static final Item CookedBeefWithLeaping = registerItem("cooked_beef_with_leaping", Item::new);
    public static final Item CookedBeefWithFireResistance = registerItem("cooked_beef_with_fire_resistance", Item::new);
    public static final Item CookedBeefWithWaterBreathing = registerItem("cooked_beef_with_water_breathing", Item::new);
    public static final Item CookedBeefWithNightVision = registerItem("cooked_beef_with_night_vision", Item::new);
    public static final Item CookedBeefWithInvisibility = registerItem("cooked_beef_with_invisibility", Item::new);
    public static final Item CookedBeefWithSlowFalling = registerItem("cooked_beef_with_slow_falling", Item::new);
    public static final Item CookedBeefWithTheTurtleMaster = registerItem("cooked_beef_with_the_turtle_master", Item::new);
    public static final Item CookedBeefWithPoison = registerItem("cooked_beef_with_poison", Item::new);
    public static final Item CookedBeefWithHarming = registerItem("cooked_beef_with_harming", Item::new);
    public static final Item CookedBeefWithSlowness = registerItem("cooked_beef_with_slowness", Item::new);
    public static final Item CookedBeefWithWindCharging = registerItem("cooked_beef_with_wind_charging", Item::new);
    public static final Item CookedBeefWithOozing = registerItem("cooked_beef_with_oozing", Item::new);
    public static final Item CookedBeefWithWeaving = registerItem("cooked_beef_with_weaving", Item::new);
    public static final Item CookedBeefWithInfestation = registerItem("cooked_beef_with_infestation", Item::new);

    // Cooked Rabbit

    public static final Item CookedRabbitWithAwkwardness = registerItem("cooked_rabbit_with_awkwardness", Item::new);
    public static final Item CookedRabbitWithMundanity = registerItem("cooked_rabbit_with_mundanity", Item::new);
    public static final Item CookedRabbitWithDensity = registerItem("cooked_rabbit_with_density", Item::new);
    public static final Item CookedRabbitWithWeakness = registerItem("cooked_rabbit_with_weakness", Item::new);
    public static final Item CookedRabbitWithHealing = registerItem("cooked_rabbit_with_healing", Item::new);
    public static final Item CookedRabbitWithRegeneration = registerItem("cooked_rabbit_with_regeneration", Item::new);
    public static final Item CookedRabbitWithStrength = registerItem("cooked_rabbit_with_strength", Item::new);
    public static final Item CookedRabbitWithSwiftness = registerItem("cooked_rabbit_with_swiftness", Item::new);
    public static final Item CookedRabbitWithLeaping = registerItem("cooked_rabbit_with_leaping", Item::new);
    public static final Item CookedRabbitWithFireResistance = registerItem("cooked_rabbit_with_fire_resistance", Item::new);
    public static final Item CookedRabbitWithWaterBreathing = registerItem("cooked_rabbit_with_water_breathing", Item::new);
    public static final Item CookedRabbitWithNightVision = registerItem("cooked_rabbit_with_night_vision", Item::new);
    public static final Item CookedRabbitWithInvisibility = registerItem("cooked_rabbit_with_invisibility", Item::new);
    public static final Item CookedRabbitWithSlowFalling = registerItem("cooked_rabbit_with_slow_falling", Item::new);
    public static final Item CookedRabbitWithTheTurtleMaster = registerItem("cooked_rabbit_with_the_turtle_master", Item::new);
    public static final Item CookedRabbitWithPoison = registerItem("cooked_rabbit_with_poison", Item::new);
    public static final Item CookedRabbitWithHarming = registerItem("cooked_rabbit_with_harming", Item::new);
    public static final Item CookedRabbitWithSlowness = registerItem("cooked_rabbit_with_slowness", Item::new);
    public static final Item CookedRabbitWithWindCharging = registerItem("cooked_rabbit_with_wind_charging", Item::new);
    public static final Item CookedRabbitWithOozing = registerItem("cooked_rabbit_with_oozing", Item::new);
    public static final Item CookedRabbitWithWeaving = registerItem("cooked_rabbit_with_weaving", Item::new);
    public static final Item CookedRabbitWithInfestation = registerItem("cooked_rabbit_with_infestation", Item::new);

    // Cooked Cod

    public static final Item CookedCodWithAwkwardness = registerItem("cooked_cod_with_awkwardness", Item::new);
    public static final Item CookedCodWithMundanity = registerItem("cooked_cod_with_mundanity", Item::new);
    public static final Item CookedCodWithDensity = registerItem("cooked_cod_with_density", Item::new);
    public static final Item CookedCodWithWeakness = registerItem("cooked_cod_with_weakness", Item::new);
    public static final Item CookedCodWithHealing = registerItem("cooked_cod_with_healing", Item::new);
    public static final Item CookedCodWithRegeneration = registerItem("cooked_cod_with_regeneration", Item::new);
    public static final Item CookedCodWithStrength = registerItem("cooked_cod_with_strength", Item::new);
    public static final Item CookedCodWithSwiftness = registerItem("cooked_cod_with_swiftness", Item::new);
    public static final Item CookedCodWithLeaping = registerItem("cooked_cod_with_leaping", Item::new);
    public static final Item CookedCodWithFireResistance = registerItem("cooked_cod_with_fire_resistance", Item::new);
    public static final Item CookedCodWithWaterBreathing = registerItem("cooked_cod_with_water_breathing", Item::new);
    public static final Item CookedCodWithNightVision = registerItem("cooked_cod_with_night_vision", Item::new);
    public static final Item CookedCodWithInvisibility = registerItem("cooked_cod_with_invisibility", Item::new);
    public static final Item CookedCodWithSlowFalling = registerItem("cooked_cod_with_slow_falling", Item::new);
    public static final Item CookedCodWithTheTurtleMaster = registerItem("cooked_cod_with_the_turtle_master", Item::new);
    public static final Item CookedCodWithPoison = registerItem("cooked_cod_with_poison", Item::new);
    public static final Item CookedCodWithHarming = registerItem("cooked_cod_with_harming", Item::new);
    public static final Item CookedCodWithSlowness = registerItem("cooked_cod_with_slowness", Item::new);
    public static final Item CookedCodWithWindCharging = registerItem("cooked_cod_with_wind_charging", Item::new);
    public static final Item CookedCodWithOozing = registerItem("cooked_cod_with_oozing", Item::new);
    public static final Item CookedCodWithWeaving = registerItem("cooked_cod_with_weaving", Item::new);
    public static final Item CookedCodWithInfestation = registerItem("cooked_cod_with_infestation", Item::new);

    // Cooked Salmon

    public static final Item CookedSalmonWithAwkwardness = registerItem("cooked_salmon_with_awkwardness", Item::new);
    public static final Item CookedSalmonWithMundanity = registerItem("cooked_salmon_with_mundanity", Item::new);
    public static final Item CookedSalmonWithDensity = registerItem("cooked_salmon_with_density", Item::new);
    public static final Item CookedSalmonWithWeakness = registerItem("cooked_salmon_with_weakness", Item::new);
    public static final Item CookedSalmonWithHealing = registerItem("cooked_salmon_with_healing", Item::new);
    public static final Item CookedSalmonWithRegeneration = registerItem("cooked_salmon_with_regeneration", Item::new);
    public static final Item CookedSalmonWithStrength = registerItem("cooked_salmon_with_strength", Item::new);
    public static final Item CookedSalmonWithSwiftness = registerItem("cooked_salmon_with_swiftness", Item::new);
    public static final Item CookedSalmonWithLeaping = registerItem("cooked_salmon_with_leaping", Item::new);
    public static final Item CookedSalmonWithFireResistance = registerItem("cooked_salmon_with_fire_resistance", Item::new);
    public static final Item CookedSalmonWithWaterBreathing = registerItem("cooked_salmon_with_water_breathing", Item::new);
    public static final Item CookedSalmonWithNightVision = registerItem("cooked_salmon_with_night_vision", Item::new);
    public static final Item CookedSalmonWithInvisibility = registerItem("cooked_salmon_with_invisibility", Item::new);
    public static final Item CookedSalmonWithSlowFalling = registerItem("cooked_salmon_with_slow_falling", Item::new);
    public static final Item CookedSalmonWithTheTurtleMaster = registerItem("cooked_salmon_with_the_turtle_master", Item::new);
    public static final Item CookedSalmonWithPoison = registerItem("cooked_salmon_with_poison", Item::new);
    public static final Item CookedSalmonWithHarming = registerItem("cooked_salmon_with_harming", Item::new);
    public static final Item CookedSalmonWithSlowness = registerItem("cooked_salmon_with_slowness", Item::new);
    public static final Item CookedSalmonWithWindCharging = registerItem("cooked_salmon_with_wind_charging", Item::new);
    public static final Item CookedSalmonWithOozing = registerItem("cooked_salmon_with_oozing", Item::new);
    public static final Item CookedSalmonWithWeaving = registerItem("cooked_salmon_with_weaving", Item::new);
    public static final Item CookedSalmonWithInfestation = registerItem("cooked_salmon_with_infestation", Item::new);

    // Apple

    public static final Item AppleWithAwkwardness = registerItem("apple_with_awkwardness", Item::new);
    public static final Item AppleWithMundanity = registerItem("apple_with_mundanity", Item::new);
    public static final Item AppleWithDensity = registerItem("apple_with_density", Item::new);
    public static final Item AppleWithWeakness = registerItem("apple_with_weakness", Item::new);
    public static final Item AppleWithHealing = registerItem("apple_with_healing", Item::new);
    public static final Item AppleWithRegeneration = registerItem("apple_with_regeneration", Item::new);
    public static final Item AppleWithStrength = registerItem("apple_with_strength", Item::new);
    public static final Item AppleWithSwiftness = registerItem("apple_with_swiftness", Item::new);
    public static final Item AppleWithLeaping = registerItem("apple_with_leaping", Item::new);
    public static final Item AppleWithFireResistance = registerItem("apple_with_fire_resistance", Item::new);
    public static final Item AppleWithWaterBreathing = registerItem("apple_with_water_breathing", Item::new);
    public static final Item AppleWithNightVision = registerItem("apple_with_night_vision", Item::new);
    public static final Item AppleWithInvisibility = registerItem("apple_with_invisibility", Item::new);
    public static final Item AppleWithSlowFalling = registerItem("apple_with_slow_falling", Item::new);
    public static final Item AppleWithTheTurtleMaster = registerItem("apple_with_the_turtle_master", Item::new);
    public static final Item AppleWithPoison = registerItem("apple_with_poison", Item::new);
    public static final Item AppleWithHarming = registerItem("apple_with_harming", Item::new);
    public static final Item AppleWithSlowness = registerItem("apple_with_slowness", Item::new);
    public static final Item AppleWithWindCharging = registerItem("apple_with_wind_charging", Item::new);
    public static final Item AppleWithOozing = registerItem("apple_with_oozing", Item::new);
    public static final Item AppleWithWeaving = registerItem("apple_with_weaving", Item::new);
    public static final Item AppleWithInfestation = registerItem("apple_with_infestation", Item::new);

    // Sweet Berries

    public static final Item SweetBerriesWithAwkwardness = registerItem("sweet_berries_with_awkwardness", Item::new);
    public static final Item SweetBerriesWithMundanity = registerItem("sweet_berries_with_mundanity", Item::new);
    public static final Item SweetBerriesWithDensity = registerItem("sweet_berries_with_density", Item::new);
    public static final Item SweetBerriesWithWeakness = registerItem("sweet_berries_with_weakness", Item::new);
    public static final Item SweetBerriesWithHealing = registerItem("sweet_berries_with_healing", Item::new);
    public static final Item SweetBerriesWithRegeneration = registerItem("sweet_berries_with_regeneration", Item::new);
    public static final Item SweetBerriesWithStrength = registerItem("sweet_berries_with_strength", Item::new);
    public static final Item SweetBerriesWithSwiftness = registerItem("sweet_berries_with_swiftness", Item::new);
    public static final Item SweetBerriesWithLeaping = registerItem("sweet_berries_with_leaping", Item::new);
    public static final Item SweetBerriesWithFireResistance = registerItem("sweet_berries_with_fire_resistance", Item::new);
    public static final Item SweetBerriesWithWaterBreathing = registerItem("sweet_berries_with_water_breathing", Item::new);
    public static final Item SweetBerriesWithNightVision = registerItem("sweet_berries_with_night_vision", Item::new);
    public static final Item SweetBerriesWithInvisibility = registerItem("sweet_berries_with_invisibility", Item::new);
    public static final Item SweetBerriesWithSlowFalling = registerItem("sweet_berries_with_slow_falling", Item::new);
    public static final Item SweetBerriesWithTheTurtleMaster = registerItem("sweet_berries_with_the_turtle_master", Item::new);
    public static final Item SweetBerriesWithPoison = registerItem("sweet_berries_with_poison", Item::new);
    public static final Item SweetBerriesWithHarming = registerItem("sweet_berries_with_harming", Item::new);
    public static final Item SweetBerriesWithSlowness = registerItem("sweet_berries_with_slowness", Item::new);
    public static final Item SweetBerriesWithWindCharging = registerItem("sweet_berries_with_wind_charging", Item::new);
    public static final Item SweetBerriesWithOozing = registerItem("sweet_berries_with_oozing", Item::new);
    public static final Item SweetBerriesWithWeaving = registerItem("sweet_berries_with_weaving", Item::new);
    public static final Item SweetBerriesWithInfestation = registerItem("sweet_berries_with_infestation", Item::new);

    // Glow Berries

    public static final Item GlowBerriesWithAwkwardness = registerItem("glow_berries_with_awkwardness", Item::new);
    public static final Item GlowBerriesWithMundanity = registerItem("glow_berries_with_mundanity", Item::new);
    public static final Item GlowBerriesWithDensity = registerItem("glow_berries_with_density", Item::new);
    public static final Item GlowBerriesWithWeakness = registerItem("glow_berries_with_weakness", Item::new);
    public static final Item GlowBerriesWithHealing = registerItem("glow_berries_with_healing", Item::new);
    public static final Item GlowBerriesWithRegeneration = registerItem("glow_berries_with_regeneration", Item::new);
    public static final Item GlowBerriesWithStrength = registerItem("glow_berries_with_strength", Item::new);
    public static final Item GlowBerriesWithSwiftness = registerItem("glow_berries_with_swiftness", Item::new);
    public static final Item GlowBerriesWithLeaping = registerItem("glow_berries_with_leaping", Item::new);
    public static final Item GlowBerriesWithFireResistance = registerItem("glow_berries_with_fire_resistance", Item::new);
    public static final Item GlowBerriesWithWaterBreathing = registerItem("glow_berries_with_water_breathing", Item::new);
    public static final Item GlowBerriesWithNightVision = registerItem("glow_berries_with_night_vision", Item::new);
    public static final Item GlowBerriesWithInvisibility = registerItem("glow_berries_with_invisibility", Item::new);
    public static final Item GlowBerriesWithSlowFalling = registerItem("glow_berries_with_slow_falling", Item::new);
    public static final Item GlowBerriesWithTheTurtleMaster = registerItem("glow_berries_with_the_turtle_master", Item::new);
    public static final Item GlowBerriesWithPoison = registerItem("glow_berries_with_poison", Item::new);
    public static final Item GlowBerriesWithHarming = registerItem("glow_berries_with_harming", Item::new);
    public static final Item GlowBerriesWithSlowness = registerItem("glow_berries_with_slowness", Item::new);
    public static final Item GlowBerriesWithWindCharging = registerItem("glow_berries_with_wind_charging", Item::new);
    public static final Item GlowBerriesWithOozing = registerItem("glow_berries_with_oozing", Item::new);
    public static final Item GlowBerriesWithWeaving = registerItem("glow_berries_with_weaving", Item::new);
    public static final Item GlowBerriesWithInfestation = registerItem("glow_berries_with_infestation", Item::new);

    // Melon Slice

    public static final Item MelonSliceWithAwkwardness = registerItem("melon_slice_with_awkwardness", Item::new);
    public static final Item MelonSliceWithMundanity = registerItem("melon_slice_with_mundanity", Item::new);
    public static final Item MelonSliceWithDensity = registerItem("melon_slice_with_density", Item::new);
    public static final Item MelonSliceWithWeakness = registerItem("melon_slice_with_weakness", Item::new);
    public static final Item MelonSliceWithHealing = registerItem("melon_slice_with_healing", Item::new);
    public static final Item MelonSliceWithRegeneration = registerItem("melon_slice_with_regeneration", Item::new);
    public static final Item MelonSliceWithStrength = registerItem("melon_slice_with_strength", Item::new);
    public static final Item MelonSliceWithSwiftness = registerItem("melon_slice_with_swiftness", Item::new);
    public static final Item MelonSliceWithLeaping = registerItem("melon_slice_with_leaping", Item::new);
    public static final Item MelonSliceWithFireResistance = registerItem("melon_slice_with_fire_resistance", Item::new);
    public static final Item MelonSliceWithWaterBreathing = registerItem("melon_slice_with_water_breathing", Item::new);
    public static final Item MelonSliceWithNightVision = registerItem("melon_slice_with_night_vision", Item::new);
    public static final Item MelonSliceWithInvisibility = registerItem("melon_slice_with_invisibility", Item::new);
    public static final Item MelonSliceWithSlowFalling = registerItem("melon_slice_with_slow_falling", Item::new);
    public static final Item MelonSliceWithTheTurtleMaster = registerItem("melon_slice_with_the_turtle_master", Item::new);
    public static final Item MelonSliceWithPoison = registerItem("melon_slice_with_poison", Item::new);
    public static final Item MelonSliceWithHarming = registerItem("melon_slice_with_harming", Item::new);
    public static final Item MelonSliceWithSlowness = registerItem("melon_slice_with_slowness", Item::new);
    public static final Item MelonSliceWithWindCharging = registerItem("melon_slice_with_wind_charging", Item::new);
    public static final Item MelonSliceWithOozing = registerItem("melon_slice_with_oozing", Item::new);
    public static final Item MelonSliceWithWeaving = registerItem("melon_slice_with_weaving", Item::new);
    public static final Item MelonSliceWithInfestation = registerItem("melon_slice_with_infestation", Item::new);

    // Carrot

    public static final Item CarrotWithAwkwardness = registerItem("carrot_with_awkwardness", Item::new);
    public static final Item CarrotWithMundanity = registerItem("carrot_with_mundanity", Item::new);
    public static final Item CarrotWithDensity = registerItem("carrot_with_density", Item::new);
    public static final Item CarrotWithWeakness = registerItem("carrot_with_weakness", Item::new);
    public static final Item CarrotWithHealing = registerItem("carrot_with_healing", Item::new);
    public static final Item CarrotWithRegeneration = registerItem("carrot_with_regeneration", Item::new);
    public static final Item CarrotWithStrength = registerItem("carrot_with_strength", Item::new);
    public static final Item CarrotWithSwiftness = registerItem("carrot_with_swiftness", Item::new);
    public static final Item CarrotWithLeaping = registerItem("carrot_with_leaping", Item::new);
    public static final Item CarrotWithFireResistance = registerItem("carrot_with_fire_resistance", Item::new);
    public static final Item CarrotWithWaterBreathing = registerItem("carrot_with_water_breathing", Item::new);
    public static final Item CarrotWithNightVision = registerItem("carrot_with_night_vision", Item::new);
    public static final Item CarrotWithInvisibility = registerItem("carrot_with_invisibility", Item::new);
    public static final Item CarrotWithSlowFalling = registerItem("carrot_with_slow_falling", Item::new);
    public static final Item CarrotWithTheTurtleMaster = registerItem("carrot_with_the_turtle_master", Item::new);
    public static final Item CarrotWithPoison = registerItem("carrot_with_poison", Item::new);
    public static final Item CarrotWithHarming = registerItem("carrot_with_harming", Item::new);
    public static final Item CarrotWithSlowness = registerItem("carrot_with_slowness", Item::new);
    public static final Item CarrotWithWindCharging = registerItem("carrot_with_wind_charging", Item::new);
    public static final Item CarrotWithOozing = registerItem("carrot_with_oozing", Item::new);
    public static final Item CarrotWithWeaving = registerItem("carrot_with_weaving", Item::new);
    public static final Item CarrotWithInfestation = registerItem("carrot_with_infestation", Item::new);

    // Potato

    public static final Item PotatoWithAwkwardness = registerItem("potato_with_awkwardness", Item::new);
    public static final Item PotatoWithMundanity = registerItem("potato_with_mundanity", Item::new);
    public static final Item PotatoWithDensity = registerItem("potato_with_density", Item::new);
    public static final Item PotatoWithWeakness = registerItem("potato_with_weakness", Item::new);
    public static final Item PotatoWithHealing = registerItem("potato_with_healing", Item::new);
    public static final Item PotatoWithRegeneration = registerItem("potato_with_regeneration", Item::new);
    public static final Item PotatoWithStrength = registerItem("potato_with_strength", Item::new);
    public static final Item PotatoWithSwiftness = registerItem("potato_with_swiftness", Item::new);
    public static final Item PotatoWithLeaping = registerItem("potato_with_leaping", Item::new);
    public static final Item PotatoWithFireResistance = registerItem("potato_with_fire_resistance", Item::new);
    public static final Item PotatoWithWaterBreathing = registerItem("potato_with_water_breathing", Item::new);
    public static final Item PotatoWithNightVision = registerItem("potato_with_night_vision", Item::new);
    public static final Item PotatoWithInvisibility = registerItem("potato_with_invisibility", Item::new);
    public static final Item PotatoWithSlowFalling = registerItem("potato_with_slow_falling", Item::new);
    public static final Item PotatoWithTheTurtleMaster = registerItem("potato_with_the_turtle_master", Item::new);
    public static final Item PotatoWithPoison = registerItem("potato_with_poison", Item::new);
    public static final Item PotatoWithHarming = registerItem("potato_with_harming", Item::new);
    public static final Item PotatoWithSlowness = registerItem("potato_with_slowness", Item::new);
    public static final Item PotatoWithWindCharging = registerItem("potato_with_wind_charging", Item::new);
    public static final Item PotatoWithOozing = registerItem("potato_with_oozing", Item::new);
    public static final Item PotatoWithWeaving = registerItem("potato_with_weaving", Item::new);
    public static final Item PotatoWithInfestation = registerItem("potato_with_infestation", Item::new);

    // Baked Potato

    public static final Item BakedPotatoWithAwkwardness = registerItem("baked_potato_with_awkwardness", Item::new);
    public static final Item BakedPotatoWithMundanity = registerItem("baked_potato_with_mundanity", Item::new);
    public static final Item BakedPotatoWithDensity = registerItem("baked_potato_with_density", Item::new);
    public static final Item BakedPotatoWithWeakness = registerItem("baked_potato_with_weakness", Item::new);
    public static final Item BakedPotatoWithHealing = registerItem("baked_potato_with_healing", Item::new);
    public static final Item BakedPotatoWithRegeneration = registerItem("baked_potato_with_regeneration", Item::new);
    public static final Item BakedPotatoWithStrength = registerItem("baked_potato_with_strength", Item::new);
    public static final Item BakedPotatoWithSwiftness = registerItem("baked_potato_with_swiftness", Item::new);
    public static final Item BakedPotatoWithLeaping = registerItem("baked_potato_with_leaping", Item::new);
    public static final Item BakedPotatoWithFireResistance = registerItem("baked_potato_with_fire_resistance", Item::new);
    public static final Item BakedPotatoWithWaterBreathing = registerItem("baked_potato_with_water_breathing", Item::new);
    public static final Item BakedPotatoWithNightVision = registerItem("baked_potato_with_night_vision", Item::new);
    public static final Item BakedPotatoWithInvisibility = registerItem("baked_potato_with_invisibility", Item::new);
    public static final Item BakedPotatoWithSlowFalling = registerItem("baked_potato_with_slow_falling", Item::new);
    public static final Item BakedPotatoWithTheTurtleMaster = registerItem("baked_potato_with_the_turtle_master", Item::new);
    public static final Item BakedPotatoWithPoison = registerItem("baked_potato_with_poison", Item::new);
    public static final Item BakedPotatoWithHarming = registerItem("baked_potato_with_harming", Item::new);
    public static final Item BakedPotatoWithSlowness = registerItem("baked_potato_with_slowness", Item::new);
    public static final Item BakedPotatoWithWindCharging = registerItem("baked_potato_with_wind_charging", Item::new);
    public static final Item BakedPotatoWithOozing = registerItem("baked_potato_with_oozing", Item::new);
    public static final Item BakedPotatoWithWeaving = registerItem("baked_potato_with_weaving", Item::new);
    public static final Item BakedPotatoWithInfestation = registerItem("baked_potato_with_infestation", Item::new);

    // Beetroot

    public static final Item BeetrootWithAwkwardness = registerItem("beetroot_with_awkwardness", Item::new);
    public static final Item BeetrootWithMundanity = registerItem("beetroot_with_mundanity", Item::new);
    public static final Item BeetrootWithDensity = registerItem("beetroot_with_density", Item::new);
    public static final Item BeetrootWithWeakness = registerItem("beetroot_with_weakness", Item::new);
    public static final Item BeetrootWithHealing = registerItem("beetroot_with_healing", Item::new);
    public static final Item BeetrootWithRegeneration = registerItem("beetroot_with_regeneration", Item::new);
    public static final Item BeetrootWithStrength = registerItem("beetroot_with_strength", Item::new);
    public static final Item BeetrootWithSwiftness = registerItem("beetroot_with_swiftness", Item::new);
    public static final Item BeetrootWithLeaping = registerItem("beetroot_with_leaping", Item::new);
    public static final Item BeetrootWithFireResistance = registerItem("beetroot_with_fire_resistance", Item::new);
    public static final Item BeetrootWithWaterBreathing = registerItem("beetroot_with_water_breathing", Item::new);
    public static final Item BeetrootWithNightVision = registerItem("beetroot_with_night_vision", Item::new);
    public static final Item BeetrootWithInvisibility = registerItem("beetroot_with_invisibility", Item::new);
    public static final Item BeetrootWithSlowFalling = registerItem("beetroot_with_slow_falling", Item::new);
    public static final Item BeetrootWithTheTurtleMaster = registerItem("beetroot_with_the_turtle_master", Item::new);
    public static final Item BeetrootWithPoison = registerItem("beetroot_with_poison", Item::new);
    public static final Item BeetrootWithHarming = registerItem("beetroot_with_harming", Item::new);
    public static final Item BeetrootWithSlowness = registerItem("beetroot_with_slowness", Item::new);
    public static final Item BeetrootWithWindCharging = registerItem("beetroot_with_wind_charging", Item::new);
    public static final Item BeetrootWithOozing = registerItem("beetroot_with_oozing", Item::new);
    public static final Item BeetrootWithWeaving = registerItem("beetroot_with_weaving", Item::new);
    public static final Item BeetrootWithInfestation = registerItem("beetroot_with_infestation", Item::new);

    // Dried Kelp

    public static final Item DriedKelpWithAwkwardness = registerItem("dried_kelp_with_awkwardness", Item::new);
    public static final Item DriedKelpWithMundanity = registerItem("dried_kelp_with_mundanity", Item::new);
    public static final Item DriedKelpWithDensity = registerItem("dried_kelp_with_density", Item::new);
    public static final Item DriedKelpWithWeakness = registerItem("dried_kelp_with_weakness", Item::new);
    public static final Item DriedKelpWithHealing = registerItem("dried_kelp_with_healing", Item::new);
    public static final Item DriedKelpWithRegeneration = registerItem("dried_kelp_with_regeneration", Item::new);
    public static final Item DriedKelpWithStrength = registerItem("dried_kelp_with_strength", Item::new);
    public static final Item DriedKelpWithSwiftness = registerItem("dried_kelp_with_swiftness", Item::new);
    public static final Item DriedKelpWithLeaping = registerItem("dried_kelp_with_leaping", Item::new);
    public static final Item DriedKelpWithFireResistance = registerItem("dried_kelp_with_fire_resistance", Item::new);
    public static final Item DriedKelpWithWaterBreathing = registerItem("dried_kelp_with_water_breathing", Item::new);
    public static final Item DriedKelpWithNightVision = registerItem("dried_kelp_with_night_vision", Item::new);
    public static final Item DriedKelpWithInvisibility = registerItem("dried_kelp_with_invisibility", Item::new);
    public static final Item DriedKelpWithSlowFalling = registerItem("dried_kelp_with_slow_falling", Item::new);
    public static final Item DriedKelpWithTheTurtleMaster = registerItem("dried_kelp_with_the_turtle_master", Item::new);
    public static final Item DriedKelpWithPoison = registerItem("dried_kelp_with_poison", Item::new);
    public static final Item DriedKelpWithHarming = registerItem("dried_kelp_with_harming", Item::new);
    public static final Item DriedKelpWithSlowness = registerItem("dried_kelp_with_slowness", Item::new);
    public static final Item DriedKelpWithWindCharging = registerItem("dried_kelp_with_wind_charging", Item::new);
    public static final Item DriedKelpWithOozing = registerItem("dried_kelp_with_oozing", Item::new);
    public static final Item DriedKelpWithWeaving = registerItem("dried_kelp_with_weaving", Item::new);
    public static final Item DriedKelpWithInfestation = registerItem("dried_kelp_with_infestation", Item::new);

    // Bread

    public static final Item BreadWithAwkwardness = registerItem("bread_with_awkwardness", Item::new);
    public static final Item BreadWithMundanity = registerItem("bread_with_mundanity", Item::new);
    public static final Item BreadWithDensity = registerItem("bread_with_density", Item::new);
    public static final Item BreadWithWeakness = registerItem("bread_with_weakness", Item::new);
    public static final Item BreadWithHealing = registerItem("bread_with_healing", Item::new);
    public static final Item BreadWithRegeneration = registerItem("bread_with_regeneration", Item::new);
    public static final Item BreadWithStrength = registerItem("bread_with_strength", Item::new);
    public static final Item BreadWithSwiftness = registerItem("bread_with_swiftness", Item::new);
    public static final Item BreadWithLeaping = registerItem("bread_with_leaping", Item::new);
    public static final Item BreadWithFireResistance = registerItem("bread_with_fire_resistance", Item::new);
    public static final Item BreadWithWaterBreathing = registerItem("bread_with_water_breathing", Item::new);
    public static final Item BreadWithNightVision = registerItem("bread_with_night_vision", Item::new);
    public static final Item BreadWithInvisibility = registerItem("bread_with_invisibility", Item::new);
    public static final Item BreadWithSlowFalling = registerItem("bread_with_slow_falling", Item::new);
    public static final Item BreadWithTheTurtleMaster = registerItem("bread_with_the_turtle_master", Item::new);
    public static final Item BreadWithPoison = registerItem("bread_with_poison", Item::new);
    public static final Item BreadWithHarming = registerItem("bread_with_harming", Item::new);
    public static final Item BreadWithSlowness = registerItem("bread_with_slowness", Item::new);
    public static final Item BreadWithWindCharging = registerItem("bread_with_wind_charging", Item::new);
    public static final Item BreadWithOozing = registerItem("bread_with_oozing", Item::new);
    public static final Item BreadWithWeaving = registerItem("bread_with_weaving", Item::new);
    public static final Item BreadWithInfestation = registerItem("bread_with_infestation", Item::new);

    // Cookie

    public static final Item CookieWithAwkwardness = registerItem("cookie_with_awkwardness", Item::new);
    public static final Item CookieWithMundanity = registerItem("cookie_with_mundanity", Item::new);
    public static final Item CookieWithDensity = registerItem("cookie_with_density", Item::new);
    public static final Item CookieWithWeakness = registerItem("cookie_with_weakness", Item::new);
    public static final Item CookieWithHealing = registerItem("cookie_with_healing", Item::new);
    public static final Item CookieWithRegeneration = registerItem("cookie_with_regeneration", Item::new);
    public static final Item CookieWithStrength = registerItem("cookie_with_strength", Item::new);
    public static final Item CookieWithSwiftness = registerItem("cookie_with_swiftness", Item::new);
    public static final Item CookieWithLeaping = registerItem("cookie_with_leaping", Item::new);
    public static final Item CookieWithFireResistance = registerItem("cookie_with_fire_resistance", Item::new);
    public static final Item CookieWithWaterBreathing = registerItem("cookie_with_water_breathing", Item::new);
    public static final Item CookieWithNightVision = registerItem("cookie_with_night_vision", Item::new);
    public static final Item CookieWithInvisibility = registerItem("cookie_with_invisibility", Item::new);
    public static final Item CookieWithSlowFalling = registerItem("cookie_with_slow_falling", Item::new);
    public static final Item CookieWithTheTurtleMaster = registerItem("cookie_with_the_turtle_master", Item::new);
    public static final Item CookieWithPoison = registerItem("cookie_with_poison", Item::new);
    public static final Item CookieWithHarming = registerItem("cookie_with_harming", Item::new);
    public static final Item CookieWithSlowness = registerItem("cookie_with_slowness", Item::new);
    public static final Item CookieWithWindCharging = registerItem("cookie_with_wind_charging", Item::new);
    public static final Item CookieWithOozing = registerItem("cookie_with_oozing", Item::new);
    public static final Item CookieWithWeaving = registerItem("cookie_with_weaving", Item::new);
    public static final Item CookieWithInfestation = registerItem("cookie_with_infestation", Item::new);


    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath
                        (Morefood.MOD_ID, name), function.apply(new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM,
                        Identifier.fromNamespaceAndPath(Morefood.MOD_ID, name)))));
    }


  public static void registerModItems() {

      Morefood.LOGGER.info("Registering ModItems");

  }



}
