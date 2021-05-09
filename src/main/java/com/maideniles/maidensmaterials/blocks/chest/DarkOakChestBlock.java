package com.maideniles.maidensmaterials.blocks.chest;

import com.maideniles.maidensmaterials.blocks.BaseChestBlock;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import com.maideniles.maidensmaterials.tileentity.DarkOakChestTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class DarkOakChestBlock extends BaseChestBlock {

    public DarkOakChestBlock(Properties properties) {
        super(MaidensChestTypes.DARK_OAK, MaidensChestTileEntityTypes.DARK_OAK_CHEST::get, properties);
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new DarkOakChestTileEntity();
    }
}
