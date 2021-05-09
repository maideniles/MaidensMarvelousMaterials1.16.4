package com.maideniles.maidensmaterials.tileentity;



import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class WisteriaChestTileEntity extends TestChestTileEntity {

    public WisteriaChestTileEntity() {
        super(MaidensChestTileEntityTypes.WISTERIA_CHEST.get(), MaidensChestTypes.WISTERIA, MaidensChestBlocks.WISTERIA_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createWisteriaContainer(id, playerInventory, this);
    }
}