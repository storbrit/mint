package org.storbrit.mint.foodvariants.reg;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.storbrit.britlib.reg.ItemRegistry;
import org.storbrit.mint.Mint;
import org.storbrit.mint.foodvariants.item.FVFoodComponents;

@SuppressWarnings("unused")
public class FoodVariantsItems {
	public static final Item GREEN_APPLE = ItemRegistry.add(Mint.id("green_apple"),
			new Item((new QuiltItemSettings()).food(FVFoodComponents.GREEN_APPLE)), ItemGroups.FOOD_AND_DRINK,
			Items.APPLE);
	public static final Item CHOCOLATE_BAR = ItemRegistry.add(Mint.id("chocolate_bar"),
			new Item((new QuiltItemSettings()).food(FVFoodComponents.CHOCOLATE_BAR)), ItemGroups.FOOD_AND_DRINK,
			Items.COOKIE);

	@SuppressWarnings("UnstableApiUsage")
	protected static Item register(String id, ItemGroup group, Item groupTarget, Item item) {
		Item result = Registry.register(Registries.ITEM, new Identifier(Mint.MOD_ID, id), item);
		ItemGroupEvents.modifyEntriesEvent(group).register(content -> content.addAfter(groupTarget, result));

		return result;
	}

	public static void init() {
		Mint.LOGGER.info("Registering food variant items");
	}
}
