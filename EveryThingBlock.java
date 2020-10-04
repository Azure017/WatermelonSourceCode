package net.ccbluex.liquidbounce.features.module.modules.render;

import net.ccbluex.liquidbounce.features.module.Module;
import net.ccbluex.liquidbounce.features.module.ModuleCategory;
import net.ccbluex.liquidbounce.features.module.ModuleInfo;
import net.ccbluex.liquidbounce.features.module.ModuleManager;
import net.ccbluex.liquidbounce.value.FloatValue;


@ModuleInfo(name = "BlockEverything", description = "nah", category = ModuleCategory.WAVE)
public class EveryThingBlock extends Module {

    public static FloatValue x = new FloatValue("X", 0.0f, -1.0f, 1.0f);
    public static FloatValue y = new FloatValue("Y", 0.0f, -1.0f, 1.0f);
    public static FloatValue z = new FloatValue("Z", 0.0f, -1.0f, 1.0f);
    public static FloatValue scale = new FloatValue("scale", 1, 1, 10);
    public static ModuleManager getX;
    public static ModuleManager getY;
    public static ModuleManager getZ;
    public static ModuleManager getScale;

    public static FloatValue getX() {
        return x;
    }

    public static FloatValue getY() {
        return y;
    }

    public static FloatValue getZ() {
        return z;
    }

    public static FloatValue getScale() { return scale; }

    @Override
    public String getTag() {
        return "§6" + "[" + x.get() + ":" + y.get() + ":" + z.get() + "]";
    }
}