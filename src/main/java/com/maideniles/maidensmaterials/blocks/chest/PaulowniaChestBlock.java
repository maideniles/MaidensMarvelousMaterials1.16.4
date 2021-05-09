package com.maideniles.maidensmaterials.blocks.chest;

import com.maideniles.maidensmaterials.blocks.BaseChestBlock;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import com.maideniles.maidensmaterials.tileentity.PaulowniaChestTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class PaulowniaChestBlock extends BaseChestBlock {

    public PaulowniaChestBlock(Properties properties) {
        super(MaidensChestTypes.PAULOWNIA, MaidensChestTileEntityTypes.PAULOWNIA_CHEST::get, properties);
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new PaulowniaChestTileEntity();
    }
}