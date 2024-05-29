package com.beast.backpackedwoc.backpack;

import com.beast.backpackedwoc.BackpackedWorldOfColor;
import com.beast.backpackedwoc.client.model.WCModelInstances;
import com.mrcrayfish.backpacked.common.backpack.Backpack;
import com.mrcrayfish.backpacked.data.tracker.IProgressTracker;
import com.mrcrayfish.backpacked.data.tracker.ProgressFormatters;
import com.mrcrayfish.backpacked.data.tracker.impl.CountProgressTracker;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class WCBackpack extends Backpack {
    private final String color;
    private final Identifier ID;

    public WCBackpack(String color) {
        super(new Identifier(BackpackedWorldOfColor.MOD_ID, color));
        this.color = color;
        this.ID = new Identifier(BackpackedWorldOfColor.MOD_ID, color);
    }

    public boolean isUnlocked(PlayerEntity player) {
        return true;
    }

    @Override
    public Supplier<Object> getModelSupplier() {
        WCModelInstances instances = WCModelInstances.get();
        return () -> instances.getModel(color);
    }

    @Nullable
    public IProgressTracker createProgressTracker() {
        return new CountProgressTracker(1, ProgressFormatters.COLLECT_X_OF_X);
    }

    public Identifier getId() {
        return ID;
    }
}
