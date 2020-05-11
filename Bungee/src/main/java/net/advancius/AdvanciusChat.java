package net.advancius;

import net.md_5.bungee.api.plugin.Plugin;

public class AdvanciusChat extends Plugin {

	private static AdvanciusChat instance;
	
	@Override
	public void onLoad() {
		super.onLoad();
	}

	@Override
	public void onEnable() {
		super.onEnable();
		AdvanciusChat.instance = this;
		//
		instance.getLogger().info("Hello... world! :D");
	}

	@Override
	public void onDisable() {
		instance.getLogger().info("Goodbye world! :(");
		//
		AdvanciusChat.instance = null;
		super.onDisable();
	}

	
}
