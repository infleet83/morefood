package name.modid.Item;

import name.modid.Morefood;
import name.modid.consumable.ModConsumables;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;


public class ModItem {

    public static final Item Testtube = registerItem( "testtube", Item::new);


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

    // Modified foods

    public static final Item CookedChickenWithWeakness = registerItem("cooked_chicken_with_weakness",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithWeakness, ModConsumables.CookedChickenWithWeakness_edi)));

    public static final Item CookedChickenWithHealing = registerItem("cooked_chicken_with_healing",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithHealing, ModConsumables.CookedChickenWithHealing_edi)));

    public static final Item CookedChickenWithRegeneration = registerItem("cooked_chicken_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithRegeneration, ModConsumables.CookedChickenWithRegeneration_edi)));

    public static final Item CookedChickenWithStrength = registerItem("cooked_chicken_with_strength",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithStrength, ModConsumables.CookedChickenWithStrength_edi)));

    public static final Item CookedChickenWithSwiftness = registerItem("cooked_chicken_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithSwiftness, ModConsumables.CookedChickenWithSwiftness_edi)));

    public static final Item CookedChickenWithLeaping = registerItem("cooked_chicken_with_leaping",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithLeaping, ModConsumables.CookedChickenWithLeaping_edi)));

    public static final Item CookedChickenWithFireResistance = registerItem("cooked_chicken_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithFireResistance, ModConsumables.CookedChickenWithFireResistance_edi)));

    public static final Item CookedChickenWithWaterBreathing = registerItem("cooked_chicken_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithWaterBreathing, ModConsumables.CookedChickenWithWaterBreathing_edi)));

    public static final Item CookedChickenWithNightVision = registerItem("cooked_chicken_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithNightVision, ModConsumables.CookedChickenWithNightVision_edi)));

    public static final Item CookedChickenWithInvisibility = registerItem("cooked_chicken_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithInvisibility, ModConsumables.CookedChickenWithInvisibility_edi)));

    public static final Item CookedChickenWithSlowFalling = registerItem("cooked_chicken_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithSlowFalling, ModConsumables.CookedChickenWithSlowFalling_edi)));

    public static final Item CookedChickenWithTheTurtleMaster = registerItem("cooked_chicken_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithTheTurtleMaster, ModConsumables.CookedChickenWithTheTurtleMaster_edi)));

    public static final Item CookedChickenWithPoison = registerItem("cooked_chicken_with_poison",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithPoison, ModConsumables.CookedChickenWithPoison_edi)));

    public static final Item CookedChickenWithHarming = registerItem("cooked_chicken_with_harming",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithHarming, ModConsumables.CookedChickenWithHarming_edi)));

    public static final Item CookedChickenWithSlowness = registerItem("cooked_chicken_with_slowness",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithSlowness, ModConsumables.CookedChickenWithSlowness_edi)));

    public static final Item CookedChickenWithWindCharging = registerItem("cooked_chicken_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithWindCharging, ModConsumables.CookedChickenWithWindCharging_edi)));

    public static final Item CookedChickenWithOozing = registerItem("cooked_chicken_with_oozing",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithOozing, ModConsumables.CookedChickenWithOozing_edi)));

    public static final Item CookedChickenWithWeaving = registerItem("cooked_chicken_with_weaving",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithWeaving, ModConsumables.CookedChickenWithWeaving_edi)));

    public static final Item CookedChickenWithInfestation = registerItem("cooked_chicken_with_infestation",
            properties -> new Item(properties.food(ModConsumables.CookedChickenWithInfestation, ModConsumables.CookedChickenWithInfestation_edi)));

    public static final Item CookedMuttonWithWeakness = registerItem("cooked_mutton_with_weakness",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithWeakness, ModConsumables.CookedMuttonWithWeakness_edi)));

    public static final Item CookedMuttonWithHealing = registerItem("cooked_mutton_with_healing",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithHealing, ModConsumables.CookedMuttonWithHealing_edi)));

    public static final Item CookedMuttonWithRegeneration = registerItem("cooked_mutton_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithRegeneration, ModConsumables.CookedMuttonWithRegeneration_edi)));

    public static final Item CookedMuttonWithStrength = registerItem("cooked_mutton_with_strength",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithStrength, ModConsumables.CookedMuttonWithStrength_edi)));

    public static final Item CookedMuttonWithSwiftness = registerItem("cooked_mutton_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithSwiftness, ModConsumables.CookedMuttonWithSwiftness_edi)));

    public static final Item CookedMuttonWithLeaping = registerItem("cooked_mutton_with_leaping",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithLeaping, ModConsumables.CookedMuttonWithLeaping_edi)));

    public static final Item CookedMuttonWithFireResistance = registerItem("cooked_mutton_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithFireResistance, ModConsumables.CookedMuttonWithFireResistance_edi)));

    public static final Item CookedMuttonWithWaterBreathing = registerItem("cooked_mutton_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithWaterBreathing, ModConsumables.CookedMuttonWithWaterBreathing_edi)));

    public static final Item CookedMuttonWithNightVision = registerItem("cooked_mutton_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithNightVision, ModConsumables.CookedMuttonWithNightVision_edi)));

    public static final Item CookedMuttonWithInvisibility = registerItem("cooked_mutton_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithInvisibility, ModConsumables.CookedMuttonWithInvisibility_edi)));

    public static final Item CookedMuttonWithSlowFalling = registerItem("cooked_mutton_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithSlowFalling, ModConsumables.CookedMuttonWithSlowFalling_edi)));

    public static final Item CookedMuttonWithTheTurtleMaster = registerItem("cooked_mutton_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithTheTurtleMaster, ModConsumables.CookedMuttonWithTheTurtleMaster_edi)));

    public static final Item CookedMuttonWithPoison = registerItem("cooked_mutton_with_poison",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithPoison, ModConsumables.CookedMuttonWithPoison_edi)));

    public static final Item CookedMuttonWithHarming = registerItem("cooked_mutton_with_harming",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithHarming, ModConsumables.CookedMuttonWithHarming_edi)));

    public static final Item CookedMuttonWithSlowness = registerItem("cooked_mutton_with_slowness",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithSlowness, ModConsumables.CookedMuttonWithSlowness_edi)));

    public static final Item CookedMuttonWithWindCharging = registerItem("cooked_mutton_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithWindCharging, ModConsumables.CookedMuttonWithWindCharging_edi)));

    public static final Item CookedMuttonWithOozing = registerItem("cooked_mutton_with_oozing",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithOozing, ModConsumables.CookedMuttonWithOozing_edi)));

    public static final Item CookedMuttonWithWeaving = registerItem("cooked_mutton_with_weaving",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithWeaving, ModConsumables.CookedMuttonWithWeaving_edi)));

    public static final Item CookedMuttonWithInfestation = registerItem("cooked_mutton_with_infestation",
            properties -> new Item(properties.food(ModConsumables.CookedMuttonWithInfestation, ModConsumables.CookedMuttonWithInfestation_edi)));

    public static final Item CookedPorkchopWithWeakness = registerItem("cooked_porkchop_with_weakness",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithWeakness, ModConsumables.CookedPorkchopWithWeakness_edi)));

    public static final Item CookedPorkchopWithHealing = registerItem("cooked_porkchop_with_healing",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithHealing, ModConsumables.CookedPorkchopWithHealing_edi)));

    public static final Item CookedPorkchopWithRegeneration = registerItem("cooked_porkchop_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithRegeneration, ModConsumables.CookedPorkchopWithRegeneration_edi)));

    public static final Item CookedPorkchopWithStrength = registerItem("cooked_porkchop_with_strength",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithStrength, ModConsumables.CookedPorkchopWithStrength_edi)));

    public static final Item CookedPorkchopWithSwiftness = registerItem("cooked_porkchop_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithSwiftness, ModConsumables.CookedPorkchopWithSwiftness_edi)));

    public static final Item CookedPorkchopWithLeaping = registerItem("cooked_porkchop_with_leaping",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithLeaping, ModConsumables.CookedPorkchopWithLeaping_edi)));

    public static final Item CookedPorkchopWithFireResistance = registerItem("cooked_porkchop_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithFireResistance, ModConsumables.CookedPorkchopWithFireResistance_edi)));

    public static final Item CookedPorkchopWithWaterBreathing = registerItem("cooked_porkchop_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithWaterBreathing, ModConsumables.CookedPorkchopWithWaterBreathing_edi)));

    public static final Item CookedPorkchopWithNightVision = registerItem("cooked_porkchop_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithNightVision, ModConsumables.CookedPorkchopWithNightVision_edi)));

    public static final Item CookedPorkchopWithInvisibility = registerItem("cooked_porkchop_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithInvisibility, ModConsumables.CookedPorkchopWithInvisibility_edi)));

    public static final Item CookedPorkchopWithSlowFalling = registerItem("cooked_porkchop_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithSlowFalling, ModConsumables.CookedPorkchopWithSlowFalling_edi)));

    public static final Item CookedPorkchopWithTheTurtleMaster = registerItem("cooked_porkchop_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithTheTurtleMaster, ModConsumables.CookedPorkchopWithTheTurtleMaster_edi)));

    public static final Item CookedPorkchopWithPoison = registerItem("cooked_porkchop_with_poison",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithPoison, ModConsumables.CookedPorkchopWithPoison_edi)));

    public static final Item CookedPorkchopWithHarming = registerItem("cooked_porkchop_with_harming",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithHarming, ModConsumables.CookedPorkchopWithHarming_edi)));

    public static final Item CookedPorkchopWithSlowness = registerItem("cooked_porkchop_with_slowness",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithSlowness, ModConsumables.CookedPorkchopWithSlowness_edi)));

    public static final Item CookedPorkchopWithWindCharging = registerItem("cooked_porkchop_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithWindCharging, ModConsumables.CookedPorkchopWithWindCharging_edi)));

    public static final Item CookedPorkchopWithOozing = registerItem("cooked_porkchop_with_oozing",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithOozing, ModConsumables.CookedPorkchopWithOozing_edi)));

    public static final Item CookedPorkchopWithWeaving = registerItem("cooked_porkchop_with_weaving",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithWeaving, ModConsumables.CookedPorkchopWithWeaving_edi)));

    public static final Item CookedPorkchopWithInfestation = registerItem("cooked_porkchop_with_infestation",
            properties -> new Item(properties.food(ModConsumables.CookedPorkchopWithInfestation, ModConsumables.CookedPorkchopWithInfestation_edi)));

    public static final Item CookedBeefWithWeakness = registerItem("cooked_beef_with_weakness",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithWeakness, ModConsumables.CookedBeefWithWeakness_edi)));

    public static final Item CookedBeefWithHealing = registerItem("cooked_beef_with_healing",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithHealing, ModConsumables.CookedBeefWithHealing_edi)));

    public static final Item CookedBeefWithRegeneration = registerItem("cooked_beef_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithRegeneration, ModConsumables.CookedBeefWithRegeneration_edi)));

    public static final Item CookedBeefWithStrength = registerItem("cooked_beef_with_strength",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithStrength, ModConsumables.CookedBeefWithStrength_edi)));

    public static final Item CookedBeefWithSwiftness = registerItem("cooked_beef_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithSwiftness, ModConsumables.CookedBeefWithSwiftness_edi)));

    public static final Item CookedBeefWithLeaping = registerItem("cooked_beef_with_leaping",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithLeaping, ModConsumables.CookedBeefWithLeaping_edi)));

    public static final Item CookedBeefWithFireResistance = registerItem("cooked_beef_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithFireResistance, ModConsumables.CookedBeefWithFireResistance_edi)));

    public static final Item CookedBeefWithWaterBreathing = registerItem("cooked_beef_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithWaterBreathing, ModConsumables.CookedBeefWithWaterBreathing_edi)));

    public static final Item CookedBeefWithNightVision = registerItem("cooked_beef_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithNightVision, ModConsumables.CookedBeefWithNightVision_edi)));

    public static final Item CookedBeefWithInvisibility = registerItem("cooked_beef_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithInvisibility, ModConsumables.CookedBeefWithInvisibility_edi)));

    public static final Item CookedBeefWithSlowFalling = registerItem("cooked_beef_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithSlowFalling, ModConsumables.CookedBeefWithSlowFalling_edi)));

    public static final Item CookedBeefWithTheTurtleMaster = registerItem("cooked_beef_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithTheTurtleMaster, ModConsumables.CookedBeefWithTheTurtleMaster_edi)));

    public static final Item CookedBeefWithPoison = registerItem("cooked_beef_with_poison",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithPoison, ModConsumables.CookedBeefWithPoison_edi)));

    public static final Item CookedBeefWithHarming = registerItem("cooked_beef_with_harming",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithHarming, ModConsumables.CookedBeefWithHarming_edi)));

    public static final Item CookedBeefWithSlowness = registerItem("cooked_beef_with_slowness",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithSlowness, ModConsumables.CookedBeefWithSlowness_edi)));

    public static final Item CookedBeefWithWindCharging = registerItem("cooked_beef_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithWindCharging, ModConsumables.CookedBeefWithWindCharging_edi)));

    public static final Item CookedBeefWithOozing = registerItem("cooked_beef_with_oozing",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithOozing, ModConsumables.CookedBeefWithOozing_edi)));

    public static final Item CookedBeefWithWeaving = registerItem("cooked_beef_with_weaving",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithWeaving, ModConsumables.CookedBeefWithWeaving_edi)));

    public static final Item CookedBeefWithInfestation = registerItem("cooked_beef_with_infestation",
            properties -> new Item(properties.food(ModConsumables.CookedBeefWithInfestation, ModConsumables.CookedBeefWithInfestation_edi)));

    public static final Item CookedRabbitWithWeakness = registerItem("cooked_rabbit_with_weakness",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithWeakness, ModConsumables.CookedRabbitWithWeakness_edi)));

    public static final Item CookedRabbitWithHealing = registerItem("cooked_rabbit_with_healing",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithHealing, ModConsumables.CookedRabbitWithHealing_edi)));

    public static final Item CookedRabbitWithRegeneration = registerItem("cooked_rabbit_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithRegeneration, ModConsumables.CookedRabbitWithRegeneration_edi)));

    public static final Item CookedRabbitWithStrength = registerItem("cooked_rabbit_with_strength",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithStrength, ModConsumables.CookedRabbitWithStrength_edi)));

    public static final Item CookedRabbitWithSwiftness = registerItem("cooked_rabbit_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithSwiftness, ModConsumables.CookedRabbitWithSwiftness_edi)));

    public static final Item CookedRabbitWithLeaping = registerItem("cooked_rabbit_with_leaping",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithLeaping, ModConsumables.CookedRabbitWithLeaping_edi)));

    public static final Item CookedRabbitWithFireResistance = registerItem("cooked_rabbit_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithFireResistance, ModConsumables.CookedRabbitWithFireResistance_edi)));

    public static final Item CookedRabbitWithWaterBreathing = registerItem("cooked_rabbit_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithWaterBreathing, ModConsumables.CookedRabbitWithWaterBreathing_edi)));

    public static final Item CookedRabbitWithNightVision = registerItem("cooked_rabbit_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithNightVision, ModConsumables.CookedRabbitWithNightVision_edi)));

    public static final Item CookedRabbitWithInvisibility = registerItem("cooked_rabbit_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithInvisibility, ModConsumables.CookedRabbitWithInvisibility_edi)));

    public static final Item CookedRabbitWithSlowFalling = registerItem("cooked_rabbit_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithSlowFalling, ModConsumables.CookedRabbitWithSlowFalling_edi)));

    public static final Item CookedRabbitWithTheTurtleMaster = registerItem("cooked_rabbit_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithTheTurtleMaster, ModConsumables.CookedRabbitWithTheTurtleMaster_edi)));

    public static final Item CookedRabbitWithPoison = registerItem("cooked_rabbit_with_poison",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithPoison, ModConsumables.CookedRabbitWithPoison_edi)));

    public static final Item CookedRabbitWithHarming = registerItem("cooked_rabbit_with_harming",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithHarming, ModConsumables.CookedRabbitWithHarming_edi)));

    public static final Item CookedRabbitWithSlowness = registerItem("cooked_rabbit_with_slowness",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithSlowness, ModConsumables.CookedRabbitWithSlowness_edi)));

    public static final Item CookedRabbitWithWindCharging = registerItem("cooked_rabbit_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithWindCharging, ModConsumables.CookedRabbitWithWindCharging_edi)));

    public static final Item CookedRabbitWithOozing = registerItem("cooked_rabbit_with_oozing",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithOozing, ModConsumables.CookedRabbitWithOozing_edi)));

    public static final Item CookedRabbitWithWeaving = registerItem("cooked_rabbit_with_weaving",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithWeaving, ModConsumables.CookedRabbitWithWeaving_edi)));

    public static final Item CookedRabbitWithInfestation = registerItem("cooked_rabbit_with_infestation",
            properties -> new Item(properties.food(ModConsumables.CookedRabbitWithInfestation, ModConsumables.CookedRabbitWithInfestation_edi)));

    public static final Item CookedCodWithWeakness = registerItem("cooked_cod_with_weakness",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithWeakness, ModConsumables.CookedCodWithWeakness_edi)));

    public static final Item CookedCodWithHealing = registerItem("cooked_cod_with_healing",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithHealing, ModConsumables.CookedCodWithHealing_edi)));

    public static final Item CookedCodWithRegeneration = registerItem("cooked_cod_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithRegeneration, ModConsumables.CookedCodWithRegeneration_edi)));

    public static final Item CookedCodWithStrength = registerItem("cooked_cod_with_strength",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithStrength, ModConsumables.CookedCodWithStrength_edi)));

    public static final Item CookedCodWithSwiftness = registerItem("cooked_cod_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithSwiftness, ModConsumables.CookedCodWithSwiftness_edi)));

    public static final Item CookedCodWithLeaping = registerItem("cooked_cod_with_leaping",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithLeaping, ModConsumables.CookedCodWithLeaping_edi)));

    public static final Item CookedCodWithFireResistance = registerItem("cooked_cod_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithFireResistance, ModConsumables.CookedCodWithFireResistance_edi)));

    public static final Item CookedCodWithWaterBreathing = registerItem("cooked_cod_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithWaterBreathing, ModConsumables.CookedCodWithWaterBreathing_edi)));

    public static final Item CookedCodWithNightVision = registerItem("cooked_cod_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithNightVision, ModConsumables.CookedCodWithNightVision_edi)));

    public static final Item CookedCodWithInvisibility = registerItem("cooked_cod_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithInvisibility, ModConsumables.CookedCodWithInvisibility_edi)));

    public static final Item CookedCodWithSlowFalling = registerItem("cooked_cod_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithSlowFalling, ModConsumables.CookedCodWithSlowFalling_edi)));

    public static final Item CookedCodWithTheTurtleMaster = registerItem("cooked_cod_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithTheTurtleMaster, ModConsumables.CookedCodWithTheTurtleMaster_edi)));

    public static final Item CookedCodWithPoison = registerItem("cooked_cod_with_poison",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithPoison, ModConsumables.CookedCodWithPoison_edi)));

    public static final Item CookedCodWithHarming = registerItem("cooked_cod_with_harming",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithHarming, ModConsumables.CookedCodWithHarming_edi)));

    public static final Item CookedCodWithSlowness = registerItem("cooked_cod_with_slowness",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithSlowness, ModConsumables.CookedCodWithSlowness_edi)));

    public static final Item CookedCodWithWindCharging = registerItem("cooked_cod_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithWindCharging, ModConsumables.CookedCodWithWindCharging_edi)));

    public static final Item CookedCodWithOozing = registerItem("cooked_cod_with_oozing",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithOozing, ModConsumables.CookedCodWithOozing_edi)));

    public static final Item CookedCodWithWeaving = registerItem("cooked_cod_with_weaving",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithWeaving, ModConsumables.CookedCodWithWeaving_edi)));

    public static final Item CookedCodWithInfestation = registerItem("cooked_cod_with_infestation",
            properties -> new Item(properties.food(ModConsumables.CookedCodWithInfestation, ModConsumables.CookedCodWithInfestation_edi)));

    public static final Item CookedSalmonWithWeakness = registerItem("cooked_salmon_with_weakness",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithWeakness, ModConsumables.CookedSalmonWithWeakness_edi)));

    public static final Item CookedSalmonWithHealing = registerItem("cooked_salmon_with_healing",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithHealing, ModConsumables.CookedSalmonWithHealing_edi)));

    public static final Item CookedSalmonWithRegeneration = registerItem("cooked_salmon_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithRegeneration, ModConsumables.CookedSalmonWithRegeneration_edi)));

    public static final Item CookedSalmonWithStrength = registerItem("cooked_salmon_with_strength",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithStrength, ModConsumables.CookedSalmonWithStrength_edi)));

    public static final Item CookedSalmonWithSwiftness = registerItem("cooked_salmon_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithSwiftness, ModConsumables.CookedSalmonWithSwiftness_edi)));

    public static final Item CookedSalmonWithLeaping = registerItem("cooked_salmon_with_leaping",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithLeaping, ModConsumables.CookedSalmonWithLeaping_edi)));

    public static final Item CookedSalmonWithFireResistance = registerItem("cooked_salmon_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithFireResistance, ModConsumables.CookedSalmonWithFireResistance_edi)));

    public static final Item CookedSalmonWithWaterBreathing = registerItem("cooked_salmon_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithWaterBreathing, ModConsumables.CookedSalmonWithWaterBreathing_edi)));

    public static final Item CookedSalmonWithNightVision = registerItem("cooked_salmon_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithNightVision, ModConsumables.CookedSalmonWithNightVision_edi)));

    public static final Item CookedSalmonWithInvisibility = registerItem("cooked_salmon_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithInvisibility, ModConsumables.CookedSalmonWithInvisibility_edi)));

    public static final Item CookedSalmonWithSlowFalling = registerItem("cooked_salmon_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithSlowFalling, ModConsumables.CookedSalmonWithSlowFalling_edi)));

    public static final Item CookedSalmonWithTheTurtleMaster = registerItem("cooked_salmon_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithTheTurtleMaster, ModConsumables.CookedSalmonWithTheTurtleMaster_edi)));

    public static final Item CookedSalmonWithPoison = registerItem("cooked_salmon_with_poison",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithPoison, ModConsumables.CookedSalmonWithPoison_edi)));

    public static final Item CookedSalmonWithHarming = registerItem("cooked_salmon_with_harming",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithHarming, ModConsumables.CookedSalmonWithHarming_edi)));

    public static final Item CookedSalmonWithSlowness = registerItem("cooked_salmon_with_slowness",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithSlowness, ModConsumables.CookedSalmonWithSlowness_edi)));

    public static final Item CookedSalmonWithWindCharging = registerItem("cooked_salmon_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithWindCharging, ModConsumables.CookedSalmonWithWindCharging_edi)));

    public static final Item CookedSalmonWithOozing = registerItem("cooked_salmon_with_oozing",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithOozing, ModConsumables.CookedSalmonWithOozing_edi)));

    public static final Item CookedSalmonWithWeaving = registerItem("cooked_salmon_with_weaving",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithWeaving, ModConsumables.CookedSalmonWithWeaving_edi)));

    public static final Item CookedSalmonWithInfestation = registerItem("cooked_salmon_with_infestation",
            properties -> new Item(properties.food(ModConsumables.CookedSalmonWithInfestation, ModConsumables.CookedSalmonWithInfestation_edi)));

    public static final Item AppleWithWeakness = registerItem("apple_with_weakness",
            properties -> new Item(properties.food(ModConsumables.AppleWithWeakness, ModConsumables.AppleWithWeakness_edi)));

    public static final Item AppleWithHealing = registerItem("apple_with_healing",
            properties -> new Item(properties.food(ModConsumables.AppleWithHealing, ModConsumables.AppleWithHealing_edi)));

    public static final Item AppleWithRegeneration = registerItem("apple_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.AppleWithRegeneration, ModConsumables.AppleWithRegeneration_edi)));

    public static final Item AppleWithStrength = registerItem("apple_with_strength",
            properties -> new Item(properties.food(ModConsumables.AppleWithStrength, ModConsumables.AppleWithStrength_edi)));

    public static final Item AppleWithSwiftness = registerItem("apple_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.AppleWithSwiftness, ModConsumables.AppleWithSwiftness_edi)));

    public static final Item AppleWithLeaping = registerItem("apple_with_leaping",
            properties -> new Item(properties.food(ModConsumables.AppleWithLeaping, ModConsumables.AppleWithLeaping_edi)));

    public static final Item AppleWithFireResistance = registerItem("apple_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.AppleWithFireResistance, ModConsumables.AppleWithFireResistance_edi)));

    public static final Item AppleWithWaterBreathing = registerItem("apple_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.AppleWithWaterBreathing, ModConsumables.AppleWithWaterBreathing_edi)));

    public static final Item AppleWithNightVision = registerItem("apple_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.AppleWithNightVision, ModConsumables.AppleWithNightVision_edi)));

    public static final Item AppleWithInvisibility = registerItem("apple_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.AppleWithInvisibility, ModConsumables.AppleWithInvisibility_edi)));

    public static final Item AppleWithSlowFalling = registerItem("apple_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.AppleWithSlowFalling, ModConsumables.AppleWithSlowFalling_edi)));

    public static final Item AppleWithTheTurtleMaster = registerItem("apple_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.AppleWithTheTurtleMaster, ModConsumables.AppleWithTheTurtleMaster_edi)));

    public static final Item AppleWithPoison = registerItem("apple_with_poison",
            properties -> new Item(properties.food(ModConsumables.AppleWithPoison, ModConsumables.AppleWithPoison_edi)));

    public static final Item AppleWithHarming = registerItem("apple_with_harming",
            properties -> new Item(properties.food(ModConsumables.AppleWithHarming, ModConsumables.AppleWithHarming_edi)));

    public static final Item AppleWithSlowness = registerItem("apple_with_slowness",
            properties -> new Item(properties.food(ModConsumables.AppleWithSlowness, ModConsumables.AppleWithSlowness_edi)));

    public static final Item AppleWithWindCharging = registerItem("apple_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.AppleWithWindCharging, ModConsumables.AppleWithWindCharging_edi)));

    public static final Item AppleWithOozing = registerItem("apple_with_oozing",
            properties -> new Item(properties.food(ModConsumables.AppleWithOozing, ModConsumables.AppleWithOozing_edi)));

    public static final Item AppleWithWeaving = registerItem("apple_with_weaving",
            properties -> new Item(properties.food(ModConsumables.AppleWithWeaving, ModConsumables.AppleWithWeaving_edi)));

    public static final Item AppleWithInfestation = registerItem("apple_with_infestation",
            properties -> new Item(properties.food(ModConsumables.AppleWithInfestation, ModConsumables.AppleWithInfestation_edi)));

    public static final Item SweetBerriesWithWeakness = registerItem("sweet_berries_with_weakness",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithWeakness, ModConsumables.SweetBerriesWithWeakness_edi)));

    public static final Item SweetBerriesWithHealing = registerItem("sweet_berries_with_healing",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithHealing, ModConsumables.SweetBerriesWithHealing_edi)));

    public static final Item SweetBerriesWithRegeneration = registerItem("sweet_berries_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithRegeneration, ModConsumables.SweetBerriesWithRegeneration_edi)));

    public static final Item SweetBerriesWithStrength = registerItem("sweet_berries_with_strength",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithStrength, ModConsumables.SweetBerriesWithStrength_edi)));

    public static final Item SweetBerriesWithSwiftness = registerItem("sweet_berries_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithSwiftness, ModConsumables.SweetBerriesWithSwiftness_edi)));

    public static final Item SweetBerriesWithLeaping = registerItem("sweet_berries_with_leaping",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithLeaping, ModConsumables.SweetBerriesWithLeaping_edi)));

    public static final Item SweetBerriesWithFireResistance = registerItem("sweet_berries_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithFireResistance, ModConsumables.SweetBerriesWithFireResistance_edi)));

    public static final Item SweetBerriesWithWaterBreathing = registerItem("sweet_berries_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithWaterBreathing, ModConsumables.SweetBerriesWithWaterBreathing_edi)));

    public static final Item SweetBerriesWithNightVision = registerItem("sweet_berries_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithNightVision, ModConsumables.SweetBerriesWithNightVision_edi)));

    public static final Item SweetBerriesWithInvisibility = registerItem("sweet_berries_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithInvisibility, ModConsumables.SweetBerriesWithInvisibility_edi)));

    public static final Item SweetBerriesWithSlowFalling = registerItem("sweet_berries_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithSlowFalling, ModConsumables.SweetBerriesWithSlowFalling_edi)));

    public static final Item SweetBerriesWithTheTurtleMaster = registerItem("sweet_berries_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithTheTurtleMaster, ModConsumables.SweetBerriesWithTheTurtleMaster_edi)));

    public static final Item SweetBerriesWithPoison = registerItem("sweet_berries_with_poison",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithPoison, ModConsumables.SweetBerriesWithPoison_edi)));

    public static final Item SweetBerriesWithHarming = registerItem("sweet_berries_with_harming",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithHarming, ModConsumables.SweetBerriesWithHarming_edi)));

    public static final Item SweetBerriesWithSlowness = registerItem("sweet_berries_with_slowness",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithSlowness, ModConsumables.SweetBerriesWithSlowness_edi)));

    public static final Item SweetBerriesWithWindCharging = registerItem("sweet_berries_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithWindCharging, ModConsumables.SweetBerriesWithWindCharging_edi)));

    public static final Item SweetBerriesWithOozing = registerItem("sweet_berries_with_oozing",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithOozing, ModConsumables.SweetBerriesWithOozing_edi)));

    public static final Item SweetBerriesWithWeaving = registerItem("sweet_berries_with_weaving",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithWeaving, ModConsumables.SweetBerriesWithWeaving_edi)));

    public static final Item SweetBerriesWithInfestation = registerItem("sweet_berries_with_infestation",
            properties -> new Item(properties.food(ModConsumables.SweetBerriesWithInfestation, ModConsumables.SweetBerriesWithInfestation_edi)));

    public static final Item GlowBerriesWithWeakness = registerItem("glow_berries_with_weakness",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithWeakness, ModConsumables.GlowBerriesWithWeakness_edi)));

    public static final Item GlowBerriesWithHealing = registerItem("glow_berries_with_healing",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithHealing, ModConsumables.GlowBerriesWithHealing_edi)));

    public static final Item GlowBerriesWithRegeneration = registerItem("glow_berries_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithRegeneration, ModConsumables.GlowBerriesWithRegeneration_edi)));

    public static final Item GlowBerriesWithStrength = registerItem("glow_berries_with_strength",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithStrength, ModConsumables.GlowBerriesWithStrength_edi)));

    public static final Item GlowBerriesWithSwiftness = registerItem("glow_berries_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithSwiftness, ModConsumables.GlowBerriesWithSwiftness_edi)));

    public static final Item GlowBerriesWithLeaping = registerItem("glow_berries_with_leaping",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithLeaping, ModConsumables.GlowBerriesWithLeaping_edi)));

    public static final Item GlowBerriesWithFireResistance = registerItem("glow_berries_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithFireResistance, ModConsumables.GlowBerriesWithFireResistance_edi)));

    public static final Item GlowBerriesWithWaterBreathing = registerItem("glow_berries_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithWaterBreathing, ModConsumables.GlowBerriesWithWaterBreathing_edi)));

    public static final Item GlowBerriesWithNightVision = registerItem("glow_berries_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithNightVision, ModConsumables.GlowBerriesWithNightVision_edi)));

    public static final Item GlowBerriesWithInvisibility = registerItem("glow_berries_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithInvisibility, ModConsumables.GlowBerriesWithInvisibility_edi)));

    public static final Item GlowBerriesWithSlowFalling = registerItem("glow_berries_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithSlowFalling, ModConsumables.GlowBerriesWithSlowFalling_edi)));

    public static final Item GlowBerriesWithTheTurtleMaster = registerItem("glow_berries_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithTheTurtleMaster, ModConsumables.GlowBerriesWithTheTurtleMaster_edi)));

    public static final Item GlowBerriesWithPoison = registerItem("glow_berries_with_poison",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithPoison, ModConsumables.GlowBerriesWithPoison_edi)));

    public static final Item GlowBerriesWithHarming = registerItem("glow_berries_with_harming",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithHarming, ModConsumables.GlowBerriesWithHarming_edi)));

    public static final Item GlowBerriesWithSlowness = registerItem("glow_berries_with_slowness",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithSlowness, ModConsumables.GlowBerriesWithSlowness_edi)));

    public static final Item GlowBerriesWithWindCharging = registerItem("glow_berries_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithWindCharging, ModConsumables.GlowBerriesWithWindCharging_edi)));

    public static final Item GlowBerriesWithOozing = registerItem("glow_berries_with_oozing",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithOozing, ModConsumables.GlowBerriesWithOozing_edi)));

    public static final Item GlowBerriesWithWeaving = registerItem("glow_berries_with_weaving",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithWeaving, ModConsumables.GlowBerriesWithWeaving_edi)));

    public static final Item GlowBerriesWithInfestation = registerItem("glow_berries_with_infestation",
            properties -> new Item(properties.food(ModConsumables.GlowBerriesWithInfestation, ModConsumables.GlowBerriesWithInfestation_edi)));

    public static final Item MelonSliceWithWeakness = registerItem("melon_slice_with_weakness",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithWeakness, ModConsumables.MelonSliceWithWeakness_edi)));

    public static final Item MelonSliceWithHealing = registerItem("melon_slice_with_healing",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithHealing, ModConsumables.MelonSliceWithHealing_edi)));

    public static final Item MelonSliceWithRegeneration = registerItem("melon_slice_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithRegeneration, ModConsumables.MelonSliceWithRegeneration_edi)));

    public static final Item MelonSliceWithStrength = registerItem("melon_slice_with_strength",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithStrength, ModConsumables.MelonSliceWithStrength_edi)));

    public static final Item MelonSliceWithSwiftness = registerItem("melon_slice_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithSwiftness, ModConsumables.MelonSliceWithSwiftness_edi)));

    public static final Item MelonSliceWithLeaping = registerItem("melon_slice_with_leaping",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithLeaping, ModConsumables.MelonSliceWithLeaping_edi)));

    public static final Item MelonSliceWithFireResistance = registerItem("melon_slice_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithFireResistance, ModConsumables.MelonSliceWithFireResistance_edi)));

    public static final Item MelonSliceWithWaterBreathing = registerItem("melon_slice_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithWaterBreathing, ModConsumables.MelonSliceWithWaterBreathing_edi)));

    public static final Item MelonSliceWithNightVision = registerItem("melon_slice_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithNightVision, ModConsumables.MelonSliceWithNightVision_edi)));

    public static final Item MelonSliceWithInvisibility = registerItem("melon_slice_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithInvisibility, ModConsumables.MelonSliceWithInvisibility_edi)));

    public static final Item MelonSliceWithSlowFalling = registerItem("melon_slice_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithSlowFalling, ModConsumables.MelonSliceWithSlowFalling_edi)));

    public static final Item MelonSliceWithTheTurtleMaster = registerItem("melon_slice_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithTheTurtleMaster, ModConsumables.MelonSliceWithTheTurtleMaster_edi)));

    public static final Item MelonSliceWithPoison = registerItem("melon_slice_with_poison",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithPoison, ModConsumables.MelonSliceWithPoison_edi)));

    public static final Item MelonSliceWithHarming = registerItem("melon_slice_with_harming",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithHarming, ModConsumables.MelonSliceWithHarming_edi)));

    public static final Item MelonSliceWithSlowness = registerItem("melon_slice_with_slowness",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithSlowness, ModConsumables.MelonSliceWithSlowness_edi)));

    public static final Item MelonSliceWithWindCharging = registerItem("melon_slice_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithWindCharging, ModConsumables.MelonSliceWithWindCharging_edi)));

    public static final Item MelonSliceWithOozing = registerItem("melon_slice_with_oozing",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithOozing, ModConsumables.MelonSliceWithOozing_edi)));

    public static final Item MelonSliceWithWeaving = registerItem("melon_slice_with_weaving",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithWeaving, ModConsumables.MelonSliceWithWeaving_edi)));

    public static final Item MelonSliceWithInfestation = registerItem("melon_slice_with_infestation",
            properties -> new Item(properties.food(ModConsumables.MelonSliceWithInfestation, ModConsumables.MelonSliceWithInfestation_edi)));

    public static final Item CarrotWithWeakness = registerItem("carrot_with_weakness",
            properties -> new Item(properties.food(ModConsumables.CarrotWithWeakness, ModConsumables.CarrotWithWeakness_edi)));

    public static final Item CarrotWithHealing = registerItem("carrot_with_healing",
            properties -> new Item(properties.food(ModConsumables.CarrotWithHealing, ModConsumables.CarrotWithHealing_edi)));

    public static final Item CarrotWithRegeneration = registerItem("carrot_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.CarrotWithRegeneration, ModConsumables.CarrotWithRegeneration_edi)));

    public static final Item CarrotWithStrength = registerItem("carrot_with_strength",
            properties -> new Item(properties.food(ModConsumables.CarrotWithStrength, ModConsumables.CarrotWithStrength_edi)));

    public static final Item CarrotWithSwiftness = registerItem("carrot_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.CarrotWithSwiftness, ModConsumables.CarrotWithSwiftness_edi)));

    public static final Item CarrotWithLeaping = registerItem("carrot_with_leaping",
            properties -> new Item(properties.food(ModConsumables.CarrotWithLeaping, ModConsumables.CarrotWithLeaping_edi)));

    public static final Item CarrotWithFireResistance = registerItem("carrot_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.CarrotWithFireResistance, ModConsumables.CarrotWithFireResistance_edi)));

    public static final Item CarrotWithWaterBreathing = registerItem("carrot_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.CarrotWithWaterBreathing, ModConsumables.CarrotWithWaterBreathing_edi)));

    public static final Item CarrotWithNightVision = registerItem("carrot_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.CarrotWithNightVision, ModConsumables.CarrotWithNightVision_edi)));

    public static final Item CarrotWithInvisibility = registerItem("carrot_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.CarrotWithInvisibility, ModConsumables.CarrotWithInvisibility_edi)));

    public static final Item CarrotWithSlowFalling = registerItem("carrot_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.CarrotWithSlowFalling, ModConsumables.CarrotWithSlowFalling_edi)));

    public static final Item CarrotWithTheTurtleMaster = registerItem("carrot_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.CarrotWithTheTurtleMaster, ModConsumables.CarrotWithTheTurtleMaster_edi)));

    public static final Item CarrotWithPoison = registerItem("carrot_with_poison",
            properties -> new Item(properties.food(ModConsumables.CarrotWithPoison, ModConsumables.CarrotWithPoison_edi)));

    public static final Item CarrotWithHarming = registerItem("carrot_with_harming",
            properties -> new Item(properties.food(ModConsumables.CarrotWithHarming, ModConsumables.CarrotWithHarming_edi)));

    public static final Item CarrotWithSlowness = registerItem("carrot_with_slowness",
            properties -> new Item(properties.food(ModConsumables.CarrotWithSlowness, ModConsumables.CarrotWithSlowness_edi)));

    public static final Item CarrotWithWindCharging = registerItem("carrot_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.CarrotWithWindCharging, ModConsumables.CarrotWithWindCharging_edi)));

    public static final Item CarrotWithOozing = registerItem("carrot_with_oozing",
            properties -> new Item(properties.food(ModConsumables.CarrotWithOozing, ModConsumables.CarrotWithOozing_edi)));

    public static final Item CarrotWithWeaving = registerItem("carrot_with_weaving",
            properties -> new Item(properties.food(ModConsumables.CarrotWithWeaving, ModConsumables.CarrotWithWeaving_edi)));

    public static final Item CarrotWithInfestation = registerItem("carrot_with_infestation",
            properties -> new Item(properties.food(ModConsumables.CarrotWithInfestation, ModConsumables.CarrotWithInfestation_edi)));

    public static final Item PotatoWithWeakness = registerItem("potato_with_weakness",
            properties -> new Item(properties.food(ModConsumables.PotatoWithWeakness, ModConsumables.PotatoWithWeakness_edi)));

    public static final Item PotatoWithHealing = registerItem("potato_with_healing",
            properties -> new Item(properties.food(ModConsumables.PotatoWithHealing, ModConsumables.PotatoWithHealing_edi)));

    public static final Item PotatoWithRegeneration = registerItem("potato_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.PotatoWithRegeneration, ModConsumables.PotatoWithRegeneration_edi)));

    public static final Item PotatoWithStrength = registerItem("potato_with_strength",
            properties -> new Item(properties.food(ModConsumables.PotatoWithStrength, ModConsumables.PotatoWithStrength_edi)));

    public static final Item PotatoWithSwiftness = registerItem("potato_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.PotatoWithSwiftness, ModConsumables.PotatoWithSwiftness_edi)));

    public static final Item PotatoWithLeaping = registerItem("potato_with_leaping",
            properties -> new Item(properties.food(ModConsumables.PotatoWithLeaping, ModConsumables.PotatoWithLeaping_edi)));

    public static final Item PotatoWithFireResistance = registerItem("potato_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.PotatoWithFireResistance, ModConsumables.PotatoWithFireResistance_edi)));

    public static final Item PotatoWithWaterBreathing = registerItem("potato_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.PotatoWithWaterBreathing, ModConsumables.PotatoWithWaterBreathing_edi)));

    public static final Item PotatoWithNightVision = registerItem("potato_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.PotatoWithNightVision, ModConsumables.PotatoWithNightVision_edi)));

    public static final Item PotatoWithInvisibility = registerItem("potato_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.PotatoWithInvisibility, ModConsumables.PotatoWithInvisibility_edi)));

    public static final Item PotatoWithSlowFalling = registerItem("potato_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.PotatoWithSlowFalling, ModConsumables.PotatoWithSlowFalling_edi)));

    public static final Item PotatoWithTheTurtleMaster = registerItem("potato_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.PotatoWithTheTurtleMaster, ModConsumables.PotatoWithTheTurtleMaster_edi)));

    public static final Item PotatoWithPoison = registerItem("potato_with_poison",
            properties -> new Item(properties.food(ModConsumables.PotatoWithPoison, ModConsumables.PotatoWithPoison_edi)));

    public static final Item PotatoWithHarming = registerItem("potato_with_harming",
            properties -> new Item(properties.food(ModConsumables.PotatoWithHarming, ModConsumables.PotatoWithHarming_edi)));

    public static final Item PotatoWithSlowness = registerItem("potato_with_slowness",
            properties -> new Item(properties.food(ModConsumables.PotatoWithSlowness, ModConsumables.PotatoWithSlowness_edi)));

    public static final Item PotatoWithWindCharging = registerItem("potato_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.PotatoWithWindCharging, ModConsumables.PotatoWithWindCharging_edi)));

    public static final Item PotatoWithOozing = registerItem("potato_with_oozing",
            properties -> new Item(properties.food(ModConsumables.PotatoWithOozing, ModConsumables.PotatoWithOozing_edi)));

    public static final Item PotatoWithWeaving = registerItem("potato_with_weaving",
            properties -> new Item(properties.food(ModConsumables.PotatoWithWeaving, ModConsumables.PotatoWithWeaving_edi)));

    public static final Item PotatoWithInfestation = registerItem("potato_with_infestation",
            properties -> new Item(properties.food(ModConsumables.PotatoWithInfestation, ModConsumables.PotatoWithInfestation_edi)));

    public static final Item BakedPotatoWithWeakness = registerItem("baked_potato_with_weakness",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithWeakness, ModConsumables.BakedPotatoWithWeakness_edi)));

    public static final Item BakedPotatoWithHealing = registerItem("baked_potato_with_healing",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithHealing, ModConsumables.BakedPotatoWithHealing_edi)));

    public static final Item BakedPotatoWithRegeneration = registerItem("baked_potato_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithRegeneration, ModConsumables.BakedPotatoWithRegeneration_edi)));

    public static final Item BakedPotatoWithStrength = registerItem("baked_potato_with_strength",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithStrength, ModConsumables.BakedPotatoWithStrength_edi)));

    public static final Item BakedPotatoWithSwiftness = registerItem("baked_potato_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithSwiftness, ModConsumables.BakedPotatoWithSwiftness_edi)));

    public static final Item BakedPotatoWithLeaping = registerItem("baked_potato_with_leaping",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithLeaping, ModConsumables.BakedPotatoWithLeaping_edi)));

    public static final Item BakedPotatoWithFireResistance = registerItem("baked_potato_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithFireResistance, ModConsumables.BakedPotatoWithFireResistance_edi)));

    public static final Item BakedPotatoWithWaterBreathing = registerItem("baked_potato_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithWaterBreathing, ModConsumables.BakedPotatoWithWaterBreathing_edi)));

    public static final Item BakedPotatoWithNightVision = registerItem("baked_potato_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithNightVision, ModConsumables.BakedPotatoWithNightVision_edi)));

    public static final Item BakedPotatoWithInvisibility = registerItem("baked_potato_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithInvisibility, ModConsumables.BakedPotatoWithInvisibility_edi)));

    public static final Item BakedPotatoWithSlowFalling = registerItem("baked_potato_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithSlowFalling, ModConsumables.BakedPotatoWithSlowFalling_edi)));

    public static final Item BakedPotatoWithTheTurtleMaster = registerItem("baked_potato_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithTheTurtleMaster, ModConsumables.BakedPotatoWithTheTurtleMaster_edi)));

    public static final Item BakedPotatoWithPoison = registerItem("baked_potato_with_poison",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithPoison, ModConsumables.BakedPotatoWithPoison_edi)));

    public static final Item BakedPotatoWithHarming = registerItem("baked_potato_with_harming",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithHarming, ModConsumables.BakedPotatoWithHarming_edi)));

    public static final Item BakedPotatoWithSlowness = registerItem("baked_potato_with_slowness",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithSlowness, ModConsumables.BakedPotatoWithSlowness_edi)));

    public static final Item BakedPotatoWithWindCharging = registerItem("baked_potato_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithWindCharging, ModConsumables.BakedPotatoWithWindCharging_edi)));

    public static final Item BakedPotatoWithOozing = registerItem("baked_potato_with_oozing",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithOozing, ModConsumables.BakedPotatoWithOozing_edi)));

    public static final Item BakedPotatoWithWeaving = registerItem("baked_potato_with_weaving",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithWeaving, ModConsumables.BakedPotatoWithWeaving_edi)));

    public static final Item BakedPotatoWithInfestation = registerItem("baked_potato_with_infestation",
            properties -> new Item(properties.food(ModConsumables.BakedPotatoWithInfestation, ModConsumables.BakedPotatoWithInfestation_edi)));

    public static final Item BeetrootWithWeakness = registerItem("beetroot_with_weakness",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithWeakness, ModConsumables.BeetrootWithWeakness_edi)));

    public static final Item BeetrootWithHealing = registerItem("beetroot_with_healing",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithHealing, ModConsumables.BeetrootWithHealing_edi)));

    public static final Item BeetrootWithRegeneration = registerItem("beetroot_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithRegeneration, ModConsumables.BeetrootWithRegeneration_edi)));

    public static final Item BeetrootWithStrength = registerItem("beetroot_with_strength",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithStrength, ModConsumables.BeetrootWithStrength_edi)));

    public static final Item BeetrootWithSwiftness = registerItem("beetroot_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithSwiftness, ModConsumables.BeetrootWithSwiftness_edi)));

    public static final Item BeetrootWithLeaping = registerItem("beetroot_with_leaping",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithLeaping, ModConsumables.BeetrootWithLeaping_edi)));

    public static final Item BeetrootWithFireResistance = registerItem("beetroot_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithFireResistance, ModConsumables.BeetrootWithFireResistance_edi)));

    public static final Item BeetrootWithWaterBreathing = registerItem("beetroot_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithWaterBreathing, ModConsumables.BeetrootWithWaterBreathing_edi)));

    public static final Item BeetrootWithNightVision = registerItem("beetroot_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithNightVision, ModConsumables.BeetrootWithNightVision_edi)));

    public static final Item BeetrootWithInvisibility = registerItem("beetroot_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithInvisibility, ModConsumables.BeetrootWithInvisibility_edi)));

    public static final Item BeetrootWithSlowFalling = registerItem("beetroot_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithSlowFalling, ModConsumables.BeetrootWithSlowFalling_edi)));

    public static final Item BeetrootWithTheTurtleMaster = registerItem("beetroot_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithTheTurtleMaster, ModConsumables.BeetrootWithTheTurtleMaster_edi)));

    public static final Item BeetrootWithPoison = registerItem("beetroot_with_poison",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithPoison, ModConsumables.BeetrootWithPoison_edi)));

    public static final Item BeetrootWithHarming = registerItem("beetroot_with_harming",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithHarming, ModConsumables.BeetrootWithHarming_edi)));

    public static final Item BeetrootWithSlowness = registerItem("beetroot_with_slowness",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithSlowness, ModConsumables.BeetrootWithSlowness_edi)));

    public static final Item BeetrootWithWindCharging = registerItem("beetroot_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithWindCharging, ModConsumables.BeetrootWithWindCharging_edi)));

    public static final Item BeetrootWithOozing = registerItem("beetroot_with_oozing",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithOozing, ModConsumables.BeetrootWithOozing_edi)));

    public static final Item BeetrootWithWeaving = registerItem("beetroot_with_weaving",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithWeaving, ModConsumables.BeetrootWithWeaving_edi)));

    public static final Item BeetrootWithInfestation = registerItem("beetroot_with_infestation",
            properties -> new Item(properties.food(ModConsumables.BeetrootWithInfestation, ModConsumables.BeetrootWithInfestation_edi)));

    public static final Item DriedKelpWithWeakness = registerItem("dried_kelp_with_weakness",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithWeakness, ModConsumables.DriedKelpWithWeakness_edi)));

    public static final Item DriedKelpWithHealing = registerItem("dried_kelp_with_healing",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithHealing, ModConsumables.DriedKelpWithHealing_edi)));

    public static final Item DriedKelpWithRegeneration = registerItem("dried_kelp_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithRegeneration, ModConsumables.DriedKelpWithRegeneration_edi)));

    public static final Item DriedKelpWithStrength = registerItem("dried_kelp_with_strength",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithStrength, ModConsumables.DriedKelpWithStrength_edi)));

    public static final Item DriedKelpWithSwiftness = registerItem("dried_kelp_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithSwiftness, ModConsumables.DriedKelpWithSwiftness_edi)));

    public static final Item DriedKelpWithLeaping = registerItem("dried_kelp_with_leaping",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithLeaping, ModConsumables.DriedKelpWithLeaping_edi)));

    public static final Item DriedKelpWithFireResistance = registerItem("dried_kelp_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithFireResistance, ModConsumables.DriedKelpWithFireResistance_edi)));

    public static final Item DriedKelpWithWaterBreathing = registerItem("dried_kelp_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithWaterBreathing, ModConsumables.DriedKelpWithWaterBreathing_edi)));

    public static final Item DriedKelpWithNightVision = registerItem("dried_kelp_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithNightVision, ModConsumables.DriedKelpWithNightVision_edi)));

    public static final Item DriedKelpWithInvisibility = registerItem("dried_kelp_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithInvisibility, ModConsumables.DriedKelpWithInvisibility_edi)));

    public static final Item DriedKelpWithSlowFalling = registerItem("dried_kelp_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithSlowFalling, ModConsumables.DriedKelpWithSlowFalling_edi)));

    public static final Item DriedKelpWithTheTurtleMaster = registerItem("dried_kelp_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithTheTurtleMaster, ModConsumables.DriedKelpWithTheTurtleMaster_edi)));

    public static final Item DriedKelpWithPoison = registerItem("dried_kelp_with_poison",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithPoison, ModConsumables.DriedKelpWithPoison_edi)));

    public static final Item DriedKelpWithHarming = registerItem("dried_kelp_with_harming",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithHarming, ModConsumables.DriedKelpWithHarming_edi)));

    public static final Item DriedKelpWithSlowness = registerItem("dried_kelp_with_slowness",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithSlowness, ModConsumables.DriedKelpWithSlowness_edi)));

    public static final Item DriedKelpWithWindCharging = registerItem("dried_kelp_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithWindCharging, ModConsumables.DriedKelpWithWindCharging_edi)));

    public static final Item DriedKelpWithOozing = registerItem("dried_kelp_with_oozing",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithOozing, ModConsumables.DriedKelpWithOozing_edi)));

    public static final Item DriedKelpWithWeaving = registerItem("dried_kelp_with_weaving",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithWeaving, ModConsumables.DriedKelpWithWeaving_edi)));

    public static final Item DriedKelpWithInfestation = registerItem("dried_kelp_with_infestation",
            properties -> new Item(properties.food(ModConsumables.DriedKelpWithInfestation, ModConsumables.DriedKelpWithInfestation_edi)));

    public static final Item BreadWithWeakness = registerItem("bread_with_weakness",
            properties -> new Item(properties.food(ModConsumables.BreadWithWeakness, ModConsumables.BreadWithWeakness_edi)));

    public static final Item BreadWithHealing = registerItem("bread_with_healing",
            properties -> new Item(properties.food(ModConsumables.BreadWithHealing, ModConsumables.BreadWithHealing_edi)));

    public static final Item BreadWithRegeneration = registerItem("bread_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.BreadWithRegeneration, ModConsumables.BreadWithRegeneration_edi)));

    public static final Item BreadWithStrength = registerItem("bread_with_strength",
            properties -> new Item(properties.food(ModConsumables.BreadWithStrength, ModConsumables.BreadWithStrength_edi)));

    public static final Item BreadWithSwiftness = registerItem("bread_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.BreadWithSwiftness, ModConsumables.BreadWithSwiftness_edi)));

    public static final Item BreadWithLeaping = registerItem("bread_with_leaping",
            properties -> new Item(properties.food(ModConsumables.BreadWithLeaping, ModConsumables.BreadWithLeaping_edi)));

    public static final Item BreadWithFireResistance = registerItem("bread_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.BreadWithFireResistance, ModConsumables.BreadWithFireResistance_edi)));

    public static final Item BreadWithWaterBreathing = registerItem("bread_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.BreadWithWaterBreathing, ModConsumables.BreadWithWaterBreathing_edi)));

    public static final Item BreadWithNightVision = registerItem("bread_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.BreadWithNightVision, ModConsumables.BreadWithNightVision_edi)));

    public static final Item BreadWithInvisibility = registerItem("bread_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.BreadWithInvisibility, ModConsumables.BreadWithInvisibility_edi)));

    public static final Item BreadWithSlowFalling = registerItem("bread_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.BreadWithSlowFalling, ModConsumables.BreadWithSlowFalling_edi)));

    public static final Item BreadWithTheTurtleMaster = registerItem("bread_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.BreadWithTheTurtleMaster, ModConsumables.BreadWithTheTurtleMaster_edi)));

    public static final Item BreadWithPoison = registerItem("bread_with_poison",
            properties -> new Item(properties.food(ModConsumables.BreadWithPoison, ModConsumables.BreadWithPoison_edi)));

    public static final Item BreadWithHarming = registerItem("bread_with_harming",
            properties -> new Item(properties.food(ModConsumables.BreadWithHarming, ModConsumables.BreadWithHarming_edi)));

    public static final Item BreadWithSlowness = registerItem("bread_with_slowness",
            properties -> new Item(properties.food(ModConsumables.BreadWithSlowness, ModConsumables.BreadWithSlowness_edi)));

    public static final Item BreadWithWindCharging = registerItem("bread_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.BreadWithWindCharging, ModConsumables.BreadWithWindCharging_edi)));

    public static final Item BreadWithOozing = registerItem("bread_with_oozing",
            properties -> new Item(properties.food(ModConsumables.BreadWithOozing, ModConsumables.BreadWithOozing_edi)));

    public static final Item BreadWithWeaving = registerItem("bread_with_weaving",
            properties -> new Item(properties.food(ModConsumables.BreadWithWeaving, ModConsumables.BreadWithWeaving_edi)));

    public static final Item BreadWithInfestation = registerItem("bread_with_infestation",
            properties -> new Item(properties.food(ModConsumables.BreadWithInfestation, ModConsumables.BreadWithInfestation_edi)));

    public static final Item CookieWithWeakness = registerItem("cookie_with_weakness",
            properties -> new Item(properties.food(ModConsumables.CookieWithWeakness, ModConsumables.CookieWithWeakness_edi)));

    public static final Item CookieWithHealing = registerItem("cookie_with_healing",
            properties -> new Item(properties.food(ModConsumables.CookieWithHealing, ModConsumables.CookieWithHealing_edi)));

    public static final Item CookieWithRegeneration = registerItem("cookie_with_regeneration",
            properties -> new Item(properties.food(ModConsumables.CookieWithRegeneration, ModConsumables.CookieWithRegeneration_edi)));

    public static final Item CookieWithStrength = registerItem("cookie_with_strength",
            properties -> new Item(properties.food(ModConsumables.CookieWithStrength, ModConsumables.CookieWithStrength_edi)));

    public static final Item CookieWithSwiftness = registerItem("cookie_with_swiftness",
            properties -> new Item(properties.food(ModConsumables.CookieWithSwiftness, ModConsumables.CookieWithSwiftness_edi)));

    public static final Item CookieWithLeaping = registerItem("cookie_with_leaping",
            properties -> new Item(properties.food(ModConsumables.CookieWithLeaping, ModConsumables.CookieWithLeaping_edi)));

    public static final Item CookieWithFireResistance = registerItem("cookie_with_fire_resistance",
            properties -> new Item(properties.food(ModConsumables.CookieWithFireResistance, ModConsumables.CookieWithFireResistance_edi)));

    public static final Item CookieWithWaterBreathing = registerItem("cookie_with_water_breathing",
            properties -> new Item(properties.food(ModConsumables.CookieWithWaterBreathing, ModConsumables.CookieWithWaterBreathing_edi)));

    public static final Item CookieWithNightVision = registerItem("cookie_with_night_vision",
            properties -> new Item(properties.food(ModConsumables.CookieWithNightVision, ModConsumables.CookieWithNightVision_edi)));

    public static final Item CookieWithInvisibility = registerItem("cookie_with_invisibility",
            properties -> new Item(properties.food(ModConsumables.CookieWithInvisibility, ModConsumables.CookieWithInvisibility_edi)));

    public static final Item CookieWithSlowFalling = registerItem("cookie_with_slow_falling",
            properties -> new Item(properties.food(ModConsumables.CookieWithSlowFalling, ModConsumables.CookieWithSlowFalling_edi)));

    public static final Item CookieWithTheTurtleMaster = registerItem("cookie_with_the_turtle_master",
            properties -> new Item(properties.food(ModConsumables.CookieWithTheTurtleMaster, ModConsumables.CookieWithTheTurtleMaster_edi)));

    public static final Item CookieWithPoison = registerItem("cookie_with_poison",
            properties -> new Item(properties.food(ModConsumables.CookieWithPoison, ModConsumables.CookieWithPoison_edi)));

    public static final Item CookieWithHarming = registerItem("cookie_with_harming",
            properties -> new Item(properties.food(ModConsumables.CookieWithHarming, ModConsumables.CookieWithHarming_edi)));

    public static final Item CookieWithSlowness = registerItem("cookie_with_slowness",
            properties -> new Item(properties.food(ModConsumables.CookieWithSlowness, ModConsumables.CookieWithSlowness_edi)));

    public static final Item CookieWithWindCharging = registerItem("cookie_with_wind_charging",
            properties -> new Item(properties.food(ModConsumables.CookieWithWindCharging, ModConsumables.CookieWithWindCharging_edi)));

    public static final Item CookieWithOozing = registerItem("cookie_with_oozing",
            properties -> new Item(properties.food(ModConsumables.CookieWithOozing, ModConsumables.CookieWithOozing_edi)));

    public static final Item CookieWithWeaving = registerItem("cookie_with_weaving",
            properties -> new Item(properties.food(ModConsumables.CookieWithWeaving, ModConsumables.CookieWithWeaving_edi)));

    public static final Item CookieWithInfestation = registerItem("cookie_with_infestation",
            properties -> new Item(properties.food(ModConsumables.CookieWithInfestation, ModConsumables.CookieWithInfestation_edi)));

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
