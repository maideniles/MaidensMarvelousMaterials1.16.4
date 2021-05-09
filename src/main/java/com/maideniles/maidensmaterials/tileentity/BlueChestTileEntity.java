package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class BlueChestTileEntity extends TestChestTileEntity {

    public BlueChestTileEntity() {
        super(MaidensChestTileEntityTypes.BLUE_CHEST.get(), MaidensChestTypes.BLUE, MaidensChestBlocks.BLUE_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createBlueContainer(id, playerInventory, this);
    }
}