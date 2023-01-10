package org.storbrit.mint.foodvariants;

import org.storbrit.mint.Mint;
import org.storbrit.mint.foodvariants.reg.FoodVariantsItems;

public class FoodVariantsFeature {
	public static void init() {
		Mint.LOGGER.info("Initialising food variants feature");

		FoodVariantsItems.init();
	}
}
