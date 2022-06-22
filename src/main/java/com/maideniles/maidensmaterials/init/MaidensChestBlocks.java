package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.blocks.chest.*;
import com.maideniles.maidensmaterials.client.ItemStackRenderer;
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

public class MaidensChestBlocks {

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

    public static final RegistryObject<CrabappleChestBlock> CRABAPPLE_CHEST = register(
            "crabapple_chest", () -> new CrabappleChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> crabappleChestRenderer());

    public static final RegistryObject<PoincianaChestBlock> POINCIANA_CHEST = register(
            "poinciana_chest", () -> new PoincianaChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> poincianaChestRenderer());

    public static final RegistryObject<LaburnumChestBlock> LABURNUM_CHEST = register(
            "laburnum_chest", () -> new LaburnumChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> laburnumChestRenderer());

    public static final RegistryObject<JadeChestBlock> JADE_CHEST = register(
            "jade_chest", () -> new JadeChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> jadeChestRenderer());

    public static final RegistryObject<PaulowniaChestBlock> PAULOWNIA_CHEST = register(
            "paulownia_chest", () -> new PaulowniaChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> paulowniaChestRenderer());

    public static final RegistryObject<WisteriaChestBlock> WISTERIA_CHEST = register(
            "wisteria_chest", () -> new WisteriaChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> wisteriaChestRenderer());

    public static final RegistryObject<JacarandaChestBlock> JACARANDA_CHEST = register(
            "jacaranda_chest", () -> new JacarandaChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> jacarandaChestRenderer());

    public static final RegistryObject<DogwoodChestBlock> DOGWOOD_CHEST = register(
            "dogwood_chest", () -> new DogwoodChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> dogwoodChestRenderer());

    public static final RegistryObject<SilverbellChestBlock> SILVERBELL_CHEST = register(
            "silverbell_chest", () -> new SilverbellChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> silverbellChestRenderer());

    public static final RegistryObject<CedarChestBlock> CEDAR_CHEST = register(
            "cedar_chest", () -> new CedarChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> cedarChestRenderer());

    public static final RegistryObject<PalmChestBlock> PALM_CHEST = register(
            "palm_chest", () -> new PalmChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> palmChestRenderer());

    public static final RegistryObject<AcaciaChestBlock> ACACIA_CHEST = register(
            "acacia_chest", () -> new AcaciaChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> acaciaChestRenderer());

    public static final RegistryObject<BirchChestBlock> BIRCH_CHEST = register(
            "birch_chest", () -> new BirchChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> birchChestRenderer());

    public static final RegistryObject<OakChestBlock> OAK_CHEST = register(
            "oak_chest", () -> new OakChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> oakChestRenderer());

    public static final RegistryObject<JungleChestBlock> JUNGLE_CHEST = register(
            "jungle_chest", () -> new JungleChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> jungleChestRenderer());

    public static final RegistryObject<SpruceChestBlock> SPRUCE_CHEST = register(
            "spruce_chest", () -> new SpruceChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> spruceChestRenderer());

    public static final RegistryObject<DarkOakChestBlock> DARK_OAK_CHEST = register(
            "dark_oak_chest", () -> new DarkOakChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> darkOakChestRenderer());

    public static final RegistryObject<CrimsonChestBlock> CRIMSON_CHEST = register(
            "crimson_chest", () -> new CrimsonChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> crimsonChestRenderer());

    public static final RegistryObject<WarpedChestBlock> WARPED_CHEST = register(
            "warped_chest", () -> new WarpedChestBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0F)),
            () -> warpedChestRenderer());


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
        return () -> new ItemStackRenderer(RedChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> orangeChestRenderer() {
        return () -> new ItemStackRenderer(OrangeChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> yellowChestRenderer() {
        return () -> new ItemStackRenderer(YellowChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> limeChestRenderer() {
        return () -> new ItemStackRenderer(LimeChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> greenChestRenderer() {
        return () -> new ItemStackRenderer(GreenChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> cyanChestRenderer() {
        return () -> new ItemStackRenderer(CyanChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> lightBlueChestRenderer() {
        return () -> new ItemStackRenderer(LightBlueChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> blueChestRenderer() {
        return () -> new ItemStackRenderer(BlueChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> purpleChestRenderer() {
        return () -> new ItemStackRenderer(PurpleChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> magentaChestRenderer() {
        return () -> new ItemStackRenderer(MagentaChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> pinkChestRenderer() {
        return () -> new ItemStackRenderer(PinkChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> whiteChestRenderer() {
        return () -> new ItemStackRenderer(WhiteChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> lightGrayChestRenderer() {
        return () -> new ItemStackRenderer(LightGrayChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> grayChestRenderer() {
        return () -> new ItemStackRenderer(GrayChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> blackChestRenderer() {
        return () -> new ItemStackRenderer(BlackChestTileEntity::new);
    }
    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> brownChestRenderer() {
        return () -> new ItemStackRenderer(BrownChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> crabappleChestRenderer() {
        return () -> new ItemStackRenderer(CrabappleChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> poincianaChestRenderer() {
        return () -> new ItemStackRenderer(PoincianaChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> laburnumChestRenderer() {
        return () -> new ItemStackRenderer(LaburnumChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> jadeChestRenderer() {
        return () -> new ItemStackRenderer(JadeChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> paulowniaChestRenderer() {
        return () -> new ItemStackRenderer(PaulowniaChestTileEntity::new);
    }
    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> wisteriaChestRenderer() {
        return () -> new ItemStackRenderer(WisteriaChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> jacarandaChestRenderer() {
        return () -> new ItemStackRenderer(JacarandaChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> dogwoodChestRenderer() {
        return () -> new ItemStackRenderer(DogwoodChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> silverbellChestRenderer() {
        return () -> new ItemStackRenderer(SilverbellChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> cedarChestRenderer() {
        return () -> new ItemStackRenderer(CedarChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> palmChestRenderer() {
        return () -> new ItemStackRenderer(PalmChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> acaciaChestRenderer() {
        return () -> new ItemStackRenderer(AcaciaChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> birchChestRenderer() {
        return () -> new ItemStackRenderer(BirchChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> oakChestRenderer() {
        return () -> new ItemStackRenderer(OakChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> jungleChestRenderer() {
        return () -> new ItemStackRenderer(JungleChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> spruceChestRenderer() {
        return () -> new ItemStackRenderer(SpruceChestTileEntity::new);
    }
    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> darkOakChestRenderer() {
        return () -> new ItemStackRenderer(DarkOakChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> crimsonChestRenderer() {
        return () -> new ItemStackRenderer(CrimsonChestTileEntity::new);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> warpedChestRenderer() {
        return () -> new ItemStackRenderer(WarpedChestTileEntity::new);
    }
}
