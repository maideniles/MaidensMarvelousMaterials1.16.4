package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class DarkOakChestTileEntity extends TestChestTileEntity {

    public DarkOakChestTileEntity() {
        super(MaidensChestTileEntityTypes.DARK_OAK_CHEST.get(), MaidensChestTypes.DARK_OAK, MaidensChestBlocks.DARK_OAK_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createDarkOakContainer(id, playerInventory, this);
    }
}
