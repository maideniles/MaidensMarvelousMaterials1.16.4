package com.maideniles.maidensmaterials.world.feature.base;

import java.util.*;

import com.google.common.collect.ImmutableList;

import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class MaidensStraightTrunkPlacer extends StraightTrunkPlacer {


    public MaidensStraightTrunkPlacer(int p_i232059_1_, int p_i232059_2_, int p_i232059_3_) {
        super(p_i232059_1_, p_i232059_2_, p_i232059_3_);
    }

    @Override
    public List<FoliagePlacer.Foliage> func_230382_a_(IWorldGenerationReader p_230382_1_, Random p_230382_2_, int p_230382_3_, BlockPos p_230382_4_, Set<BlockPos> p_230382_5_, MutableBoundingBox p_230382_6_, BaseTreeFeatureConfig p_230382_7_) {

        checkBlock(p_230382_1_, p_230382_4_.down());

        for(int i = 0; i < p_230382_3_; ++i) {
            func_236911_a_(p_230382_1_, p_230382_2_, p_230382_4_.up(i), p_230382_5_, p_230382_6_, p_230382_7_);
        }

        return ImmutableList.of(new FoliagePlacer.Foliage(p_230382_4_.up(p_230382_3_), 0, false));

    }

    protected static void checkBlock(IWorldGenerationReader p_236909_0_, BlockPos p_236909_1_) {
        if (!canGenerateAt(p_236909_0_, p_236909_1_)) {
            TreeFeature.func_236408_b_(p_236909_0_, p_236909_1_, Blocks.DIRT.getDefaultState());
        }

    }

    protected static boolean canGenerateAt(IWorldGenerationBaseReader reader, BlockPos pos) {
        return reader.hasBlockState(pos, (thneed) -> {
            Block block = thneed.getBlock();
            return block == ModBlocks.ORNAMENTAL_GRASS.get();
        });
    }
}