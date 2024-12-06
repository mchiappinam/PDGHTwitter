package me.mchiappinam.pdghtwitter;

import org.bukkit.plugin.java.JavaPlugin;

import me.mchiappinam.pdghtwitter.Comando;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getServer().getPluginCommand("tweet").setExecutor(new Comando(this));
		getServer().getPluginManager().registerEvents(new Listeners(this), this);
		getServer().getConsoleSender().sendMessage("§3[PDGHTwitter] §2ativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHTwitter] §2Acesse: http://pdgh.com.br/");
	}

	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHTwitter] §2desativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHTwitter] §2Acesse: http://pdgh.com.br/");
	}
	
	/**public void tweet(String msg) {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
			.setOAuthConsumerKey(consumerKey)
			.setOAuthConsumerSecret(consumerSecret)
			.setOAuthAccessToken(accessToken)
			.setOAuthAccessTokenSecret(accessSecret);
		try {
			TwitterFactory factory = new TwitterFactory(cb.build());
			Twitter twitter = factory.getInstance();
			
			System.out.println(twitter.getScreenName());
			Status status = twitter.updateStatus(msg);
			System.out.println("§3[PDGHTwitter] §2Nova publicacao: "+status.getText());
		}catch (TwitterException te) {
			te.printStackTrace();
		}
	}*/
	
	/**public void sendActionBar(Player p, String msg) {
	    IChatBaseComponent cbc = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + msg + "\"}");
	    PacketPlayOutChat ppoc = new PacketPlayOutChat(cbc, (byte)2);
	    ((CraftPlayer)p).getHandle().playerConnection.sendPacket(ppoc);
	}*/
}