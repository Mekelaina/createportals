package com.mekelaina.createportals;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;

public class CPBlocks {
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreatePortals.MOD_ID);

	public static final BlockEntry<Block> PORTAL_FRAME = REGISTRATE.block("portal_frame", Block::new)
			.simpleItem()
			.register();



	public static void init() {
		// load the class and register everything
		CreatePortals.LOGGER.info("Registering blocks for " + CreatePortals.NAME);
	}
}
