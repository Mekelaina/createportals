package com.mekelaina.createportals;

import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.CreateRegistrate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreatePortals {
    public static final String MOD_ID = "createportals";
    public static final String NAME = "Create Portals";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreatePortals.MOD_ID);


    public static void init() {
        LOGGER.info("{} initializing! Create version: {} on platform: {}", NAME, Create.VERSION, ExampleExpectPlatform.platformName());
        CPBlocks.init();
        CPModGroup.register();
    }

   /* public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }*/

}
