package com.maideniles.maidensmaterials.world.feature.tree.fruit;

import com.google.common.collect.ImmutableList;
import com.maideniles.maidensmaterials.init.ModBlocks;

import com.maideniles.maidensmaterials.world.gen.decorator.tree.leaf.MaidensLeafVineDecorator;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.mushroom.MaidensMushroomDecorator;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.trunk.MaidensTrunkVineDecorator;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FancyFoliagePlacer;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.trunkplacer.FancyTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

import javax.annotation.Nullable;
import java.util.OptionalInt;
import java.util.Random;

public class PeachTree extends Tree {

    private static final int BASE_HEIGHT=2;
    private static final int FIRST_RANDOM_HEIGHT=2;
    private static final int SECOND_RANDOM_HEIGHT=3;

    private static final int LEAVES_RADIUS=3;
    private static final int LEAVES_OFFSET=4;
    private static final int LEAVES_HEIGHT=5;

    public static final BaseTreeFeatureConfig PEACH_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.CEDAR_LOG.get().getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.GROWING_PEACH_LEAVES.get().getDefaultState()),
            new BlobFoliagePlacer(FeatureSpread.func_242252_a(LEAVES_RADIUS),
                    FeatureSpread.func_242252_a(LEAVES_OFFSET), LEAVES_HEIGHT),
            new StraightTrunkPlacer(BASE_HEIGHT, FIRST_RANDOM_HEIGHT, SECOND_RANDOM_HEIGHT),

            new TwoLayerFeature(1,0,1)))
            .setDecorators(ImmutableList.of( new MaidensMushroomDecorator(0.25f),new BeehiveTreeDecorator(0.02f)))
            .build();


    public static final BaseTreeFeatureConfig PEACH_TREE_BIG_CONFIG = (new BaseTreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.CEDAR_LOG.get().getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.GROWING_PEACH_LEAVES.get().getDefaultState()),
            new FancyFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(4), 4),
            new FancyTrunkPlacer(3, 11, 0),
            new TwoLayerFeature(0, 0, 0, OptionalInt.of(4))))
            .setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING)
            .setDecorators(ImmutableList.of(new MaidensMushroomDecorator(0.25f),
                    new BeehiveTreeDecorator(0.02f))).build();



    @Nullable
    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean largeHive) {

        return randomIn.nextInt(6)==0 ?(Feature.TREE.withConfiguration(PEACH_TREE_CONFIG)):
                Feature.TREE.withConfiguration(PEACH_TREE_BIG_CONFIG);

    }
}