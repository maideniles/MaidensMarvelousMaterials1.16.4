package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.entity.FairyFlyEntity;
import com.maideniles.maidensmaterials.util.Registration;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

public class ModEntities {

    public static final RegistryObject<EntityType<FairyFlyEntity>> FAIRY_FLY = Registration.ENTITIES.register("fairy_fly",
            ()-> EntityType.Builder.create(FairyFlyEntity::new, EntityClassification.CREATURE)
            .size(1.5F, 1.5F).build(new ResourceLocation(MaidensMaterials.MOD_ID + "fairy_fly").toString()));


    public static void register(){

    }
}
