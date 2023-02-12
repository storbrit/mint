package org.storbrit.mint.mixin.augredstone;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.storbrit.mint.augredstone.reg.AugRedstoneBlocks;

@Mixin(World.class)
public abstract class WorldMixin {
	@Shadow
	public abstract BlockState getBlockState(BlockPos pos);

	@Inject(at = @At("HEAD"), method = "getEmittedRedstonePower", cancellable = true)
	public void dontTransmitAugRedstonePower(BlockPos pos, Direction direction, CallbackInfoReturnable<Integer> cir) {
		if ((this.getBlockState(pos.offset(direction.getOpposite())).getBlock() == Blocks.REDSTONE_WIRE &&
				this.getBlockState(pos).getBlock() ==
						AugRedstoneBlocks.AUGMENTED_REDSTONE_WIRE) ||
				(this.getBlockState(pos.offset(direction.getOpposite())).getBlock() == AugRedstoneBlocks.AUGMENTED_REDSTONE_WIRE &&
						this.getBlockState(pos).getBlock() ==
								Blocks.REDSTONE_WIRE)) {
			cir.setReturnValue(0);
		}
	}
}
