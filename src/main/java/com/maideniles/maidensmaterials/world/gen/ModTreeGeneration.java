package com.maideniles.maidensmaterials.world.gen;


import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModConfiguredFeatures;
import com.maideniles.maidensmaterials.world.feature.tree.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.placement.*;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = MaidensMaterials.MOD_ID)
public class ModTreeGeneration {



    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event)
    {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.MAGICAL))
        {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);



//ADD NORMAL TREES//
           base.add(() -> Feature.TREE.withConfiguration(CedarTree.CEDAR_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
           base.add(() -> Feature.TREE.withConfiguration(CrabappleTree.CRABAPPLE_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(PoincianaTree.POINCIANA_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(LaburnumTree.LABURNUM_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(JadeTree.JADE_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(PaulowniaTree.PAULOWNIA_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(WisteriaTree.WISTERIA_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(JacarandaTree.JACARANDA_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(DogwoodTree.DOGWOOD_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(SilverbellTree.SILVERBELL_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
//ADD VINED TREES//

            base.add(() -> Feature.TREE.withConfiguration(CedarTree.CEDAR_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(CrabappleTree.CRABAPPLE_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(PoincianaTree.POINCIANA_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(LaburnumTree.LABURNUM_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(JadeTree.JADE_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(PaulowniaTree.PAULOWNIA_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(WisteriaTree.WISTERIA_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(JacarandaTree.JACARANDA_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(DogwoodTree.DOGWOOD_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            base.add(() -> Feature.TREE.withConfiguration(SilverbellTree.SILVERBELL_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));



        }
    }
}