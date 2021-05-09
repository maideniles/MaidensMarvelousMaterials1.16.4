package com.maideniles.maidensmaterials.world.gen.ore;

import com.maideniles.maidensmaterials.init.ModBlocks;

import com.maideniles.maidensmaterials.util.KVP;

import net.minecraft.block.Block;

public enum OreType {

    CITRINE("Citrine", ModBlocks.CITRINE_ORE.get(), 8,41,60),               //COMMON
    JADE("Jade", ModBlocks.JADE_ORE.get(), 8,41,60),                        //COMMON
    JASPER("Jasper", ModBlocks.JASPER_ORE.get(), 8,41,60),                  //COMMON
    MOONSTONE("Moonstone", ModBlocks.MOONSTONE_ORE.get(), 8,41,60),         //COMMON

    AVENTURINE("Aventurine", ModBlocks.AVENTURINE_ORE.get(), 6,21,40),      //UNCCOMMON
    LABRADORITE("Labradorite", ModBlocks.LABRADORITE_ORE.get(), 6,21,40),   //UNCCOMMON
    MICA("Mica", ModBlocks.MICA_ORE.get(), 6,21,40),                        //UNCCOMMON
    ROSE_QUARTZ("Rose Quartz", ModBlocks.ROSE_QUARTZ_ORE.get(), 6,21,40),   //UNCCOMMON

    AMETHYST("Amethyst", ModBlocks.AMETHYST_ORE.get(), 4,0,20),              //RARE
    CARNELIAN("Carnelian", ModBlocks.CARNELIAN_ORE.get(), 4,0,20),           //RARE
    CHALCOPYRITE("Chalcopyrite", ModBlocks.CHALCOPYRITE_ORE.get(), 4,0,20),  //RARE
    SODALITE("Sodalite", ModBlocks.SODALITE_ORE.get(), 4,0,20);              //RARE
    
	private final String name;
	private final Block block;
	
    private int maxVeinSize, minHeight, maxHeight;

    OreType(String name, Block Block , int maxVeinSize, int minHeight, int maxHeight)
    {
		this.name = name;
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

    public String getName(){
        return name;
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

    public static void loadFromConfig(KVP config)
    {
        for(OreType ore : values()){
			ore.maxVeinSize = config.getInteger(ore.name + " max vein size", ore.maxVeinSize);
			ore.minHeight = config.getInteger(ore.name + " min height", ore.minHeight);
			ore.maxHeight = config.getInteger(ore.name + " max height", ore.maxHeight);
        }
    }
}
