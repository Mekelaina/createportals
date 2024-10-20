package com.mekelaina.createportals;

import com.mekelaina.createportals.items.EntanglementItem;
import com.tterrag.registrate.util.entry.ItemEntry;

public class CPItems {
    static { CPModGroup.useModTab(CPModGroup.CP_TAB_KEY);}

    public static final ItemEntry<EntanglementItem> ENTANGLEMENT = CreatePortals.REGISTRATE.item("entanglement", EntanglementItem::new)
            .register();

    public static void init() {

    }
}
