package me.mchiappinam.pdghtwitter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Listeners implements Listener {

	private Main plugin;
	public Listeners(Main main) {
		plugin=main;
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
ConfigurationBuilder cb = new ConfigurationBuilder();
		
		cb.setDebugEnabled(true);
		cb.setOAuthConsumerKey("VbU2fJszQVin37xvBrKj1hpG5");
		cb.setOAuthConsumerSecret("gp6C8wxERUEeaZf2sYg3WMwrYZDsXhf99Pq4KCm5hS123W2qXc");
		cb.setOAuthAccessToken("714545194939641856-vEsL9wDV84vVH5FkwmvlnRZJ6Ekmxnm");
		cb.setOAuthAccessTokenSecret("kapm8m5vrcCKj9X55dmj39PwVO35x1r3EYFlWFNXyBqDH");
		
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter tt = tf.getInstance();
		try {
			tt.updateStatus("pepeka do mal");
		}catch (Exception ex) {
			
		}
	}
}
