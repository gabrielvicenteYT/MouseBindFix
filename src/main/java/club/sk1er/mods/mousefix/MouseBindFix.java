package club.sk1er.mods.mousefix;

import club.sk1er.modcore.ModCoreInstaller;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "mousebindfix", name = "Mouse Bind Fix", version = "1.3")
public class MouseBindFix {

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModCoreInstaller.initializeModCore(Minecraft.getMinecraft().mcDataDir);
    }
}
