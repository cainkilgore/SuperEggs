package me.cain.supereggs;

import java.util.logging.Logger;
import com.nijiko.permissions.PermissionHandler;
import com.nijikokun.bukkit.Permissions.Permissions;
import org.bukkit.plugin.Plugin;
import javax.swing.event.DocumentEvent.EventType;
import org.bukkit.plugin.Plugin;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Listener;
import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.block.*;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.Slot;

public class mainegg extends JavaPlugin{
	
	private final mainlistener TheListener = new mainlistener();	
	Player player;
	
Logger log = Logger.getLogger("Minecraft");
String pluginname = "SuperEggs";

	public void onDisable() {
		log.info("[" + pluginname + "] " + pluginname + " has been disabled.");
		}
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		log.info("[" + pluginname + "] " + pluginname + " has been enabled.");
		log.info("[" + pluginname + "] Created by CainFoool");
		pm.registerEvent(Event.Type.PLAYER_INTERACT, new mainlistener(), Priority.Normal, this);
	}
}
		