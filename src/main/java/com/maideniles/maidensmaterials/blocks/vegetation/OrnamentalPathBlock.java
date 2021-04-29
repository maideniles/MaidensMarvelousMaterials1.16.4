package com.maideniles.maidensmaterials.blocks.vegetation;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.GrassPathBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class OrnamentalPathBlock extends GrassPathBlock {

    private static final VoxelShape SHAPE = Block.makeCuboidShape(0, 0, 0, 16, 14, 16);

    public OrnamentalPathBlock(Block.Properties properties) {
        super(Block.Properties.create(Material.ORGANIC).hardnessAndResistance(2.5F).sound(SoundType.GROUND));





        // TODO Auto-generated constructor stub
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


    /**
     * Used to determine ambient occlusion and culling when rebuilding chunks for render
     */




}