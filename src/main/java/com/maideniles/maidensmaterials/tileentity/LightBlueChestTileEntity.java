package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.TestChestContainer;
import com.maideniles.maidensmaterials.init.TestChestBlocks;
import com.maideniles.maidensmaterials.init.TestChestTileEntityTypes;
import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class LightBlueChestTileEntity extends TestChestTileEntity {

    public LightBlueChestTileEntity() {
        super(TestChestTileEntityTypes.LIGHT_BLUE_CHEST.get(), TestChestTypes.LIGHT_BLUE, TestChestBlocks.LIGHT_BLUE_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return TestChestContainer.createLightBlueContainer(id, playerInventory, this);
    }
}
