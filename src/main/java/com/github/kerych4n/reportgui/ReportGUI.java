package com.github.kerych4n.reportgui;

import org.bukkit.plugin.java.JavaPlugin;

public final class ReportGUI extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("有効になりました");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        getLogger().info("無効になりました");
        // Plugin shutdown logic
    }
}
