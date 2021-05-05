package com.maideniles.maidensmaterials.init;


import com.google.common.collect.ImmutableList;
import com.maideniles.maidensmaterials.blocks.vegetation.CoralBlockStateProvider;
import com.maideniles.maidensmaterials.world.feature.base.PalmTreeFeature;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.leaf.MaidensLeafVineDecorator;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.ColumnBlockPlacer;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.ForestFlowerBlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.treedecorator.LeaveVineTreeDecorator;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class ModConfiguredFeatures {


    private static final BlockState mushroom = ModBlocks.ORNAMENTAL_MUSHROOM.get().getDefaultState();
    private static final BlockState orchid = Blocks.BLUE_ORCHID.getDefaultState();


    public static final ConfiguredFeature<?, ?> ORNAMENTAL_MUSHROOM_FEATURE = Feature.FLOWER.withConfiguration(
            (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(mushroom), SimpleBlockPlacer.PLACER))
                    .tries(64).func_227317_b_().build())
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .func_242731_b(2);


    public static final ConfiguredFeature<?, ?> ORCHID_CONFIG = Feature.FLOWER.withConfiguration(
            (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(orchid), SimpleBlockPlacer.PLACER))
                    .tries(64).func_227317_b_().build())
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .func_242731_b(2);

    public static final ConfiguredFeature<?, ?> FOREST_FLOWERS_CONFIG = Feature.FLOWER.withConfiguration(
            (new BlockClusterFeatureConfig.Builder(ForestFlowerBlockStateProvider.PROVIDER, SimpleBlockPlacer.PLACER))
                    .tries(64).build())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .func_242731_b(50);

    //SPECIAL CONFIG FOR ORCHARD BIOME//
    public static final ConfiguredFeature<?, ?> ORNAMENTAL_MUSHROOM_ORCHARD_FEATURE = Feature.FLOWER.withConfiguration(
            (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(mushroom), SimpleBlockPlacer.PLACER))
                    .tries(64).func_227317_b_().build())
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.2F, 1)));


    public static final ConfiguredFeature<?, ?> ORCHID_ORCHARD_CONFIG = Feature.FLOWER.withConfiguration(
            (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(orchid), SimpleBlockPlacer.PLACER))
                    .tries(64).func_227317_b_().build())
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.2F, 1)));

    public static final ConfiguredFeature<?, ?> FOREST_FLOWERS_ORCHARD_CONFIG = Feature.FLOWER.withConfiguration(
            (new BlockClusterFeatureConfig.Builder(ForestFlowerBlockStateProvider.PROVIDER, SimpleBlockPlacer.PLACER))
                    .tries(64).build())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.2F, 1)));

    //SPECIAL CONFIG FOR OASIS BIOME//
    public static final ConfiguredFeature<?, ?> ORNAMENTAL_MUSHROOM_OASIS_FEATURE = Feature.FLOWER.withConfiguration(
            (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(mushroom), SimpleBlockPlacer.PLACER))
                    .tries(64).func_227317_b_().build())
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.2F, 1)));

    public static final ConfiguredFeature<?, ?> ORCHID_OASIS_CONFIG = Feature.FLOWER.withConfiguration(
            (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(orchid), SimpleBlockPlacer.PLACER))
                    .tries(64).func_227317_b_().build())
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.2F, 1)));

    public static final ConfiguredFeature<?, ?> FOREST_FLOWERS_OASIS_CONFIG = Feature.FLOWER.withConfiguration(
            (new BlockClusterFeatureConfig.Builder(ForestFlowerBlockStateProvider.PROVIDER, SimpleBlockPlacer.PLACER))
                    .tries(64).build())
            .withPlacement(Features.Placements.VEGETATION_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.2F, 1)));

    public static final ConfiguredFeature<?,?> CORAL_FAN_OASIS_CONFIG = Feature.CORAL_TREE.withConfiguration
            (IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(20, 0.1F, 1)));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PALM_TREE_CONFIGURED_FEATURE = ModFeatures.PALM_TREE_INSTANCE.withConfiguration(
            new BaseTreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()), new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()),
                    new BlobFoliagePlacer(FeatureSpread.func_242252_a(1), FeatureSpread.func_242252_a(1), 1),
                    new StraightTrunkPlacer(1, 1, 1),
                    new TwoLayerFeature(1, 1, 1)).setIgnoreVines().build());

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PALM_TREE_CONFIGURED_FEATURE_BEES = ModFeatures.PALM_TREE_INSTANCE.withConfiguration(
            new BaseTreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()), new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()),
                    new BlobFoliagePlacer(FeatureSpread.func_242252_a(1), FeatureSpread.func_242252_a(1), 1),
                    new StraightTrunkPlacer(1, 1, 1),
              //place decorator when figured out//
                    new TwoLayerFeature(1, 1, 1)).setIgnoreVines()
                    .setDecorators(ImmutableList.of(new BeehiveTreeDecorator(0.05f))).build());


   public static final ConfiguredFeature<?,?> PALM_TREE_CONFIGURED_FEATURE_BEES_WG = PALM_TREE_CONFIGURED_FEATURE_BEES
           .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
           .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1)));

  public static final ConfiguredFeature<?,?> PALM_TREE_CONFIGURED_FEATURE_WG = PALM_TREE_CONFIGURED_FEATURE
          .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
          .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1)));


    public static void registerCFs() {

      //ORNAMENTAL FOREST CUSTOM FLOWERS CONFIG//
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "ornamental_mushroom_feature", ORNAMENTAL_MUSHROOM_FEATURE);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "orchid_spread_feature", ORCHID_CONFIG);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "forest_flower_spread_feature", FOREST_FLOWERS_CONFIG);

   //ORCHARD CUSTOM FLOWERS CONFIG
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "ornamental_mushroom_orchard_feature", ORNAMENTAL_MUSHROOM_ORCHARD_FEATURE);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "orchid_orchard_spread_feature", ORCHID_ORCHARD_CONFIG);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "forest_flower_orchard_spread_feature", FOREST_FLOWERS_ORCHARD_CONFIG);

    //OASIS CUSTOM FLOWERS CONFIG
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "ornamental_mushroom_oasis_feature", ORNAMENTAL_MUSHROOM_OASIS_FEATURE);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "orchid_oasis_spread_feature", ORCHID_OASIS_CONFIG);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "forest_flower_oasis_spread_feature", FOREST_FLOWERS_OASIS_CONFIG);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "coral_fan_oasis_config", CORAL_FAN_OASIS_CONFIG);


    //SAPLING TREE CONFIGS//
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "palm_tree_configured_feature", PALM_TREE_CONFIGURED_FEATURE);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "palm_tree_configured_feature_bees", PALM_TREE_CONFIGURED_FEATURE_BEES);

    //WORLDGEN TREE CONFIGS//
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "palm_tree_configured_feature_wg", PALM_TREE_CONFIGURED_FEATURE_WG);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "palm_tree_configured_feature_bees_wg", PALM_TREE_CONFIGURED_FEATURE_BEES_WG);
    }
}




