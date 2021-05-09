package com.maideniles.maidensmaterials.tileentity;



import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class PaulowniaChestTileEntity extends TestChestTileEntity {

    public PaulowniaChestTileEntity() {
        super(MaidensChestTileEntityTypes.PAULOWNIA_CHEST.get(), MaidensChestTypes.PAULOWNIA, MaidensChestBlocks.PAULOWNIA_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createPaulowniaContainer(id, playerInventory, this);
    }
}