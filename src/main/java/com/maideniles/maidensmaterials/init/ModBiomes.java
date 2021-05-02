package com.maideniles.maidensmaterials.init;


import com.maideniles.maidensmaterials.util.Registration;
import com.maideniles.maidensmaterials.world.biome.ModConfiguredSurfaceBuilders;
import com.maideniles.maidensmaterials.world.biome.OasisShoreBiome;
import com.maideniles.maidensmaterials.world.biome.OrnamentalForestBiome;
import com.maideniles.maidensmaterials.world.biome.OrnamentalOrchardBiome;
import com.maideniles.maidensmaterials.world.feature.tree.CedarTree;
import com.maideniles.maidensmaterials.world.feature.tree.fruit.AppleTree;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBiomes
{
    public static final RegistryObject<Biome> ORNAMENTAL_FOREST_BIOME =
            Registration.BIOMES.register("ornamental_forest_biome",
                    () -> OrnamentalForestBiome.makeOrnamentalForestBiome(() -> WorldGenRegistries.CONFIGURED_SURFACE_BUILDER.getOrThrow(
                            ModConfiguredSurfaceBuilders.ORNAMENTAL_FOREST_SURFACE), 0.125f, 0.05f));

    public static final RegistryObject<Biome> OASIS_SHORE_BIOME =
            Registration.BIOMES.register("oasis_shore_biome",
                    () -> OasisShoreBiome.makeOasisShoreBiome(() -> WorldGenRegistries.CONFIGURED_SURFACE_BUILDER.getOrThrow(
                            ModConfiguredSurfaceBuilders.OASIS_SHORE_SURFACE), 0.125f, 0.05f));

    public static final RegistryObject<Biome> ORNAMENTAL_ORCHARD_BIOME =
            Registration.BIOMES.register("ornamental_orchard_biome",
                    () -> OrnamentalOrchardBiome.makeOrnamentalOrchardBiome(() -> WorldGenRegistries.CONFIGURED_SURFACE_BUILDER.getOrThrow(
                            ModConfiguredSurfaceBuilders.ORNAMENTAL_ORCHARD_SURFACE), 0.125f, 0.05f));

    public static void register() { }


}
