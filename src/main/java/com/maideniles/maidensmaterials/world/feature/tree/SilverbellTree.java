package com.maideniles.maidensmaterials.world.feature.tree;

import com.google.common.collect.ImmutableList;
import com.maideniles.maidensmaterials.init.ModBlocks;

import com.maideniles.maidensmaterials.world.feature.base.MaidensStraightTrunkPlacer;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.leaf.MaidensLeafVineDecorator;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.mushroom.MaidensMushroomDecorator;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.trunk.MaidensTrunkVineDecorator;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.treedecorator.LeaveVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

import javax.annotation.Nullable;
import java.util.Random;

public class SilverbellTree extends Tree {

    private static final int BASE_HEIGHT=5;
    private static final int FIRST_RANDOM_HEIGHT=3;
    private static final int SECOND_RANDOM_HEIGHT=7;

    private static final int LEAVES_RADIUS=3;
    private static final int LEAVES_OFFSET=4;
    private static final int LEAVES_HEIGHT=5;

    public static final BaseTreeFeatureConfig SILVERBELL_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.SILVERBELL_LOG.get().getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.SILVERBELL_LEAVES.get().getDefaultState()),
            new BlobFoliagePlacer(FeatureSpread.func_242252_a(LEAVES_RADIUS),
                    FeatureSpread.func_242252_a(LEAVES_OFFSET), LEAVES_HEIGHT),
            new MaidensStraightTrunkPlacer(BASE_HEIGHT, FIRST_RANDOM_HEIGHT, SECOND_RANDOM_HEIGHT),

            new TwoLayerFeature(1,0,1)))
            .setDecorators(ImmutableList.of( new MaidensMushroomDecorator(0.25f),
                    new BeehiveTreeDecorator(0.02f)))
            .build();


    public static final BaseTreeFeatureConfig SILVERBELL_TREE_VINES_CONFIG = (new BaseTreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.SILVERBELL_LOG.get().getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.SILVERBELL_LEAVES.get().getDefaultState()),
            new BlobFoliagePlacer(FeatureSpread.func_242252_a(LEAVES_RADIUS),
                    FeatureSpread.func_242252_a(LEAVES_OFFSET), LEAVES_HEIGHT),
            new MaidensStraightTrunkPlacer(BASE_HEIGHT, FIRST_RANDOM_HEIGHT, SECOND_RANDOM_HEIGHT),
            new TwoLayerFeature(1, 0, 1)))
            .setDecorators(ImmutableList.of(MaidensLeafVineDecorator.field_236871_b_,
                    new MaidensMushroomDecorator(0.25f),
                    MaidensTrunkVineDecorator.field_236871_b_, new BeehiveTreeDecorator(0.02f))).build();



    @Nullable
    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean largeHive) {

        return randomIn.nextInt(6)==0 ?(Feature.TREE.withConfiguration(SILVERBELL_TREE_CONFIG)):
                Feature.TREE.withConfiguration(SILVERBELL_TREE_VINES_CONFIG);

    }
}
