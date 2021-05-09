package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class AcaciaChestTileEntity extends TestChestTileEntity {

    public AcaciaChestTileEntity() {
        super(MaidensChestTileEntityTypes.ACACIA_CHEST.get(), MaidensChestTypes.ACACIA, MaidensChestBlocks.ACACIA_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createAcaciaContainer(id, playerInventory, this);
    }
}
