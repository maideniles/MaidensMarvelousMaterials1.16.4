package com.maideniles.maidensmaterials.world.gen.decorator.tree.trunk;

import com.maideniles.maidensmaterials.init.MaidensTreeDecoratorTypes;
import com.maideniles.maidensmaterials.init.ModBlocks;


import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.VineBlock;
import net.minecraft.state.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class MaidensTrunkVineDecorator extends TreeDecorator {

    public static final Codec<MaidensTrunkVineDecorator> field_236866_a_;
    public static final MaidensTrunkVineDecorator field_236871_b_ = new MaidensTrunkVineDecorator();


    public MaidensTrunkVineDecorator() {
    }


    public <T> MaidensTrunkVineDecorator(Dynamic<T> p_i225870_1_) {
        this();
    }

    protected TreeDecoratorType<?> func_230380_a_() {
        return MaidensTreeDecoratorTypes.MAIDENS_TRUNK_VINE.get();
    }

    @Override
    public void func_225576_a_(ISeedReader p_225576_1_, Random p_225576_2_, List<BlockPos> blockPos, List<BlockPos> p_225576_4_, Set<BlockPos> p_225576_5_, MutableBoundingBox p_225576_6_) {
        blockPos.forEach((p_227433_5_) -> {

            Block vine = Blocks.VINE;
            if (!blockPos.isEmpty())  {
                Block log = p_225576_1_.getBlockState(blockPos.get(0)).getBlock();
                if (log == ModBlocks.CRABAPPLE_LOG.get()) {
                    vine = ModBlocks.CRABAPPLE_VINE.get();
                }
                //TODO add checks for other leaves/vines here//
                if (log == ModBlocks.POINCIANA_LOG.get()) {
                    vine = ModBlocks.POINCIANA_VINE.get();
                }

                if (log == ModBlocks.LABURNUM_LOG.get()) {
                    vine = ModBlocks.LABURNUM_VINE.get();
                }

                if (log == ModBlocks.JADE_LOG.get()) {
                    vine = ModBlocks.JADE_VINE.get();
                }

                if (log == ModBlocks.PAULOWNIA_LOG.get()) {
                    vine = ModBlocks.PAULOWNIA_VINE.get();
                }

                if (log == ModBlocks.WISTERIA_LOG.get()) {
                    vine = ModBlocks.WISTERIA_VINE.get();
                }

                if (log == ModBlocks.JACARANDA_LOG.get()) {
                    vine = ModBlocks.JACARANDA_VINE.get();
                }

                if (log == ModBlocks.DOGWOOD_LOG.get()) {
                    vine = ModBlocks.DOGWOOD_VINE.get();
                }

                if (log == ModBlocks.SILVERBELL_LOG.get()) {
                    vine = ModBlocks.SILVERBELL_VINE.get();
                }

                if (log == ModBlocks.CEDAR_LOG.get()) {
                    vine = ModBlocks.CEDAR_VINE.get();
                }

            }


            if (p_225576_2_.nextInt(3) > 0) {
                BlockPos blockpos = p_227433_5_.west();
                if (Feature.isAirAt(p_225576_1_, blockpos)) {
                    this.placeVine(p_225576_1_, blockpos, VineBlock.EAST, p_225576_5_, p_225576_6_,vine);
                }
            }

            if (p_225576_2_.nextInt(3) > 0) {
                BlockPos blockpos1 = p_227433_5_.east();
                if (Feature.isAirAt(p_225576_1_, blockpos1)) {
                    this.placeVine(p_225576_1_, blockpos1, VineBlock.WEST, p_225576_5_, p_225576_6_,vine);
                }
            }

            if (p_225576_2_.nextInt(3) > 0) {
                BlockPos blockpos2 = p_227433_5_.north();
                if (Feature.isAirAt(p_225576_1_, blockpos2)) {
                    this.placeVine(p_225576_1_, blockpos2, VineBlock.SOUTH, p_225576_5_, p_225576_6_,vine);
                }
            }

            if (p_225576_2_.nextInt(3) > 0) {
                BlockPos blockpos3 = p_227433_5_.south();
                if (Feature.isAirAt(p_225576_1_, blockpos3)) {
                    this.placeVine(p_225576_1_, blockpos3, VineBlock.NORTH, p_225576_5_, p_225576_6_, vine);
                }
            }

        });
    }




    private void placeVine(IWorld iWorld, BlockPos blockpos3, BooleanProperty north, Set<BlockPos> posSet, MutableBoundingBox box, Block vine) {

        this.func_227423_a_(iWorld, blockpos3, vine.getDefaultState().with(north, Boolean.valueOf(true)), posSet, box);
    }


    static {
        field_236866_a_ = Codec.unit(() -> {
            return field_236871_b_;
        });
    }

}