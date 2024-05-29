package com.beast.backpackedwoc.client.model;

import com.beast.backpackedwoc.BackpackedWorldOfColor;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class WCLayerDefinitions {
    public static final Map<String, EntityModelLayer> LAYERS = new HashMap<>();

    static {
        for (String color : BackpackColors.COLORS) {
            register(color);
        }
    }

    public WCLayerDefinitions() {
    }

    private static void register(String color) {
        LAYERS.put(color, new EntityModelLayer(new Identifier(BackpackedWorldOfColor.MOD_ID, color), "main"));
    }

    public static EntityModelLayer get(String color) {
        return LAYERS.computeIfAbsent(color, c -> new EntityModelLayer(new Identifier(BackpackedWorldOfColor.MOD_ID, c + "_backpack" ), "main"));
    }
}
