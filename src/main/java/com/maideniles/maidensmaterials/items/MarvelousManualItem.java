package com.maideniles.maidensmaterials.items;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import vazkii.patchouli.api.PatchouliAPI;

import java.util.Objects;

public class MarvelousManualItem extends Item
{


    public MarvelousManualItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        if (worldIn.isRemote()) {

            System.out.print("Opened book!");
            return ActionResult.resultPass(playerIn.getHeldItem(handIn));

        }
        ServerPlayerEntity player = (ServerPlayerEntity)playerIn;
        PatchouliAPI.instance.openBookGUI(player, Objects.requireNonNull(ModItems.MARVELOUS_MANUAL.get().getRegistryName()));
        System.out.print("Opened gui for book!");
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}