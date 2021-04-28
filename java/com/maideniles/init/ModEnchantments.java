package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MaidensMaterials;

import com.maideniles.maidensmaterials.enchants.EnchantmentFloralFeet;
import com.maideniles.maidensmaterials.enchants.EnchantmentFlowerPower;
import com.maideniles.maidensmaterials.util.Registration;
import net.java.games.input.Component;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Rarity;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModEnchantments {



    public static final RegistryObject<Enchantment> FLOWER_POWER = Registration.ENCHANTMENTS.register("flower_child",
            () -> new EnchantmentFlowerPower());

    public static final RegistryObject<Enchantment> FANCY_FEET = Registration.ENCHANTMENTS.register("fancy_feet",
            () -> new EnchantmentFloralFeet());

    public static void register(){

    }
}