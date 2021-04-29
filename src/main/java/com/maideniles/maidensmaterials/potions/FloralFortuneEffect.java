package com.maideniles.maidensmaterials.potions;

import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class FloralFortuneEffect extends Effect {
    public FloralFortuneEffect() {
        super(EffectType.BENEFICIAL, 7033103);
    }


    @Override
    public boolean isReady(int duration, int amplifier) {
        return duration % 100 == 0;  // preform effect once every 5 seconds
    }


}