package name.modid.Datagen;

import name.modid.Item.ModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;

import java.util.concurrent.CompletableFuture;

public class ModRecipieProvider extends FabricRecipeProvider {
    public ModRecipieProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, BootstrapContext<Recipe<?>> output,
                                                     BootstrapContext<Advancement> advancementOutput) {
        return new RecipeProvider(output, advancementOutput) {
            @Override
            public void buildRecipes() {

                // Cooked Chicken



                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedChickenWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.COOKED_CHICKEN)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_CHICKEN))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Cooked Mutton



                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedMuttonWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.COOKED_MUTTON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_MUTTON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Cooked Porkchop



                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedPorkchopWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.COOKED_PORKCHOP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_PORKCHOP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Cooked Beef



                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedBeefWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.COOKED_BEEF)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_BEEF))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Cooked Rabbit



                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedRabbitWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.COOKED_RABBIT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_RABBIT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Cooked Cod



                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedCodWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.COOKED_COD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_COD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Cooked Salmon



                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookedSalmonWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.COOKED_SALMON)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKED_SALMON))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Apple



                shapeless(RecipeCategory.FOOD, ModItem.AppleWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.AppleWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.APPLE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.APPLE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Sweet Berries



                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.SweetBerriesWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.SWEET_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.SWEET_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Glow Berries



                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.GlowBerriesWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.GLOW_BERRIES)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.GLOW_BERRIES))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Melon Slice



                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.MelonSliceWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.MELON_SLICE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.MELON_SLICE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Carrot



                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CarrotWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.CARROT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.CARROT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Potato



                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.PotatoWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Baked Potato



                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BakedPotatoWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.BAKED_POTATO)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BAKED_POTATO))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Beetroot



                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BeetrootWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.BEETROOT)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BEETROOT))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Dried Kelp



                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.DriedKelpWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.DRIED_KELP)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.DRIED_KELP))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Bread



                shapeless(RecipeCategory.FOOD, ModItem.BreadWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.BreadWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.BREAD)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.BREAD))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                // Cookie



                shapeless(RecipeCategory.FOOD, ModItem.CookieWithWeakness)
                        .requires(ModItem.TesttubeOfWeakness)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithHealing)
                        .requires(ModItem.TesttubeOfHealing)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithRegeneration)
                        .requires(ModItem.TesttubeOfRegeneration)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithStrength)
                        .requires(ModItem.TesttubeOfStrength)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithSwiftness)
                        .requires(ModItem.TesttubeOfSwiftness)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithLeaping)
                        .requires(ModItem.TesttubeOfLeaping)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithFireResistance)
                        .requires(ModItem.TesttubeOfFireResistance)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithWaterBreathing)
                        .requires(ModItem.TesttubeOfWaterBreathing)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithNightVision)
                        .requires(ModItem.TesttubeOfNightVision)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithInvisibility)
                        .requires(ModItem.TesttubeOfInvisibility)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithSlowFalling)
                        .requires(ModItem.TesttubeOfSlowFalling)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithTheTurtleMaster)
                        .requires(ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithPoison)
                        .requires(ModItem.TesttubeOfPoison)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithHarming)
                        .requires(ModItem.TesttubeOfHarming)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithSlowness)
                        .requires(ModItem.TesttubeOfSlowness)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithWindCharging)
                        .requires(ModItem.TesttubeOfWindCharging)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithOozing)
                        .requires(ModItem.TesttubeOfOozing)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithWeaving)
                        .requires(ModItem.TesttubeOfWeaving)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);

                shapeless(RecipeCategory.FOOD, ModItem.CookieWithInfestation)
                        .requires(ModItem.TesttubeOfInfestation)
                        .requires(Items.COOKIE)
                        .group("More foods")
                        .unlockedBy("has_base", has(Items.COOKIE))
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output);































                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfDensity)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "water");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfWeakness)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "weakness");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfHealing)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "healing");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfRegeneration)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "regeneration");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfStrength)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "strength");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfSwiftness)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "swiftness");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfLeaping)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "leaping");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfFireResistance)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "fire_resistance");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfWaterBreathing)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "water_breathing");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfNightVision)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "night_vision");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfInvisibility)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "invisibility");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfSlowFalling)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "slow_falling");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfTheTurtleMaster)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "turtle_master");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfPoison)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "poison");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfHarming)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "harming");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfSlowness)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "slowness");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfWindCharging)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "wind_charged");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfOozing)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "oozing");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfWeaving)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "weaving");

                shapeless(RecipeCategory.BREWING, ModItem.TesttubeOfInfestation)
                        .requires(Ingredient.of(Items.POTION))
                        .requires(ModItem.Testtube)
                        .group("More foods")
                        .unlockedBy("has_testtube", has(ModItem.Testtube))
                        .save(output, "infested");

            }
        };
    }

    @Override
    public String getName() {
        return "More Food Recipies";
    }
}
