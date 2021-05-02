package com.maideniles.maidensmaterials.world.feature.base;

import com.maideniles.maidensmaterials.init.ModConfiguredFeatures;
import com.maideniles.maidensmaterials.init.ModFeatures;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class ModTreeSelector extends Tree {
    @Nullable
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean largeHive) {
        return ModConfiguredFeatures.PALM_TREE_FEATURE;
    }
}