package com.pardonsmp.mcstuff.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SuicideCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        //suicide - kills player

        if (sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("McStuff.suicide")) {
                player.setHealth(0.0);
                player.sendMessage(ChatColor.RED + "You have Killed your self.");
            }else{
                player.sendMessage(ChatColor.RED + "You do not have the required permissions (McStuff.die) to run this command.");
            }
        }
        return true;
    }

}
