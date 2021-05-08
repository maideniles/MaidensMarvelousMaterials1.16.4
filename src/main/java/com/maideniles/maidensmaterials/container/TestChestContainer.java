package com.maideniles.maidensmaterials.container;

import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import com.maideniles.maidensmaterials.init.TestChestContainerTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TestChestContainer extends Container {

    private final IInventory inventory;

    private final TestChestTypes chestType;



    public static TestChestContainer createRedContainer(int windowId, PlayerInventory playerInventory) {
        return new TestChestContainer(TestChestContainerTypes.RED_CHEST.get(), windowId, playerInventory, new Inventory(TestChestTypes.RED.size), TestChestTypes.RED);
    }

    public static TestChestContainer createRedContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new TestChestContainer(TestChestContainerTypes.RED_CHEST.get(), windowId, playerInventory, inventory, TestChestTypes.RED);
    }

    public static TestChestContainer createOrangeContainer(int windowId, PlayerInventory playerInventory) {
        return new TestChestContainer(TestChestContainerTypes.ORANGE_CHEST.get(), windowId, playerInventory, new Inventory(TestChestTypes.ORANGE.size), TestChestTypes.ORANGE);
    }

    public static TestChestContainer createOrangeContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new TestChestContainer(TestChestContainerTypes.ORANGE_CHEST.get(), windowId, playerInventory, inventory, TestChestTypes.ORANGE);
    }

    public static TestChestContainer createYellowContainer(int windowId, PlayerInventory playerInventory) {
        return new TestChestContainer(TestChestContainerTypes.YELLOW_CHEST.get(), windowId, playerInventory, new Inventory(TestChestTypes.YELLOW.size), TestChestTypes.YELLOW);
    }

    public static TestChestContainer createYellowContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new TestChestContainer(TestChestContainerTypes.YELLOW_CHEST.get(), windowId, playerInventory, inventory, TestChestTypes.YELLOW);
    }

    public static TestChestContainer createLimeContainer(int windowId, PlayerInventory playerInventory) {
        return new TestChestContainer(TestChestContainerTypes.LIME_CHEST.get(), windowId, playerInventory, new Inventory(TestChestTypes.LIME.size), TestChestTypes.LIME);
    }

    public static TestChestContainer createLimeContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new TestChestContainer(TestChestContainerTypes.LIME_CHEST.get(), windowId, playerInventory, inventory, TestChestTypes.LIME);
    }

    public static TestChestContainer createGreenContainer(int windowId, PlayerInventory playerInventory) {
        return new TestChestContainer(TestChestContainerTypes.GREEN_CHEST.get(), windowId, playerInventory, new Inventory(TestChestTypes.GREEN.size), TestChestTypes.GREEN);
    }

    public static TestChestContainer createGreenContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new TestChestContainer(TestChestContainerTypes.GREEN_CHEST.get(), windowId, playerInventory, inventory, TestChestTypes.GREEN);
    }

    public static TestChestContainer createCyanContainer(int windowId, PlayerInventory playerInventory) {
        return new TestChestContainer(TestChestContainerTypes.CYAN_CHEST.get(), windowId, playerInventory, new Inventory(TestChestTypes.CYAN.size), TestChestTypes.CYAN);
    }

    public static TestChestContainer createCyanContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new TestChestContainer(TestChestContainerTypes.CYAN_CHEST.get(), windowId, playerInventory, inventory, TestChestTypes.CYAN);
    }

    public static TestChestContainer createLightBlueContainer(int windowId, PlayerInventory playerInventory) {
        return new TestChestContainer(TestChestContainerTypes.LIGHT_BLUE_CHEST.get(), windowId, playerInventory, new Inventory(TestChestTypes.LIGHT_BLUE.size), TestChestTypes.LIGHT_BLUE);
    }

    public static TestChestContainer createLightBlueContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new TestChestContainer(TestChestContainerTypes.LIGHT_BLUE_CHEST.get(), windowId, playerInventory, inventory, TestChestTypes.LIGHT_BLUE);
    }

    public static TestChestContainer createBlueContainer(int windowId, PlayerInventory playerInventory) {
        return new TestChestContainer(TestChestContainerTypes.BLUE_CHEST.get(), windowId, playerInventory, new Inventory(TestChestTypes.BLUE.size), TestChestTypes.BLUE);
    }

    public static TestChestContainer createBlueContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new TestChestContainer(TestChestContainerTypes.BLUE_CHEST.get(), windowId, playerInventory, inventory, TestChestTypes.BLUE);
    }

    public static TestChestContainer createPurpleContainer(int windowId, PlayerInventory playerInventory) {
        return new TestChestContainer(TestChestContainerTypes.PURPLE_CHEST.get(), windowId, playerInventory, new Inventory(TestChestTypes.PURPLE.size), TestChestTypes.PURPLE);
    }

    public static TestChestContainer createPurpleContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new TestChestContainer(TestChestContainerTypes.PURPLE_CHEST.get(), windowId, playerInventory, inventory, TestChestTypes.PURPLE);
    }

    public static TestChestContainer createMagentaContainer(int windowId, PlayerInventory playerInventory) {
        return new TestChestContainer(TestChestContainerTypes.MAGENTA_CHEST.get(), windowId, playerInventory, new Inventory(TestChestTypes.MAGENTA.size), TestChestTypes.MAGENTA);
    }

    public static TestChestContainer createMagentaContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new TestChestContainer(TestChestContainerTypes.MAGENTA_CHEST.get(), windowId, playerInventory, inventory, TestChestTypes.MAGENTA);
    }

    public static TestChestContainer createPinkContainer(int windowId, PlayerInventory playerInventory) {
        return new TestChestContainer(TestChestContainerTypes.PINK_CHEST.get(), windowId, playerInventory, new Inventory(TestChestTypes.PINK.size), TestChestTypes.PINK);
    }

    public static TestChestContainer createPinkContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new TestChestContainer(TestChestContainerTypes.PINK_CHEST.get(), windowId, playerInventory, inventory, TestChestTypes.PINK);
    }

    public static TestChestContainer createWhiteContainer(int windowId, PlayerInventory playerInventory) {
        return new TestChestContainer(TestChestContainerTypes.WHITE_CHEST.get(), windowId, playerInventory, new Inventory(TestChestTypes.WHITE.size), TestChestTypes.WHITE);
    }

    public static TestChestContainer createWhiteContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new TestChestContainer(TestChestContainerTypes.WHITE_CHEST.get(), windowId, playerInventory, inventory, TestChestTypes.WHITE);
    }

    public static TestChestContainer createLightGrayContainer(int windowId, PlayerInventory playerInventory) {
        return new TestChestContainer(TestChestContainerTypes.LIGHT_GRAY_CHEST.get(), windowId, playerInventory, new Inventory(TestChestTypes.LIGHT_GRAY.size), TestChestTypes.LIGHT_GRAY);
    }

    public static TestChestContainer createLightGrayContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new TestChestContainer(TestChestContainerTypes.LIGHT_GRAY_CHEST.get(), windowId, playerInventory, inventory, TestChestTypes.LIGHT_GRAY);
    }

    public static TestChestContainer createGrayContainer(int windowId, PlayerInventory playerInventory) {
        return new TestChestContainer(TestChestContainerTypes.GRAY_CHEST.get(), windowId, playerInventory, new Inventory(TestChestTypes.GRAY.size), TestChestTypes.GRAY);
    }

    public static TestChestContainer createGrayContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new TestChestContainer(TestChestContainerTypes.GRAY_CHEST.get(), windowId, playerInventory, inventory, TestChestTypes.GRAY);
    }


    public static TestChestContainer createBlackContainer(int windowId, PlayerInventory playerInventory) {
        return new TestChestContainer(TestChestContainerTypes.BLACK_CHEST.get(), windowId, playerInventory, new Inventory(TestChestTypes.BLACK.size), TestChestTypes.BLACK);
    }

    public static TestChestContainer createBlackContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new TestChestContainer(TestChestContainerTypes.BLACK_CHEST.get(), windowId, playerInventory, inventory, TestChestTypes.BLACK);
    }

    public static TestChestContainer createBrownContainer(int windowId, PlayerInventory playerInventory) {
        return new TestChestContainer(TestChestContainerTypes.BROWN_CHEST.get(), windowId, playerInventory, new Inventory(TestChestTypes.BROWN.size), TestChestTypes.BROWN);
    }

    public static TestChestContainer createBrownContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new TestChestContainer(TestChestContainerTypes.BROWN_CHEST.get(), windowId, playerInventory, inventory, TestChestTypes.BROWN);
    }

    public TestChestContainer(ContainerType<?> containerType, int windowId, PlayerInventory playerInventory, IInventory inventory, TestChestTypes chestType) {
        super(containerType, windowId);
        assertInventorySize(inventory, chestType.size);

        this.inventory = inventory;
        this.chestType = chestType;

        inventory.openInventory(playerInventory.player);


            for (int chestRow = 0; chestRow < chestType.getRowCount(); chestRow++) {
                for (int chestCol = 0; chestCol < chestType.rowLength; chestCol++) {
                    this.addSlot(new Slot(inventory, chestCol + chestRow * chestType.rowLength, 12 + chestCol * 18, 18 + chestRow * 18));
                }
            }


        int leftCol = (chestType.xSize - 162) / 2 + 1;

        for (int playerInvRow = 0; playerInvRow < 3; playerInvRow++) {
            for (int playerInvCol = 0; playerInvCol < 9; playerInvCol++) {
                this.addSlot(new Slot(playerInventory, playerInvCol + playerInvRow * 9 + 9, leftCol + playerInvCol * 18, chestType.ySize - (4 - playerInvRow) * 18 - 10));
            }

        }

        for (int hotbarSlot = 0; hotbarSlot < 9; hotbarSlot++) {
            this.addSlot(new Slot(playerInventory, hotbarSlot, leftCol + hotbarSlot * 18, chestType.ySize - 24));
        }
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return this.inventory.isUsableByPlayer(playerIn);
    }

    @Override
    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index < this.chestType.size) {
                if (!this.mergeItemStack(itemstack1, this.chestType.size, this.inventorySlots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 0, this.chestType.size, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            }
            else {
                slot.onSlotChanged();
            }
        }

        return itemstack;
    }

    @Override
    public void onContainerClosed(PlayerEntity playerIn) {
        super.onContainerClosed(playerIn);
        this.inventory.closeInventory(playerIn);
    }

    @OnlyIn(Dist.CLIENT)
    public TestChestTypes getChestType() {
        return this.chestType;
    }
}
