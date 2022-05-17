package com.pardonsmp.mcstuff.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeleportCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){

            Player p = (Player) sender;

            if (p.hasPermission("McStuff.mctp")){

                if (args.length == 0){
                p.sendMessage(ChatColor.RED + "You need to enter some arguments.");
                p.sendMessage(ChatColor.YELLOW + "To teleport yourself: /mctp <OtherPlayer>");
                p.sendMessage(ChatColor.YELLOW + "To Teleport Others: /mctp <Player> <OtherPlayer>");
            }else if(args. length == 1){
                Player target = Bukkit.getPlayer(args[0]);

                try{
                    p.teleport(target.getLocation());
                }catch (NullPointerException e){
                    p.sendMessage(ChatColor.RED + "Player does not exist.");
                }
            }else if(args.length == 2) {
                Player playerToSend = Bukkit.getPlayer(args[0]);
                Player target = Bukkit.getPlayer(args[1]);
                try {
                    playerToSend.teleport(target.getLocation());
                } catch (NullPointerException e) {
                    p.sendMessage(ChatColor.RED + "Player does not exist.");
                }
            }


            }else{
                p.sendMessage(ChatColor.RED + "You do not have the required permissions for this command!");
            }



        }






        return true;
    }
}
