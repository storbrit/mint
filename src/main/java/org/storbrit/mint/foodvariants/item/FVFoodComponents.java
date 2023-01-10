package org.storbrit.mint.foodvariants.item;

import net.minecraft.item.FoodComponent;

public class FVFoodComponents {
	public static final FoodComponent GREEN_APPLE =
			new FoodComponent.Builder().hunger(2).saturationModifier(0.8F).build();
	public static final FoodComponent CHOCOLATE_BAR =
			new FoodComponent.Builder().hunger(7).saturationModifier(0.1F).build();
}
