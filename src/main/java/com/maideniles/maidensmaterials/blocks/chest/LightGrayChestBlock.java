package com.maideniles.maidensmaterials.blocks.chest;

import com.maideniles.maidensmaterials.blocks.BaseChestBlock;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import com.maideniles.maidensmaterials.tileentity.LightGrayChestTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class LightGrayChestBlock extends BaseChestBlock {

    public LightGrayChestBlock(Properties properties) {
        super(MaidensChestTypes.LIGHT_GRAY, MaidensChestTileEntityTypes.LIGHT_GRAY_CHEST::get, properties);
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new LightGrayChestTileEntity();
    }
}