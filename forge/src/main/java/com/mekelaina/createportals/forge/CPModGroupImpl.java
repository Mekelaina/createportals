package com.mekelaina.createportals.forge;


import com.mekelaina.createportals.CPModGroup;
import com.mekelaina.createportals.CreatePortals;
import com.simibubi.create.Create;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class CPModGroupImpl {

    private static final DeferredRegister<CreativeModeTab> TAB_REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreatePortals.MOD_ID);

    private static Map<ResourceKey<CreativeModeTab>, RegistryObject<CreativeModeTab>> TABS = new HashMap<>();
    public static Supplier<CreativeModeTab> wrapGroup(String id, Supplier<CreativeModeTab> sup) {
        RegistryObject<CreativeModeTab> obj = TAB_REGISTER.register(id, sup);
        TABS.put(CPModGroup.makeKey(id), obj);
        return obj;
    }

    public static CreativeModeTab.Builder createBuilder() {
        return CreativeModeTab.builder().withTabsBefore(Create.asResource("palettes"));
    }

    public static void registerForge(IEventBus modbus) {
        TAB_REGISTER.register(modbus);
    }

    public static void useModTab(ResourceKey<CreativeModeTab> key) {
        CreatePortals.REGISTRATE.setCreativeTab(TABS.get(key));
    }
}
