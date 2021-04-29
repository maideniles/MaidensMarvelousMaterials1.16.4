package com.maideniles.maidensmaterials.client;

import com.maideniles.maidensmaterials.entity.render.FairyFlyRenderer;
import com.maideniles.maidensmaterials.init.ModBlocks;

import com.maideniles.maidensmaterials.init.ModEntities;
import com.maideniles.maidensmaterials.items.ModSpawnEggItem;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class RenderLayers {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

        RenderingRegistry.registerEntityRenderingHandler(ModEntities.FAIRY_FLY.get(), FairyFlyRenderer::new);
        // Set the render layer of blocks that need transparency here
    ModSpawnEggItem.initSpawnEggs();
//saplings
        RenderTypeLookup.setRenderLayer(ModBlocks.CRABAPPLE_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POINCIANA_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LABURNUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JADE_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PAULOWNIA_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WISTERIA_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JACARANDA_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DOGWOOD_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SILVERBELL_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CEDAR_SAPLING.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.PALM_SAPLING.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.APPLE_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PEAR_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PEACH_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PLUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LEMON_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CHERRY_SAPLING.get(), RenderType.getCutoutMipped());



//vines
        RenderTypeLookup.setRenderLayer(ModBlocks.CRABAPPLE_VINE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POINCIANA_VINE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LABURNUM_VINE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JADE_VINE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PAULOWNIA_VINE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WISTERIA_VINE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JACARANDA_VINE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DOGWOOD_VINE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SILVERBELL_VINE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CEDAR_VINE.get(), RenderType.getCutoutMipped());

//plants
        RenderTypeLookup.setRenderLayer(ModBlocks.ORNAMENTAL_MUSHROOM.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.FAIRY_GLOW_CUP.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WALK_FLOWERS.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.VINE_TIE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORNAMENTAL_PATH.get(), RenderType.getCutoutMipped());

        //LEAVES
        RenderTypeLookup.setRenderLayer(ModBlocks.PALM_LEAVES.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(ModBlocks.CRABAPPLE_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POINCIANA_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LABURNUM_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JADE_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PAULOWNIA_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WISTERIA_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JACARANDA_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DOGWOOD_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SILVERBELL_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CEDAR_LEAVES.get(), RenderType.getCutoutMipped());
/*
        RenderTypeLookup.setRenderLayer(ModBlocks.GROWING_APPLE_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GROWING_PEAR_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GROWING_PLUM_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GROWING_PEACH_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GROWING_ORANGE_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GROWING_GRAPEFRUIT_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GROWING_LEMON_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GROWING_LIME_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GROWING_CHERRY_LEAVES.get(), RenderType.getCutoutMipped());
*/

//VASES
// no flowers//
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASE_NO_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASE_NO_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_NO_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASE_NO_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASE_NO_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYAN_VASE_NO_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_NO_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_NO_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_NO_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_NO_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_NO_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_NO_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_NO_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_NO_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_NO_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_NO_FLOWER.get(), RenderType.getCutoutMipped());
//RED_ flowers//
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASE_RED_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASE_RED_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_RED_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASE_RED_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASE_RED_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYAN_VASE_RED_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_RED_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_RED_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_RED_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_RED_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_RED_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_RED_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_RED_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_RED_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_RED_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_RED_FLOWER.get(), RenderType.getCutoutMipped());
//ORANGE_ flowers//
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASE_ORANGE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASE_ORANGE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_ORANGE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASE_ORANGE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASE_ORANGE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYAN_VASE_ORANGE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_ORANGE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_ORANGE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_ORANGE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_ORANGE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_ORANGE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_ORANGE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_ORANGE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_ORANGE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_ORANGE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_ORANGE_FLOWER.get(), RenderType.getCutoutMipped());
        //YELLOW_ flowers//
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASE_YELLOW_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASE_YELLOW_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_YELLOW_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASE_YELLOW_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASE_YELLOW_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYAN_VASE_YELLOW_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_YELLOW_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_YELLOW_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_YELLOW_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_YELLOW_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_YELLOW_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_YELLOW_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_YELLOW_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_YELLOW_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_YELLOW_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_YELLOW_FLOWER.get(), RenderType.getCutoutMipped());
        //GREEN_ flowers//
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASE_GREEN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASE_GREEN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_GREEN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASE_GREEN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASE_GREEN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYAN_VASE_GREEN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_GREEN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_GREEN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_GREEN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_GREEN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_GREEN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_GREEN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_GREEN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_GREEN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_GREEN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_GREEN_FLOWER.get(), RenderType.getCutoutMipped());
        //CYAN flowers//
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASE_CYAN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASE_CYAN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_CYAN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASE_CYAN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASE_CYAN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYAN_VASE_CYAN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_CYAN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_CYAN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_CYAN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_CYAN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_CYAN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_CYAN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_CYAN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_CYAN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_CYAN_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_CYAN_FLOWER.get(), RenderType.getCutoutMipped());
        //BLUE_ flowers//
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASE_BLUE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASE_BLUE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_BLUE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASE_BLUE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASE_BLUE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYAN_VASE_BLUE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_BLUE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_BLUE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_BLUE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_BLUE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_BLUE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_BLUE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_BLUE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_BLUE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_BLUE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_BLUE_FLOWER.get(), RenderType.getCutoutMipped());
        //PURPLE_ flowers//
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASE_PURPLE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASE_PURPLE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_PURPLE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASE_PURPLE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASE_PURPLE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYAN_VASE_PURPLE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_PURPLE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_PURPLE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_PURPLE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_PURPLE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_PURPLE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_PURPLE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_PURPLE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_PURPLE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_PURPLE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_PURPLE_FLOWER.get(), RenderType.getCutoutMipped());
        //PINK_ flowers//
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASE_PINK_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASE_PINK_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_PINK_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASE_PINK_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASE_PINK_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYAN_VASE_PINK_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_PINK_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_PINK_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_PINK_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_PINK_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_PINK_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_PINK_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_PINK_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_PINK_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_PINK_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_PINK_FLOWER.get(), RenderType.getCutoutMipped());
        //WHITE_ flowers//
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASE_WHITE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASE_WHITE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_WHITE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASE_WHITE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASE_WHITE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYAN_VASE_WHITE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_WHITE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_WHITE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_WHITE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_WHITE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_WHITE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_WHITE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_WHITE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_WHITE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_WHITE_FLOWER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_WHITE_FLOWER.get(), RenderType.getCutoutMipped());

