package com.maideniles.maidensmaterials.world.gen.decorator.tree.mushroom;

import com.maideniles.maidensmaterials.blocks.vegetation.FairyGlowCup;
import com.maideniles.maidensmaterials.init.MaidensTreeDecoratorTypes;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CocoaBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import java.util.List;
import java.util.Random;
import java.util.Set;


public class MaidensMushroomDecorator extends TreeDecorator {
    public static final Codec<MaidensMushroomDecorator> field_236866_a_ = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(MaidensMushroomDecorator::new, (p_236868_0_) -> {
        return p_236868_0_.field_227417_b_;
    }).codec();
    private final float field_227417_b_;

    public MaidensMushroomDecorator(float p_i225868_1_) {
        this.field_227417_b_ = p_i225868_1_;
    }



    @Override
    protected TreeDecoratorType<?> getDecoratorType() {
        return MaidensTreeDecoratorTypes.MAIDENS_MUSHROOM.get();
    }

    public void func_225576_a_(ISeedReader p_225576_1_, Random p_225576_2_, List<BlockPos> p_225576_3_, List<BlockPos> p_225576_4_, Set<BlockPos> p_225576_5_, MutableBoundingBox p_225576_6_) {
        if (!(p_225576_2_.nextFloat() >= this.field_227417_b_)) {
            int i = p_225576_3_.get(0).getY();
            p_225576_3_.stream().filter((p_236867_1_) -> {
                return p_236867_1_.getY() - i <= 2;
            }).forEach((p_242865_5_) -> {
                for(Direction direction : Direction.Plane.HORIZONTAL) {
                    if (p_225576_2_.nextFloat() <= 0.25F) {
                        Direction direction1 = direction.getOpposite();
                        BlockPos blockpos = p_242865_5_.add(direction1.getXOffset(), 7, direction1.getZOffset());
                        if (Feature.isAirAt(p_225576_1_, blockpos)) {
                            BlockState blockstate = ModBlocks.FAIRY_GLOW_CUP.get().getDefaultState().with(FairyGlowCup.AGE, Integer.valueOf(p_225576_2_.nextInt(3))).with(FairyGlowCup.HORIZONTAL_FACING, direction);
                            this.func_227423_a_(p_225576_1_, blockpos, blockstate, p_225576_5_, p_225576_6_);
                        }
                    }
                }

            });
        }
    }
}
