package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.util.Registration;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.leaf.MaidensLeafVineDecorator;

import com.maideniles.maidensmaterials.world.gen.decorator.tree.mushroom.MaidensMushroomDecorator;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.trunk.MaidensCoconutDecorator;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.trunk.MaidensTrunkVineDecorator;
import com.mojang.serialization.Codec;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.treedecorator.LeaveVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.lwjgl.system.CallbackI;

import javax.annotation.Nullable;

public class MaidensTreeDecoratorTypes  {
    private static <T extends TreeDecorator> RegistryObject<?> register(String p_236877_0_, Codec<T> p_236877_1_) {
        return Registration.TREE_DECORATORS.register(p_236877_0_,
                () -> new TreeDecoratorType(p_236877_1_));
    }

    public static final RegistryObject<TreeDecoratorType<MaidensLeafVineDecorator>> MAIDENS_LEAF_VINE =
            (RegistryObject<TreeDecoratorType<MaidensLeafVineDecorator>>) register("maidens_leaf_vine_decorator",
                    MaidensLeafVineDecorator.field_236866_a_);

    public static final RegistryObject<TreeDecoratorType<MaidensTrunkVineDecorator>> MAIDENS_TRUNK_VINE =
            (RegistryObject<TreeDecoratorType<MaidensTrunkVineDecorator>>) register("maidens_trunk_vine_decorator",
                    MaidensTrunkVineDecorator.field_236866_a_);

    public static final RegistryObject<TreeDecoratorType<MaidensMushroomDecorator>> MAIDENS_MUSHROOM =
            (RegistryObject<TreeDecoratorType<MaidensMushroomDecorator>>) register("maidens_mushroom_decorator",
                    MaidensMushroomDecorator.field_236874_c_);


    public static final RegistryObject<TreeDecoratorType<MaidensCoconutDecorator>> MAIDENS_COCONUT =
            (RegistryObject<TreeDecoratorType<MaidensCoconutDecorator>>) register("maidens_coconut_decorator",
                    MaidensCoconutDecorator.field_236874_c_);


    public static void register(){}
}
