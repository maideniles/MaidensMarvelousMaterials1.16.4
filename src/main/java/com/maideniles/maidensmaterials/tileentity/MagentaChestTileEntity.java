package com.maideniles.maidensmaterials.tileentity;

import com.maideniles.maidensmaterials.container.TestChestContainer;
import com.maideniles.maidensmaterials.init.TestChestBlocks;
import com.maideniles.maidensmaterials.init.TestChestTileEntityTypes;
import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class MagentaChestTileEntity extends TestChestTileEntity {

    public MagentaChestTileEntity() {
        super(TestChestTileEntityTypes.MAGENTA_CHEST.get(), TestChestTypes.MAGENTA, TestChestBlocks.MAGENTA_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return TestChestContainer.createMagentaContainer(id, playerInventory, this);
    }
}