//vases--fruit saplings  //
/*
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASESAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASESAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASESAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASESAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANVASE_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_SAPLING.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASE_PEAR_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASE_PEAR_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_PEAR_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASE_PEAR_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASE_PEAR_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANVASE_PEAR_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_PEAR_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_PEAR_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_PEAR_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_PEAR_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_PEAR_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_PEAR_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_PEAR_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_PEAR_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_PEAR_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_PEAR_SAPLING.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASE_PEACH_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASE_PEACH_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_PEACH_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASE_PEACH_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASE_PEACH_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANVASE_PEACH_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_PEACH_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_PEACH_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_PEACH_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_PEACH_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_PEACH_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_PEACH_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_PEACH_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_PEACH_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_PEACH_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_PEACH_SAPLING.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASEPLUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASEPLUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_PLUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASEPLUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASEPLUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANVASE_PLUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_PLUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_PLUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_PLUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_PLUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_PLUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_PLUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_PLUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_PLUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_PLUM_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_PLUM_SAPLING.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASE_GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASE_GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASE_GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASE_GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANVASE_GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_GRAPEFRUIT_SAPLING.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASE_ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASE_ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASE_ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASE_ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANVASE_ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_ORANGE_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASELIME_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASELIME_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_LIME_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASELIME_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASELIME_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANVASE_LIME_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_LIME_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_LIME_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_LIME_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_LIME_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_LIME_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_LIME_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_LIME_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_LIME_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_LIME_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_LIME_FRUIT_SAPLING.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASE_LEMON_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASE_LEMON_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_LEMON_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASE_LEMON_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASE_LEMON_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANVASE_LEMON_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_LEMON_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_LEMON_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_LEMON_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_LEMON_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_LEMON_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_LEMON_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_LEMON_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_LEMON_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_LEMON_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_LEMON_SAPLING.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_VASE_CHERRY_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_VASE_CHERRY_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_VASE_CHERRY_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_VASE_CHERRY_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_VASE_CHERRY_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANVASE_CHERRY_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_VASE_CHERRY_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_VASE_CHERRY_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_VASE_CHERRY_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_VASE_CHERRY_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_VASE_CHERRY_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_VASE_CHERRY_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_VASE_CHERRY_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_VASE_CHERRY_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_VASE_CHERRY_SAPLING.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_VASE_CHERRY_SAPLING.get(), RenderType.getCutoutMipped());

        //doors//

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_STAINED_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_STAINED_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_STAINED_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_STAINED_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_STAINED_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANSTAINED_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_STAINED_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_STAINED_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_STAINED_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_STAINED_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_STAINED_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_STAINED_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_STAINED_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_STAINED_DOOR_1.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_STAINED_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_STAINED_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_STAINED_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_STAINED_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_STAINED_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANSTAINED_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_STAINED_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_STAINED_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_STAINED_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_STAINED_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_STAINED_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_STAINED_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_STAINED_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_STAINED_DOOR_2.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_STAINED_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_STAINED_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_STAINED_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_STAINED_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_STAINED_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANSTAINED_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_STAINED_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_STAINED_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_STAINED_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_STAINED_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_STAINED_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_STAINED_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_STAINED_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_STAINED_DOOR_3.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_STAINED_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_STAINED_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_STAINED_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_STAINED_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_STAINED_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANSTAINED_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_STAINED_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_STAINED_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_STAINED_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_STAINED_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_STAINED_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_STAINED_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_STAINED_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_STAINED_DOOR_4.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_STAINED_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_STAINED_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_STAINED_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_STAINED_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_STAINED_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANSTAINED_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_STAINED_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_STAINED_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_STAINED_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_STAINED_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_STAINED_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_STAINED_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_STAINED_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_STAINED_DOOR5.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_STAINED_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_STAINED_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_STAINED_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_STAINED_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_STAINED_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANSTAINED_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_STAINED_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_STAINED_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_STAINED_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_STAINED_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_STAINED_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_STAINED_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_STAINED_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_STAINED_DOOR6.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.CRABAPPLE_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POINCIANA_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LABURNUM_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JADE_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PAULOWNIA_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WISTERIA_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JACARANDA_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DOGWOOD_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SILVERBELL_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAKDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_DOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CEDAR_DOOR_1.get(), RenderType.getCutoutMipped());
        //   RenderTypeLookup.setRenderLayer(ModBlocks.PALM_DOOR_1.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.CRABAPPLE_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POINCIANA_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LABURNUM_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JADE_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PAULOWNIA_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WISTERIA_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JACARANDA_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DOGWOOD_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SILVERBELL_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_DOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CEDAR_DOOR_2.get(), RenderType.getCutoutMipped());
        //   RenderTypeLookup.setRenderLayer(ModBlocks.PALM_DOOR_2.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.CRABAPPLE_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POINCIANA_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LABURNUM_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JADE_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PAULOWNIA_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WISTERIA_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JACARANDA_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DOGWOOD_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SILVERBELL_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_DOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CEDAR_DOOR_3.get(), RenderType.getCutoutMipped());
        //   RenderTypeLookup.setRenderLayer(ModBlocks.PALM_DOOR_3.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.CRABAPPLE_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POINCIANA_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LABURNUM_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JADE_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PAULOWNIA_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WISTERIA_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JACARANDA_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DOGWOOD_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SILVERBELL_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_DOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CEDAR_DOOR_4.get(), RenderType.getCutoutMipped());
        //   RenderTypeLookup.setRenderLayer(ModBlocks.PALM_DOOR_4.get(), RenderType.getCutoutMipped());



        RenderTypeLookup.setRenderLayer(ModBlocks.CRABAPPLE_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POINCIANA_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LABURNUM_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JADE_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PAULOWNIA_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WISTERIA_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JACARANDA_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DOGWOOD_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SILVERBELL_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_DOOR5.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CEDAR_DOOR5.get(), RenderType.getCutoutMipped());
        //   RenderTypeLookup.setRenderLayer(ModBlocks.PALM_DOOR5.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.CRABAPPLE_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POINCIANA_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LABURNUM_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JADE_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PAULOWNIA_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WISTERIA_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JACARANDA_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DOGWOOD_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SILVERBELL_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_DOOR6.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CEDAR_DOOR6.get(), RenderType.getCutoutMipped());
        //   RenderTypeLookup.setRenderLayer(ModBlocks.PALM_DOOR6.get(), RenderType.getCutoutMipped());


        RenderTypeLookup.setRenderLayer(ModBlocks.CRABAPPLE_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POINCIANA_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LABURNUM_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JADE_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PAULOWNIA_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WISTERIA_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JACARANDA_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DOGWOOD_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SILVERBELL_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAKTRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CEDAR_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        //   RenderTypeLookup.setRenderLayer(ModBlocks.PALM_TRAPDOOR_1.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_STAINED_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_STAINED_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_STAINED_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_STAINED_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_STAINED_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANSTAINED_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_STAINED_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_STAINED_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_STAINED_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_STAINED_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_STAINED_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_STAINED_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_STAINED_TRAPDOOR_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_STAINED_TRAPDOOR_1.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.CRABAPPLE_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POINCIANA_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LABURNUM_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JADE_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PAULOWNIA_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WISTERIA_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JACARANDA_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DOGWOOD_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SILVERBELL_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CEDAR_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        //   RenderTypeLookup.setRenderLayer(ModBlocks.PALM_TRAPDOOR_2.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_STAINED_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_STAINED_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_STAINED_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_STAINED_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_STAINED_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANSTAINED_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_STAINED_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_STAINED_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_STAINED_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_STAINED_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_STAINED_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_STAINED_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_STAINED_TRAPDOOR_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_STAINED_TRAPDOOR_2.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.CRABAPPLE_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POINCIANA_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LABURNUM_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JADE_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PAULOWNIA_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WISTERIA_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JACARANDA_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DOGWOOD_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SILVERBELL_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CEDAR_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        //   RenderTypeLookup.setRenderLayer(ModBlocks.PALM_TRAPDOOR_3.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_STAINED_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_STAINED_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_STAINED_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_STAINED_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_STAINED_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANSTAINED_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_STAINED_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_STAINED_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_STAINED_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_STAINED_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_STAINED_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_STAINED_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_STAINED_TRAPDOOR_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_STAINED_TRAPDOOR_3.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.CRABAPPLE_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POINCIANA_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LABURNUM_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JADE_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PAULOWNIA_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WISTERIA_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JACARANDA_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DOGWOOD_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SILVERBELL_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CEDAR_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        //   RenderTypeLookup.setRenderLayer(ModBlocks.PALM_TRAPDOOR_4.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_STAINED_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_STAINED_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_STAINED_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_STAINED_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_STAINED_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYANSTAINED_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_STAINED_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_STAINED_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_STAINED_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_STAINED_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_STAINED_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_STAINED_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_STAINED_TRAPDOOR_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_STAINED_TRAPDOOR_4.get(), RenderType.getCutoutMipped());


 */
    }

    public static void safeRunClient() {
        final IEventBus eventHandler = FMLJavaModLoadingContext.get().getModEventBus();
        eventHandler.register(RenderLayers.class);
    }
}