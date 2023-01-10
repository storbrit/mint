package org.storbrit.mint.foodvariants.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.CakeBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;

public class ChocolateCakeBlock extends CakeBlock {
	public ChocolateCakeBlock(AbstractBlock.Settings settings) {
		super(settings);
	}

	@SuppressWarnings("unused")
	protected static ActionResult tryEat(WorldAccess world, BlockPos pos, BlockState state, PlayerEntity player) {
		if (!player.canConsume(false)) {
			return ActionResult.PASS;
		} else {
			player.incrementStat(Stats.EAT_CAKE_SLICE);
			player.getHungerManager().add(2, 0.1F);
			int i = state.get(BITES);
			world.emitGameEvent(player, GameEvent.EAT, pos);
			if (i < 6) {
				world.setBlockState(pos, state.with(BITES, i + 1), 3);
			} else {
				world.removeBlock(pos, false);
				world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, pos);
			}

			return ActionResult.SUCCESS;
		}
	}
}
