package com.maideniles.maidensmaterials.blocks.chest;

import com.maideniles.maidensmaterials.blocks.TestChestBlock;
import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import com.maideniles.maidensmaterials.init.TestChestTileEntityTypes;
import com.maideniles.maidensmaterials.tileentity.OrangeChestTileEntity;
import com.maideniles.maidensmaterials.tileentity.RedChestTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class OrangeChestBlock extends TestChestBlock {

    public OrangeChestBlock(Properties properties) {
        super(TestChestTypes.ORANGE, TestChestTileEntityTypes.ORANGE_CHEST::get, properties);
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new OrangeChestTileEntity();
    }
}
