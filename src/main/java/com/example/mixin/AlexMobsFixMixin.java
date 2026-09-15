package com.example.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// This is a shim to handle the ClassCastException by intercepting the problematic call.
// Since the actual Alex's Mobs classes aren't in the classpath, 
// we use a Mixin to block or redirect the initialization that causes the crash.
@Mixin(targets = "com.github.alexthe666.alexsmobs.item.ItemTabIcon")
public class AlexMobsFixMixin {
    @Inject(method = "initializeClient", at = @At("HEAD"), cancellable = true)
    private void onInitializeClient(CallbackInfo ci) {
        // By cancelling the original initializeClient, we prevent the ClassCastException.
        // In a full implementation, we would provide a safe adapter here.
        ci.cancel();
    }
}
