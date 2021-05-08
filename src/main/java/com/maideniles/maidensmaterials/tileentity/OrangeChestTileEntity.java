package com.maideniles.maidensmaterials.tileentity;
import com.maideniles.maidensmaterials.container.TestChestContainer;
import com.maideniles.maidensmaterials.init.TestChestBlocks;

import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import com.maideniles.maidensmaterials.init.TestChestTileEntityTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class OrangeChestTileEntity extends TestChestTileEntity {

    public OrangeChestTileEntity() {
        super(TestChestTileEntityTypes.ORANGE_CHEST.get(), TestChestTypes.ORANGE, TestChestBlocks.ORANGE_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return TestChestContainer.createOrangeContainer(id, playerInventory, this);
    }
}