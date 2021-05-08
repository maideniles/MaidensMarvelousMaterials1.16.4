package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.TestChestContainer;
import com.maideniles.maidensmaterials.init.TestChestTileEntityTypes;
import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import com.maideniles.maidensmaterials.init.TestChestBlocks;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class YellowChestTileEntity extends TestChestTileEntity {

    public YellowChestTileEntity() {
        super(TestChestTileEntityTypes.YELLOW_CHEST.get(), TestChestTypes.YELLOW, TestChestBlocks.YELLOW_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return TestChestContainer.createYellowContainer(id, playerInventory, this);
    }
}
