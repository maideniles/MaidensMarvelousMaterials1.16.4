package com.maideniles.maidensmaterials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class MaidensBookshelfBlock extends Block {
    public MaidensBookshelfBlock(Properties properties) {
        super(properties);
    }


    @Override
    public float getEnchantPowerBonus(BlockState state, IWorldReader world, BlockPos pos) {
        return 1;
    }
}
