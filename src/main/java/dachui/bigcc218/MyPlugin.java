package dachui.bigcc218;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup login
        Bukkit.getConsoleSender().sendMessage("§a插件已装载");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage("§c插件已卸载");
    }
}
