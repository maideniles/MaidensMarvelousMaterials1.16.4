package com.maideniles.maidensmaterials.entity;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.maideniles.maidensmaterials.init.ModEntities;
import com.maideniles.maidensmaterials.init.ModItems;
import com.maideniles.maidensmaterials.init.ModSounds;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.entity.passive.IFlyingAnimal;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class FairyFlyEntity extends ParrotEntity implements IFlyingAnimal {

    private static final Item TAME_ITEMS = ModItems.FLORAL_ESSENCE.get();
    private static final Item DEADLY_ITEM = ModItems.EARTHEN_ESSENCE.get();
    private static final Ingredient TEMPTATION_ITEMS = Ingredient.fromItems(ModItems.FLORAL_ESSENCE.get(),
            ModItems.EARTHEN_ESSENCE.get());


    public FairyFlyEntity(EntityType<? extends ParrotEntity> type, World worldIn) {
        super(type, worldIn);
    }




    public static AttributeModifierMap.MutableAttribute setCustomAttributes(){

        return MobEntity.func_233666_p_().createMutableAttribute(Attributes.MAX_HEALTH, 20D)
                .createMutableAttribute(Attributes.FLYING_SPEED, 0.6F)
                .createMutableAttribute(Attributes.LUCK, 5F);

    }
@Override
    public boolean canSitOnShoulder() {
        return false;
    }












    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(2, new FollowOwnerGoal(this, 1.0D, 5.0F, 1.0F, true));
        this.goalSelector.addGoal(2, new WaterAvoidingRandomFlyingGoal(this, 1.0D));
        this.goalSelector.addGoal(2, new SitGoal(this));
        this.goalSelector.addGoal(1, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(0, new PanicGoal(this, 1.25D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.0D, false, TEMPTATION_ITEMS));
    }
@Override
public ActionResultType getEntityInteractionResult(PlayerEntity playerIn, Hand hand) {
    ItemStack itemstack = playerIn.getHeldItem(hand);
    if (!this.isTamed() && TAME_ITEMS==(itemstack.getItem())) {
        if (!playerIn.abilities.isCreativeMode) {
            itemstack.shrink(1);
        }

        if (!this.isSilent()) {
            this.world.playSound((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.ENTITY_PARROT_EAT, this.getSoundCategory(), 1.0F, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F);
        }

        if (!this.world.isRemote) {
            if (this.rand.nextInt(10) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, playerIn)) {
                this.setTamedBy(playerIn);
                this.world.setEntityState(this, (byte)7);
            } else {
                this.world.setEntityState(this, (byte)6);
            }
        }

        return ActionResultType.func_233537_a_(this.world.isRemote);
    } else if (itemstack.getItem() == DEADLY_ITEM) {
        if (!playerIn.abilities.isCreativeMode) {
            itemstack.shrink(1);
        }

        this.addPotionEffect(new EffectInstance(Effects.POISON, 900));
        if (playerIn.isCreative() || !this.isInvulnerable()) {
            this.attackEntityFrom(DamageSource.causePlayerDamage(playerIn), Float.MAX_VALUE);
        }

        return ActionResultType.func_233537_a_(this.world.isRemote);
    } else if (!this.isFlying() && this.isTamed() && this.isOwner(playerIn)) {
        if (!this.world.isRemote) {
            this.setSitting(!this.isQueuedToSit());
        }

        return ActionResultType.func_233537_a_(this.world.isRemote);
    } else {
        return super.getEntityInteractionResult(playerIn, hand);
    }
}

    @Nullable
    @Override
    public SoundEvent getAmbientSound() {
        return ModSounds.FAIRY_FLY_AMBIENT.get();
    }

    @Override
    protected float playFlySound(float volume) {
        this.playSound(ModSounds.FAIRY_FLY_AMBIENT.get(), 0.15F, 1.0F);
        return volume + this.flapSpeed / 2.0F;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return ModSounds.FAIRY_FLY_HURT.get();
    }

    protected SoundEvent getDeathSound() {
        return ModSounds.FAIRY_FLY_DIE.get();
    }





        @Override
    protected boolean makeFlySound() {
        return false;
    }

    @Override
    protected float getSoundVolume() {
        return 0.1F;
    }

    @Override
    public boolean isFlying() {
        return !this.onGround;
    }


    public Vector3d func_241205_ce_() {
        return new Vector3d(0.0D, (double)(0.5F * this.getEyeHeight()), (double)(this.getWidth() * 0.4F));
    }

    @Nullable
    @Override
    public AgeableEntity createChild(ServerWorld world, AgeableEntity mate)
    {
        return ModEntities.FAIRY_FLY.get().create(this.world);
    }





}
