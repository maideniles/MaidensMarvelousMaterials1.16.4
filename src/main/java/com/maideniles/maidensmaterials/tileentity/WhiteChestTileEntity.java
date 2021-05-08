package com.maideniles.maidensmaterials.tileentity;



import com.maideniles.maidensmaterials.container.TestChestContainer;
import com.maideniles.maidensmaterials.init.TestChestBlocks;
import com.maideniles.maidensmaterials.init.TestChestTileEntityTypes;
import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class WhiteChestTileEntity extends TestChestTileEntity {

    public WhiteChestTileEntity() {
        super(TestChestTileEntityTypes.WHITE_CHEST.get(), TestChestTypes.WHITE, TestChestBlocks.WHITE_CHEST::get);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return TestChestContainer.createWhiteContainer(id, playerInventory, this);
    }
}