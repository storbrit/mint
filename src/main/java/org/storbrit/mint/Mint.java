package org.storbrit.mint;

import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.storbrit.mint.augredstone.AugRedstoneFeature;
import org.storbrit.mint.foodvariants.FoodVariantsFeature;
import org.storbrit.mint.toolvariants.ToolVariantsFeature;

public class Mint implements ModInitializer {
	public static final String MOD_ID = "mint";
	public static final Logger LOGGER = LoggerFactory.getLogger("Mint");

	@Override
	public void onInitialize(ModContainer mod) {
		Mint.LOGGER.info("how it feels to chew 5 MINT");

		AugRedstoneFeature.init();
		FoodVariantsFeature.init();
		ToolVariantsFeature.init();
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
