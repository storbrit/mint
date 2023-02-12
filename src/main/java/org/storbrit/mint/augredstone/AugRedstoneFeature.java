package org.storbrit.mint.augredstone;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Items;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;
import org.storbrit.mint.Mint;
import org.storbrit.mint.augredstone.block.AugmentedRedstoneWireBlock;
import org.storbrit.mint.augredstone.reg.AugRedstoneBlocks;
import org.storbrit.mint.augredstone.reg.AugRedstoneItems;

public class AugRedstoneFeature {
	public static void init() {
		Mint.LOGGER.debug("Initialising augmented redstone feature");

		AugRedstoneBlocks.init();
		AugRedstoneItems.init();

		UseBlockCallback.EVENT.register(((player, world, hand, hitResult) -> {
			BlockState state = world.getBlockState(hitResult.getBlockPos());
			if (player.getMainHandStack().isOf(Items.BLAZE_ROD)) {
				if (state.getBlock() == Blocks.REDSTONE_WIRE) {
					world.setBlockState(hitResult.getBlockPos(),
							AugRedstoneBlocks.AUGMENTED_REDSTONE_WIRE.getStateWithProperties(state));
					return ActionResult.SUCCESS;
				} else if (state.getBlock() == AugRedstoneBlocks.AUGMENTED_REDSTONE_WIRE) {
					world.setBlockState(hitResult.getBlockPos(), Blocks.REDSTONE_WIRE.getStateWithProperties(state));
					return ActionResult.SUCCESS;
				}
			}
			return ActionResult.PASS;
		}));
	}

	public static void initClient() {
		Mint.LOGGER.debug("Initialising augmented redstone feature (client)");

		BlockRenderLayerMap.put(RenderLayer.getCutout(), AugRedstoneBlocks.AUGMENTED_REDSTONE_WIRE);
		ColorProviderRegistry.BLOCK.register(
				((blockState, blockRenderView, blockPos, i) -> AugmentedRedstoneWireBlock.getWireColor(blockState.get(
						Properties.POWER))), AugRedstoneBlocks.AUGMENTED_REDSTONE_WIRE);
	}
}
