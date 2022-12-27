package de.xyonox.xapi;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.UUID;


public final class XApi extends JavaPlugin {

    public static XApi plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }




}
