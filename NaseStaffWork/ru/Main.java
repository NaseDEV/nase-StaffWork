package NaseStaffWork.ru;

import NaseStaffWork.ru.A.A;
import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private static Main ā;

    public Main() {
    }

    public void onEnable() {
        ā = this;
        this.saveDefaultConfig();
        Bukkit.getPluginCommand("sw").setExecutor(new A());
        NaseStaffWork.ru.B.A.ĉ();
    }

    public void onDisable() {
        HandlerList.unregisterAll(this);
    }

    public static Main ā() {
        return ā;
    }
}
