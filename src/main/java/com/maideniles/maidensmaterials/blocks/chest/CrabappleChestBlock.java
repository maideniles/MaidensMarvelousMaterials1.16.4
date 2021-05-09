package com.maideniles.maidensmaterials.blocks.chest;

import com.maideniles.maidensmaterials.blocks.BaseChestBlock;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import com.maideniles.maidensmaterials.tileentity.CrabappleChestTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class CrabappleChestBlock extends BaseChestBlock {

    public CrabappleChestBlock(Properties properties) {
        super(MaidensChestTypes.CRABAPPLE, MaidensChestTileEntityTypes.CRABAPPLE_CHEST::get, properties);
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new CrabappleChestTileEntity();
    }
}