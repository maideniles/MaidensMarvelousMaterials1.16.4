package com.maideniles.maidensmaterials.init;


import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.ForestFlowerBlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;
import net.minecraftforge.fml.RegistryObject;

public class ModConfiguredFeatures
        {


    private static final BlockState mushroom = ModBlocks.ORNAMENTAL_MUSHROOM.get().getDefaultState();
    private static final BlockState orchid = Blocks.BLUE_ORCHID.getDefaultState();


            public static final ConfiguredFeature<?, ?> ORNAMENTAL_MUSHROOM_FEATURE =
                    Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "ornamental_mushroom_feature",
                            Feature.FLOWER.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(mushroom), SimpleBlockPlacer.PLACER))
                                    .tries(64).func_227317_b_().build()).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).func_242731_b(2));


            public static final ConfiguredFeature<?, ?> ORCHID_CONFIG =
                    Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "orchid_spread_feature",
                            Feature.FLOWER.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(orchid), SimpleBlockPlacer.PLACER))
                                    .tries(64).func_227317_b_().build()).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).func_242731_b(2));

public static final ConfiguredFeature<?,?> FOREST_FLOWERS_CONFIG =
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "forest_flower_spread_feature",
                Feature.FLOWER.withConfiguration((new BlockClusterFeatureConfig.Builder(ForestFlowerBlockStateProvider.PROVIDER, SimpleBlockPlacer.PLACER))
                        .tries(64).build()).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                        .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).func_242731_b(50));

//SPECIAL CONFIG FOR ORCHARD BIOME//
            public static final ConfiguredFeature<?, ?> ORNAMENTAL_MUSHROOM_ORCHARD_FEATURE =
                    Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "ornamental_mushroom_orchard_feature",
                            Feature.FLOWER.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(mushroom), SimpleBlockPlacer.PLACER))
                                    .tries(64).func_227317_b_().build()).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).func_242731_b(1));


            public static final ConfiguredFeature<?, ?> ORCHID_ORCHARD_CONFIG =
                    Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "orchid_orchard_spread_feature",
                            Feature.FLOWER.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(orchid), SimpleBlockPlacer.PLACER))
                                    .tries(64).func_227317_b_().build()).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).func_242731_b(1));

            public static final ConfiguredFeature<?,?> FOREST_FLOWERS_ORCHARD_CONFIG =
                    Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "forest_flower_orchard_spread_feature",
                            Feature.FLOWER.withConfiguration((new BlockClusterFeatureConfig.Builder(ForestFlowerBlockStateProvider.PROVIDER, SimpleBlockPlacer.PLACER))
                                    .tries(64).build()).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).func_242731_b(10));

            public static final ConfiguredFeature<BaseTreeFeatureConfig,?> PALM_TREE_FEATURE =
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "palm_tree_feature",
               ModFeatures.PALM_TREE.get().withConfiguration(new BaseTreeFeatureConfig.Builder(
                        new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()), new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()),
                        new BlobFoliagePlacer(FeatureSpread.func_242252_a(1), FeatureSpread.func_242252_a(1), 1),
                        new StraightTrunkPlacer(1, 1, 1),
                        new TwoLayerFeature(1, 1, 1)).setIgnoreVines().build()));


        }




