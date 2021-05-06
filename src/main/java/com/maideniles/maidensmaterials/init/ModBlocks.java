package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MaidensMaterials;

import com.maideniles.maidensmaterials.blocks.MaidensBookshelfBlock;
import com.maideniles.maidensmaterials.blocks.MaidensDoorBlock;
import com.maideniles.maidensmaterials.blocks.MaidensTrapDoorBlock;
import com.maideniles.maidensmaterials.blocks.VineTieBlock;
import com.maideniles.maidensmaterials.blocks.tree.leaves.MaidenLeavesBlock;
import com.maideniles.maidensmaterials.blocks.tree.leaves.PalmLeavesBlock;
import com.maideniles.maidensmaterials.blocks.tree.leaves.fruit.*;
import com.maideniles.maidensmaterials.blocks.tree.sapling.OrnamentalSaplingBlock;
import com.maideniles.maidensmaterials.blocks.vase.*;
import com.maideniles.maidensmaterials.blocks.vegetation.*;
import com.maideniles.maidensmaterials.util.Registration;

import com.maideniles.maidensmaterials.world.feature.base.ModTreeSelector;
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

    public static final RegistryObject<Block> MICA_TILE_1 = register("mica_tile_1",
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

    public static final RegistryObject<Block> MICA_TILE_2 = register("mica_tile_2",
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

    public static final RegistryObject<Block> MICA_TILE_3 = register("mica_tile_3",
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

    public static final RegistryObject<Block> MICA_TILE_4 = register("mica_tile_4",
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

    public static final RegistryObject<Block> MICA_TILE_5 = register("mica_tile_5",
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

    public static final RegistryObject<Block> MICA_TILE_6 = register("mica_tile_6",
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


    //SLABS//


    //GEM SLABS--TILE 1//
    public static final RegistryObject<Block> AMETHYST_SLAB_1 = register("amethyst_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.AMETHYST_TILE_1.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> AVENTURINE_SLAB_1 = register("aventurine_tile_1_slab" ,
            () ->new SlabBlock(Block.Properties.from(ModBlocks.AVENTURINE_TILE_1.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CARNELIAN_SLAB_1 = register("carnelian_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CARNELIAN_TILE_1.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CHALCOPYRITE_SLAB_1 = register("chalcopyrite_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CHALCOPYRITE_TILE_1.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CITRINE_SLAB_1 = register("citrine_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CITRINE_TILE_1.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JADE_SLAB_1 = register("jade_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.JADE_TILE_1.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JASPER_SLAB_1 = register("jasper_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.JASPER_TILE_1.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LABRADORITE_SLAB_1 = register("labradorite_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.LABRADORITE_TILE_1.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MICA_SLAB_1 = register("mica_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.MICA_TILE_1.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MOONSTONE_SLAB_1 = register( "moonstone_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.MOONSTONE_TILE_1.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ROSE_QUARTZ_SLAB_1 = register("rose_quartz_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.ROSE_QUARTZ_TILE_1.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> SODALITE_SLAB_1 = register("sodalite_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.SODALITE_TILE_1.get()).hardnessAndResistance(1.5F)));

    //GEM SLABS--TILE 2//
    public static final RegistryObject<Block> AMETHYST_SLAB_2 = register("amethyst_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.AMETHYST_TILE_2.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> AVENTURINE_SLAB_2 = register("aventurine_tile_2_slab" ,
            () ->new SlabBlock(Block.Properties.from(ModBlocks.AVENTURINE_TILE_2.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CARNELIAN_SLAB_2 = register("carnelian_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CARNELIAN_TILE_2.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CHALCOPYRITE_SLAB_2 = register("chalcopyrite_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CHALCOPYRITE_TILE_2.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CITRINE_SLAB_2 = register("citrine_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CITRINE_TILE_2.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JADE_SLAB_2 = register("jade_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.JADE_TILE_2.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JASPER_SLAB_2 = register("jasper_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.JASPER_TILE_2.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LABRADORITE_SLAB_2 = register("labradorite_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.LABRADORITE_TILE_2.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MICA_SLAB_2 = register("mica_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.MICA_TILE_2.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MOONSTONE_SLAB_2 = register( "moonstone_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.MOONSTONE_TILE_2.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ROSE_QUARTZ_SLAB_2 = register("rose_quartz_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.ROSE_QUARTZ_TILE_2.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> SODALITE_SLAB_2 = register("sodalite_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.SODALITE_TILE_2.get()).hardnessAndResistance(1.5F)));

    //GEM SLABS--TILE 3//
    public static final RegistryObject<Block> AMETHYST_SLAB_3 = register("amethyst_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.AMETHYST_TILE_3.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> AVENTURINE_SLAB_3 = register("aventurine_tile_3_slab" ,
            () ->new SlabBlock(Block.Properties.from(ModBlocks.AVENTURINE_TILE_3.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CARNELIAN_SLAB_3 = register("carnelian_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CARNELIAN_TILE_3.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CHALCOPYRITE_SLAB_3 = register("chalcopyrite_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CHALCOPYRITE_TILE_3.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CITRINE_SLAB_3 = register("citrine_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CITRINE_TILE_3.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JADE_SLAB_3 = register("jade_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.JADE_TILE_3.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JASPER_SLAB_3 = register("jasper_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.JASPER_TILE_3.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LABRADORITE_SLAB_3 = register("labradorite_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.LABRADORITE_TILE_3.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MICA_SLAB_3 = register("mica_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.MICA_TILE_3.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MOONSTONE_SLAB_3 = register( "moonstone_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.MOONSTONE_TILE_3.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ROSE_QUARTZ_SLAB_3 = register("rose_quartz_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.ROSE_QUARTZ_TILE_3.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> SODALITE_SLAB_3 = register("sodalite_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.SODALITE_TILE_3.get()).hardnessAndResistance(1.5F)));

    //GEM SLABS--TILE 4//
    public static final RegistryObject<Block> AMETHYST_SLAB_4 = register("amethyst_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.AMETHYST_TILE_4.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> AVENTURINE_SLAB_4 = register("aventurine_tile_4_slab" ,
            () ->new SlabBlock(Block.Properties.from(ModBlocks.AVENTURINE_TILE_4.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CARNELIAN_SLAB_4 = register("carnelian_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CARNELIAN_TILE_4.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CHALCOPYRITE_SLAB_4 = register("chalcopyrite_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CHALCOPYRITE_TILE_4.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CITRINE_SLAB_4 = register("citrine_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CITRINE_TILE_4.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JADE_SLAB_4 = register("jade_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.JADE_TILE_4.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JASPER_SLAB_4 = register("jasper_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.JASPER_TILE_4.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LABRADORITE_SLAB_4 = register("labradorite_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.LABRADORITE_TILE_4.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MICA_SLAB_4 = register("mica_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.MICA_TILE_4.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MOONSTONE_SLAB_4 = register( "moonstone_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.MOONSTONE_TILE_4.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ROSE_QUARTZ_SLAB_4 = register("rose_quartz_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.ROSE_QUARTZ_TILE_4.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> SODALITE_SLAB_4 = register("sodalite_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.SODALITE_TILE_4.get()).hardnessAndResistance(1.5F)));

    //GEM SLABS--TILE 5//
    public static final RegistryObject<Block> AMETHYST_SLAB_5 = register("amethyst_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.AMETHYST_TILE_5.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> AVENTURINE_SLAB_5 = register("aventurine_tile_5_slab" ,
            () ->new SlabBlock(Block.Properties.from(ModBlocks.AVENTURINE_TILE_5.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CARNELIAN_SLAB_5 = register("carnelian_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CARNELIAN_TILE_5.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CHALCOPYRITE_SLAB_5 = register("chalcopyrite_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CHALCOPYRITE_TILE_5.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CITRINE_SLAB_5 = register("citrine_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CITRINE_TILE_5.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JADE_SLAB_5 = register("jade_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.JADE_TILE_5.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JASPER_SLAB_5 = register("jasper_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.JASPER_TILE_5.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LABRADORITE_SLAB_5 = register("labradorite_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.LABRADORITE_TILE_5.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MICA_SLAB_5 = register("mica_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.MICA_TILE_5.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MOONSTONE_SLAB_5 = register( "moonstone_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.MOONSTONE_TILE_5.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ROSE_QUARTZ_SLAB_5 = register("rose_quartz_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.ROSE_QUARTZ_TILE_5.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> SODALITE_SLAB_5 = register("sodalite_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.SODALITE_TILE_5.get()).hardnessAndResistance(1.5F)));

    //GEM SLABS--TILE 6//
    public static final RegistryObject<Block> AMETHYST_SLAB_6 = register("amethyst_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.AMETHYST_TILE_6.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> AVENTURINE_SLAB_6 = register("aventurine_tile_6_slab" ,
            () ->new SlabBlock(Block.Properties.from(ModBlocks.AVENTURINE_TILE_6.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CARNELIAN_SLAB_6 = register("carnelian_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CARNELIAN_TILE_6.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CHALCOPYRITE_SLAB_6 = register("chalcopyrite_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CHALCOPYRITE_TILE_6.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CITRINE_SLAB_6 = register("citrine_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.CITRINE_TILE_6.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JADE_SLAB_6 = register("jade_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.JADE_TILE_6.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JASPER_SLAB_6 = register("jasper_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.JASPER_TILE_6.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LABRADORITE_SLAB_6 = register("labradorite_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.LABRADORITE_TILE_6.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MICA_SLAB_6 = register("mica_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.MICA_TILE_6.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MOONSTONE_SLAB_6 = register( "moonstone_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.MOONSTONE_TILE_6.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ROSE_QUARTZ_SLAB_6 = register("rose_quartz_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.ROSE_QUARTZ_TILE_6.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> SODALITE_SLAB_6 = register("sodalite_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.SODALITE_TILE_6.get()).hardnessAndResistance(1.5F)));

    //SLABS--CLAY//
    public static final RegistryObject<Block> RED_CLAY_SLAB = register( "red_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.RED_CLAY_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ORANGE_CLAY_SLAB = register("orange_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.ORANGE_CLAY_BLOCK.get()).hardnessAndResistance(1.5F)));


    public static final RegistryObject<Block> YELLOW_CLAY_SLAB = register("yellow_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.YELLOW_CLAY_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIME_CLAY_SLAB = register("lime_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.LIME_CLAY_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> GREEN_CLAY_SLAB = register("green_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.GREEN_CLAY_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CYAN_CLAY_SLAB = register("cyan_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.CYAN_CLAY_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIGHT_BLUE_CLAY_SLAB = register("light_blue_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.LIGHT_BLUE_CLAY_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BLUE_CLAY_SLAB = register("blue_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.BLUE_CLAY_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PURPLE_CLAY_SLAB = register("purple_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.PURPLE_CLAY_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MAGENTA_CLAY_SLAB = register("magenta_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.MAGENTA_CLAY_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PINK_CLAY_SLAB = register("pink_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.PINK_CLAY_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> WHITE_CLAY_SLAB = register("white_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.WHITE_CLAY_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIGHT_GRAY_CLAY_SLAB = register("light_gray_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.LIGHT_GRAY_CLAY_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> GRAY_CLAY_SLAB = register("gray_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.GRAY_CLAY_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BLACK_CLAY_SLAB_ = register("black_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.BLACK_CLAY_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BROWN_CLAY_SLAB_ = register("brown_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.BROWN_CLAY_BLOCK.get()).hardnessAndResistance(1.5F)));

    //SLABS--BRICK//
    public static final RegistryObject<Block> RED_BRICK_SLAB_ = register( "red_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.RED_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ORANGE_BRICK_SLAB_ = register("orange_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.ORANGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));


    public static final RegistryObject<Block> YELLOW_BRICK_SLAB_ = register("yellow_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.YELLOW_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIME_BRICK_SLAB_ = register("lime_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.LIME_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> GREEN_BRICK_SLAB_ = register("green_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.GREEN_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CYAN_BRICK_SLAB_ = register("cyan_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.CYAN_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_SLAB_ = register("light_blue_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.LIGHT_BLUE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BLUE_BRICK_SLAB_ = register("blue_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.BLUE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PURPLE_BRICK_SLAB_ = register("purple_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.PURPLE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MAGENTA_BRICK_SLAB_ = register("magenta_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.MAGENTA_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PINK_BRICK_SLAB_ = register("pink_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.PINK_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> WHITE_BRICK_SLAB_ = register("white_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.WHITE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_SLAB_ = register("light_gray_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.LIGHT_GRAY_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> GRAY_BRICK_SLAB_ = register("gray_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.GRAY_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BLACK_BRICK_SLAB_ = register("black_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.BLACK_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BROWN_BRICK_SLAB_ = register("brown_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.BROWN_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));


    //SLABS--LARGE BRICK//
    public static final RegistryObject<Block> RED_LARGE_BRICK_SLAB_ = register( "red_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.RED_LARGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ORANGE_LARGE_BRICK_SLAB_ = register("orange_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.ORANGE_LARGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));


    public static final RegistryObject<Block> YELLOW_LARGE_BRICK_SLAB_ = register("yellow_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.YELLOW_LARGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIME_LARGE_BRICK_SLAB_ = register("lime_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.LIME_LARGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> GREEN_LARGE_BRICK_SLAB_ = register("green_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.GREEN_LARGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CYAN_LARGE_BRICK_SLAB_ = register("cyan_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.CYAN_LARGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIGHT_BLUE_LARGE_BRICK_SLAB_ = register("light_blue_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.LIGHT_BLUE_LARGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BLUE_LARGE_BRICK_SLAB_ = register("blue_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.BLUE_LARGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PURPLE_LARGE_BRICK_SLAB_ = register("purple_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.PURPLE_LARGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MAGENTA_LARGE_BRICK_SLAB_ = register("magenta_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.MAGENTA_LARGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PINK_LARGE_BRICK_SLAB_ = register("pink_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.PINK_LARGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> WHITE_LARGE_BRICK_SLAB_ = register("white_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.WHITE_LARGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIGHT_GRAY_LargeBRICK_SLAB_ = register("light_gray_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.LIGHT_GRAY_LARGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> GRAY_LARGE_BRICK_SLAB_ = register("gray_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.GRAY_LARGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BLACK_LARGE_BRICK_SLAB_ = register("black_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.BLACK_LARGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BROWN_LARGE_BRICK_SLAB_ = register("brown_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.BROWN_LARGE_BRICK_BLOCK.get()).hardnessAndResistance(1.5F)));

    //SLABS--WOOD//
    public static final RegistryObject<Block> CRABAPPLE_SLAB_ = register( "crabapple_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.CRABAPPLE_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> POINCIANA_SLAB_ = register("poinciana_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.POINCIANA_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LABURNUM_SLAB_ = register("laburnum_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.LABURNUM_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JADE_SLAB_ = register("jade_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.JADE_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PAULOWNIA_SLAB_ = register("paulownia_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.PAULOWNIA_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> WISTERIA_SLAB_ = register("wisteria_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.WISTERIA_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JACARANDA_SLAB_ = register("jacaranda_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.JACARANDA_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> DOGWOOD_SLAB_ = register("dogwood_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.DOGWOOD_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> SILVERBELL_SLAB_ = register("silverbell_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.SILVERBELL_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CEDAR_SLAB_ = register("cedar_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.CEDAR_PLANKS.get()).hardnessAndResistance(1.5F)));

    //SLABS--STAINED//
    public static final RegistryObject<Block> RED_STAINED_SLAB_ = register( "red_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.RED_STAINED_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ORANGE_STAINED_SLAB_ = register("orange_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.ORANGE_STAINED_PLANKS.get()).hardnessAndResistance(1.5F)));


    public static final RegistryObject<Block> YELLOW_STAINED_SLAB_ = register("yellow_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.YELLOW_STAINED_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIME_STAINED_SLAB_ = register("lime_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.LIME_STAINED_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> GREEN_STAINED_SLAB_ = register("green_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.GREEN_STAINED_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CYAN_STAINED_SLAB_ = register("cyan_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.CYAN_STAINED_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_SLAB_ = register("light_blue_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BLUE_STAINED_SLAB_ = register("blue_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.BLUE_STAINED_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PURPLE_STAINED_SLAB_ = register("purple_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.PURPLE_STAINED_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_SLAB_ = register("magenta_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.MAGENTA_STAINED_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PINK_STAINED_SLAB_ = register("pink_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.PINK_STAINED_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> WHITE_STAINED_SLAB_ = register("white_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.WHITE_STAINED_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_SLAB_ = register("light_gray_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> GRAY_STAINED_SLAB_ = register("gray_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.GRAY_STAINED_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BLACK_STAINED_SLAB_ = register("black_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.BLACK_STAINED_PLANKS.get()).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BROWN_STAINED_SLAB_ = register("brown_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.BROWN_STAINED_PLANKS.get()).hardnessAndResistance(1.5F)));

    //STAIRS--WOOD--STAINED//
    public static final RegistryObject<Block> CRABAPPLE_STAIRS = register( "crabapple_stairs",
            () -> new StairsBlock(() -> ModBlocks.CRABAPPLE_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> POINCIANA_STAIRS = register( "poinciana_stairs",
            () -> new StairsBlock(() -> ModBlocks.POINCIANA_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LABURNUM_STAIRS = register( "laburnum_stairs",
            () -> new StairsBlock(() -> ModBlocks.LABURNUM_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JADE_STAIRS = register( "jade_stairs",
            () -> new StairsBlock(() -> ModBlocks.JADE_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PAULOWNIA_STAIRS = register( "paulownia_stairs",
            () -> new StairsBlock(() -> ModBlocks.PAULOWNIA_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> WISTERIA_STAIRS = register( "wisteria_stairs",
            () -> new StairsBlock(() -> ModBlocks.WISTERIA_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JACARANDA_STAIRS = register( "jacaranda_stairs",
            () -> new StairsBlock(() -> ModBlocks.JACARANDA_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> DOGWOOD_STAIRS = register( "dogwood_stairs",
            () -> new StairsBlock(() -> ModBlocks.DOGWOOD_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> SILVERBELL_STAIRS = register( "silverbell_stairs",
            () -> new StairsBlock(() -> ModBlocks.SILVERBELL_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CEDAR_STAIRS = register( "cedar_stairs",
            () -> new StairsBlock(() -> ModBlocks.CEDAR_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    //STAIRS//


    //GEM STAIRS--TILE 1//
    public static final RegistryObject<Block> AMETHYST_STAIRS_1 = register("amethyst_tile_1_stairs",
            () ->new StairsBlock( ()->ModBlocks.AMETHYST_TILE_1.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> AVENTURINE_STAIRS_1 = register("aventurine_tile_1_stairs" ,
            () ->new StairsBlock( ()->ModBlocks.AVENTURINE_TILE_1.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CARNELIAN_STAIRS_1 = register("carnelian_tile_1_stairs",
            () ->new StairsBlock( ()->ModBlocks.CARNELIAN_TILE_1.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CHALCOPYRITE_STAIRS_1 = register("chalcopyrite_tile_1_stairs",
            () ->new StairsBlock( ()->ModBlocks.CHALCOPYRITE_TILE_1.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CITRINE_STAIRS_1 = register("citrine_tile_1_stairs",
            () ->new StairsBlock( ()->ModBlocks.CITRINE_TILE_1.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JADE_STAIRS_1 = register("jade_tile_1_stairs",
            () ->new StairsBlock( ()->ModBlocks.JADE_TILE_1.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JASPER_STAIRS_1 = register("jasper_tile_1_stairs",
            () ->new StairsBlock( ()->ModBlocks.JASPER_TILE_1.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LABRADORITE_STAIRS_1 = register("labradorite_tile_1_stairs",
            () ->new StairsBlock( ()->ModBlocks.LABRADORITE_TILE_1.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MICA_STAIRS_1 = register("mica_tile_1_stairs",
            () ->new StairsBlock( ()->ModBlocks.MICA_TILE_1.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MOONSTONE_STAIRS_1 = register( "moonstone_tile_1_stairs",
            () ->new StairsBlock( ()->ModBlocks.MOONSTONE_TILE_1.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ROSE_QUARTZ_STAIRS_1 = register("rose_quartz_tile_1_stairs",
            () ->new StairsBlock( ()->ModBlocks.ROSE_QUARTZ_TILE_1.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> SODALITE_STAIRS_1 = register("sodalite_tile_1_stairs",
            () ->new StairsBlock( ()->ModBlocks.SODALITE_TILE_1.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    //GEM STAIRS--TILE 2//
    public static final RegistryObject<Block> AMETHYST_STAIRS_2 = register("amethyst_tile_2_stairs",
            () ->new StairsBlock( ()->ModBlocks.AMETHYST_TILE_2.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> AVENTURINE_STAIRS_2 = register("aventurine_tile_2_stairs" ,
            () ->new StairsBlock( ()->ModBlocks.AVENTURINE_TILE_2.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CARNELIAN_STAIRS_2 = register("carnelian_tile_2_stairs",
            () ->new StairsBlock( ()->ModBlocks.CARNELIAN_TILE_2.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CHALCOPYRITE_STAIRS_2 = register("chalcopyrite_tile_2_stairs",
            () ->new StairsBlock( ()->ModBlocks.CHALCOPYRITE_TILE_2.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CITRINE_STAIRS_2 = register("citrine_tile_2_stairs",
            () ->new StairsBlock( ()->ModBlocks.CITRINE_TILE_2.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JADE_STAIRS_2 = register("jade_tile_2_stairs",
            () ->new StairsBlock( ()->ModBlocks.JADE_TILE_2.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JASPER_STAIRS_2 = register("jasper_tile_2_stairs",
            () ->new StairsBlock( ()->ModBlocks.JASPER_TILE_2.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LABRADORITE_STAIRS_2 = register("labradorite_tile_2_stairs",
            () ->new StairsBlock( ()->ModBlocks.LABRADORITE_TILE_2.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MICA_STAIRS_2 = register("mica_tile_2_stairs",
            () ->new StairsBlock( ()->ModBlocks.MICA_TILE_2.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MOONSTONE_STAIRS_2 = register( "moonstone_tile_2_stairs",
            () ->new StairsBlock( ()->ModBlocks.MOONSTONE_TILE_2.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ROSE_QUARTZ_STAIRS_2 = register("rose_quartz_tile_2_stairs",
            () ->new StairsBlock( ()->ModBlocks.ROSE_QUARTZ_TILE_2.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> SODALITE_STAIRS_2 = register("sodalite_tile_2_stairs",
            () ->new StairsBlock( ()->ModBlocks.SODALITE_TILE_2.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    //GEM STAIRS--TILE 3//
    public static final RegistryObject<Block> AMETHYST_STAIRS_3 = register("amethyst_tile_3_stairs",
            () ->new StairsBlock( ()->ModBlocks.AMETHYST_TILE_3.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> AVENTURINE_STAIRS_3 = register("aventurine_tile_3_stairs" ,
            () ->new StairsBlock( ()->ModBlocks.AVENTURINE_TILE_3.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CARNELIAN_STAIRS_3 = register("carnelian_tile_3_stairs",
            () ->new StairsBlock( ()->ModBlocks.CARNELIAN_TILE_3.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CHALCOPYRITE_STAIRS_3 = register("chalcopyrite_tile_3_stairs",
            () ->new StairsBlock( ()->ModBlocks.CHALCOPYRITE_TILE_3.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CITRINE_STAIRS_3 = register("citrine_tile_3_stairs",
            () ->new StairsBlock( ()->ModBlocks.CITRINE_TILE_3.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JADE_STAIRS_3 = register("jade_tile_3_stairs",
            () ->new StairsBlock( ()->ModBlocks.JADE_TILE_3.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JASPER_STAIRS_3 = register("jasper_tile_3_stairs",
            () ->new StairsBlock( ()->ModBlocks.JASPER_TILE_3.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LABRADORITE_STAIRS_3 = register("labradorite_tile_3_stairs",
            () ->new StairsBlock( ()->ModBlocks.LABRADORITE_TILE_3.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MICA_STAIRS_3 = register("mica_tile_3_stairs",
            () ->new StairsBlock( ()->ModBlocks.MICA_TILE_3.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MOONSTONE_STAIRS_3 = register( "moonstone_tile_3_stairs",
            () ->new StairsBlock( ()->ModBlocks.MOONSTONE_TILE_3.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ROSE_QUARTZ_STAIRS_3 = register("rose_quartz_tile_3_stairs",
            () ->new StairsBlock( ()->ModBlocks.ROSE_QUARTZ_TILE_3.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> SODALITE_STAIRS_3 = register("sodalite_tile_3_stairs",
            () ->new StairsBlock( ()->ModBlocks.SODALITE_TILE_3.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    //GEM STAIRS--TILE 4//
    public static final RegistryObject<Block> AMETHYST_STAIRS_4 = register("amethyst_tile_4_stairs",
            () ->new StairsBlock( ()->ModBlocks.AMETHYST_TILE_4.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> AVENTURINE_STAIRS_4 = register("aventurine_tile_4_stairs" ,
            () ->new StairsBlock( ()->ModBlocks.AVENTURINE_TILE_4.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CARNELIAN_STAIRS_4 = register("carnelian_tile_4_stairs",
            () ->new StairsBlock( ()->ModBlocks.CARNELIAN_TILE_4.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CHALCOPYRITE_STAIRS_4 = register("chalcopyrite_tile_4_stairs",
            () ->new StairsBlock( ()->ModBlocks.CHALCOPYRITE_TILE_4.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CITRINE_STAIRS_4 = register("citrine_tile_4_stairs",
            () ->new StairsBlock( ()->ModBlocks.CITRINE_TILE_4.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JADE_STAIRS_4 = register("jade_tile_4_stairs",
            () ->new StairsBlock( ()->ModBlocks.JADE_TILE_4.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JASPER_STAIRS_4 = register("jasper_tile_4_stairs",
            () ->new StairsBlock( ()->ModBlocks.JASPER_TILE_4.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LABRADORITE_STAIRS_4 = register("labradorite_tile_4_stairs",
            () ->new StairsBlock( ()->ModBlocks.LABRADORITE_TILE_4.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MICA_STAIRS_4 = register("mica_tile_4_stairs",
            () ->new StairsBlock( ()->ModBlocks.MICA_TILE_4.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MOONSTONE_STAIRS_4 = register( "moonstone_tile_4_stairs",
            () ->new StairsBlock( ()->ModBlocks.MOONSTONE_TILE_4.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ROSE_QUARTZ_STAIRS_4 = register("rose_quartz_tile_4_stairs",
            () ->new StairsBlock( ()->ModBlocks.ROSE_QUARTZ_TILE_4.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> SODALITE_STAIRS_4 = register("sodalite_tile_4_stairs",
            () ->new StairsBlock( ()->ModBlocks.SODALITE_TILE_4.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    //GEM STAIRS--TILE 5//
    public static final RegistryObject<Block> AMETHYST_STAIRS_5 = register("amethyst_tile_5_stairs",
            () ->new StairsBlock( ()->ModBlocks.AMETHYST_TILE_5.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> AVENTURINE_STAIRS_5 = register("aventurine_tile_5_stairs" ,
            () ->new StairsBlock( ()->ModBlocks.AVENTURINE_TILE_5.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CARNELIAN_STAIRS_5 = register("carnelian_tile_5_stairs",
            () ->new StairsBlock( ()->ModBlocks.CARNELIAN_TILE_5.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CHALCOPYRITE_STAIRS_5 = register("chalcopyrite_tile_5_stairs",
            () ->new StairsBlock( ()->ModBlocks.CHALCOPYRITE_TILE_5.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CITRINE_STAIRS_5 = register("citrine_tile_5_stairs",
            () ->new StairsBlock( ()->ModBlocks.CITRINE_TILE_5.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JADE_STAIRS_5 = register("jade_tile_5_stairs",
            () ->new StairsBlock( ()->ModBlocks.JADE_TILE_5.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JASPER_STAIRS_5 = register("jasper_tile_5_stairs",
            () ->new StairsBlock( ()->ModBlocks.JASPER_TILE_5.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LABRADORITE_STAIRS_5 = register("labradorite_tile_5_stairs",
            () ->new StairsBlock( ()->ModBlocks.LABRADORITE_TILE_5.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MICA_STAIRS_5 = register("mica_tile_5_stairs",
            () ->new StairsBlock( ()->ModBlocks.MICA_TILE_5.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MOONSTONE_STAIRS_5 = register( "moonstone_tile_5_stairs",
            () ->new StairsBlock( ()->ModBlocks.MOONSTONE_TILE_5.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ROSE_QUARTZ_STAIRS_5 = register("rose_quartz_tile_5_stairs",
            () ->new StairsBlock( ()->ModBlocks.ROSE_QUARTZ_TILE_5.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> SODALITE_STAIRS_5 = register("sodalite_tile_5_stairs",
            () ->new StairsBlock( ()->ModBlocks.SODALITE_TILE_5.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    //GEM STAIRS--TILE 6//
    public static final RegistryObject<Block> AMETHYST_STAIRS_6 = register("amethyst_tile_6_stairs",
            () ->new StairsBlock( ()->ModBlocks.AMETHYST_TILE_6.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> AVENTURINE_STAIRS_6 = register("aventurine_tile_6_stairs" ,
            () ->new StairsBlock( ()->ModBlocks.AVENTURINE_TILE_6.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CARNELIAN_STAIRS_6 = register("carnelian_tile_6_stairs",
            () ->new StairsBlock( ()->ModBlocks.CARNELIAN_TILE_6.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CHALCOPYRITE_STAIRS_6 = register("chalcopyrite_tile_6_stairs",
            () ->new StairsBlock( ()->ModBlocks.CHALCOPYRITE_TILE_6.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CITRINE_STAIRS_6 = register("citrine_tile_6_stairs",
            () ->new StairsBlock( ()->ModBlocks.CITRINE_TILE_6.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JADE_STAIRS_6 = register("jade_tile_6_stairs",
            () ->new StairsBlock( ()->ModBlocks.JADE_TILE_6.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> JASPER_STAIRS_6 = register("jasper_tile_6_stairs",
            () ->new StairsBlock( ()->ModBlocks.JASPER_TILE_6.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LABRADORITE_STAIRS_6 = register("labradorite_tile_6_stairs",
            () ->new StairsBlock( ()->ModBlocks.LABRADORITE_TILE_6.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MICA_STAIRS_6 = register("mica_tile_6_stairs",
            () ->new StairsBlock( ()->ModBlocks.MICA_TILE_6.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MOONSTONE_STAIRS_6 = register( "moonstone_tile_6_stairs",
            () ->new StairsBlock( ()->ModBlocks.MOONSTONE_TILE_6.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ROSE_QUARTZ_STAIRS_6 = register("rose_quartz_tile_6_stairs",
            () ->new StairsBlock( ()->ModBlocks.ROSE_QUARTZ_TILE_6.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> SODALITE_STAIRS_6 = register("sodalite_tile_6_stairs",
            () ->new StairsBlock( ()->ModBlocks.SODALITE_TILE_6.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    //STAIRS--CLAY//
    public static final RegistryObject<Block> RED_CLAY_STAIRS = register( "red_clay_stairs",
            () -> new StairsBlock( ()->ModBlocks.RED_CLAY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ORANGE_CLAY_STAIRS = register("orange_clay_stairs",
            () -> new StairsBlock( ()->ModBlocks.ORANGE_CLAY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));


    public static final RegistryObject<Block> YELLOW_CLAY_STAIRS = register("yellow_clay_stairs",
            () -> new StairsBlock( ()->ModBlocks.YELLOW_CLAY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIME_CLAY_STAIRS = register("lime_clay_stairs",
            () -> new StairsBlock( ()->ModBlocks.LIME_CLAY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> GREEN_CLAY_STAIRS = register("green_clay_stairs",
            () -> new StairsBlock( ()->ModBlocks.GREEN_CLAY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CYAN_CLAY_STAIRS = register("cyan_clay_stairs",
            () -> new StairsBlock( ()->ModBlocks.CYAN_CLAY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIGHT_BLUE_CLAY_STAIRS = register("light_blue_clay_stairs",
            () -> new StairsBlock( ()->ModBlocks.LIGHT_BLUE_CLAY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BLUE_CLAY_STAIRS = register("blue_clay_stairs",
            () -> new StairsBlock( ()->ModBlocks.BLUE_CLAY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PURPLE_CLAY_STAIRS = register("purple_clay_stairs",
            () -> new StairsBlock( ()->ModBlocks.PURPLE_CLAY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MAGENTA_CLAY_STAIRS = register("magenta_clay_stairs",
            () -> new StairsBlock( ()->ModBlocks.MAGENTA_CLAY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PINK_CLAY_STAIRS = register("pink_clay_stairs",
            () -> new StairsBlock( ()->ModBlocks.PINK_CLAY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> WHITE_CLAY_STAIRS = register("white_clay_stairs",
            () -> new StairsBlock( ()->ModBlocks.WHITE_CLAY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIGHT_GRAY_CLAY_STAIRS = register("light_gray_clay_stairs",
            () -> new StairsBlock( ()->ModBlocks.LIGHT_GRAY_CLAY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> GRAY_CLAY_STAIRS = register("gray_clay_stairs",
            () -> new StairsBlock( ()->ModBlocks.GRAY_CLAY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BLACK_CLAY_STAIRS_ = register("black_clay_stairs",
            () -> new StairsBlock( ()->ModBlocks.BLACK_CLAY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BROWN_CLAY_STAIRS_ = register("brown_clay_stairs",
            () -> new StairsBlock( ()->ModBlocks.BROWN_CLAY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    //STAIRS--BRICK//
    public static final RegistryObject<Block> RED_BRICK_STAIRS_ = register( "red_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.RED_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ORANGE_BRICK_STAIRS_ = register("orange_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.ORANGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));


    public static final RegistryObject<Block> YELLOW_BRICK_STAIRS_ = register("yellow_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.YELLOW_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIME_BRICK_STAIRS_ = register("lime_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.LIME_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> GREEN_BRICK_STAIRS_ = register("green_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.GREEN_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CYAN_BRICK_STAIRS_ = register("cyan_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.CYAN_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_STAIRS_ = register("light_blue_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.LIGHT_BLUE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BLUE_BRICK_STAIRS_ = register("blue_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.BLUE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PURPLE_BRICK_STAIRS_ = register("purple_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.PURPLE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MAGENTA_BRICK_STAIRS_ = register("magenta_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.MAGENTA_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PINK_BRICK_STAIRS_ = register("pink_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.PINK_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> WHITE_BRICK_STAIRS_ = register("white_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.WHITE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_STAIRS_ = register("light_gray_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.LIGHT_GRAY_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> GRAY_BRICK_STAIRS_ = register("gray_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.GRAY_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BLACK_BRICK_STAIRS_ = register("black_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.BLACK_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BROWN_BRICK_STAIRS_ = register("brown_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.BROWN_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));


    //STAIRS--LARGE BRICK//
    public static final RegistryObject<Block> RED_LARGE_BRICK_STAIRS_ = register( "red_large_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.RED_LARGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ORANGE_LARGE_BRICK_STAIRS_ = register("orange_large_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.ORANGE_LARGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));


    public static final RegistryObject<Block> YELLOW_LARGE_BRICK_STAIRS_ = register("yellow_large_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.YELLOW_LARGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIME_LARGE_BRICK_STAIRS_ = register("lime_large_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.LIME_LARGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> GREEN_LARGE_BRICK_STAIRS_ = register("green_large_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.GREEN_LARGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CYAN_LARGE_BRICK_STAIRS_ = register("cyan_large_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.CYAN_LARGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIGHT_BLUE_LARGE_BRICK_STAIRS_ = register("light_blue_large_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.LIGHT_BLUE_LARGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BLUE_LARGE_BRICK_STAIRS_ = register("blue_large_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.BLUE_LARGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PURPLE_LARGE_BRICK_STAIRS_ = register("purple_large_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.PURPLE_LARGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MAGENTA_LARGE_BRICK_STAIRS_ = register("magenta_large_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.MAGENTA_LARGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PINK_LARGE_BRICK_STAIRS_ = register("pink_large_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.PINK_LARGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> WHITE_LARGE_BRICK_STAIRS_ = register("white_large_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.WHITE_LARGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIGHT_GRAY_LargeBRICK_STAIRS_ = register("light_gray_large_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.LIGHT_GRAY_LARGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> GRAY_LARGE_BRICK_STAIRS_ = register("gray_large_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.GRAY_LARGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BLACK_LARGE_BRICK_STAIRS_ = register("black_large_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.BLACK_LARGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BROWN_LARGE_BRICK_STAIRS_ = register("brown_large_brick_stairs",
            () -> new StairsBlock( ()->ModBlocks.BROWN_LARGE_BRICK_BLOCK.get().getDefaultState(), Block.Properties.create(Material.CLAY).hardnessAndResistance(1.5F)));



    //STAIRS--STAINED//
    public static final RegistryObject<Block> RED_STAINED_STAIRS_ = register( "red_stained_stairs",
            () -> new StairsBlock( ()->ModBlocks.RED_STAINED_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> ORANGE_STAINED_STAIRS_ = register("orange_stained_stairs",
            () -> new StairsBlock( ()->ModBlocks.ORANGE_STAINED_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));


    public static final RegistryObject<Block> YELLOW_STAINED_STAIRS_ = register("yellow_stained_stairs",
            () -> new StairsBlock( ()->ModBlocks.YELLOW_STAINED_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIME_STAINED_STAIRS_ = register("lime_stained_stairs",
            () -> new StairsBlock( ()->ModBlocks.LIME_STAINED_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> GREEN_STAINED_STAIRS_ = register("green_stained_stairs",
            () -> new StairsBlock( ()->ModBlocks.GREEN_STAINED_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> CYAN_STAINED_STAIRS_ = register("cyan_stained_stairs",
            () -> new StairsBlock( ()->ModBlocks.CYAN_STAINED_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_STAIRS_ = register("light_blue_stained_stairs",
            () -> new StairsBlock( ()->ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BLUE_STAINED_STAIRS_ = register("blue_stained_stairs",
            () -> new StairsBlock( ()->ModBlocks.BLUE_STAINED_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PURPLE_STAINED_STAIRS_ = register("purple_stained_stairs",
            () -> new StairsBlock( ()->ModBlocks.PURPLE_STAINED_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_STAIRS_ = register("magenta_stained_stairs",
            () -> new StairsBlock( ()->ModBlocks.MAGENTA_STAINED_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> PINK_STAINED_STAIRS_ = register("pink_stained_stairs",
            () -> new StairsBlock( ()->ModBlocks.PINK_STAINED_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> WHITE_STAINED_STAIRS_ = register("white_stained_stairs",
            () -> new StairsBlock( ()->ModBlocks.WHITE_STAINED_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_STAIRS_ = register("light_gray_stained_stairs",
            () -> new StairsBlock( ()->ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> GRAY_STAINED_STAIRS_ = register("gray_stained_stairs",
            () -> new StairsBlock( ()->ModBlocks.GRAY_STAINED_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BLACK_STAINED_STAIRS_ = register("black_stained_stairs",
            () -> new StairsBlock( ()->ModBlocks.BLACK_STAINED_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> BROWN_STAINED_STAIRS_ = register("brown_stained_stairs",
            () -> new StairsBlock( ()->ModBlocks.BROWN_STAINED_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F)));

    //BOOKSHELVES--TREES//
    public static final RegistryObject<Block>  CRABAPPLE_BOOKSHELF = register("crabapple_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   POINCIANA_BOOKSHELF = register( "poinciana_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   LABURNUM_BOOKSHELF = register("laburnum_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>  JADE_BOOKSHELF = register("jade_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   PAULOWNIA_BOOKSHELF = register("paulownia_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   WISTERIA_BOOKSHELF = register("wisteria_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   JACARANDA_BOOKSHELF = register("jacaranda_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   DOGWOOD_BOOKSHELF = register("dogwood_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   SILVERBELL_BOOKSHELF = register("silverbell_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   CEDAR_BOOKSHELF = register("cedar_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    //BOOKSHELVES--TREES//
    public static final RegistryObject<Block>  BIRCH_BOOKSHELF = register("birch_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   OAK_BOOKSHELF = register( "oak_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   SPRUCE_BOOKSHELF = register("spruce_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>  DARK_OAK_BOOKSHELF = register("dark_oak_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   ACACIA_BOOKSHELF = register("acacia_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   JUNGLE_BOOKSHELF = register("jungle_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   WARPED_BOOKSHELF = register("warped_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   CRIMSON_BOOKSHELF = register("crimson_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));



    //BOOKSHELVES--STAINED//
    public static final RegistryObject<Block> RED_STAINED_BOOKSHELF = register(  "red_stained_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_STAINED_BOOKSHELF = register(  "orange_stained_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_STAINED_BOOKSHELF = register(  "yellow_stained_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIME_STAINED_BOOKSHELF = register(  "lime_stained_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GREEN_STAINED_BOOKSHELF = register(  "green_stained_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CYAN_STAINED_BOOKSHELF = register(  "cyan_stained_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BOOKSHELF = register(  "light_blue_stained_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLUE_STAINED_BOOKSHELF = register(  "blue_stained_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_STAINED_BOOKSHELF = register(  "purple_stained_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_BOOKSHELF = register(  "magenta_stained_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PINK_STAINED_BOOKSHELF = register(  "pink_stained_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WHITE_STAINED_BOOKSHELF = register(  "white_stained_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BOOKSHELF = register(  "light_gray_stained_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GRAY_STAINED_BOOKSHELF = register(  "gray_stained_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLACK_STAINED_BOOKSHELF = register(  "black_stained_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BROWN_STAINED_BOOKSHELF = register(  "brown_stained_bookshelf",
            () -> new MaidensBookshelfBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    //FENCES--TREES//
    public static final RegistryObject<Block>  CRABAPPLE_FENCE = register("crabapple_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   POINCIANA_FENCE = register( "poinciana_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   LABURNUM_FENCE = register("laburnum_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>  JADE_FENCE = register("jade_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   PAULOWNIA_FENCE = register("paulownia_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   WISTERIA_FENCE = register("wisteria_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   JACARANDA_FENCE = register("jacaranda_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   DOGWOOD_FENCE = register("dogwood_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   SILVERBELL_FENCE = register("silverbell_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   CEDAR_FENCE = register("cedar_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));


    //FENCES--STAINED//
    public static final RegistryObject<Block> RED_STAINED_FENCE = register(  "red_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_STAINED_FENCE = register(  "orange_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_STAINED_FENCE = register(  "yellow_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIME_STAINED_FENCE = register(  "lime_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GREEN_STAINED_FENCE = register(  "green_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CYAN_STAINED_FENCE = register(  "cyan_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_FENCE = register(  "light_blue_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLUE_STAINED_FENCE = register(  "blue_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_STAINED_FENCE = register(  "purple_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_FENCE = register(  "magenta_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PINK_STAINED_FENCE = register(  "pink_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WHITE_STAINED_FENCE = register(  "white_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_FENCE = register(  "light_gray_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GRAY_STAINED_FENCE = register(  "gray_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLACK_STAINED_FENCE = register(  "black_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BROWN_STAINED_FENCE = register(  "brown_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    //GATES--TREES//
    public static final RegistryObject<Block>  CRABAPPLE_FENCE_GATE = register("crabapple_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   POINCIANA_FENCE_GATE = register( "poinciana_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   LABURNUM_FENCE_GATE = register("laburnum_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>  JADE_FENCE_GATE = register("jade_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   PAULOWNIA_FENCE_GATE = register("paulownia_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   WISTERIA_FENCE_GATE = register("wisteria_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   JACARANDA_FENCE_GATE = register("jacaranda_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   DOGWOOD_FENCE_GATE = register("dogwood_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   SILVERBELL_FENCE_GATE = register("silverbell_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   CEDAR_FENCE_GATE = register("cedar_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));


    //GATES--STAINED//
    public static final RegistryObject<Block> RED_STAINED_FENCE_GATE = register(  "red_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_STAINED_FENCE_GATE = register(  "orange_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_STAINED_FENCE_GATE = register(  "yellow_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIME_STAINED_FENCE_GATE = register(  "lime_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GREEN_STAINED_FENCE_GATE = register(  "green_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CYAN_STAINED_FENCE_GATE = register(  "cyan_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_FENCE_GATE = register(  "light_blue_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLUE_STAINED_FENCE_GATE = register(  "blue_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_STAINED_FENCE_GATE = register(  "purple_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_FENCE_GATE = register(  "magenta_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PINK_STAINED_FENCE_GATE = register(  "pink_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WHITE_STAINED_FENCE_GATE = register(  "white_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_FENCE_GATE = register(  "light_gray_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GRAY_STAINED_FENCE_GATE = register(  "gray_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLACK_STAINED_FENCE_GATE = register(  "black_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BROWN_STAINED_FENCE_GATE = register(  "brown_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    //PRESSURE_PLATES--TREES//
    public static final RegistryObject<Block>  CRABAPPLE_PRESSURE_PLATE = register("crabapple_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   POINCIANA_PRESSURE_PLATE = register( "poinciana_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   LABURNUM_PRESSURE_PLATE = register("laburnum_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>  JADE_PRESSURE_PLATE = register("jade_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   PAULOWNIA_PRESSURE_PLATE = register("paulownia_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   WISTERIA_PRESSURE_PLATE = register("wisteria_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   JACARANDA_PRESSURE_PLATE = register("jacaranda_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   DOGWOOD_PRESSURE_PLATE = register("dogwood_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   SILVERBELL_PRESSURE_PLATE = register("silverbell_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   CEDAR_PRESSURE_PLATE = register("cedar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));


    //PRESSURE_PLATES--STAINED//
    public static final RegistryObject<Block> RED_STAINED_PRESSURE_PLATE = register(  "red_stained_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_STAINED_PRESSURE_PLATE = register(  "orange_stained_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_STAINED_PRESSURE_PLATE = register(  "yellow_stained_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIME_STAINED_PRESSURE_PLATE = register(  "lime_stained_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GREEN_STAINED_PRESSURE_PLATE = register(  "green_stained_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CYAN_STAINED_PRESSURE_PLATE = register(  "cyan_stained_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_PRESSURE_PLATE = register(  "light_blue_stained_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLUE_STAINED_PRESSURE_PLATE = register(  "blue_stained_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_STAINED_PRESSURE_PLATE = register(  "purple_stained_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_PRESSURE_PLATE = register(  "magenta_stained_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PINK_STAINED_PRESSURE_PLATE = register(  "pink_stained_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WHITE_STAINED_PRESSURE_PLATE = register(  "white_stained_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_PRESSURE_PLATE = register(  "light_gray_stained_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GRAY_STAINED_PRESSURE_PLATE = register(  "gray_stained_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLACK_STAINED_PRESSURE_PLATE = register(  "black_stained_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BROWN_STAINED_PRESSURE_PLATE = register(  "brown_stained_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    //BUTTONS--TREES//
    public static final RegistryObject<Block>  CRABAPPLE_BUTTON = register("crabapple_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   POINCIANA_BUTTON = register( "poinciana_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   LABURNUM_BUTTON = register("laburnum_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>  JADE_BUTTON = register("jade_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   PAULOWNIA_BUTTON = register("paulownia_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   WISTERIA_BUTTON = register("wisteria_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   JACARANDA_BUTTON = register("jacaranda_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   DOGWOOD_BUTTON = register("dogwood_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   SILVERBELL_BUTTON = register("silverbell_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   CEDAR_BUTTON = register("cedar_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));


    //BUTTONS--STAINED//
    public static final RegistryObject<Block> RED_STAINED_BUTTON = register(  "red_stained_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_STAINED_BUTTON = register(  "orange_stained_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_STAINED_BUTTON = register(  "yellow_stained_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIME_STAINED_BUTTON = register(  "lime_stained_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GREEN_STAINED_BUTTON = register(  "green_stained_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CYAN_STAINED_BUTTON = register(  "cyan_stained_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BUTTON = register(  "light_blue_stained_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLUE_STAINED_BUTTON = register(  "blue_stained_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_STAINED_BUTTON = register(  "purple_stained_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_BUTTON = register(  "magenta_stained_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PINK_STAINED_BUTTON = register(  "pink_stained_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WHITE_STAINED_BUTTON = register(  "white_stained_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BUTTON = register(  "light_gray_stained_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GRAY_STAINED_BUTTON = register(  "gray_stained_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLACK_STAINED_BUTTON = register(  "black_stained_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BROWN_STAINED_BUTTON = register(  "brown_stained_button",
            () -> new WoodButtonBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)));

    //DOOR_1--TREES//
    public static final RegistryObject<Block>  CRABAPPLE_DOOR_1 = register("crabapple_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   POINCIANA_DOOR_1 = register( "poinciana_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   LABURNUM_DOOR_1 = register("laburnum_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>  JADE_DOOR_1 = register("jade_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   PAULOWNIA_DOOR_1 = register("paulownia_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   WISTERIA_DOOR_1 = register("wisteria_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   JACARANDA_DOOR_1 = register("jacaranda_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   DOGWOOD_DOOR_1 = register("dogwood_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   SILVERBELL_DOOR_1 = register("silverbell_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   CEDAR_DOOR_1 = register("cedar_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ACACIA_DOOR_1 = register("acacia_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> BIRCH_DOOR_1 = register("birch_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> OAK_DOOR_1 = register("oak_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> DARK_OAKDOOR_1 = register("dark_oak_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> SPRUCE_DOOR_1 = register("spruce_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> JUNGLE_DOOR_1 = register("jungle_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));


    public static final RegistryObject<Block>   CRIMSON_DOOR_1 = register("crimson_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   WARPED_DOOR_1 = register("warped_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    //DOOR_1--STAINED//
    public static final RegistryObject<Block> RED_STAINED_DOOR_1 = register(  "red_stained_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_STAINED_DOOR_1 = register(  "orange_stained_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_STAINED_DOOR_1 = register(  "yellow_stained_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIME_STAINED_DOOR_1 = register(  "lime_stained_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GREEN_STAINED_DOOR_1 = register(  "green_stained_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CYAN_STAINED_DOOR_1 = register(  "cyan_stained_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_DOOR_1 = register(  "light_blue_stained_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLUE_STAINED_DOOR_1 = register(  "blue_stained_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_STAINED_DOOR_1 = register(  "purple_stained_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_DOOR_1 = register(  "magenta_stained_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PINK_STAINED_DOOR_1 = register(  "pink_stained_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WHITE_STAINED_DOOR_1 = register(  "white_stained_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_DOOR_1 = register(  "light_gray_stained_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GRAY_STAINED_DOOR_1 = register(  "gray_stained_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLACK_STAINED_DOOR_1 = register(  "black_stained_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BROWN_STAINED_DOOR_1 = register(  "brown_stained_door_1",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    //DOOR_2--TREES//
    public static final RegistryObject<Block>  CRABAPPLE_DOOR_2 = register("crabapple_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   POINCIANA_DOOR_2 = register( "poinciana_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   LABURNUM_DOOR_2 = register("laburnum_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>  JADE_DOOR_2 = register("jade_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   PAULOWNIA_DOOR_2 = register("paulownia_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   WISTERIA_DOOR_2 = register("wisteria_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   JACARANDA_DOOR_2 = register("jacaranda_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   DOGWOOD_DOOR_2 = register("dogwood_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   SILVERBELL_DOOR_2 = register("silverbell_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   CEDAR_DOOR_2 = register("cedar_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ACACIA_DOOR_2 = register("acacia_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> BIRCH_DOOR_2 = register("birch_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> OAK_DOOR_2 = register("oak_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> DARK_OAK_DOOR_2 = register("dark_oak_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> SPRUCE_DOOR_2 = register("spruce_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> JUNGLE_DOOR_2 = register("jungle_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> CRIMSON_DOOR_2 = register("crimson_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WARPED_DOOR_2 = register("warped_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    //DOOR_2--STAINED//
    public static final RegistryObject<Block> RED_STAINED_DOOR_2 = register(  "red_stained_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_STAINED_DOOR_2 = register(  "orange_stained_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_STAINED_DOOR_2 = register(  "yellow_stained_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIME_STAINED_DOOR_2 = register(  "lime_stained_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GREEN_STAINED_DOOR_2 = register(  "green_stained_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CYAN_STAINED_DOOR_2 = register(  "cyan_stained_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_DOOR_2 = register(  "light_blue_stained_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLUE_STAINED_DOOR_2 = register(  "blue_stained_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_STAINED_DOOR_2 = register(  "purple_stained_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_DOOR_2 = register(  "magenta_stained_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PINK_STAINED_DOOR_2 = register(  "pink_stained_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WHITE_STAINED_DOOR_2 = register(  "white_stained_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_DOOR_2 = register(  "light_gray_stained_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GRAY_STAINED_DOOR_2 = register(  "gray_stained_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLACK_STAINED_DOOR_2 = register(  "black_stained_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BROWN_STAINED_DOOR_2 = register(  "brown_stained_door_2",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    //DOOR_3--TREES//
    public static final RegistryObject<Block>  CRABAPPLE_DOOR_3 = register("crabapple_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   POINCIANA_DOOR_3 = register( "poinciana_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   LABURNUM_DOOR_3 = register("laburnum_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>  JADE_DOOR_3 = register("jade_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   PAULOWNIA_DOOR_3 = register("paulownia_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   WISTERIA_DOOR_3 = register("wisteria_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   JACARANDA_DOOR_3 = register("jacaranda_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   DOGWOOD_DOOR_3 = register("dogwood_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   SILVERBELL_DOOR_3 = register("silverbell_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   CEDAR_DOOR_3 = register("cedar_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ACACIA_DOOR_3 = register("acacia_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> BIRCH_DOOR_3 = register("birch_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> OAK_DOOR_3 = register("oak_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> DARK_OAK_DOOR_3 = register("dark_oak_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> SPRUCE_DOOR_3 = register("spruce_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> JUNGLE_DOOR_3 = register("jungle_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> CRIMSON_DOOR_3 = register("crimson_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WARPED_DOOR_3 = register("warped_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));


    //DOOR_3--STAINED//
    public static final RegistryObject<Block> RED_STAINED_DOOR_3 = register(  "red_stained_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_STAINED_DOOR_3 = register(  "orange_stained_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_STAINED_DOOR_3 = register(  "yellow_stained_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIME_STAINED_DOOR_3 = register(  "lime_stained_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GREEN_STAINED_DOOR_3 = register(  "green_stained_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CYAN_STAINED_DOOR_3 = register(  "cyan_stained_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_DOOR_3 = register(  "light_blue_stained_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLUE_STAINED_DOOR_3 = register(  "blue_stained_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_STAINED_DOOR_3 = register(  "purple_stained_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_DOOR_3 = register(  "magenta_stained_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PINK_STAINED_DOOR_3 = register(  "pink_stained_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WHITE_STAINED_DOOR_3 = register(  "white_stained_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_DOOR_3 = register(  "light_gray_stained_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GRAY_STAINED_DOOR_3 = register(  "gray_stained_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLACK_STAINED_DOOR_3 = register(  "black_stained_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BROWN_STAINED_DOOR_3 = register(  "brown_stained_door_3",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    //DOOR_4--TREES//
    public static final RegistryObject<Block>  CRABAPPLE_DOOR_4 = register("crabapple_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   POINCIANA_DOOR_4 = register( "poinciana_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   LABURNUM_DOOR_4 = register("laburnum_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>  JADE_DOOR_4 = register("jade_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   PAULOWNIA_DOOR_4 = register("paulownia_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   WISTERIA_DOOR_4 = register("wisteria_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   JACARANDA_DOOR_4 = register("jacaranda_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   DOGWOOD_DOOR_4 = register("dogwood_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   SILVERBELL_DOOR_4 = register("silverbell_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   CEDAR_DOOR_4 = register("cedar_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ACACIA_DOOR_4 = register("acacia_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> BIRCH_DOOR_4 = register("birch_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> OAK_DOOR_4 = register("oak_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> DARK_OAK_DOOR_4 = register("dark_oak_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> SPRUCE_DOOR_4 = register("spruce_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> JUNGLE_DOOR_4 = register("jungle_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> CRIMSON_DOOR_4 = register("crimson_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WARPED_DOOR_4 = register("warped_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));



    //DOOR_4--STAINED//
    public static final RegistryObject<Block> RED_STAINED_DOOR_4 = register(  "red_stained_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_STAINED_DOOR_4 = register(  "orange_stained_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_STAINED_DOOR_4 = register(  "yellow_stained_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIME_STAINED_DOOR_4 = register(  "lime_stained_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GREEN_STAINED_DOOR_4 = register(  "green_stained_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CYAN_STAINED_DOOR_4 = register(  "cyan_stained_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_DOOR_4 = register(  "light_blue_stained_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLUE_STAINED_DOOR_4 = register(  "blue_stained_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_STAINED_DOOR_4 = register(  "purple_stained_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_DOOR_4 = register(  "magenta_stained_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PINK_STAINED_DOOR_4 = register(  "pink_stained_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WHITE_STAINED_DOOR_4 = register(  "white_stained_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_DOOR_4 = register(  "light_gray_stained_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GRAY_STAINED_DOOR_4 = register(  "gray_stained_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLACK_STAINED_DOOR_4 = register(  "black_stained_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BROWN_STAINED_DOOR_4 = register(  "brown_stained_door_4",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));


    //DOOR_5--TREES//
    public static final RegistryObject<Block> CRABAPPLE_DOOR_5 = register("crabapple_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> POINCIANA_DOOR_5 = register( "poinciana_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LABURNUM_DOOR_5 = register("laburnum_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> JADE_DOOR_5 = register("jade_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PAULOWNIA_DOOR_5 = register("paulownia_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WISTERIA_DOOR_5 = register("wisteria_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> JACARANDA_DOOR_5 = register("jacaranda_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> DOGWOOD_DOOR_5 = register("dogwood_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> SILVERBELL_DOOR_5 = register("silverbell_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CEDAR_DOOR_5 = register("cedar_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ACACIA_DOOR_5 = register("acacia_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> BIRCH_DOOR_5 = register("birch_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> OAK_DOOR_5 = register("oak_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> DARK_OAK_DOOR_5 = register("dark_oak_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> SPRUCE_DOOR_5 = register("spruce_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> JUNGLE_DOOR_5 = register("jungle_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> CRIMSON_DOOR_5 = register("crimson_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WARPED_DOOR_5 = register("warped_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));


    //DOOR_5--STAINED//
    public static final RegistryObject<Block> RED_STAINED_DOOR_5 = register(  "red_stained_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_STAINED_DOOR_5 = register(  "orange_stained_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_STAINED_DOOR_5 = register(  "yellow_stained_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIME_STAINED_DOOR_5 = register(  "lime_stained_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GREEN_STAINED_DOOR_5 = register(  "green_stained_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CYAN_STAINED_DOOR_5 = register(  "cyan_stained_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_DOOR_5 = register(  "light_blue_stained_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLUE_STAINED_DOOR_5 = register(  "blue_stained_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_STAINED_DOOR_5 = register(  "purple_stained_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_DOOR_5 = register(  "magenta_stained_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PINK_STAINED_DOOR_5 = register(  "pink_stained_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WHITE_STAINED_DOOR_5 = register(  "white_stained_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_DOOR_5 = register(  "light_gray_stained_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GRAY_STAINED_DOOR_5 = register(  "gray_stained_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLACK_STAINED_DOOR_5 = register(  "black_stained_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BROWN_STAINED_DOOR_5 = register(  "brown_stained_door_5",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));


    //DOOR_6--TREES//
    public static final RegistryObject<Block> CRABAPPLE_DOOR_6 = register("crabapple_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> POINCIANA_DOOR_6 = register( "poinciana_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LABURNUM_DOOR_6 = register("laburnum_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> JADE_DOOR_6 = register("jade_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PAULOWNIA_DOOR_6 = register("paulownia_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WISTERIA_DOOR_6 = register("wisteria_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> JACARANDA_DOOR_6 = register("jacaranda_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> DOGWOOD_DOOR_6 = register("dogwood_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> SILVERBELL_DOOR_6 = register("silverbell_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CEDAR_DOOR_6 = register("cedar_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ACACIA_DOOR_6 = register("acacia_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> BIRCH_DOOR_6 = register("birch_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> OAK_DOOR_6 = register("oak_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> DARK_OAK_DOOR_6 = register("dark_oak_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> SPRUCE_DOOR_6 = register("spruce_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> JUNGLE_DOOR_6 = register("jungle_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> CRIMSON_DOOR_6 = register("crimson_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WARPED_DOOR_6 = register("warped_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));


    //DOOR_6--STAINED//
    public static final RegistryObject<Block> RED_STAINED_DOOR_6 = register(  "red_stained_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_STAINED_DOOR_6 = register(  "orange_stained_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_STAINED_DOOR_6 = register(  "yellow_stained_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIME_STAINED_DOOR_6 = register(  "lime_stained_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GREEN_STAINED_DOOR_6 = register(  "green_stained_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CYAN_STAINED_DOOR_6 = register(  "cyan_stained_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_DOOR_6 = register(  "light_blue_stained_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLUE_STAINED_DOOR_6 = register(  "blue_stained_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_STAINED_DOOR_6 = register(  "purple_stained_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_DOOR_6 = register(  "magenta_stained_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PINK_STAINED_DOOR_6 = register(  "pink_stained_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WHITE_STAINED_DOOR_6 = register(  "white_stained_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_DOOR_6 = register(  "light_gray_stained_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GRAY_STAINED_DOOR_6 = register(  "gray_stained_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLACK_STAINED_DOOR_6 = register(  "black_stained_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BROWN_STAINED_DOOR_6 = register(  "brown_stained_door_6",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(1.5F, 2.0F)));

    //TRAPDOOR_1--TREES//
    public static final RegistryObject<Block>  CRABAPPLE_TRAPDOOR_1 = register("crabapple_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   POINCIANA_TRAPDOOR_1 = register( "poinciana_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   LABURNUM_TRAPDOOR_1 = register("laburnum_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>  JADE_TRAPDOOR_1 = register("jade_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   PAULOWNIA_TRAPDOOR_1 = register("paulownia_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   WISTERIA_TRAPDOOR_1 = register("wisteria_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   JACARANDA_TRAPDOOR_1 = register("jacaranda_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   DOGWOOD_TRAPDOOR_1 = register("dogwood_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   SILVERBELL_TRAPDOOR_1 = register("silverbell_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   CEDAR_TRAPDOOR_1 = register("cedar_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ACACIA_TRAPDOOR_1 = register("acacia_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> BIRCH_TRAPDOOR_1 = register("birch_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> OAK_TRAPDOOR_1 = register("oak_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> DARK_OAK_TRAPDOOR_1 = register("dark_oak_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> SPRUCE_TRAPDOOR_1 = register("spruce_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> JUNGLE_TRAPDOOR_1 = register("jungle_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> CRIMSON_TRAPDOOR_1 = register("crimson_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WARPED_TRAPDOOR_1 = register("warped_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));


    //TRAPDOOR_1--STAINED//
    public static final RegistryObject<Block> RED_STAINED_TRAPDOOR_1 = register(  "red_stained_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_STAINED_TRAPDOOR_1 = register(  "orange_stained_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_STAINED_TRAPDOOR_1 = register(  "yellow_stained_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIME_STAINED_TRAPDOOR_1 = register(  "lime_stained_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GREEN_STAINED_TRAPDOOR_1 = register(  "green_stained_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CYAN_STAINED_TRAPDOOR_1 = register(  "cyan_stained_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_TRAPDOOR_1 = register(  "light_blue_stained_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLUE_STAINED_TRAPDOOR_1 = register(  "blue_stained_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_STAINED_TRAPDOOR_1 = register(  "purple_stained_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_TRAPDOOR_1 = register(  "magenta_stained_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PINK_STAINED_TRAPDOOR_1 = register(  "pink_stained_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WHITE_STAINED_TRAPDOOR_1 = register(  "white_stained_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_TRAPDOOR_1 = register(  "light_gray_stained_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GRAY_STAINED_TRAPDOOR_1 = register(  "gray_stained_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLACK_STAINED_TRAPDOOR_1 = register(  "black_stained_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BROWN_STAINED_TRAPDOOR_1 = register(  "brown_stained_trapdoor_1",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    //TRAPDOOR_2--TREES//
    public static final RegistryObject<Block>  CRABAPPLE_TRAPDOOR_2 = register("crabapple_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   POINCIANA_TRAPDOOR_2 = register( "poinciana_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   LABURNUM_TRAPDOOR_2 = register("laburnum_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>  JADE_TRAPDOOR_2 = register("jade_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   PAULOWNIA_TRAPDOOR_2 = register("paulownia_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   WISTERIA_TRAPDOOR_2 = register("wisteria_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   JACARANDA_TRAPDOOR_2 = register("jacaranda_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   DOGWOOD_TRAPDOOR_2 = register("dogwood_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   SILVERBELL_TRAPDOOR_2 = register("silverbell_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   CEDAR_TRAPDOOR_2 = register("cedar_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ACACIA_TRAPDOOR_2 = register("acacia_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> BIRCH_TRAPDOOR_2 = register("birch_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> OAK_TRAPDOOR_2 = register("oak_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> DARK_OAK_TRAPDOOR_2 = register("dark_oak_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> SPRUCE_TRAPDOOR_2 = register("spruce_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> JUNGLE_TRAPDOOR_2 = register("jungle_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> CRIMSON_TRAPDOOR_2 = register("crimson_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WARPED_TRAPDOOR_2 = register("warped_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));


    //TRAPDOOR_2--STAINED//
    public static final RegistryObject<Block> RED_STAINED_TRAPDOOR_2 = register(  "red_stained_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_STAINED_TRAPDOOR_2 = register(  "orange_stained_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_STAINED_TRAPDOOR_2 = register(  "yellow_stained_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIME_STAINED_TRAPDOOR_2 = register(  "lime_stained_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GREEN_STAINED_TRAPDOOR_2 = register(  "green_stained_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CYAN_STAINED_TRAPDOOR_2 = register(  "cyan_stained_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_TRAPDOOR_2 = register(  "light_blue_stained_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLUE_STAINED_TRAPDOOR_2 = register(  "blue_stained_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_STAINED_TRAPDOOR_2 = register(  "purple_stained_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_TRAPDOOR_2 = register(  "magenta_stained_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PINK_STAINED_TRAPDOOR_2 = register(  "pink_stained_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WHITE_STAINED_TRAPDOOR_2 = register(  "white_stained_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_TRAPDOOR_2 = register(  "light_gray_stained_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GRAY_STAINED_TRAPDOOR_2 = register(  "gray_stained_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLACK_STAINED_TRAPDOOR_2 = register(  "black_stained_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BROWN_STAINED_TRAPDOOR_2 = register(  "brown_stained_trapdoor_2",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    //TRAPDOOR_3--TREES//
    public static final RegistryObject<Block>  CRABAPPLE_TRAPDOOR_3 = register("crabapple_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   POINCIANA_TRAPDOOR_3 = register( "poinciana_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   LABURNUM_TRAPDOOR_3 = register("laburnum_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>  JADE_TRAPDOOR_3 = register("jade_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   PAULOWNIA_TRAPDOOR_3 = register("paulownia_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   WISTERIA_TRAPDOOR_3 = register("wisteria_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   JACARANDA_TRAPDOOR_3 = register("jacaranda_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   DOGWOOD_TRAPDOOR_3 = register("dogwood_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   SILVERBELL_TRAPDOOR_3 = register("silverbell_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   CEDAR_TRAPDOOR_3 = register("cedar_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ACACIA_TRAPDOOR_3 = register("acacia_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> BIRCH_TRAPDOOR_3 = register("birch_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> OAK_TRAPDOOR_3 = register("oak_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> DARK_OAK_TRAPDOOR_3 = register("dark_oak_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> SPRUCE_TRAPDOOR_3 = register("spruce_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> JUNGLE_TRAPDOOR_3 = register("jungle_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> CRIMSON_TRAPDOOR_3 = register("crimson_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WARPED_TRAPDOOR_3 = register("warped_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    //TRAPDOOR_3--STAINED//
    public static final RegistryObject<Block> RED_STAINED_TRAPDOOR_3 = register(  "red_stained_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_STAINED_TRAPDOOR_3 = register(  "orange_stained_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_STAINED_TRAPDOOR_3 = register(  "yellow_stained_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIME_STAINED_TRAPDOOR_3 = register(  "lime_stained_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GREEN_STAINED_TRAPDOOR_3 = register(  "green_stained_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CYAN_STAINED_TRAPDOOR_3 = register(  "cyan_stained_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_TRAPDOOR_3 = register(  "light_blue_stained_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLUE_STAINED_TRAPDOOR_3 = register(  "blue_stained_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_STAINED_TRAPDOOR_3 = register(  "purple_stained_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_TRAPDOOR_3 = register(  "magenta_stained_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PINK_STAINED_TRAPDOOR_3 = register(  "pink_stained_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WHITE_STAINED_TRAPDOOR_3 = register(  "white_stained_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_TRAPDOOR_3 = register(  "light_gray_stained_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GRAY_STAINED_TRAPDOOR_3 = register(  "gray_stained_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLACK_STAINED_TRAPDOOR_3 = register(  "black_stained_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BROWN_STAINED_TRAPDOOR_3 = register(  "brown_stained_trapdoor_3",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    //TRAPDOOR_4--TREES//
    public static final RegistryObject<Block>  CRABAPPLE_TRAPDOOR_4 = register("crabapple_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   POINCIANA_TRAPDOOR_4 = register( "poinciana_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   LABURNUM_TRAPDOOR_4 = register("laburnum_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>  JADE_TRAPDOOR_4 = register("jade_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   PAULOWNIA_TRAPDOOR_4 = register("paulownia_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   WISTERIA_TRAPDOOR_4 = register("wisteria_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   JACARANDA_TRAPDOOR_4 = register("jacaranda_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   DOGWOOD_TRAPDOOR_4 = register("dogwood_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   SILVERBELL_TRAPDOOR_4 = register("silverbell_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block>   CEDAR_TRAPDOOR_4 = register("cedar_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ACACIA_TRAPDOOR_4 = register("acacia_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> BIRCH_TRAPDOOR_4 = register("birch_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> OAK_TRAPDOOR_4 = register("oak_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> DARK_OAK_TRAPDOOR_4 = register("dark_oak_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> SPRUCE_TRAPDOOR_4 = register("spruce_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> JUNGLE_TRAPDOOR_4 = register("jungle_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> CRIMSON_TRAPDOOR_4 = register("crimson_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WARPED_TRAPDOOR_4 = register("warped_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    //TRAPDOOR_4--STAINED//
    public static final RegistryObject<Block> RED_STAINED_TRAPDOOR_4 = register(  "red_stained_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> ORANGE_STAINED_TRAPDOOR_4 = register(  "orange_stained_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> YELLOW_STAINED_TRAPDOOR_4 = register(  "yellow_stained_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIME_STAINED_TRAPDOOR_4 = register(  "lime_stained_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GREEN_STAINED_TRAPDOOR_4 = register(  "green_stained_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> CYAN_STAINED_TRAPDOOR_4 = register(  "cyan_stained_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_TRAPDOOR_4 = register(  "light_blue_stained_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLUE_STAINED_TRAPDOOR_4 = register(  "blue_stained_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PURPLE_STAINED_TRAPDOOR_4 = register(  "purple_stained_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> MAGENTA_STAINED_TRAPDOOR_4 = register(  "magenta_stained_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> PINK_STAINED_TRAPDOOR_4 = register(  "pink_stained_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> WHITE_STAINED_TRAPDOOR_4 = register(  "white_stained_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_TRAPDOOR_4 = register(  "light_gray_stained_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> GRAY_STAINED_TRAPDOOR_4 = register(  "gray_stained_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BLACK_STAINED_TRAPDOOR_4 = register(  "black_stained_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));

    public static final RegistryObject<Block> BROWN_STAINED_TRAPDOOR_4 = register(  "brown_stained_trapdoor_4",
            () -> new MaidensTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).hardnessAndResistance(1.5F, 2.0F)));



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
            ()-> new PalmLeavesBlock(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f).notSolid().sound(SoundType.PLANT)));

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
            ()-> new OrnamentalSaplingBlock(
                    ()-> new CrabappleTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> POINCIANA_SAPLING = register("poinciana_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new PoincianaTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> LABURNUM_SAPLING = register("laburnum_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new LaburnumTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> JADE_SAPLING = register("jade_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new JadeTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> PAULOWNIA_SAPLING = register("paulownia_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new PaulowniaTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> WISTERIA_SAPLING = register("wisteria_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new WisteriaTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> JACARANDA_SAPLING = register("jacaranda_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new JacarandaTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> DOGWOOD_SAPLING = register("dogwood_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new DogwoodTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> SILVERBELL_SAPLING = register("silverbell_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new SilverbellTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> CEDAR_SAPLING = register("cedar_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new CedarTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

  //TODO
  public static final RegistryObject<SaplingBlock> PALM_SAPLING = register(
          "palm_sapling", ()->  new SaplingBlock(  new ModTreeSelector(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> APPLE_SAPLING = register("apple_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new AppleTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> CHERRY_SAPLING = register("cherry_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new CherryTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> PEACH_SAPLING = register("peach_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new PeachTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> ORANGE_FRUIT_SAPLING = register("orange_fruit_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new OrangeTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> GRAPEFRUIT_SAPLING = register("grapefruit_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new GrapefruitTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> LEMON_SAPLING = register("lemon_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new LemonTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> LIME_SAPLING = register("lime_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new LimeTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> PEAR_SAPLING = register("pear_sapling",
            ()-> new OrnamentalSaplingBlock(
                    ()-> new PearTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING).notSolid()));

    public static final RegistryObject<Block> PLUM_SAPLING = register("plum_sapling",
            ()-> new OrnamentalSaplingBlock(
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
