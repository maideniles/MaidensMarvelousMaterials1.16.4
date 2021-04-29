package com.maideniles.maidensmaterials.blocks.tree.leaves;

import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import com.maideniles.maidensmaterials.init.ModPotions;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.ITag;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;

import java.util.Random;

public class MaidenLeavesBlock extends LeavesBlock {

    private final RegistryObject<Item> blossom;
    public MaidenLeavesBlock(Properties properties, RegistryObject<Item> blossom) {
        super(net.minecraft.block.Block.Properties.create(Material.LEAVES).notSolid().hardnessAndResistance(2.5F).sound(SoundType.PLANT));
        this.blossom = blossom;
    }

    public RegistryObject<Item> getBlossom() {
        return this.blossom;
    }

    private static final VoxelShape SHAPE = net.minecraft.block.Block.makeCuboidShape(0, 0, 0, 16, 16.0, 16);



    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext selectionContext)
    {  return SHAPE;

    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        Block leaves = state.getBlock();
        ItemStack shears = player.getHeldItem(handIn);
        if(!worldIn.isRemote() && ((shears.getItem() == ModItems.PRUNING_SHEARS.get()) || player.isPotionActive(ModPotions.FLORAL_FORTUNE_EFFECT.get()))) {
            // Spawn blossom entity
            worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this.getBlossom().get(), 1)));
            // Damage shears
            shears.damageItem(1, player, p -> p.sendBreakAnimation(EquipmentSlotType.MAINHAND));

            // Essence
            if(worldIn.getRandom().nextInt(100) < 9) {
                ItemEntity essenceEntity = new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.FLORAL_ESSENCE.get(), 1));
                essenceEntity.setPickupDelay(0);
                worldIn.addEntity(essenceEntity); // Spawn essence
            }
        }
    return ActionResultType.PASS;

}

    public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return false;
    }

    @OnlyIn(Dist.CLIENT)
    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
        return false;
    }


    public boolean canEntitySpawn(BlockState state, IBlockReader worldIn, BlockPos pos, EntityType<?> type) {
        return  type == EntityType.PARROT;
    }



}

