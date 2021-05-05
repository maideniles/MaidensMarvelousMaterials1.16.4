package com.maideniles.maidensmaterials.world.gen.ore;

import com.maideniles.maidensmaterials.init.ModBlocks;

import net.minecraft.block.Block;

public enum OreType {

    CITRINE(ModBlocks.CITRINE_ORE.get(), 8,41,60),              //COMMON
    JADE(ModBlocks.JADE_ORE.get(), 8,41,60),                    //COMMON
    JASPER(ModBlocks.JASPER_ORE.get(), 8,41,60),                //COMMON
    MOONSTONE(ModBlocks.MOONSTONE_ORE.get(), 8,41,60),          //COMMON

    AVENTURINE(ModBlocks.AVENTURINE_ORE.get(), 6,21,40),        //UNCCOMMON
    LABRADORITE(ModBlocks.LABRADORITE_ORE.get(), 6,21,40),      //UNCCOMMON
    MICA(ModBlocks.MICA_ORE.get(), 6,21,40),                    //UNCCOMMON
    ROSE_QUARTZ(ModBlocks.ROSE_QUARTZ_ORE.get(), 6,21,40),      //UNCCOMMON

    AMETHYST(ModBlocks.AMETHYST_ORE.get(), 4,0,20),            //RARE
    CARNELIAN(ModBlocks.CARNELIAN_ORE.get(), 4,0,20),          //RARE
    CHALCOPYRITE(ModBlocks.CHALCOPYRITE_ORE.get(), 4,0,20),    //RARE
    SODALITE(ModBlocks.SODALITE_ORE.get(), 4,0,20);            //RARE
    private final Block block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;

    OreType( Block Block , int maxVeinSize, int minHeight, int maxHeight)
    {
        this.block = Block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }


    public Block getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public static OreType get(Block block)
    {
        for(OreType ore : values()){

            if (block == ore.block){
                return ore;
            }
        }
        return null;
    }
}
