package com.maideniles.maidensmaterials.world.gen;


import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.ModBiomes;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.world.biome.ModConfiguredSurfaceBuilders;
import com.maideniles.maidensmaterials.world.biome.ModSurfaceBuilders;
import com.maideniles.maidensmaterials.util.ConfigHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

import static net.minecraftforge.common.BiomeDictionary.Type.*;

@Mod.EventBusSubscriber(modid = MaidensMaterials.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBiomeGeneration
{
    @SubscribeEvent(priority = EventPriority.LOW)
    public  static void register(final RegistryEvent.Register<SurfaceBuilder<?>> event)
    {
        registerBiome(ModConfiguredSurfaceBuilders.ORNAMENTAL_FOREST_SURFACE.getLocation(),
               ModBlocks.ORNAMENTAL_GRASS.get().getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState());

        registerBiome(ModConfiguredSurfaceBuilders.OASIS_SHORE_SURFACE.getLocation(),
                ModBlocks.SPARKLING_SAND.get().getDefaultState(), Blocks.SAND.getDefaultState(), Blocks.SAND.getDefaultState());

        registerBiome(ModConfiguredSurfaceBuilders.ORNAMENTAL_ORCHARD_SURFACE.getLocation(),
                Blocks.GRASS_BLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState());
    }

    @SubscribeEvent
    public static void setupBiome(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() ->
        {
            addBiome(ModBiomes.ORNAMENTAL_FOREST_BIOME.get(), BiomeManager.BiomeType.WARM, MaidensMaterials.getInstance()
                    .config.getInteger(ConfigHandler.ConfigKeys.ORNAMENTAL_FOREST_WEIGHT, 100), MAGICAL, LUSH, FOREST);

            addBiome(ModBiomes.OASIS_SHORE_BIOME.get(), BiomeManager.BiomeType.WARM, MaidensMaterials.getInstance()
                    .config.getInteger(ConfigHandler.ConfigKeys.OASIS_SHORES_WEIGHT, 100), BEACH, SANDY, HOT);

            addBiome(ModBiomes.ORNAMENTAL_ORCHARD_BIOME.get(), BiomeManager.BiomeType.WARM, MaidensMaterials.getInstance()
                    .config.getInteger(ConfigHandler.ConfigKeys.ORNAMENTAL_ORCHARD_WEIGHT, 100), PLAINS, LUSH, RIVER);
        });
    }

    private static void registerBiome(ResourceLocation biomeRL, BlockState topBlock, BlockState fillerBlock, BlockState underwaterBlock)
    {
        Registry.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER, biomeRL, ModSurfaceBuilders.LOGGING_DEFAULT.get().func_242929_a(
                new SurfaceBuilderConfig(topBlock, fillerBlock, underwaterBlock)));
    }

    private static void addBiome(Biome biome, BiomeManager.BiomeType type, int weight, BiomeDictionary.Type... types)
    {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(ForgeRegistries.Keys.BIOMES,
                Objects.requireNonNull(ForgeRegistries.BIOMES.getKey(biome)));

        BiomeDictionary.addTypes(key, types);
        BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(key, weight));
    }
}
