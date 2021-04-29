package com.maideniles.maidensmaterials.potions;

import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class GatherersGleeEffect extends Effect {
    public GatherersGleeEffect() {
        super(EffectType.BENEFICIAL, 7033103);

        //ADD BLOCKS TO ORE LIST//
        ModBlocks.VALID_BLOCKS.add(Blocks.GLOWSTONE);
        ModBlocks.VALID_BLOCKS.add(Blocks.COAL_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.IRON_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.GOLD_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.EMERALD_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.REDSTONE_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.LAPIS_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.DIAMOND_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.NETHER_QUARTZ_ORE);
        ModBlocks.VALID_BLOCKS.add(ModBlocks.AMETHYST_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.AVENTURINE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.CARNELIAN_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.CHALCOPYRITE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.CITRINE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.JADE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.JASPER_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.LABRADORITE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.MICA_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.MOONSTONE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.ROSE_QUARTZ_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.SODALITE_ORE.get());

        //ADD BLOCKS TO WOOD LIST//
        ModBlocks.VALID_BLOCKS.add(Blocks.ACACIA_LOG);
        ModBlocks.VALID_BLOCKS.add(Blocks.BIRCH_LOG);
        ModBlocks.VALID_BLOCKS.add(Blocks.OAK_LOG);
        ModBlocks.VALID_BLOCKS.add(Blocks.DARK_OAK_LOG);
        ModBlocks.VALID_BLOCKS.add(Blocks.SPRUCE_LOG);
        ModBlocks.VALID_BLOCKS.add(Blocks.JUNGLE_LOG);
        ModBlocks.VALID_BLOCKS.add(ModBlocks.CEDAR_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.CRABAPPLE_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.POINCIANA_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.LABURNUM_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.JADE_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.PAULOWNIA_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.WISTERIA_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.JACARANDA_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.DOGWOOD_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.SILVERBELL_LOG.get());

    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        return duration % 100 == 0;  // preform effect once every 5 seconds
    }
}
