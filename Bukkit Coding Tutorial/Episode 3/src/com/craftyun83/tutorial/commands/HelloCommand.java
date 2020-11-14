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
		try {
			if (args[0].equalsIgnoreCase("hi")) {
				if (sender instanceof Player) {
					Player p = (Player) sender;
					if (p.hasPermission("hi.use")) {
						p.sendMessage("hi");
					}
				} else {
					sender.sendMessage("hi");
				}
			}
			
			if (args[0].equalsIgnoreCase("hello")) {
				if (sender instanceof Player) {
					Player p = (Player) sender;
					if (p.hasPermission("hello.use")) {
						p.sendMessage("hello");
					}
				} else {
					sender.sendMessage("hello");
				}
			}
		}
		catch (Exception e) {
			if (sender instanceof Player ) {
				Player p = (Player) sender;
				p.sendMessage("This command requires 1 subcommand");
			} else {
				sender.sendMessage("This command requires 1 subcommand");
			}
		}
		return false;
	}
	

}
