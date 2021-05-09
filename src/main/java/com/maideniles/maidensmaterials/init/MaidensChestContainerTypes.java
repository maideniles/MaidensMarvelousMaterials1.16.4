package com.maideniles.maidensmaterials.init;


import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MaidensChestContainerTypes {

    public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MaidensMaterials.MOD_ID);

    public static final RegistryObject<ContainerType<MaidensChestContainer>> RED_CHEST = CONTAINERS.register("red_chest", () -> new ContainerType<>(MaidensChestContainer::createRedContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> ORANGE_CHEST = CONTAINERS.register("orange_chest", () -> new ContainerType<>(MaidensChestContainer::createOrangeContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> YELLOW_CHEST = CONTAINERS.register("yellow_chest", () -> new ContainerType<>(MaidensChestContainer::createYellowContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> LIME_CHEST = CONTAINERS.register("lime_chest", () -> new ContainerType<>(MaidensChestContainer::createLimeContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> GREEN_CHEST = CONTAINERS.register("green_chest", () -> new ContainerType<>(MaidensChestContainer::createGreenContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> CYAN_CHEST = CONTAINERS.register("cyan_chest", () -> new ContainerType<>(MaidensChestContainer::createCyanContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> LIGHT_BLUE_CHEST = CONTAINERS.register("light_blue_chest", () -> new ContainerType<>(MaidensChestContainer::createLightBlueContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> BLUE_CHEST = CONTAINERS.register("blue_chest", () -> new ContainerType<>(MaidensChestContainer::createBlueContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> PURPLE_CHEST = CONTAINERS.register("purple_chest", () -> new ContainerType<>(MaidensChestContainer::createPurpleContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> MAGENTA_CHEST = CONTAINERS.register("magenta_chest", () -> new ContainerType<>(MaidensChestContainer::createMagentaContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> PINK_CHEST = CONTAINERS.register("pink_chest", () -> new ContainerType<>(MaidensChestContainer::createPinkContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> WHITE_CHEST = CONTAINERS.register("white_chest", () -> new ContainerType<>(MaidensChestContainer::createWhiteContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> LIGHT_GRAY_CHEST = CONTAINERS.register("light_gray_chest", () -> new ContainerType<>(MaidensChestContainer::createLightGrayContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> GRAY_CHEST = CONTAINERS.register("gray_chest", () -> new ContainerType<>(MaidensChestContainer::createGrayContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> BLACK_CHEST = CONTAINERS.register("black_chest", () -> new ContainerType<>(MaidensChestContainer::createBlackContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> BROWN_CHEST = CONTAINERS.register("brown_chest", () -> new ContainerType<>(MaidensChestContainer::createBrownContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> CRABAPPLE_CHEST = CONTAINERS.register("crabapple_chest", () -> new ContainerType<>(MaidensChestContainer::createCrabappleContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> POINCIANA_CHEST = CONTAINERS.register("poinciana_chest", () -> new ContainerType<>(MaidensChestContainer::createPoincianaContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> LABURNUM_CHEST = CONTAINERS.register("laburnum_chest", () -> new ContainerType<>(MaidensChestContainer::createLaburnumContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> JADE_CHEST = CONTAINERS.register("jade_chest", () -> new ContainerType<>(MaidensChestContainer::createJadeContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> PAULOWNIA_CHEST = CONTAINERS.register("paulownia_chest", () -> new ContainerType<>(MaidensChestContainer::createPaulowniaContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> WISTERIA_CHEST = CONTAINERS.register("wisteria_chest", () -> new ContainerType<>(MaidensChestContainer::createWisteriaContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> JACARANDA_CHEST = CONTAINERS.register("jacaranda_chest", () -> new ContainerType<>(MaidensChestContainer::createJacarandaContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> DOGWOOD_CHEST = CONTAINERS.register("dogwood_chest", () -> new ContainerType<>(MaidensChestContainer::createDogwoodContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> SILVERBELL_CHEST = CONTAINERS.register("silverbell_chest", () -> new ContainerType<>(MaidensChestContainer::createSilverbellContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> CEDAR_CHEST = CONTAINERS.register("cedar_chest", () -> new ContainerType<>(MaidensChestContainer::createCedarContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> PALM_CHEST = CONTAINERS.register("palm_chest", () -> new ContainerType<>(MaidensChestContainer::createPalmContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> ACACIA_CHEST = CONTAINERS.register("acacia_chest", () -> new ContainerType<>(MaidensChestContainer::createAcaciaContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> BIRCH_CHEST = CONTAINERS.register("birch_chest", () -> new ContainerType<>(MaidensChestContainer::createBirchContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> OAK_CHEST = CONTAINERS.register("oak_chest", () -> new ContainerType<>(MaidensChestContainer::createOakContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> JUNGLE_CHEST = CONTAINERS.register("jungle_chest", () -> new ContainerType<>(MaidensChestContainer::createJungleContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> SPRUCE_CHEST = CONTAINERS.register("spruce_chest", () -> new ContainerType<>(MaidensChestContainer::createSpruceContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> DARK_OAK_CHEST = CONTAINERS.register("dark_oak_chest", () -> new ContainerType<>(MaidensChestContainer::createDarkOakContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> CRIMSON_CHEST = CONTAINERS.register("crimson_chest", () -> new ContainerType<>(MaidensChestContainer::createCrimsonContainer));

    public static final RegistryObject<ContainerType<MaidensChestContainer>> WARPED_CHEST = CONTAINERS.register("warped_chest", () -> new ContainerType<>(MaidensChestContainer::createWarpedContainer));

}
