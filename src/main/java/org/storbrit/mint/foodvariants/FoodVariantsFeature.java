package org.storbrit.mint.foodvariants;

import org.storbrit.mint.Mint;
import org.storbrit.mint.foodvariants.reg.FoodVariantsBlocks;
import org.storbrit.mint.foodvariants.reg.FoodVariantsItems;

public class FoodVariantsFeature {
	public static void init() {
		Mint.LOGGER.debug("Initialising food variants feature");

		FoodVariantsBlocks.init();
		FoodVariantsItems.init();
	}
}
