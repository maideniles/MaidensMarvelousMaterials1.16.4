package com.maideniles.maidensmaterials.blocks.chest;

import com.maideniles.maidensmaterials.blocks.BaseChestBlock;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.tileentity.BlueChestTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class BlueChestBlock extends BaseChestBlock {

    public BlueChestBlock(Properties properties) {
        super(MaidensChestTypes.BLUE, MaidensChestTileEntityTypes.BLUE_CHEST::get, properties);
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new BlueChestTileEntity();
    }
}
