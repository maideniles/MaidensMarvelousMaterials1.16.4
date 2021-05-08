package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.TestChestContainer;
import com.maideniles.maidensmaterials.init.TestChestBlocks;
import com.maideniles.maidensmaterials.init.TestChestTileEntityTypes;
import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class BrownChestTileEntity extends TestChestTileEntity {

    public BrownChestTileEntity() {
        super(TestChestTileEntityTypes.BROWN_CHEST.get(), TestChestTypes.BROWN, TestChestBlocks.BROWN_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return TestChestContainer.createBrownContainer(id, playerInventory, this);
    }
}
