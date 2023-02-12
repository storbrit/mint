package org.storbrit.mint;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.storbrit.mint.augredstone.AugRedstoneFeature;

public class MintClient implements ClientModInitializer {
	@Override
	public void onInitializeClient(ModContainer mod) {
		Mint.LOGGER.debug("hello minecraft world from mint client");

		AugRedstoneFeature.initClient();
	}
}
