package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class WarpedChestTileEntity extends TestChestTileEntity {

    public WarpedChestTileEntity() {
        super(MaidensChestTileEntityTypes.WARPED_CHEST.get(), MaidensChestTypes.WARPED, MaidensChestBlocks.WARPED_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createWarpedContainer(id, playerInventory, this);
    }
}