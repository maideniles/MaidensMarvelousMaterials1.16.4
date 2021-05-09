package com.maideniles.maidensmaterials.tileentity;



import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class CyanChestTileEntity extends TestChestTileEntity {

    public CyanChestTileEntity() {
        super(MaidensChestTileEntityTypes.CYAN_CHEST.get(), MaidensChestTypes.CYAN, MaidensChestBlocks.CYAN_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createCyanContainer(id, playerInventory, this);
    }
}