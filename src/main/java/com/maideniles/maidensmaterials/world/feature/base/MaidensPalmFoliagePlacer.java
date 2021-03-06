package com.maideniles.maidensmaterials.world.feature.base;

import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.foliageplacer.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FoliagePlacerType;

import java.util.Random;
import java.util.Set;

public class MaidensPalmFoliagePlacer extends AcaciaFoliagePlacer {


    public MaidensPalmFoliagePlacer(FeatureSpread p_i241999_1_, FeatureSpread p_i241999_2_) {
        super(p_i241999_1_, p_i241999_2_);
    }





    protected void func_230372_a_(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, int p_230372_4_, FoliagePlacer.Foliage foliage, int p_230372_6_, int p_230372_7_, Set<BlockPos> leaves, int p_230372_9_, MutableBoundingBox box) {
        boolean flag = foliage.func_236765_c_();

        int k = -5;
        int i = -4;
        int j = -6;

        BlockPos pos = new BlockPos(k, j, i);

        BlockPos blockpos = foliage.func_236763_a_().up(p_230372_9_);

        BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();


        //place leaf blocks for top of palm//



        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 1, k + 0), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 1, k + 10), +foliage.func_236764_b_()-1, leaves, 0, flag, box );


        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 2, k + 0), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 2, k + 10), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 7, j + 2, k + 2), +foliage.func_236764_b_()-1, leaves, 0, flag, box );

        this.func_236753_a_(world, random, config, blockpos.add(i + 7, j + 2, k + 8), +foliage.func_236764_b_()-1, leaves, 0, flag, box );//moved this one
        this.func_236753_a_(world, random, config, blockpos.add(i + 1, j + 2, k + 2), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 1, j + 2, k + 8), +foliage.func_236764_b_()-1, leaves, 0, flag, box );


        this.func_236753_a_(world, random, config, blockpos.add(i + 1, j + 3, k + 2), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 1, j + 3, k + 8), +foliage.func_236764_b_()-1, leaves, 0, flag, box );

        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 3, k + 1), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 3, k + 9), +foliage.func_236764_b_()-1, leaves, 0, flag, box );

        this.func_236753_a_(world, random, config, blockpos.add(i + 5, j + 3, k + 4), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 5, j + 3, k + 6), +foliage.func_236764_b_()-1, leaves, 0, flag, box );


        this.func_236753_a_(world, random, config, blockpos.add(i + 3, j + 3, k + 4), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 3, j + 3, k + 6), +foliage.func_236764_b_()-1, leaves, 0, flag, box );


        this.func_236753_a_(world, random, config, blockpos.add(i + 8, j + 3, k + 5), +foliage.func_236764_b_()-1, leaves, 0, flag, box );

        //testing this one here//
        this.func_236753_a_(world, random, config, blockpos.add(i + 0, j + 3, k + 5), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 0, j + 4, k + 5), +foliage.func_236764_b_()-1, leaves, 0, flag, box );

        //testing this one to fill hole
        this.func_236753_a_(world, random, config, blockpos.add(i + 3, j + 4, k + 6), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 3, j + 4, k + 4), +foliage.func_236764_b_()-1, leaves, 0, flag, box );


        this.func_236753_a_(world, random, config, blockpos.add(i + 7, j + 3, k + 2), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 7, j + 3, k + 8), +foliage.func_236764_b_()-1, leaves, 0, flag, box );


        this.func_236753_a_(world, random, config, blockpos.add(i + 1, j + 4, k + 2), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 2, j + 4, k + 5), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 2, j + 4, k + 7), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 4, k + 1), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 4, k + 3), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 4, k + 7), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 4, k + 9), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 5, j + 4, k + 4), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 5, j + 4, k + 6), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 6, j + 4, k + 3), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 6, j + 4, k + 5), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 7, j + 4, k + 8), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 8, j + 4, k + 5), +foliage.func_236764_b_()-1, leaves, 0, flag, box );


        this.func_236753_a_(world, random, config, blockpos.add(i + 2, j + 5, k + 3), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 2, j + 5, k + 5), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 1, j + 5, k + 5), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 3, j + 5, k + 4), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 3, j + 5, k + 6), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 3, j + 5, k + 4), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 3, j + 5, k + 5), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 3, j + 5, k + 6), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 5, k + 2), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 5, k + 3), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 5, k + 4), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 5, k + 5), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 5, k + 6), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 5, k + 7), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 5, k + 8), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 7, j + 5, k + 5), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 5, j + 5, k + 4), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 5, j + 5, k + 5), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 5, j + 5, k + 6), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 6, j + 5, k + 5), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 6, j + 5, k + 7), +foliage.func_236764_b_()-1, leaves, 0, flag, box );


        this.func_236753_a_(world, random, config, blockpos.add(i + 3, j + 6, k + 4), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 3, j + 6, k + 6), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 4, j + 6, k + 5), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 5, j + 6, k + 4), +foliage.func_236764_b_()-1, leaves, 0, flag, box );
        this.func_236753_a_(world, random, config, blockpos.add(i + 5, j + 6, k + 6), +foliage.func_236764_b_()-1, leaves, 0, flag, box );



    }

    @Override
    public int func_230374_a_(Random p_230374_1_, int p_230374_2_, BaseTreeFeatureConfig p_230374_3_) {
        return 0;
    }

    @Override
    protected boolean func_230373_a_(Random p_230373_1_, int p_230373_2_, int p_230373_3_, int p_230373_4_, int p_230373_5_, boolean p_230373_6_) {
        return false;
    }

}
