package com.example.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "net.fantomrat.fallingsnow.entity.FallingSnowEntity")
public class FallingSnowOptimizationMixin {
    @Inject(method = "tick", at = @At("HEAD"), cancellable = true)
    private void optimizeTick(CallbackInfo ci) {
        if (isTooFarFromPlayers()) {
            ci.cancel();
        }
    }

    private boolean isTooFarFromPlayers() {
        return false; 
    }
}
