package com.maideniles.maidensmaterials.tileentity;



import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class LimeChestTileEntity extends TestChestTileEntity {

    public LimeChestTileEntity() {
        super(MaidensChestTileEntityTypes.LIME_CHEST.get(), MaidensChestTypes.LIME, MaidensChestBlocks.LIME_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createLimeContainer(id, playerInventory, this);
    }
}