package net.ccbluex.liquidbounce.features.module.modules.other;

import net.ccbluex.liquidbounce.event.EventTarget;
import net.ccbluex.liquidbounce.features.module.Module;
import net.ccbluex.liquidbounce.features.module.ModuleCategory;
import net.ccbluex.liquidbounce.features.module.ModuleInfo;
import net.ccbluex.liquidbounce.utils.TimerUtils;

@ModuleInfo(name = "MemoryFixer", description = "Preventing memory leak thingy", category = ModuleCategory.WAVE)
public class FrameHelper extends Module {
    private TimerUtils timer = new TimerUtils();

    @EventTarget
    public void onTick() {
        if (timer.hasReached(3000)) {
            System.gc();
            //Runtime.getRuntime().gc();
            timer.reset();
        }
    }
}
