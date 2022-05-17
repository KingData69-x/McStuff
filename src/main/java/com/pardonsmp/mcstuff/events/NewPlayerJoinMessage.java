package com.pardonsmp.mcstuff.events;

import com.pardonsmp.mcstuff.files.CustomConfigFile;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class NewPlayerJoinMessage implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        p.sendMessage(CustomConfigFile.get().getString("join_message"));
    }

}
