package com.maideniles.maidensmaterials.init;


import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.Placement;

public class ModConfiguredFeatures
{



    private static final BlockClusterFeatureConfig COPPER_SPREAD_CONFIG =
            (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.ORNAMENTAL_GRASS.get().getDefaultState())
                    , new SimpleBlockPlacer())).tries(25).build();

    public static final ConfiguredFeature<?, ?> COPPER_BLOCK_SPREAD =
            Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "copper_spread",
                    Feature.RANDOM_PATCH.withConfiguration(COPPER_SPREAD_CONFIG)
                            .withPlacement(Placement.CHANCE.configure(new ChanceConfig(200))));

}
