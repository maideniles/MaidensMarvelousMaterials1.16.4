package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.util.Registration;
import com.maideniles.maidensmaterials.world.feature.base.PalmTreeFeature;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.fml.RegistryObject;

public class ModFeatures {

    static final Feature<BaseTreeFeatureConfig> PALM_TREE_INSTANCE = new PalmTreeFeature(BaseTreeFeatureConfig.CODEC);
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> PALM_TREE = Registration.FEATURES.register("palm_tree", () -> PALM_TREE_INSTANCE);

    public static void register() {}
}