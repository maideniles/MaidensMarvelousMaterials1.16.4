package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class RedChestTileEntity extends TestChestTileEntity {

    public RedChestTileEntity() {
        super(MaidensChestTileEntityTypes.RED_CHEST.get(), MaidensChestTypes.RED, MaidensChestBlocks.RED_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createRedContainer(id, playerInventory, this);
    }
}