package com.maideniles.maidensmaterials.client;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.blocks.TestChestTypes;
import net.minecraft.client.renderer.Atlases;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.function.Consumer;

@Mod.EventBusSubscriber(modid = MaidensMaterials.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TestChestModels {

    public static final ResourceLocation RED_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/red_chest");
    public static final ResourceLocation ORANGE_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/orange_chest");
    public static final ResourceLocation YELLOW_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/yellow_chest");
    public static final ResourceLocation LIME_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/lime_chest");
    public static final ResourceLocation GREEN_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/green_chest");
    public static final ResourceLocation CYAN_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/cyan_chest");
    public static final ResourceLocation LIGHT_BLUE_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/light_blue_chest");
    public static final ResourceLocation BLUE_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/blue_chest");
    public static final ResourceLocation PURPLE_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/purple_chest");
    public static final ResourceLocation MAGENTA_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/magenta_chest");
    public static final ResourceLocation PINK_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/pink_chest");
    public static final ResourceLocation WHITE_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/white_chest");
    public static final ResourceLocation LIGHT_GRAY_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/light_gray_chest");
    public static final ResourceLocation GRAY_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/gray_chest");
    public static final ResourceLocation BLACK_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/black_chest");
    public static final ResourceLocation BROWN_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/brown_chest");
    public static final ResourceLocation VANLLA_CHEST_LOCATION = new ResourceLocation("entity/chest/normal");

    public static ResourceLocation chooseChestTexture(TestChestTypes type) {
        switch (type) {
            case RED:
                return RED_CHEST_LOCATION;
            case ORANGE:
                return ORANGE_CHEST_LOCATION;
            case YELLOW:
                return YELLOW_CHEST_LOCATION;
            case LIME:
                return LIME_CHEST_LOCATION;
            case GREEN:
                return GREEN_CHEST_LOCATION;
            case CYAN:
                return CYAN_CHEST_LOCATION;
            case LIGHT_BLUE:
                return LIGHT_BLUE_CHEST_LOCATION;
            case BLUE:
                return BLUE_CHEST_LOCATION;
            case PURPLE:
                return PURPLE_CHEST_LOCATION;
            case MAGENTA:
                return MAGENTA_CHEST_LOCATION;
            case PINK:
                return PINK_CHEST_LOCATION;
            case WHITE:
                return WHITE_CHEST_LOCATION;
            case LIGHT_GRAY:
                return LIGHT_GRAY_CHEST_LOCATION;
            case GRAY:
                return GRAY_CHEST_LOCATION;
            case BLACK:
                return BLACK_CHEST_LOCATION;
            case BROWN:
                return BROWN_CHEST_LOCATION;
            default:
                return VANLLA_CHEST_LOCATION;
        }
    }

    @SubscribeEvent
    public static void onStitch(TextureStitchEvent.Pre event) {
        if (!event.getMap().getTextureLocation().equals(Atlases.CHEST_ATLAS)) {
            return;
        }

        event.addSprite(RED_CHEST_LOCATION);
        event.addSprite(ORANGE_CHEST_LOCATION);
        event.addSprite(YELLOW_CHEST_LOCATION);
        event.addSprite(LIME_CHEST_LOCATION);
        event.addSprite(GREEN_CHEST_LOCATION);
        event.addSprite(CYAN_CHEST_LOCATION);
        event.addSprite(LIGHT_BLUE_CHEST_LOCATION);
        event.addSprite(BLUE_CHEST_LOCATION);
        event.addSprite(PURPLE_CHEST_LOCATION);
        event.addSprite(MAGENTA_CHEST_LOCATION);
        event.addSprite(PINK_CHEST_LOCATION);
        event.addSprite(WHITE_CHEST_LOCATION);
        event.addSprite(LIGHT_GRAY_CHEST_LOCATION);
        event.addSprite(GRAY_CHEST_LOCATION);
        event.addSprite(BLACK_CHEST_LOCATION);
        event.addSprite(BROWN_CHEST_LOCATION);
    }
}

