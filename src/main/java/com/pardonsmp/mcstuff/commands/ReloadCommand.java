package com.pardonsmp.mcstuff.commands;

import com.pardonsmp.mcstuff.files.CustomConfigFile;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReloadCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;
        if (p.hasPermission("McStuff.reload")) {

            CustomConfigFile.reload();
            p.sendMessage(ChatColor.LIGHT_PURPLE + "McStuff Has Been Reloaded!");

        }else{
            p.sendMessage(ChatColor.RED + "You dont have the required permissions for this command");
        }

        return true;
    }
}
