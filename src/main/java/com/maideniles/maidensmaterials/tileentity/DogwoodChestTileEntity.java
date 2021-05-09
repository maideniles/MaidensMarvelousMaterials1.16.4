package com.maideniles.maidensmaterials.tileentity;



import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class DogwoodChestTileEntity extends TestChestTileEntity {

    public DogwoodChestTileEntity() {
        super(MaidensChestTileEntityTypes.DOGWOOD_CHEST.get(), MaidensChestTypes.DOGWOOD, MaidensChestBlocks.DOGWOOD_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createDogwoodContainer(id, playerInventory, this);
    }
}