package com.maideniles.maidensmaterials.blocks.chest;

import com.maideniles.maidensmaterials.blocks.TestChestBlock;
import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import com.maideniles.maidensmaterials.init.TestChestTileEntityTypes;
import com.maideniles.maidensmaterials.tileentity.RedChestTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class RedChestBlock extends TestChestBlock {

    public RedChestBlock(Properties properties) {
        super(TestChestTypes.RED, TestChestTileEntityTypes.RED_CHEST::get, properties);
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new RedChestTileEntity();
    }
}
