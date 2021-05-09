package com.maideniles.maidensmaterials.tileentity;



import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.init.MaidensChestTileEntityTypes;
import com.maideniles.maidensmaterials.init.MaidensChestBlocks;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class WhiteChestTileEntity extends TestChestTileEntity {

    public WhiteChestTileEntity() {
        super(MaidensChestTileEntityTypes.WHITE_CHEST.get(), MaidensChestTypes.WHITE, MaidensChestBlocks.WHITE_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return MaidensChestContainer.createWhiteContainer(id, playerInventory, this);
    }
}