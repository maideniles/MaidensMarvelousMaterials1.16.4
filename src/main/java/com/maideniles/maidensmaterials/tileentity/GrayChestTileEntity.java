package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.TestChestContainer;
import com.maideniles.maidensmaterials.init.TestChestBlocks;
import com.maideniles.maidensmaterials.init.TestChestTileEntityTypes;
import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class GrayChestTileEntity extends TestChestTileEntity {

    public GrayChestTileEntity() {
        super(TestChestTileEntityTypes.GRAY_CHEST.get(), TestChestTypes.GRAY, TestChestBlocks.GRAY_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return TestChestContainer.createGrayContainer(id, playerInventory, this);
    }
}