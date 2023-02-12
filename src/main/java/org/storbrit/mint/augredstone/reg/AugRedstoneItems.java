package org.storbrit.mint.augredstone.reg;

import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.storbrit.britlib.reg.ItemRegistry;
import org.storbrit.mint.Mint;

public class AugRedstoneItems {
	public static final BlockItem AUGMENTED_REDSTONE = ItemRegistry.add(Mint.id("augmented_redstone"),
			new AliasedBlockItem(AugRedstoneBlocks.AUGMENTED_REDSTONE_WIRE, new QuiltItemSettings()),
			ItemGroups.REDSTONE, Items.REDSTONE);

	public static void init() {
		Mint.LOGGER.debug("Registering augmented redstone items");
	}
}
