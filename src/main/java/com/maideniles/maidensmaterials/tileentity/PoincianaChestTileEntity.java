package com.maideniles.maidensmaterials.tileentity;



import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class PoincianaChestTileEntity extends TestChestTileEntity {

    public PoincianaChestTileEntity() {
        super(MaidensChestTileEntityTypes.POINCIANA_CHEST.get(), MaidensChestTypes.POINCIANA, MaidensChestBlocks.POINCIANA_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createPoincianaContainer(id, playerInventory, this);
    }
}