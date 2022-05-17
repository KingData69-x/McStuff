package com.pardonsmp.mcstuff;

import com.pardonsmp.mcstuff.commands.*;
import com.pardonsmp.mcstuff.events.JoinLeaveListener;
import com.pardonsmp.mcstuff.events.NewPlayerJoinMessage;
import com.pardonsmp.mcstuff.files.CustomConfigFile;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public final class McStuff extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("McStuff Has Started!");
        getServer().getPluginManager().registerEvents(this, this);
        getCommand("discord").setExecutor(new DiscordCommand());
        getCommand("suicide").setExecutor(new SuicideCommand());
        getCommand("mcgc").setExecutor(new McgcCommand());
        getCommand("mcgs").setExecutor(new McgsCommand());
        getCommand("farmtime").setExecutor(new FarmtimeCommand());
        getCommand("mcreload").setExecutor(new ReloadCommand());
        getCommand("mctp").setExecutor(new TeleportCommand());
        getCommand("mctpall").setExecutor(new TeleportAllCommand());
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
        getServer().getPluginManager().registerEvents(new NewPlayerJoinMessage(), this);

        //end of startup logic


        //setup Config Files
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        CustomConfigFile.setup();
        CustomConfigFile.get().addDefault("discord_message", "Our discord is: (Your Discord Link)");
        CustomConfigFile.get().addDefault("join_message", ChatColor.LIGHT_PURPLE + "Welcome to the server!");
        CustomConfigFile.get().options().copyDefaults(true);
        CustomConfigFile.save();

    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("McStuff Has Stopped!");

    }
}
