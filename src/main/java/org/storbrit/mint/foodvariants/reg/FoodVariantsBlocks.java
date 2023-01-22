package org.storbrit.mint.foodvariants.reg;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.storbrit.mint.Mint;
import org.storbrit.mint.foodvariants.block.ChocolateCakeBlock;

@SuppressWarnings("unused")
public class FoodVariantsBlocks {
	public static final Block CHOCOLATE_CAKE = register("chocolate_cake", ItemGroups.FOOD_AND_DRINK, Items.CAKE,
			new ChocolateCakeBlock(
					AbstractBlock.Settings.of(Material.CAKE).strength(0.5F).sounds(BlockSoundGroup.WOOL)));

	@SuppressWarnings("UnstableApiUsage")
	private static Block register(String id, ItemGroup group, Item groupTarget, Block block) {
		Block result = Registry.register(Registries.BLOCK, new Identifier(Mint.MOD_ID, id), block);
		FoodVariantsItems.register(id, group, groupTarget, new BlockItem(result, new QuiltItemSettings()));

		return result;
	}

	public static void init() {
		Mint.LOGGER.info("Registering food variant blocks");
	}
}
