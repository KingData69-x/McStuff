package com.pardonsmp.mcstuff.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MeowmeowCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if(sender instanceof Player) {
                Player player = (Player) sender;

                // /meowmeow Gives player creative
                if (player.hasPermission("McStuff.meowmeow")) {
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "You are now in creative!");
                }else{
                    player.sendMessage(ChatColor.RED + "You don't not have the required perms to run this commands!");
                }
            }


        return true;
    }
}
