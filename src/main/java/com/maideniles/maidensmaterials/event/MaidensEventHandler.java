package com.maideniles.maidensmaterials.event;


import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import com.maideniles.maidensmaterials.init.ModPotions;
import net.minecraft.block.BlockState;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber(modid= MaidensMaterials.MOD_ID)
public class MaidensEventHandler {

    private static final Random rand = new Random();

    //ADD EARTHEN ESSENCE DROPS TO ORE AND WOOD BLOCKS//


    @SubscribeEvent
    public static void onBlockBreakEvent3(BlockEvent.BreakEvent event) {
        PlayerEntity player = event.getPlayer();

        if (!player.isCreative())
            if (ModBlocks.VALID_BLOCKS.contains(event.getState().getBlock())) {
                if (rand.nextInt(200) == 0) {
                    ItemEntity item = new ItemEntity((World) event.getWorld(), event.getPos().getX() + 0.5,
                            event.getPos().getY(), event.getPos().getZ() + 0.5, new ItemStack((ModItems.EARTHEN_ESSENCE.get()), 1));
                    if (!event.getWorld().isRemote()) {
                        item.setPickupDelay(40); // To Set a Small Pickup Delay

                        event.getWorld().addEntity(item);
                        item.addVelocity(0, 0.01d, 0);

                    }
                }
            }
    }

    //GATHERER'S GLEE POTION--GET EXTRA DROPS  1 IN 20 CHANCE OF DOUBLING ORE//
    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        PlayerEntity player = event.getPlayer();

        if (!player.isCreative() && player.isPotionActive(ModPotions.GATHERERS_GLEE_EFFECT.get())) {

            if (ModBlocks.VALID_BLOCKS.contains(event.getState().getBlock())) {

                ItemEntity item = new ItemEntity((World) event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(event.getState().getBlock(), 1));

                if (!event.getWorld().isRemote()) {
                    item.setPickupDelay(40); // To Set a Small Pickup Delay
                    if (rand.nextInt(20) == 0)  //set 1 in 20 chance?// {
                        event.getWorld().addEntity(item);

                }
            }
        }
    }

    //MAKE ORNAMENTAL GRASS DROP WHILE POTION ACTIVE
    @SubscribeEvent
    public static void onBlockBreak2(BlockEvent.BreakEvent event) {
        PlayerEntity player = event.getPlayer();
        if (!player.isCreative() && player.isPotionActive(ModPotions.FLORAL_FORTUNE_EFFECT.get())) {

            if (ModBlocks.GRASS.contains(event.getState().getBlock())) {

                ItemEntity item = new ItemEntity((World) event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(),
                        new ItemStack(Item.getItemFromBlock(ModBlocks.ORNAMENTAL_GRASS.get()), 1));

                if (!event.getWorld().isRemote()) {
                    item.setPickupDelay(40); // To Set a Small Pickup Delay
                    event.getWorld().addEntity(item);

                }
            }
        }

    }




    @SubscribeEvent
    public static void woodStrippingEvent(BlockEvent.BlockToolInteractEvent event){

        PlayerEntity player = event.getPlayer();
        ItemStack stack = event.getHeldItemStack();
        ToolType toolType = event.getToolType();
        BlockState state = event.getState();

        if(!event.getWorld().isRemote() && toolType.getName().contains("axe")){

            if(event.getState().getBlock() == ModBlocks.CRABAPPLE_WOOD.get()){

                event.setFinalState(ModBlocks.CRABAPPLE_STRIPPED_WOOD.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.POINCIANA_WOOD.get()){

                event.setFinalState(ModBlocks.PAULOWNIA_STRIPPED_WOOD.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.LABURNUM_WOOD.get()){

                event.setFinalState(ModBlocks.LABURNUM_STRIPPED_WOOD.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.JADE_WOOD.get()){

                event.setFinalState(ModBlocks.JADE_STRIPPED_WOOD.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.PAULOWNIA_WOOD.get()){

                event.setFinalState(ModBlocks.PAULOWNIA_STRIPPED_WOOD.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.WISTERIA_WOOD.get()){

                event.setFinalState(ModBlocks.WISTERIA_STRIPPED_WOOD.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.JACARANDA_WOOD.get()){

                event.setFinalState(ModBlocks.JACARANDA_STRIPPED_WOOD.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.DOGWOOD_WOOD.get()){

                event.setFinalState(ModBlocks.DOGWOOD_STRIPPED_WOOD.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.SILVERBELL_WOOD.get()){

                event.setFinalState(ModBlocks.SILVERBELL_STRIPPED_WOOD.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.CEDAR_WOOD.get()){

                event.setFinalState(ModBlocks.CEDAR_STRIPPED_WOOD.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.PALM_WOOD.get()){

                event.setFinalState(ModBlocks.PALM_STRIPPED_WOOD.get().getDefaultState());
            }


        }
    }

    @SubscribeEvent
    public static void logStrippingEvent(BlockEvent.BlockToolInteractEvent event){

        PlayerEntity player = event.getPlayer();
        ItemStack stack = event.getHeldItemStack();
        ToolType toolType = event.getToolType();
        BlockState state = event.getState();

        if(!event.getWorld().isRemote() && toolType.getName().contains("axe")){

            if(event.getState().getBlock() == ModBlocks.CRABAPPLE_LOG.get()){

                event.setFinalState(ModBlocks.CRABAPPLE_STRIPPED_LOG.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.POINCIANA_LOG.get()){

                event.setFinalState(ModBlocks.PAULOWNIA_STRIPPED_LOG.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.LABURNUM_LOG.get()){

                event.setFinalState(ModBlocks.LABURNUM_STRIPPED_LOG.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.JADE_LOG.get()){

                event.setFinalState(ModBlocks.JADE_STRIPPED_LOG.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.PAULOWNIA_LOG.get()){

                event.setFinalState(ModBlocks.PAULOWNIA_STRIPPED_LOG.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.WISTERIA_LOG.get()){

                event.setFinalState(ModBlocks.WISTERIA_STRIPPED_LOG.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.JACARANDA_LOG.get()){

                event.setFinalState(ModBlocks.JACARANDA_STRIPPED_LOG.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.DOGWOOD_LOG.get()){

                event.setFinalState(ModBlocks.DOGWOOD_STRIPPED_LOG.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.SILVERBELL_LOG.get()){

                event.setFinalState(ModBlocks.SILVERBELL_STRIPPED_LOG.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.CEDAR_LOG.get()){

                event.setFinalState(ModBlocks.CEDAR_STRIPPED_LOG.get().getDefaultState());
            }

            if(event.getState().getBlock() == ModBlocks.PALM_LOG.get()){

                event.setFinalState(ModBlocks.PALM_STRIPPED_LOG.get().getDefaultState());
            }


        }
    }





}
