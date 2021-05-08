package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.tileentity.MaidensChestTileEntity;
import com.maideniles.maidensmaterials.util.Registration;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

public class ModTileEntities {

    public static final RegistryObject<TileEntityType<MaidensChestTileEntity>> PINK_CHEST_TILE_ENTITY
            = Registration.TILE_ENTITY_TYPES.register("pink_chest_tile_entity", ()-> TileEntityType.Builder.create(
            ()-> new MaidensChestTileEntity(), ModBlocks.PINK_CHEST.get()).build(null));

public static void register(){
}

}
