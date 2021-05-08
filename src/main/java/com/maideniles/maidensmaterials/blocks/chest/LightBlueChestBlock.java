package com.maideniles.maidensmaterials.blocks.chest;

import com.maideniles.maidensmaterials.blocks.TestChestBlock;
import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import com.maideniles.maidensmaterials.init.TestChestTileEntityTypes;
import com.maideniles.maidensmaterials.tileentity.CyanChestTileEntity;
import com.maideniles.maidensmaterials.tileentity.LightBlueChestTileEntity;
import com.maideniles.maidensmaterials.tileentity.RedChestTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class LightBlueChestBlock extends TestChestBlock {

    public LightBlueChestBlock(Properties properties) {
        super(TestChestTypes.LIGHT_BLUE, TestChestTileEntityTypes.LIGHT_BLUE_CHEST::get, properties);
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new LightBlueChestTileEntity();
    }
}