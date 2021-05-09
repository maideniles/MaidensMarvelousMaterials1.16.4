package com.maideniles.maidensmaterials.container;

import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import com.maideniles.maidensmaterials.init.MaidensChestContainerTypes;
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

public class MaidensChestContainer extends Container {

    private final IInventory inventory;

    private final MaidensChestTypes chestType;



    public static MaidensChestContainer createRedContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.RED_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.RED.size), MaidensChestTypes.RED);
    }

    public static MaidensChestContainer createRedContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.RED_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.RED);
    }

    public static MaidensChestContainer createOrangeContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.ORANGE_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.ORANGE.size), MaidensChestTypes.ORANGE);
    }

    public static MaidensChestContainer createOrangeContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.ORANGE_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.ORANGE);
    }

    public static MaidensChestContainer createYellowContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.YELLOW_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.YELLOW.size), MaidensChestTypes.YELLOW);
    }

    public static MaidensChestContainer createYellowContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.YELLOW_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.YELLOW);
    }

    public static MaidensChestContainer createLimeContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.LIME_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.LIME.size), MaidensChestTypes.LIME);
    }

    public static MaidensChestContainer createLimeContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.LIME_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.LIME);
    }

    public static MaidensChestContainer createGreenContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.GREEN_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.GREEN.size), MaidensChestTypes.GREEN);
    }

    public static MaidensChestContainer createGreenContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.GREEN_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.GREEN);
    }

    public static MaidensChestContainer createCyanContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.CYAN_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.CYAN.size), MaidensChestTypes.CYAN);
    }

    public static MaidensChestContainer createCyanContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.CYAN_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.CYAN);
    }

    public static MaidensChestContainer createLightBlueContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.LIGHT_BLUE_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.LIGHT_BLUE.size), MaidensChestTypes.LIGHT_BLUE);
    }

    public static MaidensChestContainer createLightBlueContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.LIGHT_BLUE_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.LIGHT_BLUE);
    }

    public static MaidensChestContainer createBlueContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.BLUE_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.BLUE.size), MaidensChestTypes.BLUE);
    }

    public static MaidensChestContainer createBlueContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.BLUE_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.BLUE);
    }

    public static MaidensChestContainer createPurpleContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.PURPLE_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.PURPLE.size), MaidensChestTypes.PURPLE);
    }

    public static MaidensChestContainer createPurpleContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.PURPLE_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.PURPLE);
    }

    public static MaidensChestContainer createMagentaContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.MAGENTA_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.MAGENTA.size), MaidensChestTypes.MAGENTA);
    }

    public static MaidensChestContainer createMagentaContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.MAGENTA_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.MAGENTA);
    }

    public static MaidensChestContainer createPinkContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.PINK_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.PINK.size), MaidensChestTypes.PINK);
    }

    public static MaidensChestContainer createPinkContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.PINK_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.PINK);
    }

    public static MaidensChestContainer createWhiteContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.WHITE_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.WHITE.size), MaidensChestTypes.WHITE);
    }

    public static MaidensChestContainer createWhiteContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.WHITE_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.WHITE);
    }

    public static MaidensChestContainer createLightGrayContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.LIGHT_GRAY_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.LIGHT_GRAY.size), MaidensChestTypes.LIGHT_GRAY);
    }

    public static MaidensChestContainer createLightGrayContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.LIGHT_GRAY_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.LIGHT_GRAY);
    }

    public static MaidensChestContainer createGrayContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.GRAY_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.GRAY.size), MaidensChestTypes.GRAY);
    }

    public static MaidensChestContainer createGrayContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.GRAY_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.GRAY);
    }


    public static MaidensChestContainer createBlackContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.BLACK_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.BLACK.size), MaidensChestTypes.BLACK);
    }

    public static MaidensChestContainer createBlackContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.BLACK_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.BLACK);
    }

    public static MaidensChestContainer createBrownContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.BROWN_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.BROWN.size), MaidensChestTypes.BROWN);
    }

    public static MaidensChestContainer createBrownContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.BROWN_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.BROWN);
    }

    public static MaidensChestContainer createCrabappleContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.CRABAPPLE_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.CRABAPPLE.size), MaidensChestTypes.CRABAPPLE);
    }

    public static MaidensChestContainer createCrabappleContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.CRABAPPLE_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.CRABAPPLE);
    }

    public static MaidensChestContainer createPoincianaContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.POINCIANA_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.POINCIANA.size), MaidensChestTypes.POINCIANA);
    }

    public static MaidensChestContainer createPoincianaContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.POINCIANA_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.POINCIANA);
    }

    public static MaidensChestContainer createLaburnumContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.LABURNUM_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.LABURNUM.size), MaidensChestTypes.LABURNUM);
    }

    public static MaidensChestContainer createLaburnumContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.LABURNUM_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.LABURNUM);
    }

    public static MaidensChestContainer createJadeContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.JADE_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.JADE.size), MaidensChestTypes.JADE);
    }

    public static MaidensChestContainer createJadeContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.JADE_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.JADE);
    }


    public static MaidensChestContainer createPaulowniaContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.PAULOWNIA_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.PAULOWNIA.size), MaidensChestTypes.PAULOWNIA);
    }

    public static MaidensChestContainer createPaulowniaContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.PAULOWNIA_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.PAULOWNIA);
    }

    public static MaidensChestContainer createWisteriaContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.WISTERIA_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.WISTERIA.size), MaidensChestTypes.WISTERIA);
    }

    public static MaidensChestContainer createWisteriaContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.WISTERIA_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.WISTERIA);
    }

    public static MaidensChestContainer createJacarandaContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.JACARANDA_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.JACARANDA.size), MaidensChestTypes.JACARANDA);
    }

    public static MaidensChestContainer createJacarandaContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.JACARANDA_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.JACARANDA);
    }

    public static MaidensChestContainer createDogwoodContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.DOGWOOD_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.DOGWOOD.size), MaidensChestTypes.DOGWOOD);
    }

    public static MaidensChestContainer createDogwoodContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.DOGWOOD_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.DOGWOOD);
    }

    public static MaidensChestContainer createSilverbellContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.SILVERBELL_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.SILVERBELL.size), MaidensChestTypes.SILVERBELL);
    }

    public static MaidensChestContainer createSilverbellContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.SILVERBELL_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.SILVERBELL);
    }

    public static MaidensChestContainer createCedarContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.CEDAR_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.CEDAR.size), MaidensChestTypes.CEDAR);
    }

    public static MaidensChestContainer createCedarContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.CEDAR_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.CEDAR);
    }


    public static MaidensChestContainer createPalmContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.PALM_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.PALM.size), MaidensChestTypes.PALM);
    }

    public static MaidensChestContainer createPalmContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.PALM_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.PALM);
    }

    public static MaidensChestContainer createAcaciaContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.ACACIA_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.ACACIA.size), MaidensChestTypes.ACACIA);
    }

    public static MaidensChestContainer createAcaciaContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.ACACIA_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.ACACIA);
    }

    public static MaidensChestContainer createBirchContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.BIRCH_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.BIRCH.size), MaidensChestTypes.BIRCH);
    }

    public static MaidensChestContainer createBirchContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.BIRCH_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.BIRCH);
    }

    public static MaidensChestContainer createOakContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.OAK_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.OAK.size), MaidensChestTypes.OAK);
    }

    public static MaidensChestContainer createOakContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.OAK_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.OAK);
    }

    public static MaidensChestContainer createJungleContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.JUNGLE_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.JUNGLE.size), MaidensChestTypes.JUNGLE);
    }

    public static MaidensChestContainer createJungleContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.JUNGLE_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.JUNGLE);
    }


    public static MaidensChestContainer createSpruceContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.SPRUCE_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.SPRUCE.size), MaidensChestTypes.SPRUCE);
    }

    public static MaidensChestContainer createSpruceContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.SPRUCE_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.SPRUCE);
    }

    public static MaidensChestContainer createDarkOakContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.DARK_OAK_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.DARK_OAK.size), MaidensChestTypes.DARK_OAK);
    }

    public static MaidensChestContainer createDarkOakContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.DARK_OAK_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.DARK_OAK);
    }

    public static MaidensChestContainer createCrimsonContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.CRIMSON_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.CRIMSON.size), MaidensChestTypes.CRIMSON);
    }

    public static MaidensChestContainer createCrimsonContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.CRIMSON_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.CRIMSON);
    }

    public static MaidensChestContainer createWarpedContainer(int windowId, PlayerInventory playerInventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.WARPED_CHEST.get(), windowId, playerInventory, new Inventory(MaidensChestTypes.WARPED.size), MaidensChestTypes.WARPED);
    }

    public static MaidensChestContainer createWarpedContainer(int windowId, PlayerInventory playerInventory, IInventory inventory) {
        return new MaidensChestContainer(MaidensChestContainerTypes.WARPED_CHEST.get(), windowId, playerInventory, inventory, MaidensChestTypes.WARPED);
    }

    public MaidensChestContainer(ContainerType<?> containerType, int windowId, PlayerInventory playerInventory, IInventory inventory, MaidensChestTypes chestType) {
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
    public MaidensChestTypes getChestType() {
        return this.chestType;
    }
}
