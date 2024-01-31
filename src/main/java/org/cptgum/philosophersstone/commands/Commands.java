package org.cptgum.philosophersstone.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Commands implements CommandExecutor, TabCompleter {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("only players can execute this command");
            return true;
        }

        Player player = (Player) sender;

        if (args.length == 0) {
            // If no subcommand is provided, show the usage
            player.sendMessage("usage: /example <subcommand>");
        } else {
            // You can add subcommands here
            String subcommand = args[0].toLowerCase();

            switch (subcommand) {
                case "test1":
                    // Example2
                    player.sendMessage("sendmessage!");
                    break;
                case "test2":
                    // Example2
                    player.sendMessage("translations");
                    break;
                // More subcommands
                default:
                    player.sendMessage("Unknown Sub Command. Usage: /example <subcommand>");
                    break;
            }
        }

        return true;
    }

    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String alias, String[] args) {
        List<String> completions = new ArrayList<>();

        if (args.length == 1) {
            // Complete subcommands
            String partialCommand = args[0].toLowerCase();

            // Add Command Names
            List<String> commandNames = List.of("subcommand1", "subcommand2", "subcommand3");

            for (String command : commandNames) {
                if (command.startsWith(partialCommand)) {
                    completions.add(command);
                }
            }
        }

        return completions;
    }
}
