package com.maideniles.maidensmaterials.blocks.chest;

import com.maideniles.maidensmaterials.blocks.BaseChestBlock;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.tileentity.OrangeChestTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class OrangeChestBlock extends BaseChestBlock {

    public OrangeChestBlock(Properties properties) {
        super(MaidensChestTypes.ORANGE, MaidensChestTileEntityTypes.ORANGE_CHEST::get, properties);
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new OrangeChestTileEntity();
    }
}
