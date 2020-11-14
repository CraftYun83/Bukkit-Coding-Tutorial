package com.craftyun83.tutorial.commands;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.craftyun83.tutorial.Main;
public class HelloCommand implements CommandExecutor{
	
	@SuppressWarnings("unused")
	private Main plugin;
	public HelloCommand (Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("hello").setExecutor(this);
	}
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {
		Player p = (Player) sender;
		
		if (p.hasPermission("hello.use")) {
			p.sendMessage("Hello!");
		} else {
			p.sendMessage("You do not have the required permission to use this command!");
		}
		return false;
	}
	

}
