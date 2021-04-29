package com.maideniles.maidensmaterials.mixin;


import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BushBlock.class)
public class BushBlockMixin {

    @Inject(at = @At("HEAD"), method = "Lnet/minecraft/block/BushBlock;isValidGround(Lnet/minecraft/block/BlockState;Lnet/minecraft/world/IBlockReader;Lnet/minecraft/util/math/BlockPos;)Z", cancellable = true)


    private void validGroundBlocks(BlockState state, IBlockReader worldIn, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (state.isIn(ModBlocks.ORNAMENTAL_MUSHROOM.get())) {
            cir.setReturnValue(true);
        }
    }

}
