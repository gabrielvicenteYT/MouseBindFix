package club.sk1er.mods.mousefix;

import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.ModMetadata;

import java.util.Collections;

public class MouseBindFix extends DummyModContainer {

    public MouseBindFix() {
        super(getMetaData());
    }

    private static ModMetadata getMetaData() {
        ModMetadata metadata = new ModMetadata();
        metadata.modId = "mousebindfix";
        metadata.version = "1.0";

        metadata.name = "Mouse Bind Fix";
        metadata.description = "Fixes mouse keybinds in inventories.";

        metadata.url = "";
        metadata.updateUrl = "";

        metadata.authorList = Collections.singletonList("Sk1er");
        return metadata;
    }

}
