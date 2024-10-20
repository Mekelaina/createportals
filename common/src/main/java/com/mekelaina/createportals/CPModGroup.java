package com.mekelaina.createportals;



import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

import java.util.Arrays;
import java.util.function.Supplier;

public class CPModGroup {

    // implementation taken from Create Big Canons.
    // https://github.com/Cannoneers-of-Create/CreateBigCannons

    public static final ResourceKey<CreativeModeTab> CP_TAB_KEY = makeKey("cp_tab");

    public static final Supplier<CreativeModeTab> GROUP = wrapGroup("cp_tab", () -> createBuilder()
            .title(Component.translatable("itemGroup." + CreatePortals.MOD_ID))
            .icon(CPBlocks.PORTAL_FRAME::asStack)
            .displayItems((param, output) -> {
              output.acceptAll(Arrays.asList(
                      CPBlocks.PORTAL_FRAME.asStack(),
                      CPBlocks.PORTAL_CASING.asStack(),
                      CPItems.ENTANGLEMENT.asStack()
              ));
            }).build());

    @ExpectPlatform public static Supplier<CreativeModeTab> wrapGroup(String id, Supplier<CreativeModeTab> sup){
        throw new AssertionError();
    }
    @ExpectPlatform public static CreativeModeTab.Builder createBuilder() {
        throw new AssertionError();
    }
    @ExpectPlatform public static void useModTab(ResourceKey<CreativeModeTab> key) {
        throw new AssertionError();
    }

    public static ResourceKey<CreativeModeTab> makeKey(String id) {
        return ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(CreatePortals.MOD_ID, id));
    }

    public static void register() {
        CreatePortals.REGISTRATE.addRawLang("itemGroup."+CreatePortals.MOD_ID, "Create Portals");
    }

}
