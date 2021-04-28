
package com.maideniles.maidensmaterials.util;

import com.maideniles.maidensmaterials.MaidensMaterials;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Potion;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MaidensMaterials.MOD_ID);

    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, MaidensMaterials.MOD_ID);

    public static final DeferredRegister<Enchantment> ENCHANTMENTS
            = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MaidensMaterials.MOD_ID);

    public static final DeferredRegister<TreeDecoratorType<?>> TREE_DECORATORS
            = DeferredRegister.create(ForgeRegistries.TREE_DECORATOR_TYPES, MaidensMaterials.MOD_ID);

    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTION_TYPES, MaidensMaterials.MOD_ID);

    public static final DeferredRegister<Effect> EFFECTS
            = DeferredRegister.create(ForgeRegistries.POTIONS, MaidensMaterials.MOD_ID);

    public static final DeferredRegister<EntityType<?>> ENTITIES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, MaidensMaterials.MOD_ID);

    public static final DeferredRegister<SoundEvent> SOUNDS
            = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MaidensMaterials.MOD_ID);

    public static final DeferredRegister<Biome> BIOMES
            = DeferredRegister.create(ForgeRegistries.BIOMES, MaidensMaterials.MOD_ID);

    public static final DeferredRegister<SurfaceBuilder<?>> SURFACE_BUILDERS =
            DeferredRegister.create(ForgeRegistries.SURFACE_BUILDERS, MaidensMaterials.MOD_ID);



    public static void register(){

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        ENCHANTMENTS.register(eventBus);
        TREE_DECORATORS.register(eventBus);
        POTIONS.register(eventBus);
        EFFECTS.register(eventBus);
        ENTITIES.register(eventBus);
        SOUNDS.register(eventBus);
        BIOMES.register(eventBus);
        SURFACE_BUILDERS.register(eventBus);
    }

}