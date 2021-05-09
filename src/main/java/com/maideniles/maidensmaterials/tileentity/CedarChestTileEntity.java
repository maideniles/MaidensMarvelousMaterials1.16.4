package com.maideniles.maidensmaterials.tileentity;



import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class CedarChestTileEntity extends TestChestTileEntity {

    public CedarChestTileEntity() {
        super(MaidensChestTileEntityTypes.CEDAR_CHEST.get(), MaidensChestTypes.CEDAR, MaidensChestBlocks.CEDAR_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createCedarContainer(id, playerInventory, this);
    }
}