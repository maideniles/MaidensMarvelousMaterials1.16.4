package com.maideniles.maidensmaterials.blocks.chest;

import com.maideniles.maidensmaterials.blocks.TestChestBlock;
import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import com.maideniles.maidensmaterials.init.TestChestTileEntityTypes;
import com.maideniles.maidensmaterials.tileentity.BlackChestTileEntity;
import com.maideniles.maidensmaterials.tileentity.RedChestTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class BlackChestBlock extends TestChestBlock {

    public BlackChestBlock(Properties properties) {
        super(TestChestTypes.BLACK, TestChestTileEntityTypes.BLACK_CHEST::get, properties);
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new BlackChestTileEntity();
    }
}