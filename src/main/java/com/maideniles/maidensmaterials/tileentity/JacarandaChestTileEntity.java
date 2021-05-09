package com.maideniles.maidensmaterials.tileentity;



import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class JacarandaChestTileEntity extends TestChestTileEntity {

    public JacarandaChestTileEntity() {
        super(MaidensChestTileEntityTypes.JACARANDA_CHEST.get(), MaidensChestTypes.JACARANDA, MaidensChestBlocks.JACARANDA_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createJacarandaContainer(id, playerInventory, this);
    }
}