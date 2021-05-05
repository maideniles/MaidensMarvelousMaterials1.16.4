package com.maideniles.maidensmaterials.world.gen.ore;

import com.maideniles.maidensmaterials.init.ModBlocks;

import net.minecraft.block.Block;

public enum OreType {
    JASPER(ModBlocks.JASPER_ORE.get(), 8,25,50),
    CARNELIAN(ModBlocks.CARNELIAN_ORE.get(), 8,25,50),
    CITRINE(ModBlocks.CITRINE_ORE.get(), 8,25,50),
    AVENTURINE(ModBlocks.AVENTURINE_ORE.get(), 8,25,50),
    JADE(ModBlocks.JADE_ORE.get(), 8,25,50),
    CHALCOPYRITE(ModBlocks.CHALCOPYRITE_ORE.get(), 8,25,50),
    LABRADORITE(ModBlocks.LABRADORITE_ORE.get(), 8,25,50),
    MOONSTONE(ModBlocks.MOONSTONE_ORE.get(), 8,25,50),
    SODALITE(ModBlocks.SODALITE_ORE.get(), 8,25,50),
    AMETHYST(ModBlocks.AMETHYST_ORE.get(), 8,25,50),
    ROSE_QUARTZ(ModBlocks.ROSE_QUARTZ_ORE.get(), 8,25,50),
    MICA(ModBlocks.MICA_ORE.get(), 8,25,50);





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
