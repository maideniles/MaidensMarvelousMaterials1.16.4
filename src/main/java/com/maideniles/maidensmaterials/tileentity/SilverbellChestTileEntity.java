package com.maideniles.maidensmaterials.tileentity;



import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class SilverbellChestTileEntity extends TestChestTileEntity {

    public SilverbellChestTileEntity() {
        super(MaidensChestTileEntityTypes.SILVERBELL_CHEST.get(), MaidensChestTypes.SILVERBELL, MaidensChestBlocks.SILVERBELL_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createSilverbellContainer(id, playerInventory, this);
    }
}