package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class YellowChestTileEntity extends TestChestTileEntity {

    public YellowChestTileEntity() {
        super(MaidensChestTileEntityTypes.YELLOW_CHEST.get(), MaidensChestTypes.YELLOW, MaidensChestBlocks.YELLOW_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createYellowContainer(id, playerInventory, this);
    }
}
