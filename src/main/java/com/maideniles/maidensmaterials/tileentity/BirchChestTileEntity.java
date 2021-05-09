package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class BirchChestTileEntity extends TestChestTileEntity {

    public BirchChestTileEntity() {
        super(MaidensChestTileEntityTypes.BIRCH_CHEST.get(), MaidensChestTypes.BIRCH, MaidensChestBlocks.BIRCH_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createBirchContainer(id, playerInventory, this);
    }
}