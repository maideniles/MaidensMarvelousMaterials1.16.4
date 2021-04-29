package com.maideniles.maidensmaterials.blocks.vegetation;


import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class FlowerGrassBlock extends BushBlock {

    private static final VoxelShape SHAPE = Block.makeCuboidShape(0, 0, 0, 16, 1.0, 16);

    public FlowerGrassBlock(Properties properties) {
        super(Block.Properties.create(Material.PLANTS).sound(SoundType.PLANT).notSolid());




    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext selectionContext)
    {  return SHAPE;

    }

    @Override
    public VoxelShape getRenderShape(BlockState state, IBlockReader reader, BlockPos pos)
    {
        return SHAPE;
    }




    @Override
    public boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        Block block = state.getBlock();
        return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT
                || block == Blocks.PODZOL || block == Blocks.SAND || block == ModBlocks.SPARKLING_SAND.get() ;
    }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        BlockPos blockpos = pos.down();
        if (state.getBlock() == this) //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
            return worldIn.getBlockState(blockpos).canSustainPlant(worldIn, blockpos, Direction.UP, this);
        return this.isValidGround(worldIn.getBlockState(blockpos), worldIn, blockpos);
    }

    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    public int tickRate(World worldIn) {
        return 3;
    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        if (state.getBlock() == this) {
            worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
        }

    }






}