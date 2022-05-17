package com.pardonsmp.mcstuff.commands;

import com.pardonsmp.mcstuff.files.CustomConfigFile;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            p.sendMessage(CustomConfigFile.get().getString("discord_message"));
        }

        return true;
    }

}
