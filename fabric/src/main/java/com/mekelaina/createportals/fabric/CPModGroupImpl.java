package com.mekelaina.createportals.fabric;

import com.mekelaina.createportals.CPModGroup;
import com.mekelaina.createportals.CreatePortals;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import java.util.function.Supplier;

public class CPModGroupImpl {
    public static Supplier<CreativeModeTab> wrapGroup(String id, Supplier<CreativeModeTab> sup) {
        CreativeModeTab tab = sup.get();
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CPModGroup.makeKey(id), tab);
        return sup;
    }

    public static CreativeModeTab.Builder createBuilder() {
        return FabricItemGroup.builder();
    }

    public static void useModTab(ResourceKey<CreativeModeTab> key) {
        CreatePortals.REGISTRATE.setCreativeTab(key);
    }
}
