package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.blocks.VineTieBlock;
import com.maideniles.maidensmaterials.blocks.tree.leaves.MaidenLeavesBlock;
import com.maideniles.maidensmaterials.blocks.tree.leaves.fruit.*;
import com.maideniles.maidensmaterials.blocks.tree.sapling.CrabappleSaplingBlock;
import com.maideniles.maidensmaterials.blocks.vase.*;
import com.maideniles.maidensmaterials.blocks.vegetation.*;
import com.maideniles.maidensmaterials.util.Registration;
import com.maideniles.maidensmaterials.world.feature.tree.*;
import com.maideniles.maidensmaterials.world.feature.tree.fruit.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {







    //COLORED CLAY BLOCKS//
    public static final RegistryObject<Block> RED_CLAY_BLOCK = register("red_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ORANGE_CLAY_BLOCK = register("orange_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> YELLOW_CLAY_BLOCK = register("yellow_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIME_CLAY_BLOCK = register("lime_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> GREEN_CLAY_BLOCK = register("green_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CYAN_CLAY_BLOCK = register("cyan_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIGHT_BLUE_CLAY_BLOCK = register("light_blue_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BLUE_CLAY_BLOCK = register("blue_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PURPLE_CLAY_BLOCK = register("purple_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MAGENTA_CLAY_BLOCK = register("magenta_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PINK_CLAY_BLOCK = register("pink_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> WHITE_CLAY_BLOCK = register("white_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIGHT_GRAY_CLAY_BLOCK = register("light_gray_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> GRAY_CLAY_BLOCK = register("gray_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BLACK_CLAY_BLOCK = register("black_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BROWN_CLAY_BLOCK = register("brown_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    //COLORED BRICK BLOCKS//
    public static final RegistryObject<Block> RED_BRICK_BLOCK = register("red_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ORANGE_BRICK_BLOCK = register("orange_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> YELLOW_BRICK_BLOCK = register("yellow_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIME_BRICK_BLOCK = register("lime_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> GREEN_BRICK_BLOCK = register("green_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CYAN_BRICK_BLOCK = register("cyan_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_BLOCK = register("light_blue_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BLUE_BRICK_BLOCK = register("blue_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PURPLE_BRICK_BLOCK = register("purple_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MAGENTA_BRICK_BLOCK = register("magenta_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PINK_BRICK_BLOCK = register("pink_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> WHITE_BRICK_BLOCK = register("white_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_BLOCK = register("light_gray_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> GRAY_BRICK_BLOCK = register("gray_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BLACK_BRICK_BLOCK = register("black_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BROWN_BRICK_BLOCK = register("brown_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    //LARGE BRICK BLOCKS//
    public static final RegistryObject<Block> RED_LARGE_BRICK_BLOCK = register("red_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ORANGE_LARGE_BRICK_BLOCK = register("orange_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> YELLOW_LARGE_BRICK_BLOCK = register("yellow_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIME_LARGE_BRICK_BLOCK = register("lime_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> GREEN_LARGE_BRICK_BLOCK = register("green_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CYAN_LARGE_BRICK_BLOCK = register("cyan_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIGHT_BLUE_LARGE_BRICK_BLOCK = register("light_blue_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BLUE_LARGE_BRICK_BLOCK = register("blue_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PURPLE_LARGE_BRICK_BLOCK = register("purple_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MAGENTA_LARGE_BRICK_BLOCK = register("magenta_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PINK_LARGE_BRICK_BLOCK = register("pink_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> WHITE_LARGE_BRICK_BLOCK = register("white_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIGHT_GRAY_LARGE_BRICK_BLOCK = register("light_gray_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> GRAY_LARGE_BRICK_BLOCK = register("gray_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BLACK_LARGE_BRICK_BLOCK = register("black_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BROWN_LARGE_BRICK_BLOCK = register("brown_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));


//GEMSTONE ORES//

    public static final RegistryObject<Block> JASPER_ORE = register("jasper_ore",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CARNELIAN_ORE = register("carnelian_ore",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CITRINE_ORE = register("citrine_ore",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AVENTURINE_ORE = register("aventurine_ore",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_ORE = register("jade_ore",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CHALCOPYRITE_ORE = register("chalcopyrite_ore",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABRADORITE_ORE = register("labradorite_ore",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MOONSTONE_ORE = register("moonstone_ore",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SODALITE_ORE = register("sodalite_ore",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AMETHYST_ORE = register("amethyst_ore",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ROSE_QUARTZ_ORE = register("rose_quartz_ore",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MICA_ORE = register("mica_ore",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));



//GEMSTONE BLOCKS//

    public static final RegistryObject<Block> JASPER_BLOCK = register("jasper_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CARNELIAN_BLOCK = register("carnelian_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CITRINE_BLOCK = register("citrine_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AVENTURINE_BLOCK = register("aventurine_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_BLOCK = register("jade_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CHALCOPYRITE_BLOCK = register("chalcopyrite_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABRADORITE_BLOCK = register("labradorite_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MOONSTONE_BLOCK = register("moonstone_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SODALITE_BLOCK = register("sodalite_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AMETHYST_BLOCK = register("amethyst_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = register("rose_quartz_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MICA_BLOCK = register("mica_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));


    //GEMSTONE TILE BLOCKS//
//GEMSTONE TILE 1//
    public static final RegistryObject<Block> JASPER_TILE_1 = register("jasper_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CARNELIAN_TILE_1 = register("carnelian_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CITRINE_TILE_1 = register("citrine_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AVENTURINE_TILE_1 = register("aventurine_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_TILE_1 = register("jade_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_1 = register("chalcopyrite_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABRADORITE_TILE_1 = register("labradorite_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MOONSTONE_TILE_1 = register("moonstone_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SODALITE_TILE_1 = register("sodalite_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AMETHYST_TILE_1 = register("amethyst_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_1 = register("rose_quartz_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    //GEMSTONE TILE 2//
    public static final RegistryObject<Block> JASPER_TILE_2 = register("jasper_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CARNELIAN_TILE_2 = register("carnelian_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CITRINE_TILE_2 = register("citrine_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AVENTURINE_TILE_2 = register("aventurine_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_TILE_2 = register("jade_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_2 = register("chalcopyrite_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABRADORITE_TILE_2 = register("labradorite_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MOONSTONE_TILE_2 = register("moonstone_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SODALITE_TILE_2 = register("sodalite_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AMETHYST_TILE_2 = register("amethyst_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_2 = register("rose_quartz_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    //GEMSTONE TILE 3//
    public static final RegistryObject<Block> JASPER_TILE_3 = register("jasper_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CARNELIAN_TILE_3 = register("carnelian_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CITRINE_TILE_3 = register("citrine_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AVENTURINE_TILE_3 = register("aventurine_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_TILE_3 = register("jade_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_3 = register("chalcopyrite_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABRADORITE_TILE_3 = register("labradorite_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MOONSTONE_TILE_3 = register("moonstone_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SODALITE_TILE_3 = register("sodalite_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AMETHYST_TILE_3 = register("amethyst_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_3 = register("rose_quartz_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    //GEMSTONE TILE 4//
    public static final RegistryObject<Block> JASPER_TILE_4 = register("jasper_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CARNELIAN_TILE_4 = register("carnelian_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CITRINE_TILE_4 = register("citrine_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AVENTURINE_TILE_4 = register("aventurine_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_TILE_4 = register("jade_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_4 = register("chalcopyrite_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABRADORITE_TILE_4 = register("labradorite_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MOONSTONE_TILE_4 = register("moonstone_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SODALITE_TILE_4 = register("sodalite_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AMETHYST_TILE_4 = register("amethyst_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_4 = register("rose_quartz_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    //GEMSTONE TILE 5//
    public static final RegistryObject<Block> JASPER_TILE_5 = register("jasper_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CARNELIAN_TILE_5 = register("carnelian_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CITRINE_TILE_5 = register("citrine_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AVENTURINE_TILE_5 = register("aventurine_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_TILE_5 = register("jade_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_5 = register("chalcopyrite_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABRADORITE_TILE_5 = register("labradorite_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MOONSTONE_TILE_5 = register("moonstone_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SODALITE_TILE_5 = register("sodalite_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AMETHYST_TILE_5 = register("amethyst_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_5 = register("rose_quartz_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    //GEMSTONE TILE 6//
    public static final RegistryObject<Block> JASPER_TILE_6 = register("jasper_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CARNELIAN_TILE_6 = register("carnelian_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CITRINE_TILE_6 = register("citrine_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AVENTURINE_TILE_6 = register("aventurine_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_TILE_6 = register("jade_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_6 = register("chalcopyrite_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABRADORITE_TILE_6 = register("labradorite_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MOONSTONE_TILE_6 = register("moonstone_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SODALITE_TILE_6 = register("sodalite_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AMETHYST_TILE_6 = register("amethyst_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_6 = register("rose_quartz_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    //ESSENCE BLOCKS//
    public static final RegistryObject<Block> EARTHEN_ESSENCE_BLOCK = register("earthen_essence_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> FLORAL_ESSENCE_BLOCK = register("floral_essence_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));


//STAINED PLANKS//

    public static final RegistryObject<Block> RED_STAINED_PLANKS = register("red_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ORANGE_STAINED_PLANKS = register("orange_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> YELLOW_STAINED_PLANKS = register("yellow_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIME_STAINED_PLANKS = register("lime_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> GREEN_STAINED_PLANKS = register("green_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CYAN_STAINED_PLANKS = register("cyan_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_PLANKS = register("light_blue_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BLUE_STAINED_PLANKS = register("blue_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PURPLE_STAINED_PLANKS = register("purple_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MAGENTA_STAINED_PLANKS = register("magenta_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PINK_STAINED_PLANKS = register("pink_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> WHITE_STAINED_PLANKS = register("white_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_PLANKS = register("light_gray_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> GRAY_STAINED_PLANKS = register("gray_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BLACK_STAINED_PLANKS = register("black_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BROWN_STAINED_PLANKS = register("brown_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));



    //WOOD PLANKS//
    public static final RegistryObject<Block> CRABAPPLE_PLANKS = register("crabapple_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> POINCIANA_PLANKS = register("poinciana_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABURNUM_PLANKS = register("laburnum_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_PLANKS = register("jade_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PAULOWNIA_PLANKS = register("paulownia_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> WISTERIA_PLANKS = register("wisteria_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JACARANDA_PLANKS = register("jacaranda_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> DOGWOOD_PLANKS = register("dogwood_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SILVERBELL_PLANKS = register("silverbell_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CEDAR_PLANKS = register("cedar_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

//    public static final RegistryObject<Block> PALM_PLANKS = register("palm_planks",
    //           ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    //VINED COBBLE BLOCKS//
    public static final RegistryObject<Block> CRABAPPLE_COBBLESTONE = register("crabapple_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> POINCIANA_COBBLESTONE = register("poinciana_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABURNUM_COBBLESTONE = register("laburnum_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_COBBLESTONE = register("jade_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PAULOWNIA_COBBLESTONE = register("paulownia_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> WISTERIA_COBBLESTONE = register("wisteria_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JACARANDA_COBBLESTONE = register("jacaranda_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> DOGWOOD_COBBLESTONE = register("dogwood_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SILVERBELL_COBBLESTONE = register("silverbell_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

//LEAVES//
public static final RegistryObject<Block> CRABAPPLE_LEAVES = register("crabapple_leaves",
        ()-> new MaidenLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid(), ModItems.CRABAPPLE_BLOSSOMS));

    public static final RegistryObject<Block> POINCIANA_LEAVES = register("poinciana_leaves",
            ()-> new MaidenLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid(),ModItems.POINCIANA_BLOSSOMS));

    public static final RegistryObject<Block> LABURNUM_LEAVES = register("laburnum_leaves",
            ()-> new MaidenLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid(),ModItems.LABURNUM_BLOSSOMS));

    public static final RegistryObject<Block> JADE_LEAVES = register("jade_leaves",
            ()-> new MaidenLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid(),ModItems.JADE_BLOSSOMS));

    public static final RegistryObject<Block> PAULOWNIA_LEAVES = register("paulownia_leaves",
            ()-> new MaidenLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid(),ModItems.PAULOWNIA_BLOSSOMS));

    public static final RegistryObject<Block> WISTERIA_LEAVES = register("wisteria_leaves",
            ()-> new MaidenLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid(),ModItems.WISTERIA_BLOSSOMS));

    public static final RegistryObject<Block> JACARANDA_LEAVES = register("jacaranda_leaves",
            ()-> new MaidenLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid(),ModItems.JACARANDA_BLOSSOMS));

    public static final RegistryObject<Block> DOGWOOD_LEAVES = register("dogwood_leaves",
            ()-> new MaidenLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid(),ModItems.DOGWOOD_BLOSSOMS));

    public static final RegistryObject<Block> SILVERBELL_LEAVES = register("silverbell_leaves",
            ()-> new MaidenLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid(),ModItems.SILVERBELL_BLOSSOMS));

    public static final RegistryObject<Block> CEDAR_LEAVES = register("cedar_leaves",
            ()-> new LeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid()));

    public static final RegistryObject<Block> PALM_LEAVES = register("palm_leaves",
            ()-> new LeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid()));

//FRUIT LEAVES//
public static final RegistryObject<Block> GROWING_APPLE_LEAVES = register("apple_leaves",
        ()-> new GrowingAppleLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid()));

    public static final RegistryObject<Block> GROWING_CHERRY_LEAVES = register("cherry_leaves",
            ()-> new GrowingCherryLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid()));

    public static final RegistryObject<Block> GROWING_PEACH_LEAVES = register("peach_leaves",
            ()-> new GrowingPeachLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid()));

    public static final RegistryObject<Block> GROWING_ORANGE_LEAVES = register("orange_leaves",
            ()-> new GrowingOrangeLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid()));

    public static final RegistryObject<Block> GROWING_GRAPEFRUIT_LEAVES = register("grapefruit_leaves",
            ()-> new GrowingGrapefruitLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid()));

    public static final RegistryObject<Block> GROWING_LEMON_LEAVES = register("lemon_leaves",
            ()-> new GrowingLemonLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid()));

    public static final RegistryObject<Block> GROWING_LIME_LEAVES = register("lime_leaves",
            ()-> new GrowingLimeLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid()));

    public static final RegistryObject<Block> GROWING_PEAR_LEAVES = register("pear_leaves",
            ()-> new GrowingPearLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid()));

    public static final RegistryObject<Block> GROWING_PLUM_LEAVES = register("plum_leaves",
            ()-> new GrowingPlumLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid()));

//VINES//

    public static final RegistryObject<Block> CRABAPPLE_VINE = register("crabapple_vine",
            ()-> new VineBlock(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().notSolid()));

    public static final RegistryObject<Block> POINCIANA_VINE = register("poinciana_vine",
            ()-> new VineBlock(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().notSolid()));

    public static final RegistryObject<Block> LABURNUM_VINE = register("laburnum_vine",
            ()-> new VineBlock(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().notSolid()));

    public static final RegistryObject<Block> JADE_VINE = register("jade_vine",
            ()-> new VineBlock(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().notSolid()));

    public static final RegistryObject<Block> PAULOWNIA_VINE = register("paulownia_vine",
            ()-> new VineBlock(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().notSolid()));

    public static final RegistryObject<Block> WISTERIA_VINE = register("wisteria_vine",
            ()-> new VineBlock(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().notSolid()));

    public static final RegistryObject<Block> JACARANDA_VINE = register("jacaranda_vine",
            ()-> new VineBlock(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().notSolid()));

    public static final RegistryObject<Block> DOGWOOD_VINE = register("dogwood_vine",
            ()-> new VineBlock(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().notSolid()));

    public static final RegistryObject<Block> SILVERBELL_VINE = register("silverbell_vine",
            ()-> new VineBlock(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().notSolid()));

    public static final RegistryObject<Block> CEDAR_VINE = register("cedar_vine",
            ()-> new VineBlock(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().notSolid()));


    //WOODS//
    public static final RegistryObject<Block> CRABAPPLE_WOOD = register("crabapple_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> POINCIANA_WOOD = register("poinciana_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABURNUM_WOOD = register("laburnum_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_WOOD = register("jade_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PAULOWNIA_WOOD = register("paulownia_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> WISTERIA_WOOD = register("wisteria_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JACARANDA_WOOD = register("jacaranda_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> DOGWOOD_WOOD = register("dogwood_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SILVERBELL_WOOD = register("silverbell_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CEDAR_WOOD = register("cedar_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PALM_WOOD = register("palm_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    //STRIPPED WOODS//
    public static final RegistryObject<Block> CRABAPPLE_STRIPPED_WOOD = register("crabapple_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> POINCIANA_STRIPPED_WOOD = register("poinciana_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABURNUM_STRIPPED_WOOD = register("laburnum_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_STRIPPED_WOOD = register("jade_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PAULOWNIA_STRIPPED_WOOD = register("paulownia_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> WISTERIA_STRIPPED_WOOD = register("wisteria_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JACARANDA_STRIPPED_WOOD = register("jacaranda_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> DOGWOOD_STRIPPED_WOOD = register("dogwood_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SILVERBELL_STRIPPED_WOOD = register("silverbell_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CEDAR_STRIPPED_WOOD = register("cedar_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PALM_STRIPPED_WOOD = register("palm_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    //TREE LOGS//
    public static final RegistryObject<Block> CRABAPPLE_LOG = register("crabapple_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> POINCIANA_LOG = register("poinciana_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> LABURNUM_LOG = register("laburnum_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> JADE_LOG = register("jade_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> PAULOWNIA_LOG = register("paulownia_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> WISTERIA_LOG = register("wisteria_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> JACARANDA_LOG = register("jacaranda_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> DOGWOOD_LOG = register("dogwood_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> SILVERBELL_LOG = register("silverbell_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> CEDAR_LOG = register("cedar_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> PALM_LOG = register("palm_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));



    //TREE STRIPPED LOGS//
    public static final RegistryObject<Block> CRABAPPLE_STRIPPED_LOG = register("crabapple_stripped_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> POINCIANA_STRIPPED_LOG = register("poinciana_stripped_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> LABURNUM_STRIPPED_LOG = register("laburnum_stripped_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> JADE_STRIPPED_LOG = register("jade_stripped_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> PAULOWNIA_STRIPPED_LOG = register("paulownia_stripped_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> WISTERIA_STRIPPED_LOG = register("wisteria_stripped_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> JACARANDA_STRIPPED_LOG = register("jacaranda_stripped_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> DOGWOOD_STRIPPED_LOG = register("dogwood_stripped_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> SILVERBELL_STRIPPED_LOG = register("silverbell_stripped_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> CEDAR_STRIPPED_LOG = register("cedar_stripped_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> PALM_STRIPPED_LOG = register("palm_stripped_log",
            ()-> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));


    //SAPLINGS//
    public static final RegistryObject<Block> CRABAPPLE_SAPLING = register("crabapple_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new CrabappleTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> POINCIANA_SAPLING = register("poinciana_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new PoincianaTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> LABURNUM_SAPLING = register("laburnum_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new LaburnumTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> JADE_SAPLING = register("jade_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new JadeTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> PAULOWNIA_SAPLING = register("paulownia_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new PaulowniaTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> WISTERIA_SAPLING = register("wisteria_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new WisteriaTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> JACARANDA_SAPLING = register("jacaranda_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new JacarandaTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> DOGWOOD_SAPLING = register("dogwood_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new DogwoodTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> SILVERBELL_SAPLING = register("silverbell_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new SilverbellTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> CEDAR_SAPLING = register("cedar_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new CedarTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> PALM_SAPLING = register("palm_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new CrabappleTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));


    public static final RegistryObject<Block> APPLE_SAPLING = register("apple_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new AppleTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> CHERRY_SAPLING = register("cherry_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new CherryTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> PEACH_SAPLING = register("peach_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new PeachTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> ORANGE_FRUIT_SAPLING = register("orange_fruit_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new OrangeTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> GRAPEFRUIT_SAPLING = register("grapefruit_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new GrapefruitTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> LEMON_SAPLING = register("lemon_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new LemonTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> LIME_SAPLING = register("lime_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new LimeTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> PEAR_SAPLING = register("pear_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new PearTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> PLUM_SAPLING = register("plum_sapling",
            ()-> new CrabappleSaplingBlock(
                    ()-> new PlumTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));










//GRASS, VEGETATION//

    public static final RegistryObject<Block> ORNAMENTAL_GRASS = register("ornamental_grass",
            ()-> new OrnamentalGrassBlock(Block.Properties.create(Material.ORGANIC).hardnessAndResistance(0.5f)));

    public static final RegistryObject<Block> ORNAMENTAL_PATH = register("ornamental_path",
            ()-> new OrnamentalPathBlock(Block.Properties.create(Material.ORGANIC).notSolid().hardnessAndResistance(0.5f)));

    public static final RegistryObject<Block> SPARKLING_SAND = register("sparkling_sand",
            ()-> new SparklingSandBlock(14406560,Block.Properties.create(Material.ORGANIC).hardnessAndResistance(0.5f)));

    public static final RegistryObject<Block> ORNAMENTAL_MUSHROOM = register("ornamental_mushroom",
            () -> new OrnamentalMushroomBlock(Effects.NIGHT_VISION, 6,Block.Properties.create(Material.PLANTS).notSolid().doesNotBlockMovement()));

    public static final RegistryObject<Block> FAIRY_GLOW_CUP = register("fairy_glow_cup",
            ()-> new FairyGlowCup(Block.Properties.create(Material.ORGANIC).notSolid().hardnessAndResistance(0.5f)));

    public static final RegistryObject<Block> DA_COCONUT_NUT = register("coconutnut",
            ()-> new FairyGlowCup(Block.Properties.create(Material.ORGANIC).notSolid().hardnessAndResistance(0.5f)));

    public static final RegistryObject<Block> VINE_TIE = register("vine_tie",
            ()-> new VineTieBlock(Block.Properties.create(Material.ORGANIC).notSolid().hardnessAndResistance(0.5f)));

    public static final RegistryObject<Block> WALK_FLOWERS = register("flower_grass",
            ()-> new FlowerGrassBlock(Block.Properties.create(Material.ORGANIC).hardnessAndResistance(0.5f)));

//VASES--EMPTY//
public static final RegistryObject<Block> RED_VASE_NO_FLOWER = register( "red_vase_no_flower",
        () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_NO_FLOWER = register( "orange_vase_no_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_NO_FLOWER = register( "yellow_vase_no_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_NO_FLOWER = register( "lime_vase_no_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_NO_FLOWER = register( "green_vase_no_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_NO_FLOWER = register( "cyan_vase_no_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_NO_FLOWER = register( "light_blue_vase_no_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_NO_FLOWER = register( "blue_vase_no_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_NO_FLOWER = register( "purple_vase_no_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_NO_FLOWER = register( "magenta_vase_no_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_NO_FLOWER = register( "pink_vase_no_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_NO_FLOWER = register( "white_vase_no_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_NO_FLOWER = register( "light_gray_vase_no_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_NO_FLOWER = register( "gray_vase_no_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_NO_FLOWER = register( "black_vase_no_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_NO_FLOWER = register( "brown_vase_no_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

//RED-FLOWER//
public static final RegistryObject<Block> RED_VASE_RED_FLOWER = register( "red_vase_red_flower",
        () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_RED_FLOWER = register( "orange_vase_red_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_RED_FLOWER = register( "yellow_vase_red_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_RED_FLOWER = register( "lime_vase_red_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_RED_FLOWER = register( "green_vase_red_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_RED_FLOWER = register( "cyan_vase_red_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_RED_FLOWER = register( "light_blue_vase_red_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_RED_FLOWER = register( "blue_vase_red_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_RED_FLOWER = register( "purple_vase_red_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_RED_FLOWER = register( "magenta_vase_red_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_RED_FLOWER = register( "pink_vase_red_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_RED_FLOWER = register( "white_vase_red_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_RED_FLOWER = register( "light_gray_vase_red_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_RED_FLOWER = register( "gray_vase_red_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_RED_FLOWER = register( "black_vase_red_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_RED_FLOWER = register( "brown_vase_red_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

//ORANGE-FLOWER//
public static final RegistryObject<Block> RED_VASE_ORANGE_FLOWER = register( "red_vase_orange_flower",
        () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_ORANGE_FLOWER = register( "orange_vase_orange_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_ORANGE_FLOWER = register( "yellow_vase_orange_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_ORANGE_FLOWER = register( "lime_vase_orange_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_ORANGE_FLOWER = register( "green_vase_orange_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_ORANGE_FLOWER = register( "cyan_vase_orange_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_ORANGE_FLOWER = register( "light_blue_vase_orange_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_ORANGE_FLOWER = register( "blue_vase_orange_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_ORANGE_FLOWER = register( "purple_vase_orange_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_ORANGE_FLOWER = register( "magenta_vase_orange_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_ORANGE_FLOWER = register( "pink_vase_orange_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_ORANGE_FLOWER = register( "white_vase_orange_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_ORANGE_FLOWER = register( "light_gray_vase_orange_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_ORANGE_FLOWER = register( "gray_vase_orange_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_ORANGE_FLOWER = register( "black_vase_orange_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_ORANGE_FLOWER = register( "brown_vase_orange_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


//YELLOW-FLOWER//
public static final RegistryObject<Block> RED_VASE_YELLOW_FLOWER = register( "red_vase_yellow_flower",
        () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_YELLOW_FLOWER = register( "orange_vase_yellow_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_YELLOW_FLOWER = register( "yellow_vase_yellow_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_YELLOW_FLOWER = register( "lime_vase_yellow_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_YELLOW_FLOWER = register( "green_vase_yellow_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_YELLOW_FLOWER = register( "cyan_vase_yellow_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_YELLOW_FLOWER = register( "light_blue_vase_yellow_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_YELLOW_FLOWER = register( "blue_vase_yellow_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_YELLOW_FLOWER = register( "purple_vase_yellow_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_YELLOW_FLOWER = register( "magenta_vase_yellow_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_YELLOW_FLOWER = register( "pink_vase_yellow_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_YELLOW_FLOWER = register( "white_vase_yellow_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_YELLOW_FLOWER = register( "light_gray_vase_yellow_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_YELLOW_FLOWER = register( "gray_vase_yellow_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_YELLOW_FLOWER = register( "black_vase_yellow_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_YELLOW_FLOWER = register( "brown_vase_yellow_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


//GREEN-FLOWER//
public static final RegistryObject<Block> RED_VASE_GREEN_FLOWER = register( "red_vase_green_flower",
        () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_GREEN_FLOWER = register( "orange_vase_green_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_GREEN_FLOWER = register( "yellow_vase_green_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_GREEN_FLOWER = register( "lime_vase_green_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_GREEN_FLOWER = register( "green_vase_green_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_GREEN_FLOWER = register( "cyan_vase_green_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_GREEN_FLOWER = register( "light_blue_vase_green_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_GREEN_FLOWER = register( "blue_vase_green_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_GREEN_FLOWER = register( "purple_vase_green_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_GREEN_FLOWER = register( "magenta_vase_green_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_GREEN_FLOWER = register( "pink_vase_green_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_GREEN_FLOWER = register( "white_vase_green_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_GREEN_FLOWER = register( "light_gray_vase_green_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_GREEN_FLOWER = register( "gray_vase_green_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_GREEN_FLOWER = register( "black_vase_green_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_GREEN_FLOWER = register( "brown_vase_green_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


//CYAN-FLOWER//
public static final RegistryObject<Block> RED_VASE_CYAN_FLOWER = register( "red_vase_cyan_flower",
        () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_CYAN_FLOWER = register( "orange_vase_cyan_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_CYAN_FLOWER = register( "yellow_vase_cyan_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_CYAN_FLOWER = register( "lime_vase_cyan_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_CYAN_FLOWER = register( "green_vase_cyan_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_CYAN_FLOWER = register( "cyan_vase_cyan_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_CYAN_FLOWER = register( "light_blue_vase_cyan_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_CYAN_FLOWER = register( "blue_vase_cyan_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_CYAN_FLOWER = register( "purple_vase_cyan_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_CYAN_FLOWER = register( "magenta_vase_cyan_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_CYAN_FLOWER = register( "pink_vase_cyan_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_CYAN_FLOWER = register( "white_vase_cyan_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_CYAN_FLOWER = register( "light_gray_vase_cyan_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_CYAN_FLOWER = register( "gray_vase_cyan_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_CYAN_FLOWER = register( "black_vase_cyan_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_CYAN_FLOWER = register( "brown_vase_cyan_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


//BLUE-FLOWER//
public static final RegistryObject<Block> RED_VASE_BLUE_FLOWER = register( "red_vase_blue_flower",
        () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_BLUE_FLOWER = register( "orange_vase_blue_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_BLUE_FLOWER = register( "yellow_vase_blue_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_BLUE_FLOWER = register( "lime_vase_blue_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_BLUE_FLOWER = register( "green_vase_blue_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_BLUE_FLOWER = register( "cyan_vase_blue_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_BLUE_FLOWER = register( "light_blue_vase_blue_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_BLUE_FLOWER = register( "blue_vase_blue_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_BLUE_FLOWER = register( "purple_vase_blue_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_BLUE_FLOWER = register( "magenta_vase_blue_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_BLUE_FLOWER = register( "pink_vase_blue_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_BLUE_FLOWER = register( "white_vase_blue_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_BLUE_FLOWER = register( "light_gray_vase_blue_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_BLUE_FLOWER = register( "gray_vase_blue_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_BLUE_FLOWER = register( "black_vase_blue_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_BLUE_FLOWER = register( "brown_vase_blue_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


//PURPLE-FLOWER//
public static final RegistryObject<Block> RED_VASE_PURPLE_FLOWER = register( "red_vase_purple_flower",
        () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_PURPLE_FLOWER = register( "orange_vase_purple_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_PURPLE_FLOWER = register( "yellow_vase_purple_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_PURPLE_FLOWER = register( "lime_vase_purple_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_PURPLE_FLOWER = register( "green_vase_purple_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_PURPLE_FLOWER = register( "cyan_vase_purple_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_PURPLE_FLOWER = register( "light_blue_vase_purple_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_PURPLE_FLOWER = register( "blue_vase_purple_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_PURPLE_FLOWER = register( "purple_vase_purple_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_PURPLE_FLOWER = register( "magenta_vase_purple_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_PURPLE_FLOWER = register( "pink_vase_purple_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_PURPLE_FLOWER = register( "white_vase_purple_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_PURPLE_FLOWER = register( "light_gray_vase_purple_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_PURPLE_FLOWER = register( "gray_vase_purple_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_PURPLE_FLOWER = register( "black_vase_purple_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_PURPLE_FLOWER = register( "brown_vase_purple_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


//PINK-FLOWER//
public static final RegistryObject<Block> RED_VASE_PINK_FLOWER = register( "red_vase_pink_flower",
        () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_PINK_FLOWER = register( "orange_vase_pink_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_PINK_FLOWER = register( "yellow_vase_pink_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_PINK_FLOWER = register( "lime_vase_pink_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_PINK_FLOWER = register( "green_vase_pink_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_PINK_FLOWER = register( "cyan_vase_pink_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_PINK_FLOWER = register( "light_blue_vase_pink_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_PINK_FLOWER = register( "blue_vase_pink_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_PINK_FLOWER = register( "purple_vase_pink_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_PINK_FLOWER = register( "magenta_vase_pink_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_PINK_FLOWER = register( "pink_vase_pink_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_PINK_FLOWER = register( "white_vase_pink_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_PINK_FLOWER = register( "light_gray_vase_pink_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_PINK_FLOWER = register( "gray_vase_pink_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_PINK_FLOWER = register( "black_vase_pink_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_PINK_FLOWER = register( "brown_vase_pink_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


//WHITE-FLOWER//
public static final RegistryObject<Block> RED_VASE_WHITE_FLOWER = register( "red_vase_white_flower",
        () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_WHITE_FLOWER = register( "orange_vase_white_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_WHITE_FLOWER = register( "yellow_vase_white_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_WHITE_FLOWER = register( "lime_vase_white_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_WHITE_FLOWER = register( "green_vase_white_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_WHITE_FLOWER = register( "cyan_vase_white_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_WHITE_FLOWER = register( "light_blue_vase_white_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_WHITE_FLOWER = register( "blue_vase_white_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_WHITE_FLOWER = register( "purple_vase_white_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_WHITE_FLOWER = register( "magenta_vase_white_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_WHITE_FLOWER = register( "pink_vase_white_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_WHITE_FLOWER = register( "white_vase_white_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_WHITE_FLOWER = register( "light_gray_vase_white_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_WHITE_FLOWER = register( "gray_vase_white_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_WHITE_FLOWER = register( "black_vase_white_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_WHITE_FLOWER = register( "brown_vase_white_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

//VASES--SAPLINGS//


    //RED-SAPLING//
    public static final RegistryObject<Block> RED_VASE_RED_SAPLING = register( "red_vase_red_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_RED_SAPLING = register( "orange_vase_red_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_RED_SAPLING = register( "yellow_vase_red_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_RED_SAPLING = register( "lime_vase_red_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_RED_SAPLING = register( "green_vase_red_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_RED_SAPLING = register( "cyan_vase_red_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_RED_SAPLING = register( "light_blue_vase_red_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_RED_SAPLING = register( "blue_vase_red_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_RED_SAPLING = register( "purple_vase_red_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_RED_SAPLING = register( "magenta_vase_red_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_RED_SAPLING = register( "pink_vase_red_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_RED_SAPLING = register( "white_vase_red_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_RED_SAPLING = register( "light_gray_vase_red_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_RED_SAPLING = register( "gray_vase_red_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_RED_SAPLING = register( "black_vase_red_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_RED_SAPLING = register( "brown_vase_red_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //ORANGE-SAPLING//
    public static final RegistryObject<Block> RED_VASE_ORANGE_SAPLING = register( "red_vase_orange_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_ORANGE_SAPLING = register( "orange_vase_orange_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_ORANGE_SAPLING = register( "yellow_vase_orange_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_ORANGE_SAPLING = register( "lime_vase_orange_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_ORANGE_SAPLING = register( "green_vase_orange_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_ORANGE_SAPLING = register( "cyan_vase_orange_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_ORANGE_SAPLING = register( "light_blue_vase_orange_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_ORANGE_SAPLING = register( "blue_vase_orange_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_ORANGE_SAPLING = register( "purple_vase_orange_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_ORANGE_SAPLING = register( "magenta_vase_orange_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_ORANGE_SAPLING = register( "pink_vase_orange_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_ORANGE_SAPLING = register( "white_vase_orange_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_ORANGE_SAPLING = register( "light_gray_vase_orange_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_ORANGE_SAPLING = register( "gray_vase_orange_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_ORANGE_SAPLING = register( "black_vase_orange_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_ORANGE_SAPLING = register( "brown_vase_orange_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //YELLOW-SAPLING//
    public static final RegistryObject<Block> RED_VASE_YELLOW_SAPLING = register( "red_vase_yellow_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_YELLOW_SAPLING = register( "orange_vase_yellow_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_YELLOW_SAPLING = register( "yellow_vase_yellow_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_YELLOW_SAPLING = register( "lime_vase_yellow_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_YELLOW_SAPLING = register( "green_vase_yellow_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_YELLOW_SAPLING = register( "cyan_vase_yellow_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_YELLOW_SAPLING = register( "light_blue_vase_yellow_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_YELLOW_SAPLING = register( "blue_vase_yellow_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_YELLOW_SAPLING = register( "purple_vase_yellow_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_YELLOW_SAPLING = register( "magenta_vase_yellow_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_YELLOW_SAPLING = register( "pink_vase_yellow_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_YELLOW_SAPLING = register( "white_vase_yellow_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_YELLOW_SAPLING = register( "light_gray_vase_yellow_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_YELLOW_SAPLING = register( "gray_vase_yellow_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_YELLOW_SAPLING = register( "black_vase_yellow_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_YELLOW_SAPLING = register( "brown_vase_yellow_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //GREEN-SAPLING//
    public static final RegistryObject<Block> RED_VASE_GREEN_SAPLING = register( "red_vase_green_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_GREEN_SAPLING = register( "orange_vase_green_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_GREEN_SAPLING = register( "yellow_vase_green_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_GREEN_SAPLING = register( "lime_vase_green_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_GREEN_SAPLING = register( "green_vase_green_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_GREEN_SAPLING = register( "cyan_vase_green_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_GREEN_SAPLING = register( "light_blue_vase_green_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_GREEN_SAPLING = register( "blue_vase_green_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_GREEN_SAPLING = register( "purple_vase_green_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_GREEN_SAPLING = register( "magenta_vase_green_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_GREEN_SAPLING = register( "pink_vase_green_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_GREEN_SAPLING = register( "white_vase_green_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_GREEN_SAPLING = register( "light_gray_vase_green_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_GREEN_SAPLING = register( "gray_vase_green_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_GREEN_SAPLING = register( "black_vase_green_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_GREEN_SAPLING = register( "brown_vase_green_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //CYAN-SAPLING//
    public static final RegistryObject<Block> RED_VASE_CYAN_SAPLING = register( "red_vase_cyan_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_CYAN_SAPLING = register( "orange_vase_cyan_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_CYAN_SAPLING = register( "yellow_vase_cyan_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_CYAN_SAPLING = register( "lime_vase_cyan_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_CYAN_SAPLING = register( "green_vase_cyan_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_CYAN_SAPLING = register( "cyan_vase_cyan_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_CYAN_SAPLING = register( "light_blue_vase_cyan_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_CYAN_SAPLING = register( "blue_vase_cyan_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_CYAN_SAPLING = register( "purple_vase_cyan_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_CYAN_SAPLING = register( "magenta_vase_cyan_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_CYAN_SAPLING = register( "pink_vase_cyan_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_CYAN_SAPLING = register( "white_vase_cyan_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_CYAN_SAPLING = register( "light_gray_vase_cyan_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_CYAN_SAPLING = register( "gray_vase_cyan_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_CYAN_SAPLING = register( "black_vase_cyan_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_CYAN_SAPLING = register( "brown_vase_cyan_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //BLUE-SAPLING//
    public static final RegistryObject<Block> RED_VASE_BLUE_SAPLING = register( "red_vase_blue_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_BLUE_SAPLING = register( "orange_vase_blue_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_BLUE_SAPLING = register( "yellow_vase_blue_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_BLUE_SAPLING = register( "lime_vase_blue_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_BLUE_SAPLING = register( "green_vase_blue_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_BLUE_SAPLING = register( "cyan_vase_blue_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_BLUE_SAPLING = register( "light_blue_vase_blue_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_BLUE_SAPLING = register( "blue_vase_blue_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_BLUE_SAPLING = register( "purple_vase_blue_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_BLUE_SAPLING = register( "magenta_vase_blue_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_BLUE_SAPLING = register( "pink_vase_blue_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_BLUE_SAPLING = register( "white_vase_blue_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_BLUE_SAPLING = register( "light_gray_vase_blue_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_BLUE_SAPLING = register( "gray_vase_blue_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_BLUE_SAPLING = register( "black_vase_blue_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_BLUE_SAPLING = register( "brown_vase_blue_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //PURPLE-SAPLING//
    public static final RegistryObject<Block> RED_VASE_PURPLE_SAPLING = register( "red_vase_purple_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_PURPLE_SAPLING = register( "orange_vase_purple_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_PURPLE_SAPLING = register( "yellow_vase_purple_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_PURPLE_SAPLING = register( "lime_vase_purple_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_PURPLE_SAPLING = register( "green_vase_purple_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_PURPLE_SAPLING = register( "cyan_vase_purple_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_PURPLE_SAPLING = register( "light_blue_vase_purple_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_PURPLE_SAPLING = register( "blue_vase_purple_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_PURPLE_SAPLING = register( "purple_vase_purple_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_PURPLE_SAPLING = register( "magenta_vase_purple_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_PURPLE_SAPLING = register( "pink_vase_purple_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_PURPLE_SAPLING = register( "white_vase_purple_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_PURPLE_SAPLING = register( "light_gray_vase_purple_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_PURPLE_SAPLING = register( "gray_vase_purple_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_PURPLE_SAPLING = register( "black_vase_purple_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_PURPLE_SAPLING = register( "brown_vase_purple_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //PINK-SAPLING//
    public static final RegistryObject<Block> RED_VASE_PINK_SAPLING = register( "red_vase_pink_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_PINK_SAPLING = register( "orange_vase_pink_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_PINK_SAPLING = register( "yellow_vase_pink_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_PINK_SAPLING = register( "lime_vase_pink_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_PINK_SAPLING = register( "green_vase_pink_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_PINK_SAPLING = register( "cyan_vase_pink_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_PINK_SAPLING = register( "light_blue_vase_pink_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_PINK_SAPLING = register( "blue_vase_pink_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_PINK_SAPLING = register( "purple_vase_pink_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_PINK_SAPLING = register( "magenta_vase_pink_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_PINK_SAPLING = register( "pink_vase_pink_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_PINK_SAPLING = register( "white_vase_pink_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_PINK_SAPLING = register( "light_gray_vase_pink_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_PINK_SAPLING = register( "gray_vase_pink_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_PINK_SAPLING = register( "black_vase_pink_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_PINK_SAPLING = register( "brown_vase_pink_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //WHITE-SAPLING//
    public static final RegistryObject<Block> RED_VASE_WHITE_SAPLING = register( "red_vase_white_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_WHITE_SAPLING = register( "orange_vase_white_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_WHITE_SAPLING = register( "yellow_vase_white_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_WHITE_SAPLING = register( "lime_vase_white_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_WHITE_SAPLING = register( "green_vase_white_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_WHITE_SAPLING = register( "cyan_vase_white_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_WHITE_SAPLING = register( "light_blue_vase_white_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_WHITE_SAPLING = register( "blue_vase_white_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_WHITE_SAPLING = register( "purple_vase_white_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_WHITE_SAPLING = register( "magenta_vase_white_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_WHITE_SAPLING = register( "pink_vase_white_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_WHITE_SAPLING = register( "white_vase_white_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_WHITE_SAPLING = register( "light_gray_vase_white_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_WHITE_SAPLING = register( "gray_vase_white_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_WHITE_SAPLING = register( "black_vase_white_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_WHITE_SAPLING = register( "brown_vase_white_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //RED-SAPLING//
    public static final RegistryObject<Block> RED_VASE_APPLE_SAPLING = register( "red_vase_apple_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_APPLE_SAPLING = register( "orange_vase_apple_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_APPLE_SAPLING = register( "yellow_vase_apple_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_APPLE_SAPLING = register( "lime_vase_apple_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_APPLE_SAPLING = register( "green_vase_apple_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_APPLE_SAPLING = register( "cyan_vase_apple_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_APPLE_SAPLING = register( "light_blue_vase_apple_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_APPLE_SAPLING = register( "blue_vase_apple_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_APPLE_SAPLING = register( "purple_vase_apple_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_APPLE_SAPLING = register( "magenta_vase_apple_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_APPLE_SAPLING = register( "pink_vase_apple_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_APPLE_SAPLING = register( "white_vase_apple_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_APPLE_SAPLING = register( "light_gray_vase_apple_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_APPLE_SAPLING = register( "gray_vase_apple_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_APPLE_SAPLING = register( "black_vase_apple_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_APPLE_SAPLING = register( "brown_vase_apple_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //ORANGE-SAPLING//
    public static final RegistryObject<Block> RED_VASE_ORANGE_FRUIT_SAPLING = register( "red_vase_orange_fruit_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_ORANGE_FRUIT_SAPLING = register( "orange_vase_orange_fruit_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_ORANGE_FRUIT_SAPLING = register( "yellow_vase_orange_fruit_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_ORANGE_FRUIT_SAPLING = register( "lime_vase_orange_fruit_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_ORANGE_FRUIT_SAPLING = register( "green_vase_orange_fruit_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_ORANGE_FRUIT_SAPLING = register( "cyan_vase_orange_fruit_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_ORANGE_FRUIT_SAPLING = register( "light_blue_vase_orange_fruit_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_ORANGE_FRUIT_SAPLING = register( "blue_vase_orange_fruit_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_ORANGE_FRUIT_SAPLING = register( "purple_vase_orange_fruit_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_ORANGE_FRUIT_SAPLING = register( "magenta_vase_orange_fruit_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_ORANGE_FRUIT_SAPLING = register( "pink_vase_orange_fruit_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_ORANGE_FRUIT_SAPLING = register( "white_vase_orange_fruit_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_ORANGE_FRUIT_SAPLING = register( "light_gray_vase_orange_fruit_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_ORANGE_FRUIT_SAPLING = register( "gray_vase_orange_fruit_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_ORANGE_FRUIT_SAPLING = register( "black_vase_orange_fruit_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_ORANGE_FRUIT_SAPLING = register( "brown_vase_orange_fruit_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //YELLOW-SAPLING//
    public static final RegistryObject<Block> RED_VASE_GRAPEFRUIT_SAPLING = register( "red_vase_grapefruit_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_GRAPEFRUIT_SAPLING = register( "orange_vase_grapefruit_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_GRAPEFRUIT_SAPLING = register( "yellow_vase_grapefruit_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_GRAPEFRUIT_SAPLING = register( "lime_vase_grapefruit_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_GRAPEFRUIT_SAPLING = register( "green_vase_grapefruit_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_GRAPEFRUIT_SAPLING = register( "cyan_vase_grapefruit_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_GRAPEFRUIT_SAPLING = register( "light_blue_vase_grapefruit_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_GRAPEFRUIT_SAPLING = register( "blue_vase_grapefruit_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_GRAPEFRUIT_SAPLING = register( "purple_vase_grapefruit_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_GRAPEFRUIT_SAPLING = register( "magenta_vase_grapefruit_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_GRAPEFRUIT_SAPLING = register( "pink_vase_grapefruit_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_GRAPEFRUIT_SAPLING = register( "white_vase_grapefruit_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_GRAPEFRUIT_SAPLING = register( "light_gray_vase_grapefruit_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_GRAPEFRUIT_SAPLING = register( "gray_vase_grapefruit_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_GRAPEFRUIT_SAPLING = register( "black_vase_grapefruit_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_GRAPEFRUIT_SAPLING = register( "brown_vase_grapefruit_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //GREEN-SAPLING//
    public static final RegistryObject<Block> RED_VASE_LEMON_SAPLING = register( "red_vase_lemon_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_LEMON_SAPLING = register( "orange_vase_lemon_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_LEMON_SAPLING = register( "yellow_vase_lemon_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_LEMON_SAPLING = register( "lime_vase_lemon_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_LEMON_SAPLING = register( "green_vase_lemon_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_LEMON_SAPLING = register( "cyan_vase_lemon_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_LEMON_SAPLING = register( "light_blue_vase_lemon_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_LEMON_SAPLING = register( "blue_vase_lemon_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_LEMON_SAPLING = register( "purple_vase_lemon_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_LEMON_SAPLING = register( "magenta_vase_lemon_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_LEMON_SAPLING = register( "pink_vase_lemon_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_LEMON_SAPLING = register( "white_vase_lemon_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_LEMON_SAPLING = register( "light_gray_vase_lemon_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_LEMON_SAPLING = register( "gray_vase_lemon_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_LEMON_SAPLING = register( "black_vase_lemon_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_LEMON_SAPLING = register( "brown_vase_lemon_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //CYAN-SAPLING//
    public static final RegistryObject<Block> RED_VASE_LIME_FRUIT_SAPLING = register( "red_vase_lime_fruit_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_LIME_FRUIT_SAPLING = register( "orange_vase_lime_fruit_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_LIME_FRUIT_SAPLING = register( "yellow_vase_lime_fruit_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_LIME_FRUIT_SAPLING = register( "lime_vase_lime_fruit_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_LIME_FRUIT_SAPLING = register( "green_vase_lime_fruit_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_LIME_FRUIT_SAPLING = register( "cyan_vase_lime_fruit_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_LIME_FRUIT_SAPLING = register( "light_blue_vase_lime_fruit_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_LIME_FRUIT_SAPLING = register( "blue_vase_lime_fruit_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_LIME_FRUIT_SAPLING = register( "purple_vase_lime_fruit_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_LIME_FRUIT_SAPLING = register( "magenta_vase_lime_fruit_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_LIME_FRUIT_SAPLING = register( "pink_vase_lime_fruit_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_LIME_FRUIT_SAPLING = register( "white_vase_lime_fruit_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_LIME_FRUIT_SAPLING = register( "light_gray_vase_lime_fruit_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_LIME_FRUIT_SAPLING = register( "gray_vase_lime_fruit_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_LIME_FRUIT_SAPLING = register( "black_vase_lime_fruit_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_LIME_FRUIT_SAPLING = register( "brown_vase_lime_fruit_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //BLUE-SAPLING//
    public static final RegistryObject<Block> RED_VASE_PLUM_SAPLING = register( "red_vase_plum_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_PLUM_SAPLING = register( "orange_vase_plum_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_PLUM_SAPLING = register( "yellow_vase_plum_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_PLUM_SAPLING = register( "lime_vase_plum_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_PLUM_SAPLING = register( "green_vase_plum_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_PLUM_SAPLING = register( "cyan_vase_plum_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_PLUM_SAPLING = register( "light_blue_vase_plum_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_PLUM_SAPLING = register( "blue_vase_plum_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_PLUM_SAPLING = register( "purple_vase_plum_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_PLUM_SAPLING = register( "magenta_vase_plum_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_PLUM_SAPLING = register( "pink_vase_plum_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_PLUM_SAPLING = register( "white_vase_plum_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_PLUM_SAPLING = register( "light_gray_vase_plum_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_PLUM_SAPLING = register( "gray_vase_plum_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_PLUM_SAPLING = register( "black_vase_plum_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_PLUM_SAPLING = register( "brown_vase_plum_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //PURPLE-SAPLING//
    public static final RegistryObject<Block> RED_VASE_PEAR_SAPLING = register( "red_vase_pear_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_PEAR_SAPLING = register( "orange_vase_pear_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_PEAR_SAPLING = register( "yellow_vase_pear_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_PEAR_SAPLING = register( "lime_vase_pear_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_PEAR_SAPLING = register( "green_vase_pear_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_PEAR_SAPLING = register( "cyan_vase_pear_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_PEAR_SAPLING = register( "light_blue_vase_pear_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_PEAR_SAPLING = register( "blue_vase_pear_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_PEAR_SAPLING = register( "purple_vase_pear_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_PEAR_SAPLING = register( "magenta_vase_pear_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_PEAR_SAPLING = register( "pink_vase_pear_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_PEAR_SAPLING = register( "white_vase_pear_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_PEAR_SAPLING = register( "light_gray_vase_pear_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_PEAR_SAPLING = register( "gray_vase_pear_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_PEAR_SAPLING = register( "black_vase_pear_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_PEAR_SAPLING = register( "brown_vase_pear_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //PINK-SAPLING//
    public static final RegistryObject<Block> RED_VASE_PEACH_SAPLING = register( "red_vase_peach_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_PEACH_SAPLING = register( "orange_vase_peach_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_PEACH_SAPLING = register( "yellow_vase_peach_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_PEACH_SAPLING = register( "lime_vase_peach_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_PEACH_SAPLING = register( "green_vase_peach_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_PEACH_SAPLING = register( "cyan_vase_peach_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_PEACH_SAPLING = register( "light_blue_vase_peach_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_PEACH_SAPLING = register( "blue_vase_peach_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_PEACH_SAPLING = register( "purple_vase_peach_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_PEACH_SAPLING = register( "magenta_vase_peach_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_PEACH_SAPLING = register( "pink_vase_peach_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_PEACH_SAPLING = register( "white_vase_peach_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_PEACH_SAPLING = register( "light_gray_vase_peach_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_PEACH_SAPLING = register( "gray_vase_peach_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_PEACH_SAPLING = register( "black_vase_peach_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_PEACH_SAPLING = register( "brown_vase_peach_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //WHITE-SAPLING//
    public static final RegistryObject<Block> RED_VASE_CHERRY_SAPLING = register( "red_vase_cherry_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_CHERRY_SAPLING = register( "orange_vase_cherry_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_CHERRY_SAPLING = register( "yellow_vase_cherry_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_CHERRY_SAPLING = register( "lime_vase_cherry_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_CHERRY_SAPLING = register( "green_vase_cherry_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_CHERRY_SAPLING = register( "cyan_vase_cherry_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_CHERRY_SAPLING = register( "light_blue_vase_cherry_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_CHERRY_SAPLING = register( "blue_vase_cherry_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_CHERRY_SAPLING = register( "purple_vase_cherry_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_CHERRY_SAPLING = register( "magenta_vase_cherry_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_CHERRY_SAPLING = register( "pink_vase_cherry_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_CHERRY_SAPLING = register( "white_vase_cherry_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_CHERRY_SAPLING = register( "light_gray_vase_cherry_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_CHERRY_SAPLING = register( "gray_vase_cherry_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_CHERRY_SAPLING = register( "black_vase_cherry_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_CHERRY_SAPLING = register( "brown_vase_cherry_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //RED-SAPLING//
    public static final RegistryObject<Block> RED_VASE_CEDAR_SAPLING = register( "red_vase_cedar_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_CEDAR_SAPLING = register( "orange_vase_cedar_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_CEDAR_SAPLING = register( "yellow_vase_cedar_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_CEDAR_SAPLING = register( "lime_vase_cedar_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_CEDAR_SAPLING = register( "green_vase_cedar_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_CEDAR_SAPLING = register( "cyan_vase_cedar_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_CEDAR_SAPLING = register( "light_blue_vase_cedar_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_CEDAR_SAPLING = register( "blue_vase_cedar_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_CEDAR_SAPLING = register( "purple_vase_cedar_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_CEDAR_SAPLING = register( "magenta_vase_cedar_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_CEDAR_SAPLING = register( "pink_vase_cedar_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_CEDAR_SAPLING = register( "white_vase_cedar_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_CEDAR_SAPLING = register( "light_gray_vase_cedar_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_CEDAR_SAPLING = register( "gray_vase_cedar_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_CEDAR_SAPLING = register( "black_vase_cedar_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_CEDAR_SAPLING = register( "brown_vase_cedar_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //ORANGE-SAPLING//
    public static final RegistryObject<Block> RED_VASE_PALM_SAPLING = register( "red_vase_palm_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_VASE_PALM_SAPLING = register( "orange_vase_palm_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_VASE_PALM_SAPLING = register( "yellow_vase_palm_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIME_VASE_PALM_SAPLING = register( "lime_vase_palm_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GREEN_VASE_PALM_SAPLING = register( "green_vase_palm_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CYAN_VASE_PALM_SAPLING = register( "cyan_vase_palm_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_VASE_PALM_SAPLING = register( "light_blue_vase_palm_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLUE_VASE_PALM_SAPLING = register( "blue_vase_palm_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_VASE_PALM_SAPLING = register( "purple_vase_palm_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_VASE_PALM_SAPLING = register( "magenta_vase_palm_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PINK_VASE_PALM_SAPLING = register( "pink_vase_palm_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WHITE_VASE_PALM_SAPLING = register( "white_vase_palm_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_VASE_PALM_SAPLING = register( "light_gray_vase_palm_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GRAY_VASE_PALM_SAPLING = register( "gray_vase_palm_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BLACK_VASE_PALM_SAPLING = register( "black_vase_palm_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BROWN_VASE_PALM_SAPLING = register( "brown_vase_palm_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));







    public static void register(){};

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block){

        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, ()-> new BlockItem(toReturn.get(),
                new Item.Properties().group(MaidensMaterials.MAIDENS_BLOCKS_GROUP)));
        return toReturn;
    }

    public static List<Item> GATHERED_ORES = new ArrayList<>();
    public static List<String> ORES_TO_ADD = new ArrayList<>();
    public static List<Block> VALID_BLOCKS = new ArrayList<>();


    public static final List<Block> GRASS= new ArrayList<Block>();

}
