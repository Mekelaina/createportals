package com.mekelaina.createportals;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class CreatePortalsBlocks {
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreatePortals.MOD_ID);

	public static final BlockEntry<Block> EXAMPLE_BLOCK = REGISTRATE.block("example_block", Block::new)
			.simpleItem()
			.register();


	public static void init() {
		// load the class and register everything
		CreatePortals.LOGGER.info("Registering blocks for " + CreatePortals.NAME);
	}
}
