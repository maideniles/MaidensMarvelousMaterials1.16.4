package com.maideniles.maidensmaterials.blocks.vegetation;

import com.maideniles.maidensmaterials.init.ModBlocks;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.common.property.Properties;

import java.util.Random;
import java.util.function.Function;

public abstract class OrnamentalMushroomFeature extends FlowersFeature {


    public OrnamentalMushroomFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> dynamicFunction) {
        super((Codec) dynamicFunction);
    }

    @Override
    public int getFlowerCount(IFeatureConfig config) {
        return 0;
    }

    @Override
    public BlockPos getNearbyPos(Random p_225561_1_, BlockPos p_225561_2_, IFeatureConfig p_225561_3_) {
        return null;
    }

    @Override
    public BlockState getFlowerToPlace(Random p_225562_1_, BlockPos p_225562_2_, IFeatureConfig p_225562_3_) {
        return null;
    }
}




