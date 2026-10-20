package name.modid.consumable;

import name.modid.Morefood;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModConsumables {

    // tubes
    public static final FoodProperties TesttubeOfWeakness= new FoodProperties.Builder().nutrition(0).alwaysEdible().build();
    public static final Consumable TesttubeOfWeakness_edi = Consumables.defaultDrink()
            .consumeSeconds(3).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS))).build();

    // DriedKelp (Nutrition: 1, Saturation: 0.1F)
    public static final FoodProperties DriedKelpWithWeakness = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithHealing = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithRegeneration = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithStrength = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithSwiftness = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithLeaping = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithFireResistance = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithWaterBreathing = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithNightVision = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithInvisibility = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithSlowFalling = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithTheTurtleMaster = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithPoison = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithHarming = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithSlowness = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithWindCharging = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithOozing = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithWeaving = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 300), 1f)).build();
    public static final FoodProperties DriedKelpWithInfestation = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final Consumable DriedKelpWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 300), 1f)).build();

    // Potato (Nutrition: 1, Saturation: 0.3F)
    public static final FoodProperties PotatoWithWeakness = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 300), 1f)).build();
    public static final FoodProperties PotatoWithHealing = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 300), 1f)).build();
    public static final FoodProperties PotatoWithRegeneration = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 300), 1f)).build();
    public static final FoodProperties PotatoWithStrength = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 300), 1f)).build();
    public static final FoodProperties PotatoWithSwiftness = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 300), 1f)).build();
    public static final FoodProperties PotatoWithLeaping = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 300), 1f)).build();
    public static final FoodProperties PotatoWithFireResistance = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300), 1f)).build();
    public static final FoodProperties PotatoWithWaterBreathing = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 300), 1f)).build();
    public static final FoodProperties PotatoWithNightVision = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 300), 1f)).build();
    public static final FoodProperties PotatoWithInvisibility = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 300), 1f)).build();
    public static final FoodProperties PotatoWithSlowFalling = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 300), 1f)).build();
    public static final FoodProperties PotatoWithTheTurtleMaster = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 300), 1f)).build();
    public static final FoodProperties PotatoWithPoison = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 300), 1f)).build();
    public static final FoodProperties PotatoWithHarming = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 300), 1f)).build();
    public static final FoodProperties PotatoWithSlowness = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 300), 1f)).build();
    public static final FoodProperties PotatoWithWindCharging = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 300), 1f)).build();
    public static final FoodProperties PotatoWithOozing = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 300), 1f)).build();
    public static final FoodProperties PotatoWithWeaving = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 300), 1f)).build();
    public static final FoodProperties PotatoWithInfestation = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final Consumable PotatoWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 300), 1f)).build();

    // Beetroot (Nutrition: 1, Saturation: 0.6F)
    public static final FoodProperties BeetrootWithWeakness = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 300), 1f)).build();
    public static final FoodProperties BeetrootWithHealing = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 300), 1f)).build();
    public static final FoodProperties BeetrootWithRegeneration = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 300), 1f)).build();
    public static final FoodProperties BeetrootWithStrength = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 300), 1f)).build();
    public static final FoodProperties BeetrootWithSwiftness = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 300), 1f)).build();
    public static final FoodProperties BeetrootWithLeaping = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 300), 1f)).build();
    public static final FoodProperties BeetrootWithFireResistance = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300), 1f)).build();
    public static final FoodProperties BeetrootWithWaterBreathing = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 300), 1f)).build();
    public static final FoodProperties BeetrootWithNightVision = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 300), 1f)).build();
    public static final FoodProperties BeetrootWithInvisibility = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 300), 1f)).build();
    public static final FoodProperties BeetrootWithSlowFalling = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 300), 1f)).build();
    public static final FoodProperties BeetrootWithTheTurtleMaster = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 300), 1f)).build();
    public static final FoodProperties BeetrootWithPoison = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 300), 1f)).build();
    public static final FoodProperties BeetrootWithHarming = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 300), 1f)).build();
    public static final FoodProperties BeetrootWithSlowness = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 300), 1f)).build();
    public static final FoodProperties BeetrootWithWindCharging = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 300), 1f)).build();
    public static final FoodProperties BeetrootWithOozing = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 300), 1f)).build();
    public static final FoodProperties BeetrootWithWeaving = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 300), 1f)).build();
    public static final FoodProperties BeetrootWithInfestation = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final Consumable BeetrootWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 300), 1f)).build();

    // Cookie (Nutrition: 2, Saturation: 0.4F)
    public static final FoodProperties CookieWithWeakness = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 600), 1f)).build();
    public static final FoodProperties CookieWithHealing = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 600), 1f)).build();
    public static final FoodProperties CookieWithRegeneration = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 600), 1f)).build();
    public static final FoodProperties CookieWithStrength = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 600), 1f)).build();
    public static final FoodProperties CookieWithSwiftness = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 600), 1f)).build();
    public static final FoodProperties CookieWithLeaping = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 600), 1f)).build();
    public static final FoodProperties CookieWithFireResistance = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600), 1f)).build();
    public static final FoodProperties CookieWithWaterBreathing = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 600), 1f)).build();
    public static final FoodProperties CookieWithNightVision = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600), 1f)).build();
    public static final FoodProperties CookieWithInvisibility = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 600), 1f)).build();
    public static final FoodProperties CookieWithSlowFalling = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 600), 1f)).build();
    public static final FoodProperties CookieWithTheTurtleMaster = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 600), 1f)).build();
    public static final FoodProperties CookieWithPoison = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 600), 1f)).build();
    public static final FoodProperties CookieWithHarming = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 600), 1f)).build();
    public static final FoodProperties CookieWithSlowness = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 600), 1f)).build();
    public static final FoodProperties CookieWithWindCharging = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 600), 1f)).build();
    public static final FoodProperties CookieWithOozing = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 600), 1f)).build();
    public static final FoodProperties CookieWithWeaving = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 600), 1f)).build();
    public static final FoodProperties CookieWithInfestation = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable CookieWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 600), 1f)).build();

    // SweetBerries (Nutrition: 2, Saturation: 0.4F)
    public static final FoodProperties SweetBerriesWithWeakness = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithHealing = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithRegeneration = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithStrength = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithSwiftness = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithLeaping = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithFireResistance = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithWaterBreathing = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithNightVision = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithInvisibility = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithSlowFalling = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithTheTurtleMaster = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithPoison = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithHarming = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithSlowness = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithWindCharging = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithOozing = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithWeaving = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 600), 1f)).build();
    public static final FoodProperties SweetBerriesWithInfestation = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable SweetBerriesWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 600), 1f)).build();

    // GlowBerries (Nutrition: 2, Saturation: 0.4F)
    public static final FoodProperties GlowBerriesWithWeakness = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithHealing = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithRegeneration = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithStrength = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithSwiftness = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithLeaping = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithFireResistance = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithWaterBreathing = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithNightVision = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithInvisibility = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithSlowFalling = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithTheTurtleMaster = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithPoison = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithHarming = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithSlowness = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithWindCharging = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithOozing = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithWeaving = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 600), 1f)).build();
    public static final FoodProperties GlowBerriesWithInfestation = new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final Consumable GlowBerriesWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 600), 1f)).build();

    // MelonSlice (Nutrition: 2, Saturation: 0.3F)
    public static final FoodProperties MelonSliceWithWeakness = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithHealing = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithRegeneration = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithStrength = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithSwiftness = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithLeaping = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithFireResistance = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithWaterBreathing = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithNightVision = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithInvisibility = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithSlowFalling = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithTheTurtleMaster = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithPoison = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithHarming = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithSlowness = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithWindCharging = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithOozing = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithWeaving = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 600), 1f)).build();
    public static final FoodProperties MelonSliceWithInfestation = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final Consumable MelonSliceWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 600), 1f)).build();

    // Carrot (Nutrition: 3, Saturation: 0.6F)
    public static final FoodProperties CarrotWithWeakness = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 900), 1f)).build();
    public static final FoodProperties CarrotWithHealing = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 900), 1f)).build();
    public static final FoodProperties CarrotWithRegeneration = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 900), 1f)).build();
    public static final FoodProperties CarrotWithStrength = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 900), 1f)).build();
    public static final FoodProperties CarrotWithSwiftness = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 900), 1f)).build();
    public static final FoodProperties CarrotWithLeaping = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 900), 1f)).build();
    public static final FoodProperties CarrotWithFireResistance = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 900), 1f)).build();
    public static final FoodProperties CarrotWithWaterBreathing = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 900), 1f)).build();
    public static final FoodProperties CarrotWithNightVision = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 900), 1f)).build();
    public static final FoodProperties CarrotWithInvisibility = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 900), 1f)).build();
    public static final FoodProperties CarrotWithSlowFalling = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 900), 1f)).build();
    public static final FoodProperties CarrotWithTheTurtleMaster = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 900), 1f)).build();
    public static final FoodProperties CarrotWithPoison = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 900), 1f)).build();
    public static final FoodProperties CarrotWithHarming = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 900), 1f)).build();
    public static final FoodProperties CarrotWithSlowness = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 900), 1f)).build();
    public static final FoodProperties CarrotWithWindCharging = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 900), 1f)).build();
    public static final FoodProperties CarrotWithOozing = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 900), 1f)).build();
    public static final FoodProperties CarrotWithWeaving = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 900), 1f)).build();
    public static final FoodProperties CarrotWithInfestation = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final Consumable CarrotWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 900), 1f)).build();

    // Apple (Nutrition: 4, Saturation: 0.3F)
    public static final FoodProperties AppleWithWeakness = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1200), 1f)).build();
    public static final FoodProperties AppleWithHealing = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 1200), 1f)).build();
    public static final FoodProperties AppleWithRegeneration = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200), 1f)).build();
    public static final FoodProperties AppleWithStrength = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 1200), 1f)).build();
    public static final FoodProperties AppleWithSwiftness = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 1200), 1f)).build();
    public static final FoodProperties AppleWithLeaping = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 1200), 1f)).build();
    public static final FoodProperties AppleWithFireResistance = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200), 1f)).build();
    public static final FoodProperties AppleWithWaterBreathing = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1200), 1f)).build();
    public static final FoodProperties AppleWithNightVision = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1200), 1f)).build();
    public static final FoodProperties AppleWithInvisibility = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1200), 1f)).build();
    public static final FoodProperties AppleWithSlowFalling = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1200), 1f)).build();
    public static final FoodProperties AppleWithTheTurtleMaster = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 1200), 1f)).build();
    public static final FoodProperties AppleWithPoison = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 1200), 1f)).build();
    public static final FoodProperties AppleWithHarming = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 1200), 1f)).build();
    public static final FoodProperties AppleWithSlowness = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 1200), 1f)).build();
    public static final FoodProperties AppleWithWindCharging = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 1200), 1f)).build();
    public static final FoodProperties AppleWithOozing = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 1200), 1f)).build();
    public static final FoodProperties AppleWithWeaving = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 1200), 1f)).build();
    public static final FoodProperties AppleWithInfestation = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final Consumable AppleWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 1200), 1f)).build();

    // Bread (Nutrition: 5, Saturation: 0.6F)
    public static final FoodProperties BreadWithWeakness = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1500), 1f)).build();
    public static final FoodProperties BreadWithHealing = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 1500), 1f)).build();
    public static final FoodProperties BreadWithRegeneration = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 1500), 1f)).build();
    public static final FoodProperties BreadWithStrength = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 1500), 1f)).build();
    public static final FoodProperties BreadWithSwiftness = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 1500), 1f)).build();
    public static final FoodProperties BreadWithLeaping = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 1500), 1f)).build();
    public static final FoodProperties BreadWithFireResistance = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1500), 1f)).build();
    public static final FoodProperties BreadWithWaterBreathing = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1500), 1f)).build();
    public static final FoodProperties BreadWithNightVision = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1500), 1f)).build();
    public static final FoodProperties BreadWithInvisibility = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1500), 1f)).build();
    public static final FoodProperties BreadWithSlowFalling = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1500), 1f)).build();
    public static final FoodProperties BreadWithTheTurtleMaster = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 1500), 1f)).build();
    public static final FoodProperties BreadWithPoison = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 1500), 1f)).build();
    public static final FoodProperties BreadWithHarming = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 1500), 1f)).build();
    public static final FoodProperties BreadWithSlowness = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 1500), 1f)).build();
    public static final FoodProperties BreadWithWindCharging = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 1500), 1f)).build();
    public static final FoodProperties BreadWithOozing = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 1500), 1f)).build();
    public static final FoodProperties BreadWithWeaving = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 1500), 1f)).build();
    public static final FoodProperties BreadWithInfestation = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BreadWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 1500), 1f)).build();

    // CookedCod (Nutrition: 5, Saturation: 0.6F)
    public static final FoodProperties CookedCodWithWeakness = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithHealing = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithRegeneration = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithStrength = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithSwiftness = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithLeaping = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithFireResistance = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithWaterBreathing = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithNightVision = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithInvisibility = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithSlowFalling = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithTheTurtleMaster = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithPoison = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithHarming = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithSlowness = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithWindCharging = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithOozing = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithWeaving = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 1500), 1f)).build();
    public static final FoodProperties CookedCodWithInfestation = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedCodWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 1500), 1f)).build();

    // CookedRabbit (Nutrition: 5, Saturation: 0.6F)
    public static final FoodProperties CookedRabbitWithWeakness = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithHealing = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithRegeneration = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithStrength = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithSwiftness = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithLeaping = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithFireResistance = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithWaterBreathing = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithNightVision = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithInvisibility = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithSlowFalling = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithTheTurtleMaster = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithPoison = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithHarming = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithSlowness = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithWindCharging = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithOozing = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithWeaving = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 1500), 1f)).build();
    public static final FoodProperties CookedRabbitWithInfestation = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable CookedRabbitWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 1500), 1f)).build();

    // BakedPotato (Nutrition: 5, Saturation: 0.6F)
    public static final FoodProperties BakedPotatoWithWeakness = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithHealing = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithRegeneration = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithStrength = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithSwiftness = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithLeaping = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithFireResistance = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithWaterBreathing = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithNightVision = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithInvisibility = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithSlowFalling = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithTheTurtleMaster = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithPoison = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithHarming = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithSlowness = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithWindCharging = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithOozing = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithWeaving = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 1500), 1f)).build();
    public static final FoodProperties BakedPotatoWithInfestation = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final Consumable BakedPotatoWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 1500), 1f)).build();

    // CookedChicken (Nutrition: 6, Saturation: 0.6F)
    public static final FoodProperties CookedChickenWithWeakness = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithHealing = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithRegeneration = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithStrength = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithSwiftness = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithLeaping = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithFireResistance = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithWaterBreathing = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithNightVision = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithInvisibility = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithSlowFalling = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithTheTurtleMaster = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithPoison = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithHarming = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithSlowness = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithWindCharging = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithOozing = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithWeaving = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 1800), 1f)).build();
    public static final FoodProperties CookedChickenWithInfestation = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final Consumable CookedChickenWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 1800), 1f)).build();

    // CookedSalmon (Nutrition: 6, Saturation: 0.8F)
    public static final FoodProperties CookedSalmonWithWeakness = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithHealing = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithRegeneration = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithStrength = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithSwiftness = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithLeaping = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithFireResistance = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithWaterBreathing = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithNightVision = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithInvisibility = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithSlowFalling = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithTheTurtleMaster = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithPoison = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithHarming = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithSlowness = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithWindCharging = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithOozing = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithWeaving = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 1800), 1f)).build();
    public static final FoodProperties CookedSalmonWithInfestation = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedSalmonWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 1800), 1f)).build();

    // CookedMutton (Nutrition: 6, Saturation: 0.8F)
    public static final FoodProperties CookedMuttonWithWeakness = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithHealing = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithRegeneration = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithStrength = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithSwiftness = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithLeaping = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithFireResistance = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithWaterBreathing = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithNightVision = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithInvisibility = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithSlowFalling = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithTheTurtleMaster = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithPoison = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithHarming = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithSlowness = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithWindCharging = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithOozing = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithWeaving = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 1800), 1f)).build();
    public static final FoodProperties CookedMuttonWithInfestation = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final Consumable CookedMuttonWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 1800), 1f)).build();

    // CookedPorkchop (Nutrition: 8, Saturation: 0.8F)
    public static final FoodProperties CookedPorkchopWithWeakness = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithHealing = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithRegeneration = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithStrength = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithSwiftness = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithLeaping = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithFireResistance = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithWaterBreathing = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithNightVision = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithInvisibility = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithSlowFalling = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithTheTurtleMaster = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithPoison = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithHarming = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithSlowness = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithWindCharging = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithOozing = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithWeaving = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 2400), 1f)).build();
    public static final FoodProperties CookedPorkchopWithInfestation = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedPorkchopWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 2400), 1f)).build();

    // CookedBeef (Nutrition: 8, Saturation: 0.8F)
    public static final FoodProperties CookedBeefWithWeakness = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithWeakness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAKNESS, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithHealing = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithHealing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithRegeneration = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithRegeneration_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithStrength = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithStrength_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithSwiftness = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithSwiftness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithLeaping = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithLeaping_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithFireResistance = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithFireResistance_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithWaterBreathing = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithWaterBreathing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithNightVision = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithNightVision_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithInvisibility = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithInvisibility_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithSlowFalling = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithSlowFalling_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithTheTurtleMaster = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithTheTurtleMaster_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithPoison = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithPoison_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithHarming = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithHarming_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithSlowness = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithSlowness_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithWindCharging = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithWindCharging_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithOozing = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithOozing_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.OOZING, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithWeaving = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithWeaving_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WEAVING, 2400), 1f)).build();
    public static final FoodProperties CookedBeefWithInfestation = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final Consumable CookedBeefWithInfestation_edi = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 2400), 1f)).build();

    public static void registerModconsumables() {
        Morefood.LOGGER.info("Registering ModConsumables");
    }
}