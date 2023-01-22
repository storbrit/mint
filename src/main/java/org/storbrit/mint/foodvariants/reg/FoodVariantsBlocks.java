package org.storbrit.mint.foodvariants.reg;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroups;
import net.minecraft.sound.BlockSoundGroup;
import org.storbrit.britlib.reg.BlockRegistry;
import org.storbrit.mint.Mint;
import org.storbrit.mint.foodvariants.block.ChocolateCakeBlock;

@SuppressWarnings("unused")
public class FoodVariantsBlocks {
	public static final Block CHOCOLATE_CAKE = BlockRegistry.add(Mint.id("chocolate_cake"), new ChocolateCakeBlock(
					AbstractBlock.Settings.of(Material.CAKE).strength(0.5F).sounds(BlockSoundGroup.WOOL)),
			ItemGroups.FOOD_AND_DRINK, Blocks.CAKE.asItem());

	public static void init() {
		Mint.LOGGER.debug("Registering food variant blocks");
	}
}
