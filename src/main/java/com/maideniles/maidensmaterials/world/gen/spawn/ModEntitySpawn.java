package com.maideniles.maidensmaterials.world.gen.spawn;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.ModEntities;
import net.minecraft.entity.EntityClassification;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Set;

@Mod.EventBusSubscriber(modid=MaidensMaterials.MOD_ID)
public class ModEntitySpawn {

    public static void onBiomeLoad(BiomeLoadingEvent event){

        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(
        !types.contains(BiomeDictionary.Type.OCEAN) && types.contains(BiomeDictionary.Type.PLAINS)){

            List<MobSpawnInfo.Spawners> base = event.getSpawns().getSpawner(EntityClassification.CREATURE);
            base.add(new MobSpawnInfo.Spawners(ModEntities.FAIRY_FLY.get(),
            80, 4, 10));
        }


    }
}
