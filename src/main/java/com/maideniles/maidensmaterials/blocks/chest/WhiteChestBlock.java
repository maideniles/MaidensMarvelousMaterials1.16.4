package com.maideniles.maidensmaterials.blocks.chest;

import com.maideniles.maidensmaterials.blocks.TestChestBlock;
import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import com.maideniles.maidensmaterials.init.TestChestTileEntityTypes;
import com.maideniles.maidensmaterials.tileentity.RedChestTileEntity;
import com.maideniles.maidensmaterials.tileentity.WhiteChestTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class WhiteChestBlock extends TestChestBlock {

    public WhiteChestBlock(Properties properties) {
        super(TestChestTypes.WHITE, TestChestTileEntityTypes.WHITE_CHEST::get, properties);
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new WhiteChestTileEntity();
    }
}
