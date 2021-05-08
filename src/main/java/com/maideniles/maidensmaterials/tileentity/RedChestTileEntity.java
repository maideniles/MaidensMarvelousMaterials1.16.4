package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.TestChestContainer;
import com.maideniles.maidensmaterials.init.TestChestBlocks;
import com.maideniles.maidensmaterials.init.TestChestTileEntityTypes;
import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class RedChestTileEntity extends TestChestTileEntity {

    public RedChestTileEntity() {
        super(TestChestTileEntityTypes.RED_CHEST.get(), TestChestTypes.RED, TestChestBlocks.RED_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return TestChestContainer.createRedContainer(id, playerInventory, this);
    }
}