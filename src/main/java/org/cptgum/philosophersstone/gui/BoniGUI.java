package org.cptgum.philosophersstone.gui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class BoniGUI {

    private final Player player;

    public BoniGUI(Player player) {
        this.player = player;
    }

    public void open() {
        Inventory inventory = Bukkit.createInventory(null, 9, "Boni"); //placeholder
                player.openInventory(inventory);
    }
}