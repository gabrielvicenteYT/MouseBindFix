package club.sk1er.mods.mousefix;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.ModMetadata;

import java.util.Collections;

public class MouseBindFix extends DummyModContainer {

    public MouseBindFix() {
        super(getMetaData());
    }

    private static ModMetadata getMetaData() {
        ModMetadata metadata = new ModMetadata();
        metadata.modId = "mousebindfix";
        metadata.version = "1.1";
        metadata.name = "Mouse Bind Fix";
        metadata.description = "Fixes mouse keybinds in inventories.";

        metadata.url = "";
        metadata.updateUrl = "";

        metadata.authorList = Collections.singletonList("Sk1er");
        return metadata;
    }

}
