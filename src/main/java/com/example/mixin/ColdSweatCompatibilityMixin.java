package com.example.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = "net.minecraft.class_5168")
public class ColdSweatCompatibilityMixin {
    @Redirect(
        method = "dispense", 
        at = @At(value = "INVOKE", target = "Lnet/minecraft/class_5168;dispense(Lnet/minecraft/class_3218;Lnet/minecraft/class_2338;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V")
    )
    private void handleDispense(Object block, Object world, CallbackInfoReturnable ci) {
        // Use Object to avoid compilation errors with intermediary names
    }
}
