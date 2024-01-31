package org.cptgum.philosophersstone.utils;

import org.cptgum.philosophersstone.PhilosophersStone;

public class ConfigLoader {
    private final PhilosophersStone philosophersStone;

    // Adding a constructor
    public ConfigLoader(PhilosophersStone philosophersStone) {
        this.philosophersStone = philosophersStone;
    }

    public void loadConfig() {
        philosophersStone.getConfig().options().copyDefaults(true);
        philosophersStone.saveDefaultConfig();
        // Read the value of an Integer from the config
        int exampleInteger = philosophersStone.getConfig().getInt("Example", 6000);
    }
}

// Lesen von Werten aus der Konfiguration

// Integer-Wert
//int exampleInteger = philosophersStone.getConfig().getInt("Example", 6000);

// String-Wert
//String exampleString = philosophersStone.getConfig().getString("ExampleString", "DefaultString");

// Boolean-Wert
//boolean exampleBoolean = philosophersStone.getConfig().getBoolean("ExampleBoolean", true);

// Double-Wert
//double exampleDouble = philosophersStone.getConfig().getDouble("ExampleDouble", 3.14);

// Liste von Strings
//List<String> exampleList = philosophersStone.getConfig().getStringList("ExampleList");
//    if (exampleList.isEmpty()) {
//        exampleList.add("Item1");
//        exampleList.add("Item2");
//        exampleList.add("Item3");
//    }

// Abschnitt (Section) in der Konfiguration
//ConfigurationSection exampleSection = philosophersStone.getConfig().getConfigurationSection("ExampleSection");
//    if (exampleSection == null) {
// Abschnitt erstellen und Werte hinzufügen
//exampleSection = philosophersStone.getConfig().createSection("ExampleSection");
//        exampleSection.set("SubKey1", "Value1");
//        exampleSection.set("SubKey2", "Value2");
//    }

            // Speichern der Konfiguration
//            philosophersStone.saveConfig();