package com.maideniles.maidensmaterials.init;

import com.google.common.collect.Sets;
import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.tileentity.*;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MaidensChestTileEntityTypes {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MaidensMaterials.MOD_ID);

    public static final RegistryObject<TileEntityType<RedChestTileEntity>> RED_CHEST = TILE_ENTITIES.register(
            "red_chest", () -> new TileEntityType<>(RedChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.RED_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<OrangeChestTileEntity>> ORANGE_CHEST = TILE_ENTITIES.register(
            "orange_chest", () -> new TileEntityType<>(OrangeChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.ORANGE_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<YellowChestTileEntity>> YELLOW_CHEST = TILE_ENTITIES.register(
            "yellow_chest", () -> new TileEntityType<>(YellowChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.YELLOW_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<LimeChestTileEntity>> LIME_CHEST = TILE_ENTITIES.register(
            "lime_chest", () -> new TileEntityType<>(LimeChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.LIME_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<GreenChestTileEntity>> GREEN_CHEST = TILE_ENTITIES.register(
            "green_chest", () -> new TileEntityType<>(GreenChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.GREEN_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<CyanChestTileEntity>> CYAN_CHEST = TILE_ENTITIES.register(
            "cyan_chest", () -> new TileEntityType<>(CyanChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.CYAN_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<LightBlueChestTileEntity>> LIGHT_BLUE_CHEST = TILE_ENTITIES.register(
            "light_blue_chest", () -> new TileEntityType<>(LightBlueChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.LIGHT_BLUE_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<BlueChestTileEntity>> BLUE_CHEST = TILE_ENTITIES.register(
            "blue_chest", () -> new TileEntityType<>(BlueChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.BLUE_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<PurpleChestTileEntity>> PURPLE_CHEST = TILE_ENTITIES.register(
            "purple_chest", () -> new TileEntityType<>(PurpleChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.PURPLE_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<MagentaChestTileEntity>> MAGENTA_CHEST = TILE_ENTITIES.register(
            "magenta_chest", () -> new TileEntityType<>(MagentaChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.MAGENTA_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<PinkChestTileEntity>> PINK_CHEST = TILE_ENTITIES.register(
            "pink_chest", () -> new TileEntityType<>(PinkChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.PINK_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<WhiteChestTileEntity>> WHITE_CHEST = TILE_ENTITIES.register(
            "white_chest", () -> new TileEntityType<>(WhiteChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.WHITE_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<LightGrayChestTileEntity>> LIGHT_GRAY_CHEST = TILE_ENTITIES.register(
            "light_gray_chest", () -> new TileEntityType<>(LightGrayChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.LIGHT_GRAY_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<GrayChestTileEntity>> GRAY_CHEST = TILE_ENTITIES.register(
            "gray_chest", () -> new TileEntityType<>(GrayChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.GRAY_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<BlackChestTileEntity>> BLACK_CHEST = TILE_ENTITIES.register(
            "black_chest", () -> new TileEntityType<>(BlackChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.BLACK_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<BrownChestTileEntity>> BROWN_CHEST = TILE_ENTITIES.register(
            "brown_chest", () -> new TileEntityType<>(BrownChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.BROWN_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<CrabappleChestTileEntity>> CRABAPPLE_CHEST = TILE_ENTITIES.register(
            "crabapple_chest", () -> new TileEntityType<>(CrabappleChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.CRABAPPLE_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<PoincianaChestTileEntity>> POINCIANA_CHEST = TILE_ENTITIES.register(
            "poinciana_chest", () -> new TileEntityType<>(PoincianaChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.POINCIANA_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<LaburnumChestTileEntity>> LABURNUM_CHEST = TILE_ENTITIES.register(
            "laburnum_chest", () -> new TileEntityType<>(LaburnumChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.LABURNUM_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<JadeChestTileEntity>> JADE_CHEST = TILE_ENTITIES.register(
            "jade_chest", () -> new TileEntityType<>(JadeChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.JADE_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<PaulowniaChestTileEntity>> PAULOWNIA_CHEST = TILE_ENTITIES.register(
            "paulownia_chest", () -> new TileEntityType<>(PaulowniaChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.PAULOWNIA_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<WisteriaChestTileEntity>> WISTERIA_CHEST = TILE_ENTITIES.register(
            "wisteria_chest", () -> new TileEntityType<>(WisteriaChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.WISTERIA_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<JacarandaChestTileEntity>> JACARANDA_CHEST = TILE_ENTITIES.register(
            "jacaranda_chest", () -> new TileEntityType<>(JacarandaChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.JACARANDA_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<DogwoodChestTileEntity>> DOGWOOD_CHEST = TILE_ENTITIES.register(
            "dogwood_chest", () -> new TileEntityType<>(DogwoodChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.DOGWOOD_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<SilverbellChestTileEntity>> SILVERBELL_CHEST = TILE_ENTITIES.register(
            "silverbell_chest", () -> new TileEntityType<>(SilverbellChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.SILVERBELL_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<CedarChestTileEntity>> CEDAR_CHEST = TILE_ENTITIES.register(
            "cedar_chest", () -> new TileEntityType<>(CedarChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.CEDAR_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<PalmChestTileEntity>> PALM_CHEST = TILE_ENTITIES.register(
            "palm_chest", () -> new TileEntityType<>(PalmChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.PALM_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<AcaciaChestTileEntity>> ACACIA_CHEST = TILE_ENTITIES.register(
            "acacia_chest", () -> new TileEntityType<>(AcaciaChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.ACACIA_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<BirchChestTileEntity>> BIRCH_CHEST = TILE_ENTITIES.register(
            "birch_chest", () -> new TileEntityType<>(BirchChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.BIRCH_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<OakChestTileEntity>> OAK_CHEST = TILE_ENTITIES.register(
            "oak_chest", () -> new TileEntityType<>(OakChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.OAK_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<JungleChestTileEntity>> JUNGLE_CHEST = TILE_ENTITIES.register(
            "jungle_chest", () -> new TileEntityType<>(JungleChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.JUNGLE_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<SpruceChestTileEntity>> SPRUCE_CHEST = TILE_ENTITIES.register(
            "spruce_chest", () -> new TileEntityType<>(SpruceChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.SPRUCE_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<DarkOakChestTileEntity>> DARK_OAK_CHEST = TILE_ENTITIES.register(
            "dark_oak_chest", () -> new TileEntityType<>(DarkOakChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.DARK_OAK_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<CrimsonChestTileEntity>> CRIMSON_CHEST = TILE_ENTITIES.register(
            "crimson_chest", () -> new TileEntityType<>(CrimsonChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.CRIMSON_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<WarpedChestTileEntity>> WARPED_CHEST = TILE_ENTITIES.register(
            "warped_chest", () -> new TileEntityType<>(WarpedChestTileEntity::new, Sets.newHashSet(MaidensChestBlocks.WARPED_CHEST.get()), null));

}
