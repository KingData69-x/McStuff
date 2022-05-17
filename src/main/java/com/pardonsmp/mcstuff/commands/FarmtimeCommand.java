package com.pardonsmp.mcstuff.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class FarmtimeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;

            // /farmtime cow 5
                if (player.hasPermission("McStuff.farmtime")) {
                    if (args.length >= 2) {
                        try {
                            EntityType entity = EntityType.valueOf(args[0].toUpperCase());
                            int amount = Integer.parseInt(args[1]);
                            for (int i = 0; i < amount; i++) {
                                player.getWorld().spawnEntity(player.getLocation(), entity);
                            }
                        } catch (IllegalArgumentException e) {
                            player.sendMessage("§c§l(!) §cThat is not a valid entity!");
                        }

                    } else {
                        player.sendMessage("§c§l(!) §c/farmtime <mob> <ammount>");
                    }
                }else{
                    player.sendMessage(ChatColor.RED + "You dont not have the required perms to run this commands!");
                }
        }

        return true;
    }
}
