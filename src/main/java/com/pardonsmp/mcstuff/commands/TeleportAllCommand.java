package com.pardonsmp.mcstuff.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeleportAllCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
//gets player
        if (sender instanceof Player){
            Player player = (Player) sender;

            if (player.hasPermission("McStuff.mctpall")){
                //mctpall Command code
                if (Bukkit.getServer().getOnlinePlayers().size() == 1){
                player.sendMessage(ChatColor.LIGHT_PURPLE + "No other players are on right now.");

            }else if(Bukkit.getServer().getOnlinePlayers().size() > 1){
                    int numberOfPlayers = 0;
                    for (Player p : Bukkit.getServer().getOnlinePlayers()){
                        p.teleport(player.getLocation());
                        numberOfPlayers++;
                    }
                    //sends message if there are players online that they have been teleported
                    player.sendMessage(ChatColor.GREEN + "Teleported all" + (numberOfPlayers - 1) + "players to you.");

                }
//the message that send if they dont have the required permissions
            }else{
                player.sendMessage(ChatColor.RED + "You do not have the required permissions for this command!");
            }

        }




    return true;
    }
}
