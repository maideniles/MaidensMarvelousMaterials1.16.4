package com.maideniles.maidensmaterials.world.biome;

import com.maideniles.maidensmaterials.init.ModConfiguredFeatures;
import com.maideniles.maidensmaterials.init.ModEntities;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;

import java.util.function.Supplier;

public class OasisShoreBiome {


    public static Biome makeOasisShoreBiome(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder, float depth, float scale)
    {

        //ADD MOBS TO BIOME//
        MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();
        DefaultBiomeFeatures.withPassiveMobs(mobspawninfo$builder);

        DefaultBiomeFeatures.withBatsAndHostiles(mobspawninfo$builder);

        mobspawninfo$builder.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(EntityType.TROPICAL_FISH, 25, 8, 8));
        mobspawninfo$builder.withSpawner(EntityClassification.WATER_CREATURE, new MobSpawnInfo.Spawners(EntityType.DOLPHIN, 2, 1, 2));

        BiomeGenerationSettings.Builder biomegenerationsettings$builder =
                (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(surfaceBuilder);

//ADD BASIC STRUCTURES AND WORLDGEN TO BIOME//
        biomegenerationsettings$builder.withStructure(StructureFeatures.MINESHAFT);
        biomegenerationsettings$builder.withStructure(StructureFeatures.VILLAGE_DESERT);

        DefaultBiomeFeatures.withCavesAndCanyons(biomegenerationsettings$builder);

        DefaultBiomeFeatures.withLavaAndWaterLakes(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withSimpleSeagrass(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withWarmKelp(biomegenerationsettings$builder);


        DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withCommonOverworldBlocks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withOverworldOres(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withClayDisks(biomegenerationsettings$builder);

        DefaultBiomeFeatures.withNormalMushroomGeneration(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withSwampSugarcaneAndPumpkin(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaAndWaterSprings(biomegenerationsettings$builder);


DefaultBiomeFeatures.withNoiseTallGrass(biomegenerationsettings$builder);
DefaultBiomeFeatures.withBadlandsGrass(biomegenerationsettings$builder);
DefaultBiomeFeatures.withDesertVegetation(biomegenerationsettings$builder);

        //ADD FLOWERS TO BIOME//
        DefaultBiomeFeatures.withWarmFlowers(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withDefaultFlowers(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withAllForestFlowerGeneration(biomegenerationsettings$builder);

       biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.ORCHID_ORCHARD_CONFIG);
        biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.FOREST_FLOWERS_ORCHARD_CONFIG);
      biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.ORNAMENTAL_MUSHROOM_ORCHARD_FEATURE);

        //FINISH CONFIGURATION OF BIOME--COLORS, ETC//

        return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.BEACH)
                .depth(depth).scale(scale).temperature(0.8F).downfall(0.9F)
                .setEffects((new BiomeAmbience.Builder()).setWaterColor(0x00AACA)
                        .setWaterFogColor(2302743).setFogColor(12638463)
                        .withSkyColor(getSkyColorWithTemperatureModifier(0.8F))
                        .withFoliageColor(0x84cc55).withGrassColor(0x84cc55)
                        .setMoodSound(MoodSoundAmbience.DEFAULT_CAVE).build())
                .withMobSpawnSettings(mobspawninfo$builder.copy())
                .withGenerationSettings(biomegenerationsettings$builder.build()).build();
    }



    private static int getSkyColorWithTemperatureModifier(float temperature) {
        float lvt_1_1_ = temperature / 3.0F;
        lvt_1_1_ = MathHelper.clamp(lvt_1_1_, -1.0F, 1.0F);
        return MathHelper.hsvToRGB(0.62222224F - lvt_1_1_ * 0.05F, 0.5F + lvt_1_1_ * 0.1F, 1.0F);
    }
}
