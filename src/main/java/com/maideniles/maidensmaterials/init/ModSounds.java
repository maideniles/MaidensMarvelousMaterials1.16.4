package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.util.Registration;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;

public class ModSounds {


    public static final RegistryObject<SoundEvent> FAIRY_FLY_AMBIENT = Registration.SOUNDS.register("fairy_fly_ambient",
            () -> new SoundEvent(new ResourceLocation(MaidensMaterials.MOD_ID, "fairy_fly_ambient")));

    public static final RegistryObject<SoundEvent> FAIRY_FLY_HURT= Registration.SOUNDS.register("fairy_fly_hurt",
            () -> new SoundEvent(new ResourceLocation(MaidensMaterials.MOD_ID, "fairy_fly_hurt")));

    public static final RegistryObject<SoundEvent> FAIRY_FLY_DIE = Registration.SOUNDS.register("fairy_fly_die",
            () -> new SoundEvent(new ResourceLocation(MaidensMaterials.MOD_ID, "fairy_fly_die")));


    public static void register(){}
}
