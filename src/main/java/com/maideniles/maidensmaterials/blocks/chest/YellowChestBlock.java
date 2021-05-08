package com.maideniles.maidensmaterials.blocks.chest;

import com.maideniles.maidensmaterials.blocks.TestChestBlock;
import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import com.maideniles.maidensmaterials.init.TestChestTileEntityTypes;
import com.maideniles.maidensmaterials.tileentity.RedChestTileEntity;
import com.maideniles.maidensmaterials.tileentity.YellowChestTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class YellowChestBlock extends TestChestBlock {

    public YellowChestBlock(Properties properties) {
        super(TestChestTypes.YELLOW, TestChestTileEntityTypes.YELLOW_CHEST::get, properties);
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new YellowChestTileEntity();
    }
}
