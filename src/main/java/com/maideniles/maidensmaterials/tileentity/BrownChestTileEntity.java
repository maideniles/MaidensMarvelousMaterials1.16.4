package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class BrownChestTileEntity extends TestChestTileEntity {

    public BrownChestTileEntity() {
        super(MaidensChestTileEntityTypes.BROWN_CHEST.get(), MaidensChestTypes.BROWN, MaidensChestBlocks.BROWN_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createBrownContainer(id, playerInventory, this);
    }
}
