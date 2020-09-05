package de.lugaming.eventplugin.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {	
	
	private static Main plugin;
	
	public void onEnable() {
		plugin = this;

		
		//Admin Commands
		getCommand("eventmenu").setExecutor(new de.lugaming.eventplugin.commands.EventMenu());
		getCommand("em").setExecutor(new de.lugaming.eventplugin.commands.EventMenu());
		getCommand("resetevent").setExecutor(new de.lugaming.eventplugin.commands.ResetEvent());
		getCommand("re").setExecutor(new de.lugaming.eventplugin.commands.ResetEvent());
		getCommand("eventmegaphone").setExecutor(new de.lugaming.eventplugin.commands.MegaPhone());
		getCommand("em").setExecutor(new de.lugaming.eventplugin.commands.MegaPhone());

		//Spieler Command
		getCommand("event").setExecutor(new de.lugaming.eventplugin.commands.Event());
		
	}
	
	public static Main getPlugin() {
		return plugin;
	}
	
}
