package com.mekelaina.createportals.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import com.mekelaina.createportals.CPBlocks;
import com.mekelaina.createportals.CreatePortals;
import net.fabricmc.api.ModInitializer;

public class CreatePortalsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CreatePortals.init();
        CreatePortals.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), CreatePortals.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        CPBlocks.REGISTRATE.register();
    }
}
