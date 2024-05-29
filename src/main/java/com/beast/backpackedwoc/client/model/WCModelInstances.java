package com.beast.backpackedwoc.client.model;

import com.mrcrayfish.backpacked.client.model.backpack.BackpackModel;
import net.minecraft.client.render.entity.model.EntityModelLoader;

import java.util.HashMap;
import java.util.Map;

public class WCModelInstances {
    private static WCModelInstances instance;

    private final Map<String, BackpackModel> models = new HashMap<>();


    public static WCModelInstances get() {
        if (instance == null) {
            instance = new WCModelInstances();
        }

        return instance;
    }

    private WCModelInstances() {
    }

    public void loadModels(EntityModelLoader loader) {
        for (String color : BackpackColors.COLORS) {
            models.put(color, new WCBackpackModel(loader.getModelPart(WCLayerDefinitions.get(color)), color));
        }
    }

    public BackpackModel getModel(String color) {
        return models.get(color);
    }
}
