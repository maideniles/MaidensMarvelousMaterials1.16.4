package com.maideniles.maidensmaterials.init;


import com.maideniles.maidensmaterials.tileentity.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;
import java.util.Locale;

public enum MaidensChestTypes implements IStringSerializable {

    RED(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    ORANGE(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    YELLOW(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    LIME(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    GREEN(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    CYAN(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    LIGHT_BLUE(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    BLUE(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    PURPLE(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    MAGENTA(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    PINK(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    WHITE(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    LIGHT_GRAY(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    GRAY(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    BLACK(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    BROWN(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    CRABAPPLE(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    POINCIANA(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    LABURNUM(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    JADE(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    PAULOWNIA(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    WISTERIA(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    JACARANDA(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    DOGWOOD(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    SILVERBELL(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    CEDAR(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    PALM(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    ACACIA(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    BIRCH(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    OAK(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    JUNGLE(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    SPRUCE(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    DARK_OAK(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    CRIMSON(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276),
    WARPED(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276);

    private final String name;
    public final int size;
    public final int rowLength;
    public final int xSize;
    public final int ySize;
    public final ResourceLocation guiTexture;
    public final int textureXSize;
    public final int textureYSize;

    MaidensChestTypes(int size, int rowLength, int xSize, int ySize, ResourceLocation guiTexture, int textureXSize, int textureYSize) {
        this(null, size, rowLength, xSize, ySize, guiTexture, textureXSize, textureYSize);
    }

    MaidensChestTypes(@Nullable String name, int size, int rowLength, int xSize, int ySize, ResourceLocation guiTexture, int textureXSize, int textureYSize) {
        this.name = name;
        this.size = size;
        this.rowLength = rowLength;
        this.xSize = xSize;
        this.ySize = ySize;
        this.guiTexture = guiTexture;
        this.textureXSize = textureXSize;
        this.textureYSize = textureYSize;
    }

    public String getId() {
        return this.name().toLowerCase(Locale.ROOT);
    }

    public String getEnglishName() {
        return this.name;
    }

    @Override
    public String getString() {
        return this.getEnglishName();
    }

    public int getRowCount() {
        return this.size / this.rowLength;
    }



    public static Block get(MaidensChestTypes type) {
        switch (type) {
            case RED:
                return MaidensChestBlocks.RED_CHEST.get();
            case ORANGE:
                return MaidensChestBlocks.ORANGE_CHEST.get();
            case YELLOW:
                return MaidensChestBlocks.YELLOW_CHEST.get();
            case LIME:
                return MaidensChestBlocks.LIME_CHEST.get();
            case GREEN:
                return MaidensChestBlocks.GREEN_CHEST.get();
            case CYAN:
                return MaidensChestBlocks.CYAN_CHEST.get();
            case LIGHT_BLUE:
                return MaidensChestBlocks.LIGHT_BLUE_CHEST.get();
            case BLUE:
                return MaidensChestBlocks.BLUE_CHEST.get();
            case PURPLE:
                return MaidensChestBlocks.PURPLE_CHEST.get();
            case MAGENTA:
                return MaidensChestBlocks.MAGENTA_CHEST.get();
            case PINK:
                return MaidensChestBlocks.PINK_CHEST.get();
            case WHITE:
                return MaidensChestBlocks.WHITE_CHEST.get();
            case LIGHT_GRAY:
                return MaidensChestBlocks.LIGHT_GRAY_CHEST.get();
            case GRAY:
                return MaidensChestBlocks.GRAY_CHEST.get();
            case BLACK:
                return MaidensChestBlocks.BLACK_CHEST.get();
            case BROWN:
                return MaidensChestBlocks.BROWN_CHEST.get();

            case CRABAPPLE:
                return MaidensChestBlocks.CRABAPPLE_CHEST.get();
            case POINCIANA:
                return MaidensChestBlocks.POINCIANA_CHEST.get();
            case LABURNUM:
                return MaidensChestBlocks.LABURNUM_CHEST.get();
            case JADE:
                return MaidensChestBlocks.JADE_CHEST.get();
            case PAULOWNIA:
                return MaidensChestBlocks.PAULOWNIA_CHEST.get();
            case WISTERIA:
                return MaidensChestBlocks.WISTERIA_CHEST.get();
            case JACARANDA:
                return MaidensChestBlocks.JACARANDA_CHEST.get();
            case DOGWOOD:
                return MaidensChestBlocks.DOGWOOD_CHEST.get();
            case SILVERBELL:
                return MaidensChestBlocks.SILVERBELL_CHEST.get();
            case CEDAR:
                return MaidensChestBlocks.CEDAR_CHEST.get();
            case PALM:
                return MaidensChestBlocks.PALM_CHEST.get();

            case ACACIA:
                return MaidensChestBlocks.ACACIA_CHEST.get();
            case BIRCH:
                return MaidensChestBlocks.BIRCH_CHEST.get();
            case OAK:
                return MaidensChestBlocks.OAK_CHEST.get();
            case JUNGLE:
                return MaidensChestBlocks.JUNGLE_CHEST.get();
            case SPRUCE:
                return MaidensChestBlocks.SPRUCE_CHEST.get();
            case DARK_OAK:
                return MaidensChestBlocks.DARK_OAK_CHEST.get();
            case CRIMSON:
                return MaidensChestBlocks.CRIMSON_CHEST.get();
            case WARPED:
                return MaidensChestBlocks.WARPED_CHEST.get();
            default:
                return Blocks.CHEST;
        }
    }

    public TestChestTileEntity makeEntity() {
        switch (this) {
            case RED:
                return new RedChestTileEntity();
            case ORANGE:
                return new OrangeChestTileEntity();
            case YELLOW:
                return new YellowChestTileEntity();
            case LIME:
                return new LimeChestTileEntity();
            case GREEN:
                return new GreenChestTileEntity();
            case CYAN:
                return new CyanChestTileEntity();
            case LIGHT_BLUE:
                return new LightBlueChestTileEntity();
            case BLUE:
                return new BlueChestTileEntity();
            case PURPLE:
                return new PurpleChestTileEntity();
            case MAGENTA:
                return new MagentaChestTileEntity();
            case PINK:
                return new PinkChestTileEntity();
            case WHITE:
                return new WhiteChestTileEntity();
            case LIGHT_GRAY:
                return new LightGrayChestTileEntity();
            case GRAY:
                return new GrayChestTileEntity();
            case BLACK:
                return new BlackChestTileEntity();
            case CRABAPPLE:
                return new CrabappleChestTileEntity();
            case POINCIANA:
                return new PoincianaChestTileEntity();
            case LABURNUM:
                return new LaburnumChestTileEntity();
            case JADE:
                return new JadeChestTileEntity();
            case PAULOWNIA:
                return new PaulowniaChestTileEntity();
            case JACARANDA:
                return new JacarandaChestTileEntity();
            case DOGWOOD:
                return new DogwoodChestTileEntity();
            case SILVERBELL:
                return new SilverbellChestTileEntity();
            case CEDAR:
                return new CedarChestTileEntity();
            case PALM:
                return new PalmChestTileEntity();
            case ACACIA:
                return new AcaciaChestTileEntity();
            case BIRCH:
                return new BirchChestTileEntity();
            case OAK:
                return new OakChestTileEntity();
            case JUNGLE:
                return new JungleChestTileEntity();
            case SPRUCE:
                return new SpruceChestTileEntity();
            case DARK_OAK:
                return new DarkOakChestTileEntity();
            case CRIMSON:
                return new CrimsonChestTileEntity();
            case WARPED:
                return new WarpedChestTileEntity();
            default:
                return null;
        }
    }
}
