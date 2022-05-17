package com.pardonsmp.mcstuff.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class McgsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;

            // /meow Gives player Survival
            if (player.hasPermission("McStuff.meow")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "You are now in Survival!");
            }else{
                player.sendMessage(ChatColor.RED + "You dont not have the required perms to run this commands!");
            }
        }
        return true;
    }
}
