package org.storbrit.mint.toolvariants.reg;

import net.minecraft.item.*;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.storbrit.britlib.reg.ItemRegistry;
import org.storbrit.mint.Mint;
import org.storbrit.mint.toolvariants.item.TVToolMaterials;

@SuppressWarnings("unused")
public class ToolVariantsItems {
	// VERY NECESSARY COMMENT: I added the deepslate tools while I was having an NSFW discussion with my boyfriend.
	public static final Item DEEPSLATE_SWORD = ItemRegistry.add(Mint.id("deepslate_sword"),
			new SwordItem(TVToolMaterials.DEEPSLATE, 3, -2.4F, new QuiltItemSettings()),
			ItemGroups.COMBAT, Items.STONE_SWORD);
	public static final Item DEEPSLATE_SHOVEL = ItemRegistry.add(Mint.id("deepslate_shovel"),
			new ShovelItem(TVToolMaterials.DEEPSLATE, 1.5F, -3.0F, new QuiltItemSettings()),
			ItemGroups.TOOLS, Items.STONE_HOE);
	public static final Item DEEPSLATE_PICKAXE = ItemRegistry.add(Mint.id("deepslate_pickaxe"),
			new PickaxeItem(TVToolMaterials.DEEPSLATE, 1, -2.8F, new QuiltItemSettings()),
			ItemGroups.TOOLS, Items.STONE_HOE);
	public static final Item DEEPSLATE_AXE = ItemRegistry.add(Mint.id("deepslate_axe"),
			new AxeItem(TVToolMaterials.DEEPSLATE, 7.0F, -3.2F, new QuiltItemSettings()),
			ItemGroups.TOOLS, Items.STONE_HOE);
	public static final Item DEEPSLATE_HOE = ItemRegistry.add(Mint.id("deepslate_hoe"),
			new HoeItem(TVToolMaterials.DEEPSLATE, -1, -2.0F, new QuiltItemSettings()),
			ItemGroups.TOOLS, Items.STONE_HOE);
	public static final Item NETHERRACK_SWORD = ItemRegistry.add(Mint.id("netherrack_sword"),
			new SwordItem(TVToolMaterials.NETHERRACK, 3, -2.4F, new QuiltItemSettings()),
			ItemGroups.COMBAT, Items.STONE_SWORD);
	public static final Item NETHERRACK_SHOVEL = ItemRegistry.add(Mint.id("netherrack_shovel"),
			new ShovelItem(TVToolMaterials.NETHERRACK, 1.5F, -3.0F, new QuiltItemSettings()),
			ItemGroups.TOOLS, Items.STONE_HOE);
	public static final Item NETHERRACK_PICKAXE = ItemRegistry.add(Mint.id("netherrack_pickaxe"),
			new PickaxeItem(TVToolMaterials.NETHERRACK, 1, -2.8F, new QuiltItemSettings()),
			ItemGroups.TOOLS, Items.STONE_HOE);
	public static final Item NETHERRACK_AXE = ItemRegistry.add(Mint.id("netherrack_axe"),
			new AxeItem(TVToolMaterials.NETHERRACK, 7.0F, -3.2F, new QuiltItemSettings()),
			ItemGroups.TOOLS, Items.STONE_HOE);
	public static final Item NETHERRACK_HOE = ItemRegistry.add(Mint.id("netherrack_hoe"),
			new HoeItem(TVToolMaterials.NETHERRACK, -1, -2.0F, new QuiltItemSettings()),
			ItemGroups.TOOLS, Items.STONE_HOE);

	public static void init() {
		Mint.LOGGER.debug("Registering tool variant items");
	}
}
