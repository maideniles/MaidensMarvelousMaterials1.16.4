package com.maideniles.maidensmaterials.world.feature.base;

import java.util.*;

import com.maideniles.maidensmaterials.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraftforge.common.IPlantable;

public class MaidensTreeFeature extends TreeFeature {
    public MaidensTreeFeature() {
        this(ModBlocks.ORNAMENTAL_GRASS.get());
    }

    protected MaidensTreeFeature(Block extraSoil) {
        super(BaseTreeFeatureConfig.CODEC); // Note in 1.16 this will switch to codecs.
        this.extraSoil = extraSoil;
    }

    private final Block extraSoil; // the additional soil block

    private boolean isMaidenSoil(IWorldGenerationReader world, BlockPos soilPos, IPlantable sapling) {
        return this.isDirtOrFarmlandAt(world, soilPos, sapling) || world.hasBlockState(soilPos, state -> state.getBlock() == this.extraSoil);
    }

    private boolean isDirtOrFarmlandAt(IWorldGenerationReader world, BlockPos soilPos, IPlantable sapling) {
        return world.hasBlockState(soilPos, (p_236409_0_) -> {
            Block block = p_236409_0_.getBlock();
            return isDirt(block) || block == Blocks.FARMLAND || block == this.extraSoil;
        });
    }
}