package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.container.MaidensChestContainer;
import com.maideniles.maidensmaterials.util.Registration;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;

public class ModContainers
{
    public static final RegistryObject<ContainerType<MaidensChestContainer>> PINK_CHEST_CONTAINER
            = Registration.CONTAINERS.register("pink_chest_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World world = inv.player.getEntityWorld();
                return new MaidensChestContainer(windowId, world, pos, inv, inv.player);
            })));

    public static void register(){}


}
