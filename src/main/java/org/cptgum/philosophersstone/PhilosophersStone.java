package org.cptgum.philosophersstone;

import org.bukkit.plugin.java.JavaPlugin;
import org.cptgum.philosophersstone.utils.Translator;
import org.cptgum.philosophersstone.utils.ConfigLoader;
import org.cptgum.philosophersstone.commands.Commands;
import org.cptgum.philosophersstone.utils.LoggerUtils;

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

        //If possible, initialize last:
        // Register commands
        getCommand("example").setExecutor(new Commands());
        LoggerUtils.logInfo("Plugin started!");
        //Example Usage of the Translator
        LoggerUtils.logInfo(translator.translate("examplemain.examplesub"));
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
