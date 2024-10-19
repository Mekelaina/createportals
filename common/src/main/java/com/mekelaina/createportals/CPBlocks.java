package com.mekelaina.createportals;


import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;

public class CPBlocks {


	static { CPModGroup.useModTab(CPModGroup.CP_TAB_KEY);}

	public static final BlockEntry<Block> PORTAL_FRAME = CreatePortals.REGISTRATE.block("portal_frame", Block::new)
			.simpleItem()
			.register();



	public static void init() {
		// load the class and register everything
		CreatePortals.LOGGER.info("Registering blocks for " + CreatePortals.NAME);
	}
}
