package com.maideniles.maidensmaterials.blocks.chest;

import com.maideniles.maidensmaterials.blocks.BaseChestBlock;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.tileentity.LightBlueChestTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class LightBlueChestBlock extends BaseChestBlock {

    public LightBlueChestBlock(Properties properties) {
        super(MaidensChestTypes.LIGHT_BLUE, MaidensChestTileEntityTypes.LIGHT_BLUE_CHEST::get, properties);
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new LightBlueChestTileEntity();
    }
}