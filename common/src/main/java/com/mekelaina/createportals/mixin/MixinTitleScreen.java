package com.mekelaina.createportals.mixin;

import com.mekelaina.createportals.CreatePortals;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MixinTitleScreen {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        CreatePortals.LOGGER.info("Hello from {}!", CreatePortals.class.getName());
    }
}