package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class JungleChestTileEntity extends TestChestTileEntity {

    public JungleChestTileEntity() {
        super(MaidensChestTileEntityTypes.JUNGLE_CHEST.get(), MaidensChestTypes.JUNGLE, MaidensChestBlocks.JUNGLE_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createJungleContainer(id, playerInventory, this);
    }
}