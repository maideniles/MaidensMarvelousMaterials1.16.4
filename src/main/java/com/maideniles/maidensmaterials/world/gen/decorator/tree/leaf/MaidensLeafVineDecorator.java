package com.maideniles.maidensmaterials.world.gen.decorator.tree.leaf;

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

public class MaidensLeafVineDecorator extends TreeDecorator {

    public static final Codec<MaidensLeafVineDecorator> field_236866_a_;
    public static final MaidensLeafVineDecorator field_236871_b_ = new MaidensLeafVineDecorator ();
    public MaidensLeafVineDecorator() {

    }

    public <T> MaidensLeafVineDecorator(Dynamic<T> p_i225870_1_) {
        this();
    }

    protected TreeDecoratorType<?> func_230380_a_() {
        return MaidensTreeDecoratorTypes.MAIDENS_LEAF_VINE.get();
    }

    @Override
    public void func_225576_a_(ISeedReader p_225576_1_, Random p_225576_2_, List<BlockPos> p_225576_3_, List<BlockPos> blockPos, Set<BlockPos> p_225576_5_, MutableBoundingBox p_225576_6_) {
        blockPos.forEach((p_227421_5_) -> {

            Block vine = Blocks.VINE;
            if (!blockPos.isEmpty())  {
                Block leaf = p_225576_1_.getBlockState(blockPos.get(0)).getBlock();
                if (leaf == ModBlocks.CRABAPPLE_LEAVES.get()) {
                    vine = ModBlocks.CRABAPPLE_VINE.get();
                }
                //TODO add checks for other leaves/vines here//
                if (leaf == ModBlocks.POINCIANA_LEAVES.get()) {
                    vine = ModBlocks.POINCIANA_VINE.get();
                }

                if (leaf == ModBlocks.LABURNUM_LEAVES.get()) {
                    vine = ModBlocks.LABURNUM_VINE.get();
                }

                if (leaf == ModBlocks.JADE_LEAVES.get()) {
                    vine = ModBlocks.JADE_VINE.get();
                }

                if (leaf == ModBlocks.PAULOWNIA_LEAVES.get()) {
                    vine = ModBlocks.PAULOWNIA_VINE.get();
                }

                if (leaf == ModBlocks.WISTERIA_LEAVES.get()) {
                    vine = ModBlocks.WISTERIA_VINE.get();
                }

                if (leaf == ModBlocks.JACARANDA_LEAVES.get()) {
                    vine = ModBlocks.JACARANDA_VINE.get();
                }

                if (leaf == ModBlocks.DOGWOOD_LEAVES.get()) {
                    vine = ModBlocks.DOGWOOD_VINE.get();
                }

                if (leaf == ModBlocks.SILVERBELL_LEAVES.get()) {
                    vine = ModBlocks.SILVERBELL_VINE.get();
                }

                if (leaf == ModBlocks.CEDAR_LEAVES.get()) {
                    vine = ModBlocks.CEDAR_VINE.get();
                }


            }

            if (p_225576_2_.nextInt(4) == 0) {
                BlockPos blockpos = p_227421_5_.west();
                if (Feature.isAirAt(p_225576_1_, blockpos)) {
                    this.growVines(p_225576_1_, blockpos, VineBlock.EAST, p_225576_5_, p_225576_6_,vine);

                }
            }

            if (p_225576_2_.nextInt(4) == 0) {
                BlockPos blockpos1 = p_227421_5_.east();
                if (Feature.isAirAt(p_225576_1_, blockpos1)) {
                    this.growVines(p_225576_1_, blockpos1, VineBlock.WEST, p_225576_5_, p_225576_6_,vine);
                }
            }

            if (p_225576_2_.nextInt(4) == 0) {
                BlockPos blockpos2 = p_227421_5_.north();
                if (Feature.isAirAt(p_225576_1_, blockpos2)) {
                    this.growVines(p_225576_1_, blockpos2, VineBlock.SOUTH, p_225576_5_, p_225576_6_,vine);
                }
            }

            if (p_225576_2_.nextInt(4) == 0) {
                BlockPos blockpos3 = p_227421_5_.south();
                if (Feature.isAirAt(p_225576_1_, blockpos3)) {
                    this.growVines(p_225576_1_, blockpos3, VineBlock.NORTH, p_225576_5_, p_225576_6_,vine);


                }
            }

        });

    }



    private void placeVine(IWorld iWorld, BlockPos blockpos3, BooleanProperty north, Set<BlockPos> posSet, MutableBoundingBox box, Block vine) {

        this.func_227423_a_(iWorld, blockpos3, vine.getDefaultState().with(north, Boolean.valueOf(true)), posSet, box);
    }

    private void growVines(IWorld world, BlockPos blockPos, BooleanProperty north, Set<BlockPos> setPos, MutableBoundingBox box, Block vine) {
        this.placeVine(world, blockPos, north, setPos, box, vine);
        int i = 4;

        for(BlockPos blockpos = blockPos.down(); Feature.isAirAt(world, blockpos) && i > 0; --i) {
            this.placeVine(world, blockpos, north, setPos, box, vine);
            blockpos = blockpos.down();
        }

    }

    static {
        field_236866_a_ = Codec.unit(() -> {
            return field_236871_b_;
        });
    }
}

