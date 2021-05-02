package com.maideniles.maidensmaterials.world.feature.tree.fruit;

import com.google.common.collect.ImmutableList;
import com.maideniles.maidensmaterials.init.ModBlocks;

import com.maideniles.maidensmaterials.world.feature.base.MaidensCurvedTrunkPlacer;
import com.maideniles.maidensmaterials.world.feature.base.MaidensPalmFoliagePlacer;
import com.maideniles.maidensmaterials.world.feature.base.MaidensStraightTrunkPlacer;

import com.maideniles.maidensmaterials.world.gen.decorator.tree.leaf.MaidensLeafVineDecorator;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.mushroom.MaidensMushroomDecorator;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.trunk.MaidensCoconutDecorator;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.trunk.MaidensTrunkVineDecorator;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

import javax.annotation.Nullable;
import java.util.Random;

public class PalmTree extends Tree {

    private static final int BASE_HEIGHT=5;
    private static final int FIRST_RANDOM_HEIGHT=3;
    private static final int SECOND_RANDOM_HEIGHT=7;

    private static final int LEAVES_RADIUS=3;
    private static final int LEAVES_OFFSET=0;
    private static final int LEAVES_HEIGHT=5;

    public static final BaseTreeFeatureConfig PALM_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.PALM_LOG.get().getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.PALM_LEAVES.get().getDefaultState()),
            new MaidensPalmFoliagePlacer(FeatureSpread.func_242252_a(LEAVES_RADIUS),
                    FeatureSpread.func_242252_a(LEAVES_OFFSET)),
            new MaidensCurvedTrunkPlacer(BASE_HEIGHT, FIRST_RANDOM_HEIGHT, SECOND_RANDOM_HEIGHT),

            new TwoLayerFeature(1,0,1)))
            .setDecorators(ImmutableList.of(
                    new MaidensCoconutDecorator(100f)                    ))
            .build();


    public static final BaseTreeFeatureConfig PALM_TREE_BEES_CONFIG = (new BaseTreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.PALM_LOG.get().getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.PALM_LEAVES.get().getDefaultState()),
            new MaidensPalmFoliagePlacer(FeatureSpread.func_242252_a(LEAVES_RADIUS),
                    FeatureSpread.func_242252_a(LEAVES_OFFSET)),


            new MaidensCurvedTrunkPlacer(BASE_HEIGHT, FIRST_RANDOM_HEIGHT, SECOND_RANDOM_HEIGHT),
            new TwoLayerFeature(1, 0, 1)))
            .setDecorators(ImmutableList.of(
                    new MaidensCoconutDecorator(100f),
                    new BeehiveTreeDecorator(0.03f))).build();



    @Nullable
    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean largeHive) {

        return randomIn.nextInt(6)==0 ?(Feature.TREE.withConfiguration(PALM_TREE_CONFIG)):
                Feature.TREE.withConfiguration(PALM_TREE_BEES_CONFIG);

    }
}

