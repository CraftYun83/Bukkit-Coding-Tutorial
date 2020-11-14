package com.craftyun83.tutorial;

import org.bukkit.plugin.java.JavaPlugin;

import com.craftyun83.tutorial.commands.HelloCommand;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		new HelloCommand(this);
	}

}
