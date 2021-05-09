package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class PurpleChestTileEntity extends TestChestTileEntity {

    public PurpleChestTileEntity() {
        super(MaidensChestTileEntityTypes.PURPLE_CHEST.get(), MaidensChestTypes.PURPLE, MaidensChestBlocks.PURPLE_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createPurpleContainer(id, playerInventory, this);
    }
}