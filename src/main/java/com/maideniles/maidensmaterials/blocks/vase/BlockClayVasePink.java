package com.maideniles.maidensmaterials.blocks.vase;


import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;

import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class BlockClayVasePink extends Block {

    private static final VoxelShape SHAPE = Block.makeCuboidShape(4.8, 0, 4.8, 11.2, 6.0, 11.2);


    public BlockClayVasePink(Properties properties) {
        super(Properties.create(Material.ROCK).hardnessAndResistance(2.5F).sound(SoundType.STONE));
        this.setDefaultState(this.getDefaultState());
    }



    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext selectionContext)
    {  return SHAPE;

    }

    @Override
    public VoxelShape getRenderShape(BlockState state, IBlockReader reader, BlockPos pos)
    {
        return SHAPE;
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        ItemStack blossom = player.getHeldItem(handIn);

        if (!worldIn.isRemote()) {



            if (blossom.getItem() == ModItems.CRABAPPLE_BLOSSOMS.get()){

     //           System.out.println("RED FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_RED_FLOWER.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.POINCIANA_BLOSSOMS.get()){

     //           System.out.println("ORANGE FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_ORANGE_FLOWER.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.LABURNUM_BLOSSOMS.get()){

    //            System.out.println("YELLOW FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_YELLOW_FLOWER.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.JADE_BLOSSOMS.get()){

    //            System.out.println("GREEN FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_GREEN_FLOWER.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.PAULOWNIA_BLOSSOMS.get()){

     //           System.out.println("CYAN FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_CYAN_FLOWER.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.WISTERIA_BLOSSOMS.get()){

     //           System.out.println("BLUE FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_BLUE_FLOWER.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.JACARANDA_BLOSSOMS.get()){

    //            System.out.println("PURPLE FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_PURPLE_FLOWER.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.DOGWOOD_BLOSSOMS.get()){

    //            System.out.println("PINK FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_PINK_FLOWER.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.SILVERBELL_BLOSSOMS.get()){

     //           System.out.println("WHITE FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_WHITE_FLOWER.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.CRABAPPLE_SAPLING.get())){

    //            System.out.println("RED SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_RED_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.POINCIANA_SAPLING.get())){

    //            System.out.println("ORANGE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_ORANGE_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.LABURNUM_SAPLING.get())){

    //            System.out.println("YELLOW SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_YELLOW_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.JADE_SAPLING.get())){

    //            System.out.println("GREEN SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_GREEN_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.PAULOWNIA_SAPLING.get())){

   //             System.out.println("CYAN SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_CYAN_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.WISTERIA_SAPLING.get())){

    //            System.out.println("BLUE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_BLUE_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.JACARANDA_SAPLING.get())){

    //            System.out.println("PURPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_PURPLE_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.DOGWOOD_SAPLING.get())){

    //            System.out.println("PINK SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_PINK_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.SILVERBELL_SAPLING.get())){

   //            System.out.println("WHITE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_WHITE_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.PALM_SAPLING.get())){

                //         System.out.println("PALM_SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_PALM_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.CEDAR_SAPLING.get())){

                //        System.out.println("CEDAR SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_CEDAR_SAPLING.get().getDefaultState());
            }
            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.APPLE_SAPLING.get())){

    //            System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_APPLE_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.PEAR_SAPLING.get())){

      //          System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_PEAR_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.PEACH_SAPLING.get())){

      //          System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_PEAR_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.PLUM_SAPLING.get())){

       //         System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_PLUM_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.ORANGE_FRUIT_SAPLING.get())){

       //         System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_ORANGE_FRUIT_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.GRAPEFRUIT_SAPLING.get())){

      //          System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_GRAPEFRUIT_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.LEMON_SAPLING.get())){

       //         System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_LEMON_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.LIME_SAPLING.get())){

      //          System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_LIME_FRUIT_SAPLING.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.CHERRY_SAPLING.get())){

        //        System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PINK_VASE_CHERRY_SAPLING.get().getDefaultState());
            }

        }




        return ActionResultType.SUCCESS;
    }



}


