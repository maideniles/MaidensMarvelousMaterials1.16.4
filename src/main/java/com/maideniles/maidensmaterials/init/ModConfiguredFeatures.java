package com.maideniles.maidensmaterials.init;


import net.minecraft.block.BlockState;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.Placement;

public class ModConfiguredFeatures
        {

    private static final BlockState mushroom = ModBlocks.ORNAMENTAL_MUSHROOM.get().getDefaultState();

            public static final BlockClusterFeatureConfig ORNAMENTAL_MUSHROOM_CONFIG =
                    (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(mushroom),
                            new SimpleBlockPlacer())).tries(64).build();


    public static final ConfiguredFeature<?, ?> ORNAMENTAL_MUSHROOM_FEATURE =
            Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "ornamental_mushroom_feature",
                    Feature.FLOWER.withConfiguration(ORNAMENTAL_MUSHROOM_CONFIG)
                            .withPlacement(Placement.CHANCE.configure(new ChanceConfig(200))));




}




