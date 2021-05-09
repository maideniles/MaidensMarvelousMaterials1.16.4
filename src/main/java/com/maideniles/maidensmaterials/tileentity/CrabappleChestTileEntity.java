package com.maideniles.maidensmaterials.tileentity;



import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class CrabappleChestTileEntity extends TestChestTileEntity {

    public CrabappleChestTileEntity() {
        super(MaidensChestTileEntityTypes.CRABAPPLE_CHEST.get(), MaidensChestTypes.CRABAPPLE, MaidensChestBlocks.CRABAPPLE_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createCrabappleContainer(id, playerInventory, this);
    }
}