package com.beast.backpackedwoc;

import com.beast.backpackedwoc.backpack.WCBackpack;
import com.beast.backpackedwoc.client.model.BackpackColors;
import com.mrcrayfish.backpacked.common.backpack.BackpackManager;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BackpackedWorldOfColor implements ModInitializer {
	public static final String MOD_ID = "backpacked-world-of-color";
    public static final Logger LOGGER = LoggerFactory.getLogger("Backpacked: World of Color");

	@Override
	public void onInitialize() {
		for (String color : BackpackColors.COLORS) {
			BackpackManager.instance().register(new WCBackpack(color));
		}

		LOGGER.info("Hello Backpacked: World of Color!");
	}
}