package NaseStaffWork.ru.A;

import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class A implements CommandExecutor {
    public A() {
    }

    public boolean onCommand(CommandSender var1, Command var2, String var3, String[] var4) {
        Player var5 = (Player)var1;
        if (var1.hasPermission("nasesw.sw")) {
            if (var4.length == 0) {
                var1.sendMessage(NaseStaffWork.ru.B.A.Ċ());
            }

            if (var4.length == 1) {
                if (var4[0].equalsIgnoreCase("help")) {
                    NaseStaffWork.ru.B.A.ă().forEach((var1x) -> {
                        var1.sendMessage(NaseStaffWork.ru.B.A.ā(String.valueOf(var1x)));
                    });
                }

                if (var4[0].equalsIgnoreCase("reload")) {
                    NaseStaffWork.ru.B.A.ĉ();
                    var1.sendMessage(NaseStaffWork.ru.B.A.ā());
                }

                Iterator var6;
                Player var7;
                if (var4[0].equalsIgnoreCase("on")) {
                    var1.sendMessage(NaseStaffWork.ru.B.A.ċ());
                    var6 = Bukkit.getOnlinePlayers().iterator();

                    while(var6.hasNext()) {
                        var7 = (Player)var6.next();
                        if (var7.hasPermission("nasesw.sw")) {
                            var1.sendMessage(NaseStaffWork.ru.B.A.Ă().replace("%player%", var5.getName()));
                        }
                    }

                    NaseStaffWork.ru.B.A.Ą().forEach((var1x) -> {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), String.valueOf(var1x).replace("%player%", var5.getName()));
                    });
                }

                if (var4[0].equalsIgnoreCase("off")) {
                    var1.sendMessage(NaseStaffWork.ru.B.A.Ć());
                    var6 = Bukkit.getOnlinePlayers().iterator();

                    while(var6.hasNext()) {
                        var7 = (Player)var6.next();
                        if (var7.hasPermission("nasesw.sw")) {
                            var1.sendMessage(NaseStaffWork.ru.B.A.Ĉ().replace("%player%", var5.getName()));
                        }
                    }

                    NaseStaffWork.ru.B.A.ć().forEach((var1x) -> {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), String.valueOf(var1x).replace("%player%", var5.getName()));
                    });
                }
            }
        } else {
            var1.sendMessage(NaseStaffWork.ru.B.A.ą());
        }

        return true;
    }
}
