package org.storbrit.mint.toolvariants;

import org.storbrit.mint.Mint;
import org.storbrit.mint.toolvariants.reg.ToolVariantsItems;

public class ToolVariantsFeature {
	public static void init() {
		Mint.LOGGER.debug("Initialising tool variants feature");

		ToolVariantsItems.init();
	}
}
