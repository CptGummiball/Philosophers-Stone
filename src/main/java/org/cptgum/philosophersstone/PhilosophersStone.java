package org.cptgum.philosophersstone;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.cptgum.philosophersstone.listener.PlayerInteractListener;
import org.cptgum.philosophersstone.utils.Translator;
import org.cptgum.philosophersstone.utils.ConfigLoader;
import org.cptgum.philosophersstone.commands.Commands;
import org.cptgum.philosophersstone.utils.LoggerUtils;

import java.util.HashMap;

public class PhilosophersStone extends JavaPlugin {
    private final ConfigLoader configLoader;
    public PhilosophersStone() {
        configLoader = new ConfigLoader(this);
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        // Load config
        configLoader.loadConfig();

        // Load languages
        Translator translator = Translator.getInstance();
        translator.loadLanguages(this);

        //Register listeners
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerInteractListener(), this);

        //If possible, initialize last:
        // Register commands
        getCommand("philosophersstone").setExecutor(new Commands());
        LoggerUtils.logInfo("Plugin started!");
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
