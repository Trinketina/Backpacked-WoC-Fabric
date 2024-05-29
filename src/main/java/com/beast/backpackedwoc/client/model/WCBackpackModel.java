package com.beast.backpackedwoc.client.model;

import com.beast.backpackedwoc.BackpackedWorldOfColor;
import com.mrcrayfish.backpacked.client.model.backpack.BackpackModel;
import net.minecraft.client.model.*;
import net.minecraft.util.Identifier;

public class WCBackpackModel extends BackpackModel {
    private static final String TEXTURE_BASE_PATH = BackpackedWorldOfColor.MOD_ID + ":textures/entity/";

    public WCBackpackModel(ModelPart root, String color) {
        super(root, getTexture(color));
    }

    private static Identifier getTexture(String color) {
        return new Identifier(TEXTURE_BASE_PATH + color + "_backpack.png");
    }
    
    public static TexturedModelData createLayer() {
        ModelData mesh = new ModelData();
        ModelPartData root = mesh.getRoot();
        ModelPartData backpack = root.addChild("backpack", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
        ModelPartData bag = backpack.addChild("bag", ModelPartBuilder.create().uv(0, 9).cuboid(-3.5F, 0.0F, 0.0F, 7.0F, 4.0F, 4.0F, new Dilation(0.0F)).uv(22, 0).mirrored().cuboid(3.4239F, 3.6173F, 0.016F, 1.0F, 5.0F, 4.0F, new Dilation(0.0F)).mirrored(false).uv(0, 0).cuboid(-3.5F, 4.0F, 0.0F, 7.0F, 5.0F, 4.0F, new Dilation(0.0F)).uv(10, 20).cuboid(-3.5F, 4.568F, 4.0F, 7.0F, 3.0F, 1.0F, new Dilation(0.0F)).uv(22, 0).cuboid(-4.4239F, 3.6173F, 0.016F, 1.0F, 5.0F, 4.0F, new Dilation(0.0F)).uv(18, 0).cuboid(-1.0F, 1.5F, 2.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)).uv(16, 30).cuboid(-1.5F, -1.0F, 1.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -9.0F, 0.0F));
        bag.addChild("part1", ModelPartBuilder.create().uv(22, 9).mirrored().cuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.4239F, 8.6173F, 0.016F, 0.0F, 0.0F, -1.1781F));
        bag.addChild("part2", ModelPartBuilder.create().uv(22, 14).mirrored().cuboid(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.4239F, 3.6173F, 0.016F, 0.0F, 0.0F, 1.1781F));
        bag.addChild("part3", ModelPartBuilder.create().uv(6, 17).cuboid(-3.5F, -1.0F, -2.0F, 7.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.568F, 5.0F, 0.5236F, 0.0F, 0.0F));
        bag.addChild("part4", ModelPartBuilder.create().uv(6, 17).cuboid(-3.5F, 0.0F, -2.0F, 7.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 4.568F, 5.0F, -0.5236F, 0.0F, 0.0F));
        bag.addChild("part5", ModelPartBuilder.create().uv(22, 9).cuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(4.4239F, 8.6173F, 0.016F, 0.0F, 0.0F, 1.1781F));
        bag.addChild("part6", ModelPartBuilder.create().uv(22, 14).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(4.4239F, 3.6173F, 0.016F, 0.0F, 0.0F, -1.1781F));
        bag.addChild("strap", ModelPartBuilder.create().uv(0, 17).cuboid(5.0F, -8.0F, -4.0F, 1.0F, 8.0F, 4.0F, new Dilation(0.0F)).uv(22, 21).mirrored().cuboid(6.0F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)).mirrored(false).uv(0, 17).mirrored().cuboid(0.0F, -8.0F, -4.0F, 1.0F, 8.0F, 4.0F, new Dilation(0.0F)).mirrored(false).uv(22, 21).cuboid(-1.0F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, 8.0F, 0.0F));
        return TexturedModelData.of(mesh, 32, 32);
    }
}

