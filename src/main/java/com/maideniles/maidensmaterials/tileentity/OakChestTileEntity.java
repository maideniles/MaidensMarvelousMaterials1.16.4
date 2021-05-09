package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class OakChestTileEntity extends TestChestTileEntity {

    public OakChestTileEntity() {
        super(MaidensChestTileEntityTypes.OAK_CHEST.get(), MaidensChestTypes.OAK, MaidensChestBlocks.OAK_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createOakContainer(id, playerInventory, this);
    }
}
