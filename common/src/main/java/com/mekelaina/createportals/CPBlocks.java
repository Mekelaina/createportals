package com.mekelaina.createportals;


import com.simibubi.create.content.decoration.encasing.CasingBlock;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class CPBlocks {


	static { CPModGroup.useModTab(CPModGroup.CP_TAB_KEY);}

	public static final BlockEntry<Block> PORTAL_FRAME = CreatePortals.REGISTRATE.block("portal_frame", Block::new)
			.simpleItem()
			.register();

	public static final BlockEntry<CasingBlock> PORTAL_CASING = CreatePortals.REGISTRATE.block("portal_casing", CasingBlock::new)
			.transform(BuilderTransformers.layeredCasing(() -> CPSpriteShifts.PORTAL_CASING_SIDE,() -> CPSpriteShifts.PORTAL_CASING))
			.properties(p -> p.mapColor(MapColor.TERRACOTTA_CYAN).sound(SoundType.NETHERITE_BLOCK))
			.register();




	public static void init() {
		// load the class and register everything
		CreatePortals.LOGGER.info("Registering blocks for " + CreatePortals.NAME);
	}
}
