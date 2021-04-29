package com.maideniles.maidensmaterials.blocks.vegetation;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.IPlantable;

public class SparklingSandBlock extends FallingBlock {
    private final int dustColor;

    public SparklingSandBlock(int p_i48338_1_, Properties properties) {
        super(Block.Properties.create(Material.SAND).sound(SoundType.PLANT));
        this.dustColor = p_i48338_1_;
    }

    @OnlyIn(Dist.CLIENT)
    public int getDustColor(BlockState state) {
        return this.dustColor;
    }

    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        return true;
    }
}