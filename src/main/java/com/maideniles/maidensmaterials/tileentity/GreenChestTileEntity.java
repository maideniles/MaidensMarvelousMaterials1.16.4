package com.maideniles.maidensmaterials.tileentity;



import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class GreenChestTileEntity extends TestChestTileEntity {

    public GreenChestTileEntity() {
        super(MaidensChestTileEntityTypes.GREEN_CHEST.get(), MaidensChestTypes.GREEN, MaidensChestBlocks.GREEN_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createGreenContainer(id, playerInventory, this);
    }
}