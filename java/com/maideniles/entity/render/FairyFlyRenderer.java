package com.maideniles.maidensmaterials.entity.render;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.entity.FairyFlyEntity;
import com.maideniles.maidensmaterials.entity.model.FairyFlyModel;
import com.maideniles.maidensmaterials.world.feature.base.TestTreeFeature;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import java.util.Random;

public class FairyFlyRenderer extends MobRenderer<FairyFlyEntity, FairyFlyModel<FairyFlyEntity>> {
    public static final Random random = new Random();

    public FairyFlyRenderer(EntityRendererManager renderManagerIn)
    {
        super(renderManagerIn, new FairyFlyModel<>(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(FairyFlyEntity entity) {

       return random.nextInt(6)==0 ?(new ResourceLocation(MaidensMaterials.MOD_ID, "textures/entity/fairy_fly.png")):
                new ResourceLocation(MaidensMaterials.MOD_ID, "textures/entity/fairy_fly2.png");

       //return new ResourceLocation(MaidensMaterials.MOD_ID, "textures/entity/fairy_fly.png");
    }
}
