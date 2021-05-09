package com.maideniles.maidensmaterials.client;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.MaidensChestTypes;
import net.minecraft.client.renderer.Atlases;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MaidensMaterials.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MaidensChestModels {

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
    public static final ResourceLocation CRABAPPLE_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/crabapple_chest");
    public static final ResourceLocation POINCIANA_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/poinciana_chest");
    public static final ResourceLocation LABURNUM_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/laburnum_chest");
    public static final ResourceLocation JADE_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/jade_chest");
    public static final ResourceLocation PAULOWNIA_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/paulownia_chest");
    public static final ResourceLocation WISTERIA_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/wisteria_chest");
    public static final ResourceLocation JACARANDA_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/jacaranda_chest");
    public static final ResourceLocation DOGWOOD_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/dogwood_chest");
    public static final ResourceLocation SILVERBELL_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/silverbell_chest");
    public static final ResourceLocation CEDAR_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/cedar_chest");
    public static final ResourceLocation PALM_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/palm_chest");
    public static final ResourceLocation ACACIA_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/acacia_chest");
    public static final ResourceLocation BIRCH_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/birch_chest");
    public static final ResourceLocation OAK_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/oak_chest");
    public static final ResourceLocation JUNGLE_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/jungle_chest");
    public static final ResourceLocation SPRUCE_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/spruce_chest");
    public static final ResourceLocation DARK_OAK_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/dark_oak_chest");
    public static final ResourceLocation CRIMSON_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/crimson_chest");
    public static final ResourceLocation WARPED_CHEST_LOCATION = new ResourceLocation(MaidensMaterials.MOD_ID, "model/warped_chest");

    public static ResourceLocation chooseChestTexture(MaidensChestTypes type) {
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
            case CRABAPPLE:
                return CRABAPPLE_CHEST_LOCATION;
            case POINCIANA:
                return POINCIANA_CHEST_LOCATION;
            case LABURNUM:
                return LABURNUM_CHEST_LOCATION;
            case JADE:
                return JADE_CHEST_LOCATION;
            case PAULOWNIA:
                return PAULOWNIA_CHEST_LOCATION;
            case WISTERIA:
                return WISTERIA_CHEST_LOCATION;
            case JACARANDA:
                return JACARANDA_CHEST_LOCATION;
            case DOGWOOD:
                return DOGWOOD_CHEST_LOCATION;
            case SILVERBELL:
                return SILVERBELL_CHEST_LOCATION;
            case CEDAR:
                return CEDAR_CHEST_LOCATION;
            case PALM:
                return PALM_CHEST_LOCATION;
            case ACACIA:
                return ACACIA_CHEST_LOCATION;
            case BIRCH:
                return BIRCH_CHEST_LOCATION;
            case OAK:
                return OAK_CHEST_LOCATION;
            case JUNGLE:
                return JUNGLE_CHEST_LOCATION;
            case SPRUCE:
                return SPRUCE_CHEST_LOCATION;
            case DARK_OAK:
                return DARK_OAK_CHEST_LOCATION;
            case CRIMSON:
                return CRIMSON_CHEST_LOCATION;
            case WARPED:
                return WARPED_CHEST_LOCATION;
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
        event.addSprite(CRABAPPLE_CHEST_LOCATION);
        event.addSprite(POINCIANA_CHEST_LOCATION);
        event.addSprite(LABURNUM_CHEST_LOCATION);
        event.addSprite(JADE_CHEST_LOCATION);
        event.addSprite(PAULOWNIA_CHEST_LOCATION);
        event.addSprite(WISTERIA_CHEST_LOCATION);
        event.addSprite(JACARANDA_CHEST_LOCATION);
        event.addSprite(DOGWOOD_CHEST_LOCATION);
        event.addSprite(SILVERBELL_CHEST_LOCATION);
        event.addSprite(CEDAR_CHEST_LOCATION);
        event.addSprite(PALM_CHEST_LOCATION);
        event.addSprite(ACACIA_CHEST_LOCATION);
        event.addSprite(BIRCH_CHEST_LOCATION);
        event.addSprite(OAK_CHEST_LOCATION);
        event.addSprite(JUNGLE_CHEST_LOCATION);
        event.addSprite(SPRUCE_CHEST_LOCATION);
        event.addSprite(DARK_OAK_CHEST_LOCATION);
        event.addSprite(CRIMSON_CHEST_LOCATION);
        event.addSprite(WARPED_CHEST_LOCATION);
    }
}

