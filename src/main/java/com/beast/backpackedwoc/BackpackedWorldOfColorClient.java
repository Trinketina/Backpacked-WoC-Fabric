package com.beast.backpackedwoc;

import com.beast.backpackedwoc.client.model.BackpackColors;
import com.beast.backpackedwoc.client.model.WCLayerDefinitions;
import com.beast.backpackedwoc.client.model.WCBackpackModel;
import com.beast.backpackedwoc.client.model.WCModelInstances;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLoader;

public class BackpackedWorldOfColorClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		for (String color : BackpackColors.COLORS) {
			EntityModelLayerRegistry.registerModelLayer(WCLayerDefinitions.get(color), WCBackpackModel::createLayer);
		}
	}

	public static void bakeBackpackModels(EntityModelLoader entityModelSet) {
		WCModelInstances.get().loadModels(entityModelSet);
	}

}