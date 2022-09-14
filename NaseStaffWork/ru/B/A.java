package NaseStaffWork.ru.B;

import NaseStaffWork.ru.Main;
import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

public class A {
    private static String ĉ;
    private static String ć;
    private static String ă;
    private static String ā;
    private static String ą;
    private static String Ă;
    private static String Ċ;
    private static List Ĉ;
    private static List Ć;
    private static List Ą;

    public A() {
    }

    public static void ĉ() {
        FileConfiguration var0 = Main.ā().getConfig();
        ĉ = var0.getString("Settings.sw_on.susses");
        ć = var0.getString("Settings.sw_on.staffchat");
        Ĉ = var0.getStringList("Settings.sw_on.Commands");
        ă = var0.getString("Settings.messages.no_perms");
        ā = var0.getString("Settings.messages.reload");
        ą = var0.getString("Settings.messages.error");
        Ć = var0.getStringList("Settings.messages.help");
        Ă = var0.getString("Settings.sw_off.susses");
        Ċ = var0.getString("Settings.sw_off.staffchat");
        Ą = var0.getStringList("Settings.sw_off.Commands");
    }

    public static String Ć() {
        return ā(Ă);
    }

    public static String Ĉ() {
        return ā(Ċ);
    }

    public static List ć() {
        return Ą;
    }

    public static List ă() {
        return Ć;
    }

    public static String ċ() {
        return ā(ĉ);
    }

    public static String Ă() {
        return ā(ć);
    }

    public static String Ċ() {
        return ā(ą);
    }

    public static List Ą() {
        return Ĉ;
    }

    public static String ą() {
        return ā(ă);
    }

    public static String ā() {
        return ā(ā);
    }

    public static String ā(String var0) {
        return ChatColor.translateAlternateColorCodes('&', var0);
    }
}
