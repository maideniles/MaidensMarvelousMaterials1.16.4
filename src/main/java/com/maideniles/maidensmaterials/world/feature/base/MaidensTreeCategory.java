package com.maideniles.maidensmaterials.world.feature.base;

import com.maideniles.maidensmaterials.init.ModFeatures;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.trees.Tree;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class MaidensTreeCategory {
    private static abstract class MaidensTree extends Tree {

        protected abstract PalmTreeFeature getMaidensTreeFeature(Random random, boolean generateBeehive);


        public boolean place(IWorld worldIn, ChunkGenerator chunkGeneratorIn, BlockPos blockPosIn, BlockState blockStateIn, Random randomIn) {
            Feature feature = getMaidensTreeFeature(randomIn, hasAdjacentFlower(worldIn, blockPosIn));
            if (feature == null) {
                return false;
            } else {
                worldIn.setBlockState(blockPosIn, Blocks.AIR.getDefaultState(), 4);
                if (feature.generate((ISeedReader) worldIn, chunkGeneratorIn, randomIn, blockPosIn, NoFeatureConfig.NO_FEATURE_CONFIG)) {
                    return true;
                } else {
                    worldIn.setBlockState(blockPosIn, blockStateIn, 4);
                    return false;
                }
            }
        }

        private boolean hasAdjacentFlower(IWorld world, BlockPos pos) {
            for(BlockPos blockpos : BlockPos.Mutable.getAllInBoxMutable(pos.down().north(2).west(2), pos.up().south(2).east(2))) {
                if (world.getBlockState(blockpos).isIn(BlockTags.FLOWERS)) {
                    return true;
                }
            }

            return false;
        }

        @Nullable
        @Override
        protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean p_225546_2_) {
            return null;
        }
    }



    public static final Tree PALM = new MaidensTree() {
        @Override
        protected PalmTreeFeature getMaidensTreeFeature(Random random, boolean generateBeehive) {


                return (PalmTreeFeature) ModFeatures.PALM_TREE.get();

            }

    };
}