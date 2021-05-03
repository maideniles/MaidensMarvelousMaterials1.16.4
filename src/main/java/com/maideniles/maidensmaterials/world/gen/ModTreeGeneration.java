package com.maideniles.maidensmaterials.world.gen;


import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModConfiguredFeatures;
import com.maideniles.maidensmaterials.world.feature.tree.*;
import com.maideniles.maidensmaterials.world.feature.tree.fruit.*;
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
            List<Supplier<ConfiguredFeature<?, ?>>> flowering =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

//ADD FLOWERING TREES TO ORNAMENTAL FOREST BIOME//
           flowering.add(() -> Feature.TREE.withConfiguration(CedarTree.CEDAR_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
           flowering.add(() -> Feature.TREE.withConfiguration(CrabappleTree.CRABAPPLE_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(PoincianaTree.POINCIANA_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(LaburnumTree.LABURNUM_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(JadeTree.JADE_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(PaulowniaTree.PAULOWNIA_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(WisteriaTree.WISTERIA_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(JacarandaTree.JACARANDA_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(DogwoodTree.DOGWOOD_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(SilverbellTree.SILVERBELL_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
//ADD VINED TREES//

            flowering.add(() -> Feature.TREE.withConfiguration(CedarTree.CEDAR_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(CrabappleTree.CRABAPPLE_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(PoincianaTree.POINCIANA_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(LaburnumTree.LABURNUM_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(JadeTree.JADE_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(PaulowniaTree.PAULOWNIA_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(WisteriaTree.WISTERIA_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(JacarandaTree.JACARANDA_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(DogwoodTree.DOGWOOD_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
            flowering.add(() -> Feature.TREE.withConfiguration(SilverbellTree.SILVERBELL_TREE_VINES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

        }
/*/ADD TROPICAL TREES TO TROPICAL BIOME//
        if(types.contains(BiomeDictionary.Type.BEACH)) {
            List<Supplier<ConfiguredFeature<?, ?>>> tropical =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            //NORMAL//
            tropical.add(() -> Feature.TREE.withConfiguration(PalmTree.PALM_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));
//WITH BEES//
            tropical.add(() -> Feature.TREE.withConfiguration(PalmTree.PALM_TREE_BEES_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

        }
*/
        if(types.contains(BiomeDictionary.Type.PLAINS)) {

            List<Supplier<ConfiguredFeature<?, ?>>> orchard =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            orchard.add(() -> Feature.TREE.withConfiguration(AppleTree.APPLE_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

            orchard.add(() -> Feature.TREE.withConfiguration(PearTree.PEAR_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

            orchard.add(() -> Feature.TREE.withConfiguration(PeachTree.PEACH_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

            orchard.add(() -> Feature.TREE.withConfiguration(PlumTree.PLUM_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

            orchard.add(() -> Feature.TREE.withConfiguration(GrapefruitTree.GRAPEFRUIT_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

            orchard.add(() -> Feature.TREE.withConfiguration(OrangeTree.ORANGE_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

            orchard.add(() -> Feature.TREE.withConfiguration(LemonTree.LEMON_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

            orchard.add(() -> Feature.TREE.withConfiguration(LimeTree.LIME_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

            orchard.add(() -> Feature.TREE.withConfiguration(CherryTree.CHERRY_TREE_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));



            orchard.add(() -> Feature.TREE.withConfiguration(AppleTree.APPLE_TREE_BIG_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

            orchard.add(() -> Feature.TREE.withConfiguration(PearTree.PEAR_TREE_BIG_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

            orchard.add(() -> Feature.TREE.withConfiguration(PeachTree.PEACH_TREE_BIG_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

            orchard.add(() -> Feature.TREE.withConfiguration(PlumTree.PLUM_TREE_BIG_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

            orchard.add(() -> Feature.TREE.withConfiguration(GrapefruitTree.GRAPEFRUIT_TREE_BIG_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

            orchard.add(() -> Feature.TREE.withConfiguration(OrangeTree.ORANGE_TREE_BIG_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

            orchard.add(() -> Feature.TREE.withConfiguration(LemonTree.LEMON_TREE_BIG_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

            orchard.add(() -> Feature.TREE.withConfiguration(LimeTree.LIME_TREE_BIG_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

            orchard.add(() -> Feature.TREE.withConfiguration(CherryTree.CHERRY_TREE_BIG_CONFIG)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

        }

    }
}