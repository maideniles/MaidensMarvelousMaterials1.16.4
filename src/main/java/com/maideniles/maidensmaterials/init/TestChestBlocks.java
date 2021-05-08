package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.blocks.chest.*;
import com.maideniles.maidensmaterials.client.TestChestItemStackRenderer;
import com.maideniles.maidensmaterials.tileentity.*;
import com.maideniles.maidensmaterials.util.Registration;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestChestBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MaidensMaterials.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = Registration.ITEMS;

    public static final RegistryObject<RedChestBlock> RED_CHEST = register(
            "red_chest", () -> new RedChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> redChestRenderer());

    public static final RegistryObject<OrangeChestBlock> ORANGE_CHEST = register(
            "orange_chest", () -> new OrangeChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> orangeChestRenderer());

    public static final RegistryObject<YellowChestBlock> YELLOW_CHEST = register(
            "yellow_chest", () -> new YellowChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> yellowChestRenderer());

    public static final RegistryObject<LimeChestBlock> LIME_CHEST = register(
            "lime_chest", () -> new LimeChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> limeChestRenderer());

    public static final RegistryObject<GreenChestBlock> GREEN_CHEST = register(
            "green_chest", () -> new GreenChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> greenChestRenderer());

    public static final RegistryObject<CyanChestBlock> CYAN_CHEST = register(
            "cyan_chest", () -> new CyanChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> cyanChestRenderer());

    public static final RegistryObject<LightBlueChestBlock> LIGHT_BLUE_CHEST = register(
            "light_blue_chest", () -> new LightBlueChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> lightBlueChestRenderer());

    public static final RegistryObject<BlueChestBlock> BLUE_CHEST = register(
            "blue_chest", () -> new BlueChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> blueChestRenderer());

    public static final RegistryObject<PurpleChestBlock> PURPLE_CHEST = register(
            "purple_chest", () -> new PurpleChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F, 10000.0F)),
            () -> purpleChestRenderer());

    public static final RegistryObject<MagentaChestBlock> MAGENTA_CHEST = register(
            "magenta_chest", () -> new MagentaChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> magentaChestRenderer());

    public static final RegistryObject<PinkChestBlock> PINK_CHEST = register(
            "pink_chest", () -> new PinkChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> pinkChestRenderer());

    public static final RegistryObject<WhiteChestBlock> WHITE_CHEST = register(
            "white_chest", () -> new WhiteChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> whiteChestRenderer());

    public static final RegistryObject<LightGrayChestBlock> LIGHT_GRAY_CHEST = register(
            "light_gray_chest", () -> new LightGrayChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> lightGrayChestRenderer());

    public static final RegistryObject<GrayChestBlock> GRAY_CHEST = register(
            "gray_chest", () -> new GrayChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> grayChestRenderer());

    public static final RegistryObject<BlackChestBlock> BLACK_CHEST = register(
            "black_chest", () -> new BlackChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> blackChestRenderer());

    public static final RegistryObject<BrownChestBlock> BROWN_CHEST = register(
            "brown_chest", () -> new BrownChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> brownChestRenderer());



    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Supplier<Callable<ItemStackTileEntityRenderer>> renderMethod) {
        return register(name, sup, block -> item(block, renderMethod));
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Function<RegistryObject<T>, Supplier<? extends Item>> itemCreator) {
        RegistryObject<T> ret = registerNoItem(name, sup);
        ITEMS.register(name, itemCreator.apply(ret));
        return ret;
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<? extends T> sup) {
        return BLOCKS.register(name, sup);
    }

    private static Supplier<BlockItem> item(final RegistryObject<? extends Block> block, final Supplier<Callable<ItemStackTileEntityRenderer>> renderMethod) {
        return () -> new BlockItem(block.get(), new Item.Properties().group(MaidensMaterials.MAIDENS_BLOCKS_GROUP).setISTER(renderMethod));
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> redChestRenderer() {
        return () -> new TestChestItemStackRenderer(RedChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> orangeChestRenderer() {
        return () -> new TestChestItemStackRenderer(OrangeChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> yellowChestRenderer() {
        return () -> new TestChestItemStackRenderer(YellowChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> limeChestRenderer() {
        return () -> new TestChestItemStackRenderer(LimeChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> greenChestRenderer() {
        return () -> new TestChestItemStackRenderer(GreenChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> cyanChestRenderer() {
        return () -> new TestChestItemStackRenderer(CyanChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> lightBlueChestRenderer() {
        return () -> new TestChestItemStackRenderer(LightBlueChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> blueChestRenderer() {
        return () -> new TestChestItemStackRenderer(BlueChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> purpleChestRenderer() {
        return () -> new TestChestItemStackRenderer(PurpleChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> magentaChestRenderer() {
        return () -> new TestChestItemStackRenderer(MagentaChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> pinkChestRenderer() {
        return () -> new TestChestItemStackRenderer(PinkChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> whiteChestRenderer() {
        return () -> new TestChestItemStackRenderer(WhiteChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> lightGrayChestRenderer() {
        return () -> new TestChestItemStackRenderer(LightGrayChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> grayChestRenderer() {
        return () -> new TestChestItemStackRenderer(GrayChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> blackChestRenderer() {
        return () -> new TestChestItemStackRenderer(BlackChestTileEntity::new);
    }
    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> brownChestRenderer() {
        return () -> new TestChestItemStackRenderer(BrownChestTileEntity::new);
    }

}
