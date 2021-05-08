package com.maideniles.maidensmaterials.blocks.chest;

import com.maideniles.maidensmaterials.blocks.TestChestBlock;
import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import com.maideniles.maidensmaterials.init.TestChestTileEntityTypes;
import com.maideniles.maidensmaterials.tileentity.BlueChestTileEntity;
import com.maideniles.maidensmaterials.tileentity.RedChestTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class BlueChestBlock extends TestChestBlock {

    public BlueChestBlock(Properties properties) {
        super(TestChestTypes.BLUE, TestChestTileEntityTypes.BLUE_CHEST::get, properties);
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new BlueChestTileEntity();
    }
}
