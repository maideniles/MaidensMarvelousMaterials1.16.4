package com.maideniles.maidensmaterials.enchants;

import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModEnchantments;
import com.maideniles.maidensmaterials.init.ModItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber


public class EnchantmentFlowerPower extends Enchantment {

    public EnchantmentFlowerPower() {
        super(Enchantment.Rarity.UNCOMMON, EnchantmentType.DIGGER, new EquipmentSlotType[]{EquipmentSlotType.MAINHAND});


    }


    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean canApply(ItemStack stack) {
        return true;
    }


    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return canApply(stack);
    }

    @Override
    public boolean isAllowedOnBooks() {
        return true;
    }

    @Override
    public boolean canApplyTogether(Enchantment ench) {
        return super.canApplyTogether(ench) && ench != Enchantments.SILK_TOUCH;
    }

    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 1 + 10 * (enchantmentLevel - 1);
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel) {
        return super.getMinEnchantability(enchantmentLevel) + 15;
    }


    @SubscribeEvent
    public static void canHarvestOrnamentalGrass(BlockEvent.BreakEvent event) {

        PlayerEntity player = event.getPlayer();

        int hasflowerpower = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.FLOWER_POWER.get(),
                player.inventory.getCurrentItem());
        if (hasflowerpower > 0) {

            if (ModBlocks.GRASS.contains(event.getState().getBlock())) {
                ItemEntity item = new ItemEntity((World) event.getWorld(), event.getPos().getX(), event.getPos().getY(),
                        event.getPos().getZ(), new ItemStack(Item.getItemFromBlock(ModBlocks.ORNAMENTAL_GRASS.get()), 1));

                if (!((World) event.getWorld()).isRemote) {
                    item.setPickupDelay(20); // To Set a Small Pickup Delay
                    event.getWorld().addEntity(item);
                }
            }

        }
    }
}