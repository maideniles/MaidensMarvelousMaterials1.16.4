package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.TestChestContainer;
import com.maideniles.maidensmaterials.init.TestChestBlocks;
import com.maideniles.maidensmaterials.init.TestChestTileEntityTypes;
import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class LightGrayChestTileEntity extends TestChestTileEntity {

    public LightGrayChestTileEntity() {
        super(TestChestTileEntityTypes.LIGHT_GRAY_CHEST.get(), TestChestTypes.LIGHT_GRAY, TestChestBlocks.LIGHT_GRAY_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return TestChestContainer.createLightGrayContainer(id, playerInventory, this);
    }
}