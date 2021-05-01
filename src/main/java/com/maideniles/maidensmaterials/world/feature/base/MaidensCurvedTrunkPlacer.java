package com.maideniles.maidensmaterials.world.feature.base;


import com.google.common.collect.Lists;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.trees.Tree;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorldWriter;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.blockstateprovider.BlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.trunkplacer.AbstractTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.TrunkPlacerType;

import java.util.List;
import java.util.Random;
import java.util.Set;

import static net.minecraft.world.gen.feature.Feature.isAirAt;

public class MaidensCurvedTrunkPlacer extends AbstractTrunkPlacer {
    public static final Codec<net.minecraft.world.gen.trunkplacer.ForkyTrunkPlacer> field_236896_a_ = RecordCodecBuilder.create((p_236897_0_) -> {
        return func_236915_a_(p_236897_0_).apply(p_236897_0_, net.minecraft.world.gen.trunkplacer.ForkyTrunkPlacer::new);
    });

    public MaidensCurvedTrunkPlacer(int p_i232056_1_, int p_i232056_2_, int p_i232056_3_) {
        super(p_i232056_1_, p_i232056_2_, p_i232056_3_);
    }

    protected TrunkPlacerType<?> func_230381_a_() {
        return TrunkPlacerType.FORKING_TRUNK_PLACER;
    }

    public List<FoliagePlacer.Foliage> func_230382_a_(IWorldGenerationReader p_230382_1_, Random p_230382_2_, int p_230382_3_, BlockPos p_230382_4_, Set<BlockPos> p_230382_5_, MutableBoundingBox p_230382_6_, BaseTreeFeatureConfig p_230382_7_) {
        func_236909_a_(p_230382_1_, p_230382_4_.down());
        List<FoliagePlacer.Foliage> list = Lists.newArrayList();
        Direction direction = Direction.Plane.HORIZONTAL.random(p_230382_2_);
        int i = p_230382_3_ - p_230382_2_.nextInt(1) - 5;  //this seems to control how tall the second fork is//
        int j = 3 - p_230382_2_.nextInt(1);  //this controls how far out it forks//
        BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();
        int k = p_230382_4_.getX();
        int l = p_230382_4_.getZ();
        int i1 = 0;

        for(int j1 = 0; j1 < p_230382_3_; ++j1) {    //j1 is where the leaves place//
            int k1 = p_230382_4_.getY() + j1;
            if (j1 >= i && j > 1) {
                k += direction.getXOffset();
                l += direction.getZOffset();
                --j;
            }

            if (func_236911_a_(p_230382_1_, p_230382_2_, blockpos$mutable.setPos(k, k1, l), p_230382_5_, p_230382_6_, p_230382_7_)) {
                i1 = k1 + 2;


            }

        }

        list.add(new FoliagePlacer.Foliage(new BlockPos(k, i1, l), 1, false));

        //testing add'l block placement here//


        return list;
    }

    protected static boolean func_236911_a_(IWorldGenerationReader p_236911_0_, Random p_236911_1_, BlockPos p_236911_2_, Set<BlockPos> p_236911_3_, MutableBoundingBox p_236911_4_, BaseTreeFeatureConfig p_236911_5_) {
        if (TreeFeature.isReplaceableAt(p_236911_0_, p_236911_2_)) {
            func_236913_a_(p_236911_0_, p_236911_2_, p_236911_5_.trunkProvider.getBlockState(p_236911_1_, p_236911_2_), p_236911_4_);
            p_236911_3_.add(p_236911_2_.toImmutable());
            return true;
        } else {
            return false;
        }
    }

    protected static void func_236910_a_(IWorldGenerationReader p_236910_0_, Random p_236910_1_, BlockPos.Mutable p_236910_2_, Set<BlockPos> p_236910_3_, MutableBoundingBox p_236910_4_, BaseTreeFeatureConfig p_236910_5_) {
        if (TreeFeature.func_236410_c_(p_236910_0_, p_236910_2_)) {
            func_236911_a_(p_236910_0_, p_236910_1_, p_236910_2_, p_236910_3_, p_236910_4_, p_236910_5_);
        }

    }



}