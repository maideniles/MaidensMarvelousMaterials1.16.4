package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class PinkChestTileEntity extends TestChestTileEntity {

    public PinkChestTileEntity() {
        super(MaidensChestTileEntityTypes.PINK_CHEST.get(), MaidensChestTypes.PINK, MaidensChestBlocks.PINK_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createPinkContainer(id, playerInventory, this);
    }
}