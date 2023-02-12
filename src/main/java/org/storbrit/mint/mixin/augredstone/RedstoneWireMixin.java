package org.storbrit.mint.mixin.augredstone;

import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneWireBlock;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.storbrit.mint.augredstone.reg.AugRedstoneBlocks;

@Mixin(RedstoneWireBlock.class)
public class RedstoneWireMixin {
	@Inject(at = @At("HEAD"), method = "connectsTo(Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/Direction;)Z",cancellable = true)
	private static void dontConnectAugmented(BlockState state, Direction dir, CallbackInfoReturnable<Boolean> cir) {
		if (state.isOf(AugRedstoneBlocks.AUGMENTED_REDSTONE_WIRE)) {
			cir.setReturnValue(false);
		}
	}
}
