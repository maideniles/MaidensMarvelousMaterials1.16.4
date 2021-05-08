package com.maideniles.maidensmaterials.blocks;


import com.maideniles.maidensmaterials.init.TestChestBlocks;
import com.maideniles.maidensmaterials.tileentity.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;
import java.util.Locale;

public enum TestChestTypes implements IStringSerializable {

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
    BROWN(108, 12, 238, 276, new ResourceLocation("maidensmaterials", "textures/gui/chest/my_container.png"), 256, 276);


    private final String name;
    public final int size;
    public final int rowLength;
    public final int xSize;
    public final int ySize;
    public final ResourceLocation guiTexture;
    public final int textureXSize;
    public final int textureYSize;

    TestChestTypes(int size, int rowLength, int xSize, int ySize, ResourceLocation guiTexture, int textureXSize, int textureYSize) {
        this(null, size, rowLength, xSize, ySize, guiTexture, textureXSize, textureYSize);
    }

    TestChestTypes(@Nullable String name, int size, int rowLength, int xSize, int ySize, ResourceLocation guiTexture, int textureXSize, int textureYSize) {
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



    public static Block get(TestChestTypes type) {
        switch (type) {
            case RED:
                return TestChestBlocks.RED_CHEST.get();
            case ORANGE:
                return TestChestBlocks.ORANGE_CHEST.get();
            case YELLOW:
                return TestChestBlocks.YELLOW_CHEST.get();
            case LIME:
                return TestChestBlocks.LIME_CHEST.get();
            case GREEN:
                return TestChestBlocks.GREEN_CHEST.get();
            case CYAN:
                return TestChestBlocks.CYAN_CHEST.get();
            case LIGHT_BLUE:
                return TestChestBlocks.LIGHT_BLUE_CHEST.get();
            case BLUE:
                return TestChestBlocks.BLUE_CHEST.get();
            case PURPLE:
                return TestChestBlocks.PURPLE_CHEST.get();
            case MAGENTA:
                return TestChestBlocks.MAGENTA_CHEST.get();
            case PINK:
                return TestChestBlocks.PINK_CHEST.get();
            case WHITE:
                return TestChestBlocks.WHITE_CHEST.get();
            case LIGHT_GRAY:
                return TestChestBlocks.LIGHT_GRAY_CHEST.get();
            case GRAY:
                return TestChestBlocks.GRAY_CHEST.get();
            case BLACK:
                return TestChestBlocks.BLACK_CHEST.get();
            case BROWN:
                return TestChestBlocks.BROWN_CHEST.get();
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
            default:
                return null;
        }
    }
}
