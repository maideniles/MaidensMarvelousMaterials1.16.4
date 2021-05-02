package com.maideniles.maidensmaterials.world.biome;


import com.maideniles.maidensmaterials.MaidensMaterials;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;

public class ModConfiguredSurfaceBuilders
{
    public static RegistryKey<ConfiguredSurfaceBuilder<?>> ORNAMENTAL_FOREST_SURFACE
            = RegistryKey.getOrCreateKey(Registry.CONFIGURED_SURFACE_BUILDER_KEY,
            new ResourceLocation(MaidensMaterials.MOD_ID, "ornamental_forest_surface"));

    public static RegistryKey<ConfiguredSurfaceBuilder<?>> OASIS_SHORE_SURFACE
            = RegistryKey.getOrCreateKey(Registry.CONFIGURED_SURFACE_BUILDER_KEY,
            new ResourceLocation(MaidensMaterials.MOD_ID, "oasis_shore_surface"));

    public static RegistryKey<ConfiguredSurfaceBuilder<?>> ORNAMENTAL_ORCHARD_SURFACE
            = RegistryKey.getOrCreateKey(Registry.CONFIGURED_SURFACE_BUILDER_KEY,
            new ResourceLocation(MaidensMaterials.MOD_ID, "ornamental_orchard_surface"));
}
