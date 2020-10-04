package net.ccbluex.liquidbounce.utils;

public class TimerUtils {
    private static long prevMS;

    public static boolean hasReached(long milliseconds) {
        byte lastMS = 0;
        if (TimerUtils.getCurrentMS() - lastMS >= milliseconds) {
            return true;
        }
        return false;
    }

    public static long getCurrentMS() {
        return System.nanoTime() / 1000000L;
    }

    public static void reset() {
        prevMS = TimerUtils.getTime();
    }

    public static long getTime() {
        return System.nanoTime() / 1000000L;
    }
}
