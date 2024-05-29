package com.beast.backpackedwoc.mixin;

import com.beast.backpackedwoc.BackpackedWorldOfColorClient;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.resource.ResourceManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityModelLoader.class)
public class EntityModelSetMixin {
    public EntityModelSetMixin() {
    }

    @Inject(
        method = "reload",
        at = @At(value = "TAIL")
    )
    private void backpackedBakeBackpackModels(ResourceManager manager, CallbackInfo ci) {
        BackpackedWorldOfColorClient.bakeBackpackModels((EntityModelLoader) (Object) this);
    }
}
