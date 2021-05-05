package com.maideniles.maidensmaterials.blocks.vegetation;

import com.mojang.serialization.Codec;
import java.util.Random;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.blockstateprovider.BlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.BlockStateProviderType;

public class CoralBlockStateProvider extends BlockStateProvider {
    public static final Codec<net.minecraft.world.gen.blockstateprovider.ForestFlowerBlockStateProvider> CODEC;
    private static final BlockState[] STATES = new BlockState[]
    {Blocks.BRAIN_CORAL.getDefaultState(), Blocks.BUBBLE_CORAL.getDefaultState(), Blocks.FIRE_CORAL.getDefaultState(),
     Blocks.HORN_CORAL.getDefaultState(), Blocks.TUBE_CORAL.getDefaultState(),  Blocks.SEAGRASS.getDefaultState(),
            Blocks.SEA_PICKLE.getDefaultState()};
    public static final net.minecraft.world.gen.blockstateprovider.ForestFlowerBlockStateProvider PROVIDER = new net.minecraft.world.gen.blockstateprovider.ForestFlowerBlockStateProvider();

    protected BlockStateProviderType<?> getProviderType() {
        return BlockStateProviderType.FOREST_FLOWER_PROVIDER;
    }

    public BlockState getBlockState(Random randomIn, BlockPos blockPosIn) {
        double d0 = MathHelper.clamp((1.0D + Biome.INFO_NOISE.noiseAt((double)blockPosIn.getX() / 48.0D, (double)blockPosIn.getZ() / 48.0D, false)) / 2.0D, 0.0D, 0.9999D);
        return STATES[(int)(d0 * (double)STATES.length)];
    }

    static {
        CODEC = Codec.unit(() -> {
            return PROVIDER;
        });
    }
}

