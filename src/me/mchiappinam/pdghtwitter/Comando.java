package me.mchiappinam.pdghtwitter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Comando implements CommandExecutor {
  private Main plugin;

	public Comando(Main main) {
		plugin = main;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		if (cmd.getName().equalsIgnoreCase("tweet")) {
			
			/**if(args.length!=0) {
				plugin.sendActionBar(((Player)sender),"pepeka do mal");
			}*/
			//plugin.tweet("testando pdgh twitter by: mc and saimon");
			return true;
		}
		return true;
	}
}