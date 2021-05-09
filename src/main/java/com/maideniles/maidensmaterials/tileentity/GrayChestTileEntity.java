package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class GrayChestTileEntity extends TestChestTileEntity {

    public GrayChestTileEntity() {
        super(MaidensChestTileEntityTypes.GRAY_CHEST.get(), MaidensChestTypes.GRAY, MaidensChestBlocks.GRAY_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createGrayContainer(id, playerInventory, this);
    }
}