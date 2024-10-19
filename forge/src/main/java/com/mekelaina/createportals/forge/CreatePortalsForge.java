package com.mekelaina.createportals.forge;

import com.mekelaina.createportals.CreatePortals;
import com.mekelaina.createportals.CPBlocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreatePortals.MOD_ID)
public class CreatePortalsForge {
    public CreatePortalsForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CPBlocks.REGISTRATE.registerEventListeners(eventBus);
        CreatePortals.init();
    }
}
