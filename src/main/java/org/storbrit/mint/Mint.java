package org.storbrit.mint;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.storbrit.mint.foodvariants.FoodVariantsFeature;

public class Mint implements ModInitializer {
	public static final String MOD_ID = "mint";
	public static final Logger LOGGER = LoggerFactory.getLogger("Mint");

	@Override
	public void onInitialize(ModContainer mod) {
		FoodVariantsFeature.init();
	}
}
