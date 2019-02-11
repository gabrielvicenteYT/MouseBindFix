package club.sk1er.mods.mousefix.forge;

import club.sk1er.mods.mousefix.MouseBindFix;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

import java.util.Map;

@SuppressWarnings("unused")
public final class FMLLoadingPlugin implements IFMLLoadingPlugin {

    @Override
    public String[] getASMTransformerClass() {
        return new String[]{ClassTransformer.class.getName()};
    }

    @Override
    public String getModContainerClass() {
        return MouseBindFix.class.getName();
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }

}
