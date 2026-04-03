package me.realized.tokenmanager.util.compat;

import me.realized.tokenmanager.util.NumberUtil;
import org.bukkit.Bukkit;

public final class CompatUtil {

    private static final long SUB_VERSION;

    static {
        final String[] parts = Bukkit.getServer().getBukkitVersion().split("\\.");
        final long major = NumberUtil.parseLong(parts[0].split("[^0-9]")[0]).orElse(1);
        if (major > 1) {
            // Server versions 2+ (e.g. 26.1.1) are always modern
            SUB_VERSION = 99;
        } else {
            SUB_VERSION = NumberUtil.parseLong(parts[1].split("[^0-9]")[0]).orElse(0);
        }
    }

    private CompatUtil() {}

    public static boolean isPre1_17() {
        return SUB_VERSION < 17;
    }

    public static boolean isPre1_14() {
        return SUB_VERSION < 14;
    }

    public static boolean isPre1_13() {
        return SUB_VERSION < 13;
    }

    public static boolean isPre1_12() {
        return SUB_VERSION < 12;
    }

    public static boolean isPre1_9() {
        return SUB_VERSION < 9;
    }
}
