package com.maideniles.maidensmaterials;

import com.maideniles.maidensmaterials.client.RenderLayers;
import com.maideniles.maidensmaterials.entity.FairyFlyEntity;
import com.maideniles.maidensmaterials.init.*;
import com.maideniles.maidensmaterials.screen.MaidensChestScreen;
import com.maideniles.maidensmaterials.tileentity.TestChestTileEntityRenderer;
import com.maideniles.maidensmaterials.util.KVP;
import com.maideniles.maidensmaterials.util.Registration;
import com.maideniles.maidensmaterials.world.biome.ModSurfaceBuilders;
import com.maideniles.maidensmaterials.util.ConfigHandler;
import com.maideniles.maidensmaterials.world.gen.ore.OreType;
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

    private static MaidensMaterials instance;

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

    public KVP config;

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public MaidensMaterials() {

        ConfigHandler.makeConfigIfAbsent();
        config = ConfigHandler.getConfig();
        OreType.loadFromConfig(config);
        MaidensMaterials.instance = this;
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




        MaidensChestBlocks.BLOCKS.register(modBus);
        MaidensChestTileEntityTypes.TILE_ENTITIES.register(modBus);
        MaidensChestContainerTypes.CONTAINERS.register(modBus);





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

    public static MaidensMaterials getInstance() { return instance; }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());




        ScreenManager.registerFactory(MaidensChestContainerTypes.RED_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.ORANGE_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.YELLOW_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.LIME_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.GREEN_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.CYAN_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.LIGHT_BLUE_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.BLUE_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.PURPLE_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.MAGENTA_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.PINK_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.WHITE_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.LIGHT_GRAY_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.GRAY_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.BLACK_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.BROWN_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.CRABAPPLE_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.POINCIANA_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.LABURNUM_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.JADE_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.PAULOWNIA_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.WISTERIA_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.JACARANDA_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.DOGWOOD_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.SILVERBELL_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.CEDAR_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.PALM_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.ACACIA_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.BIRCH_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.OAK_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.JUNGLE_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.SPRUCE_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.DARK_OAK_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.CRIMSON_CHEST.get(), MaidensChestScreen::new);
        ScreenManager.registerFactory(MaidensChestContainerTypes.WARPED_CHEST.get(), MaidensChestScreen::new);

        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.RED_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.ORANGE_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.YELLOW_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.LIME_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.GREEN_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.CYAN_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.LIGHT_BLUE_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.BLUE_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.PURPLE_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.MAGENTA_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.PINK_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.WHITE_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.LIGHT_GRAY_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.GRAY_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.BLACK_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.BROWN_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.CRABAPPLE_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.POINCIANA_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.LABURNUM_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.JADE_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.PAULOWNIA_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.WISTERIA_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.JACARANDA_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.DOGWOOD_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.SILVERBELL_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.CEDAR_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.PALM_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.ACACIA_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.BIRCH_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.OAK_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.JUNGLE_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.SPRUCE_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.DARK_OAK_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.CRIMSON_CHEST.get(), TestChestTileEntityRenderer::new);
        ClientRegistry.bindTileEntityRenderer(MaidensChestTileEntityTypes.WARPED_CHEST.get(), TestChestTileEntityRenderer::new);

        DeferredWorkQueue.runLater(() -> {
            // Done here to avoid race conditions and possible crashes if the WorldGenRegistry is accessed at same time.
            // Forge regsitries are safe. WorldGenRegistries is said to not be threadsafe.
            ModConfiguredFeatures.registerCFs();
            ModPotions.addPotionRecipes();
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

   //testing config for steve



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