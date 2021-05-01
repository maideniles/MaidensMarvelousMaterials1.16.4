package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.util.Registration;
import com.maideniles.maidensmaterials.world.feature.base.PalmTreeFeature;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.fml.RegistryObject;

public class ModFeatures {

    public static final RegistryObject<Feature<NoFeatureConfig>> PALM_TREE = Registration.FEATURES.register("palm_tree",
            () -> new PalmTreeFeature(NoFeatureConfig.field_236558_a_));

    public static void register() {}
}
