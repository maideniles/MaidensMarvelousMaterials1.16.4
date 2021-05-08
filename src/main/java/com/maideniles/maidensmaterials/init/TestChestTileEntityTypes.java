package com.maideniles.maidensmaterials.init;

import com.google.common.collect.Sets;
import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.tileentity.*;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TestChestTileEntityTypes {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MaidensMaterials.MOD_ID);

    public static final RegistryObject<TileEntityType<RedChestTileEntity>> RED_CHEST = TILE_ENTITIES.register(
            "red_chest", () -> new TileEntityType<>(RedChestTileEntity::new, Sets.newHashSet(TestChestBlocks.RED_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<OrangeChestTileEntity>> ORANGE_CHEST = TILE_ENTITIES.register(
            "orange_chest", () -> new TileEntityType<>(OrangeChestTileEntity::new, Sets.newHashSet(TestChestBlocks.ORANGE_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<YellowChestTileEntity>> YELLOW_CHEST = TILE_ENTITIES.register(
            "yellow_chest", () -> new TileEntityType<>(YellowChestTileEntity::new, Sets.newHashSet(TestChestBlocks.YELLOW_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<LimeChestTileEntity>> LIME_CHEST = TILE_ENTITIES.register(
            "lime_chest", () -> new TileEntityType<>(LimeChestTileEntity::new, Sets.newHashSet(TestChestBlocks.LIME_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<GreenChestTileEntity>> GREEN_CHEST = TILE_ENTITIES.register(
            "green_chest", () -> new TileEntityType<>(GreenChestTileEntity::new, Sets.newHashSet(TestChestBlocks.GREEN_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<CyanChestTileEntity>> CYAN_CHEST = TILE_ENTITIES.register(
            "cyan_chest", () -> new TileEntityType<>(CyanChestTileEntity::new, Sets.newHashSet(TestChestBlocks.CYAN_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<LightBlueChestTileEntity>> LIGHT_BLUE_CHEST = TILE_ENTITIES.register(
            "light_blue_chest", () -> new TileEntityType<>(LightBlueChestTileEntity::new, Sets.newHashSet(TestChestBlocks.LIGHT_BLUE_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<BlueChestTileEntity>> BLUE_CHEST = TILE_ENTITIES.register(
            "blue_chest", () -> new TileEntityType<>(BlueChestTileEntity::new, Sets.newHashSet(TestChestBlocks.BLUE_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<PurpleChestTileEntity>> PURPLE_CHEST = TILE_ENTITIES.register(
            "purple_chest", () -> new TileEntityType<>(PurpleChestTileEntity::new, Sets.newHashSet(TestChestBlocks.PURPLE_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<MagentaChestTileEntity>> MAGENTA_CHEST = TILE_ENTITIES.register(
            "magenta_chest", () -> new TileEntityType<>(MagentaChestTileEntity::new, Sets.newHashSet(TestChestBlocks.MAGENTA_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<PinkChestTileEntity>> PINK_CHEST = TILE_ENTITIES.register(
            "pink_chest", () -> new TileEntityType<>(PinkChestTileEntity::new, Sets.newHashSet(TestChestBlocks.PINK_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<WhiteChestTileEntity>> WHITE_CHEST = TILE_ENTITIES.register(
            "white_chest", () -> new TileEntityType<>(WhiteChestTileEntity::new, Sets.newHashSet(TestChestBlocks.WHITE_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<LightGrayChestTileEntity>> LIGHT_GRAY_CHEST = TILE_ENTITIES.register(
            "light_gray_chest", () -> new TileEntityType<>(LightGrayChestTileEntity::new, Sets.newHashSet(TestChestBlocks.LIGHT_GRAY_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<GrayChestTileEntity>> GRAY_CHEST = TILE_ENTITIES.register(
            "gray_chest", () -> new TileEntityType<>(GrayChestTileEntity::new, Sets.newHashSet(TestChestBlocks.GRAY_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<BlackChestTileEntity>> BLACK_CHEST = TILE_ENTITIES.register(
            "black_chest", () -> new TileEntityType<>(BlackChestTileEntity::new, Sets.newHashSet(TestChestBlocks.BLACK_CHEST.get()), null));

    public static final RegistryObject<TileEntityType<BrownChestTileEntity>> BROWN_CHEST = TILE_ENTITIES.register(
            "brown_chest", () -> new TileEntityType<>(BrownChestTileEntity::new, Sets.newHashSet(TestChestBlocks.BROWN_CHEST.get()), null));
}
