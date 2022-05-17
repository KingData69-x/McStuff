package com.pardonsmp.mcstuff.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler

    public void onJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();

        e.setJoinMessage(ChatColor.GREEN + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.RESET + "" + ChatColor.GREEN + " Has Joined The Server.");
    }
    @EventHandler

    public void onLeave(PlayerQuitEvent e){

        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.RED + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.RESET + "" + ChatColor.RED + " Has Left The Server.");
    }

}