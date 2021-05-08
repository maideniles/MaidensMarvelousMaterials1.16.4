package com.maideniles.maidensmaterials.init;


import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.container.TestChestContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TestChestContainerTypes {

    public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MaidensMaterials.MOD_ID);

    public static final RegistryObject<ContainerType<TestChestContainer>> RED_CHEST = CONTAINERS.register("red_chest", () -> new ContainerType<>(TestChestContainer::createRedContainer));

    public static final RegistryObject<ContainerType<TestChestContainer>> ORANGE_CHEST = CONTAINERS.register("orange_chest", () -> new ContainerType<>(TestChestContainer::createOrangeContainer));

    public static final RegistryObject<ContainerType<TestChestContainer>> YELLOW_CHEST = CONTAINERS.register("yellow_chest", () -> new ContainerType<>(TestChestContainer::createYellowContainer));

    public static final RegistryObject<ContainerType<TestChestContainer>> LIME_CHEST = CONTAINERS.register("lime_chest", () -> new ContainerType<>(TestChestContainer::createLimeContainer));

    public static final RegistryObject<ContainerType<TestChestContainer>> GREEN_CHEST = CONTAINERS.register("green_chest", () -> new ContainerType<>(TestChestContainer::createGreenContainer));

    public static final RegistryObject<ContainerType<TestChestContainer>> CYAN_CHEST = CONTAINERS.register("cyan_chest", () -> new ContainerType<>(TestChestContainer::createCyanContainer));
    public static final RegistryObject<ContainerType<TestChestContainer>> LIGHT_BLUE_CHEST = CONTAINERS.register("light_blue_chest", () -> new ContainerType<>(TestChestContainer::createLightBlueContainer));
    public static final RegistryObject<ContainerType<TestChestContainer>> BLUE_CHEST = CONTAINERS.register("blue_chest", () -> new ContainerType<>(TestChestContainer::createBlueContainer));

    public static final RegistryObject<ContainerType<TestChestContainer>> PURPLE_CHEST = CONTAINERS.register("purple_chest", () -> new ContainerType<>(TestChestContainer::createPurpleContainer));
    public static final RegistryObject<ContainerType<TestChestContainer>> MAGENTA_CHEST = CONTAINERS.register("magenta_chest", () -> new ContainerType<>(TestChestContainer::createMagentaContainer));
    public static final RegistryObject<ContainerType<TestChestContainer>> PINK_CHEST = CONTAINERS.register("pink_chest", () -> new ContainerType<>(TestChestContainer::createPinkContainer));

    public static final RegistryObject<ContainerType<TestChestContainer>> WHITE_CHEST = CONTAINERS.register("white_chest", () -> new ContainerType<>(TestChestContainer::createWhiteContainer));
    public static final RegistryObject<ContainerType<TestChestContainer>> LIGHT_GRAY_CHEST = CONTAINERS.register("light_gray_chest", () -> new ContainerType<>(TestChestContainer::createLightGrayContainer));

    public static final RegistryObject<ContainerType<TestChestContainer>> GRAY_CHEST = CONTAINERS.register("gray_chest", () -> new ContainerType<>(TestChestContainer::createGrayContainer));

    public static final RegistryObject<ContainerType<TestChestContainer>> BLACK_CHEST = CONTAINERS.register("black_chest", () -> new ContainerType<>(TestChestContainer::createBlackContainer));

    public static final RegistryObject<ContainerType<TestChestContainer>> BROWN_CHEST = CONTAINERS.register("brown_chest", () -> new ContainerType<>(TestChestContainer::createBrownContainer));

}
