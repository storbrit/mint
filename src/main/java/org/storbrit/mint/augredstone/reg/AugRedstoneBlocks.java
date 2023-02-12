package org.storbrit.mint.augredstone.reg;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.storbrit.britlib.reg.BlockRegistry;
import org.storbrit.mint.Mint;
import org.storbrit.mint.augredstone.block.AugmentedRedstoneWireBlock;

public class AugRedstoneBlocks {
	public static final Block AUGMENTED_REDSTONE_WIRE = BlockRegistry.add(Mint.id("augmented_redstone_wire"),
			new AugmentedRedstoneWireBlock(QuiltBlockSettings.of(Material.DECORATION).noCollision().breakInstantly()),
			false);

	public static void init() {
		Mint.LOGGER.debug("Registering augmented redstone blocks");
	}
}
