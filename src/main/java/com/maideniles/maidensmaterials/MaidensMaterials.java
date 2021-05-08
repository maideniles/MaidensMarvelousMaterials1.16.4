package com.maideniles.maidensmaterials;

import com.maideniles.maidensmaterials.client.RenderLayers;
import com.maideniles.maidensmaterials.entity.FairyFlyEntity;
import com.maideniles.maidensmaterials.init.*;
import com.maideniles.maidensmaterials.screen.MaidensChestScreen;
import com.maideniles.maidensmaterials.screen.TestChestScreen;
import com.maideniles.maidensmaterials.tileentity.TestChestTileEntityRenderer;
import com.maideniles.maidensmaterials.util.Registration;
import com.maideniles.maidensmaterials.world.biome.ModSurfaceBuilders;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("maidensmaterials")
public class MaidensMaterials
{

    public static final String MOD_ID = "maidensmaterials";

    public static final ItemGroup MAIDENS_BLOCKS_GROUP = new ItemGroup("maidens_blocks_group") {
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModBlocks.MAGENTA_BRICK_BLOCK.get());
    }
};

    public static final ItemGroup MAIDENS_ITEMS_GROUP = new ItemGroup("maidens_items_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.DOGWOOD_BLOSSOMS.get());
        }
    };


    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public MaidensMaterials() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        Registration.register();
        ModItems.register();
        ModBlocks.register();
        ModBlocks.registerWithNullGroup();
        ModBiomes.register();
        ModSurfaceBuilders.register();
        ModEnchantments.register();
        RenderLayers.safeRunClient();
        MaidensTreeDecoratorTypes.register();
        ModPotions.register();
        ModEntities.register();
        ModSounds.register();
        ModFeatures.register();
        ModTileEntities.register();
        ModContainers.register();

        TestChestBlocks.BLOCKS.register(modBus);
        TestChestTileEntityTypes.TILE_ENTITIES.register(modBus);
        TestChestContainerTypes.CONTAINERS.register(modBus);




        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }



    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());


        ScreenManager.registerFactory(ModContainers.PINK_CHEST_CONTAINER.get(), MaidensChestScreen:: new);

        ScreenManager.registerFactory(TestChestContainerTypes.RED_CHEST.get(), TestChestScreen::new);
        ScreenManager.registerFactory(TestChestContainerTypes.ORANGE_CHEST.get(), TestChestScreen::new);
        ScreenManager.registerFactory(TestChestContainerTypes.YELLOW_CHEST.get(), TestChestScreen::new);
        ScreenManager.registerFactory(TestChestContainerTypes.LIME_CHEST.get(), TestChestScreen::new);
        ScreenManager.registerFactory(TestChestContainerTypes.GREEN_CHEST.get(), TestChestScreen::new);
        ScreenManager.registerFactory(TestChestContainerTypes.CYAN_CHEST.get(), TestChestScreen::new);
        ScreenManager.registerFactory(TestChestContainerTypes.LIGHT_BLUE_CHEST.get(), TestChestScreen::new);
        ScreenManager.registerFactory(TestChestContainerTypes.BLUE_CHEST.get(), TestChestScreen::new);
        ScreenManager.registerFactory(TestChestContainerTypes.PURPLE_CHEST.get(), TestChestScreen::new);
        ScreenManager.registerFactory(TestChestContainerTypes.MAGENTA_CHEST.get(), TestChestScreen::new);
        ScreenManager.registerFactory(TestChestContainerTypes.PINK_CHEST.get(), TestChestScreen::new);
        ScreenManager.registerFactory(TestChestContainerTypes.WHITE_CHEST.get(), TestChestScreen::new);
        ScreenManager.registerFactory(TestChestContainerTypes.LIGHT_GRAY_CHEST.get(), TestChestScreen::new);
        ScreenManager.registerFactory(TestChestContainerTypes.GRAY_CHEST.get(), TestChestScreen::new);
        ScreenManager.registerFactory(TestChestContainerTypes.BLACK_CHEST.get(), TestChestScreen::new);
        ScreenManager.registerFactory(TestChestContainerTypes.BROWN_CHEST.get(), TestChestScreen::new);

        ClientRegistry.bindTileEntityRenderer(TestChestTileEntityTypes.RED_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TestChestTileEntityTypes.ORANGE_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TestChestTileEntityTypes.YELLOW_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TestChestTileEntityTypes.LIME_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TestChestTileEntityTypes.GREEN_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TestChestTileEntityTypes.CYAN_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TestChestTileEntityTypes.LIGHT_BLUE_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TestChestTileEntityTypes.BLUE_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TestChestTileEntityTypes.PURPLE_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TestChestTileEntityTypes.MAGENTA_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TestChestTileEntityTypes.PINK_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TestChestTileEntityTypes.WHITE_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TestChestTileEntityTypes.LIGHT_GRAY_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TestChestTileEntityTypes.GRAY_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TestChestTileEntityTypes.BLACK_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TestChestTileEntityTypes.BROWN_CHEST.get(), TestChestTileEntityRenderer::new);

        DeferredWorkQueue.runLater(() -> {
            // Done here to avoid race conditions and possible crashes if the WorldGenRegistry is accessed at same time.
            // Forge regsitries are safe. WorldGenRegistries is said to not be threadsafe.
            ModConfiguredFeatures.registerCFs();
            GlobalEntityTypeAttributes.put(ModEntities.FAIRY_FLY.get(), FairyFlyEntity.setCustomAttributes().create());
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("maidensmaterials", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}