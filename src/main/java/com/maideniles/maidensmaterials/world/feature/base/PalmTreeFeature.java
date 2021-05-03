package com.maideniles.maidensmaterials.world.feature.base;

import com.google.common.collect.Lists;
import com.maideniles.maidensmaterials.blocks.vegetation.DaCoconutNutBlock;
import com.maideniles.maidensmaterials.blocks.vegetation.FairyGlowCup;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.loot.LootTables;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorldWriter;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class PalmTreeFeature extends Feature<BaseTreeFeatureConfig> {


    private final int maxHeight = 15;


    public PalmTreeFeature(Codec<BaseTreeFeatureConfig> configFactory) {
        super(configFactory);

    }

    @Override
    public boolean generate(ISeedReader world, ChunkGenerator generator, Random rand, BlockPos position, BaseTreeFeatureConfig config) {
        BlockPos.Mutable myMutableBlockPos = new BlockPos.Mutable().setPos(position).move(Direction.DOWN);
        int seg1Height = inclusiveBoundedRandom(rand, 1, 7),
                seg2Height = inclusiveBoundedRandom(rand, 1, 3),
                seg3Height = inclusiveBoundedRandom(rand, 1, 5);
        int height = 0;


        //Segment 1
        for(int i = 0;  i < seg1Height && height < maxHeight; i++, height++)
            this.setBlockState(world, myMutableBlockPos.move(Direction.UP), ModBlocks.PALM_LOG.get().getDefaultState());

//store random direction in this variable//
        Direction newDir = Direction.Plane.HORIZONTAL.random(rand);

        //offset by that variable direction here//
        myMutableBlockPos.move(newDir);


        //Segment 2
        for(int i = 0;  i < seg2Height && height < maxHeight; i++, height++)
            this.setBlockState(world, myMutableBlockPos.move(Direction.UP), ModBlocks.PALM_LOG.get().getDefaultState());

        //check to see if the tree is at max height before moving forward//
        if(height < maxHeight) {

            //offset again by the same variable direction here//
            myMutableBlockPos.move(newDir);

            //Segment 3
            for (int i = 0; i < seg3Height && height < maxHeight; i++, height++)
                this.setBlockState(world, myMutableBlockPos.move(Direction.UP), ModBlocks.PALM_LOG.get().getDefaultState());

    //set log cross for top of tree
            world.setBlockState(myMutableBlockPos.add(1,0,0), ModBlocks.PALM_LOG.get().getDefaultState().with(RotatedPillarBlock.AXIS, Direction.Axis.X), 3);
            world.setBlockState(myMutableBlockPos.add(0,0,1), ModBlocks.PALM_LOG.get().getDefaultState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z), 3);
            world.setBlockState(myMutableBlockPos.add(-1,0,0), ModBlocks.PALM_LOG.get().getDefaultState().with(RotatedPillarBlock.AXIS, Direction.Axis.X), 3);
            world.setBlockState(myMutableBlockPos.add(0,0,-1), ModBlocks.PALM_LOG.get().getDefaultState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z), 3);

    //place coconuts under log cross
            if(rand.nextInt(3) == 0) {

                world.setBlockState(myMutableBlockPos.add(1, -1, 0), ModBlocks.DA_COCONUT_NUT.get().getDefaultState().with(DaCoconutNutBlock.AGE, Integer.valueOf(rand.nextInt(3))), 3);
            }

            if(rand.nextInt(3) == 0) {
                world.setBlockState(myMutableBlockPos.add(0, -1, 1), ModBlocks.DA_COCONUT_NUT.get().getDefaultState().with(DaCoconutNutBlock.AGE, Integer.valueOf(rand.nextInt(3))), 3);
            }


            if(rand.nextInt(3) == 0) {
                world.setBlockState(myMutableBlockPos.add(-1, -1, 0), ModBlocks.DA_COCONUT_NUT.get().getDefaultState().with(DaCoconutNutBlock.AGE, Integer.valueOf(rand.nextInt(3))), 3);
            }


            if(rand.nextInt(3) == 0) {
                world.setBlockState(myMutableBlockPos.add(0, -1, -1), ModBlocks.DA_COCONUT_NUT.get().getDefaultState().with(DaCoconutNutBlock.AGE, Integer.valueOf(rand.nextInt(3))), 3);
            }

            //place leaves

            world.setBlockState(myMutableBlockPos.add(0,1,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);

            world.setBlockState(myMutableBlockPos.add(5,-3,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);  //trim
            world.setBlockState(myMutableBlockPos.add(0,-3,-5), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-5,-3,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(0,-3,5), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);

            world.setBlockState(myMutableBlockPos.add(3,-2,3), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);  //trim
            world.setBlockState(myMutableBlockPos.add(3,-2,-3), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-3,-2,3), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-3,-2,-3), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);

            world.setBlockState(myMutableBlockPos.add(5,-2,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(0,-2,-5), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-5,-2,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(0,-2,5), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);

            world.setBlockState(myMutableBlockPos.add(3,-1,3), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);  //trim
            world.setBlockState(myMutableBlockPos.add(3,-1,-3), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-3,-1,3), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-3,-1,-3), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);


            world.setBlockState(myMutableBlockPos.add(1,-1,1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(1,-1,-1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-1,-1,1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-1,-1,-1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);

            world.setBlockState(myMutableBlockPos.add(4,-1,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(0,-1,-4), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-4,-1,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(0,-1,4), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);



            world.setBlockState(myMutableBlockPos.add(4,0,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(0,0,-4), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-4,0,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(0,0,4), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);

            world.setBlockState(myMutableBlockPos.add(1,0,1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(1,0,-1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-1,0,1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-1,0,-1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);

            world.setBlockState(myMutableBlockPos.add(2,0,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(0,0,-2), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-2,0,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(0,0,2), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);

            world.setBlockState(myMutableBlockPos.add(3,1,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(0,1,-3), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-3,1,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(0,1,3), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);

            world.setBlockState(myMutableBlockPos.add(1,1,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(0,1,1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-1,1,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(0,1,-1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);

            world.setBlockState(myMutableBlockPos.add(1,1,1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(1,1,-1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-1,1,1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-1,1,-1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);

            world.setBlockState(myMutableBlockPos.add(2,1,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(0,1,-2), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-2,1,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(0,1,2), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);

            world.setBlockState(myMutableBlockPos.add(2,1,2), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(2,1,-2), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-2,1,2), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-2,1,-2), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);


            world.setBlockState(myMutableBlockPos.add(1,2,1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(1,2,-1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-1,2,1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-1,2,-1), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);


            world.setBlockState(myMutableBlockPos.add(2,0,2), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(2,0,-2), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-2,0,2), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);
            world.setBlockState(myMutableBlockPos.add(-2,0,-2), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);

            world.setBlockState(myMutableBlockPos.add(0,2,0), ModBlocks.PALM_LEAVES.get().getDefaultState(), 3);


        }
        return true;
    }

    private static int inclusiveBoundedRandom(Random random, int min, int max) {
        return min + random.nextInt(max-min);
    }

}