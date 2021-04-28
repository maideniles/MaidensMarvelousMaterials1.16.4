package com.maideniles.maidensmaterials.init;


import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.potions.FloralFortuneEffect;
import com.maideniles.maidensmaterials.potions.GatherersGleeEffect;
import com.maideniles.maidensmaterials.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.*;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = MaidensMaterials.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModPotions {



    public static final RegistryObject<Effect> FLORAL_FORTUNE_EFFECT = Registration.EFFECTS.register("floral_fortune", FloralFortuneEffect::new);
    public static final RegistryObject<Effect> GATHERERS_GLEE_EFFECT = Registration.EFFECTS.register("gatherers_glee", GatherersGleeEffect::new);


    public static final RegistryObject<Potion> FLORAL_FORTUNE_POTION = Registration.POTIONS.register("floral_fortune",
            () -> new Potion(new EffectInstance(FLORAL_FORTUNE_EFFECT.get(), 900, 0)));

    public static final RegistryObject<Potion> GATHERERS_GLEE_POTION = Registration.POTIONS.register("gatherers_glee",
            () -> new Potion(new EffectInstance(GATHERERS_GLEE_EFFECT.get(), 900, 0)));



    public static void addPotionRecipes() {
        BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.MUNDANE,  ModItems.FLORAL_ESSENCE.get(), FLORAL_FORTUNE_POTION.get()));
        BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.MUNDANE, ModItems.EARTHEN_ESSENCE.get(), GATHERERS_GLEE_POTION.get()));

    }

    private static class BetterBrewingRecipe implements IBrewingRecipe {
        private final Potion bottleInput;
        private final Item itemInput;
        private final ItemStack output;

        public BetterBrewingRecipe(Potion bottleInputIn, Item itemInputIn, Potion outputIn) {
            this.bottleInput = bottleInputIn;
            this.itemInput = itemInputIn;
            this.output = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), outputIn);


        }

        // checks the item where the water bottle would go
        @Override
        public boolean isInput(ItemStack input) {
            return PotionUtils.getPotionFromItem(input).equals(this.bottleInput);
        }

        // checks the item where the nether wort would go
        @Override
        public boolean isIngredient(ItemStack ingredient) {
            return ingredient.getItem().equals(this.itemInput);
        }

        // gets the output potion. Very important to call copy because ItemStacks are mutable
        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            if (isInput(input) && isIngredient(ingredient)) {
                return this.output.copy();

            } else {
                return ItemStack.EMPTY;
            }
        }
    }


    public static void register(){}
}
