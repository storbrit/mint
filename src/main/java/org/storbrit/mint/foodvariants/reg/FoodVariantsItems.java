package org.storbrit.mint.foodvariants.reg;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.storbrit.mint.Mint;

@SuppressWarnings("unused")
public class FoodVariantsItems {
	// I intend for the green apple to have slightly different hunger and saturation values, but I haven't gotten
	// around to it yet
	public static final Item GREEN_APPLE = register("green_apple", ItemGroups.FOOD_AND_DRINK, Items.APPLE,
			new Item((new QuiltItemSettings()).food(FoodComponents.APPLE)));

	@SuppressWarnings("UnstableApiUsage")
	private static Item register(String id, ItemGroup group, Item groupTarget, Item item) {
		Item result = Registry.register(Registries.ITEM, new Identifier(Mint.MOD_ID, id), item);

		ItemGroupEvents.modifyEntriesEvent(group).register(content -> content.addAfter(groupTarget, result));

		return result;
	}

	public static void init() {
		Mint.LOGGER.info("Registering food variants");
	}
}
