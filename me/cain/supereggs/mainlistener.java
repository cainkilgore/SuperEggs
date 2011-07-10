package me.cain.supereggs;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;

public class mainlistener extends PlayerListener{
	Player player;
	Server server;
	public void onPlayerInteract(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		if(player.isOp()) {
		if(event.getMaterial() == Material.EGG) {
		if(event.getAction() == Action.LEFT_CLICK_AIR) {
			player.sendMessage(ChatColor.GREEN + "You threw 10 eggs!");
			player.throwEgg();
			player.throwEgg();
			player.throwEgg();
			player.throwEgg();
			player.throwEgg();
			player.throwEgg();
			player.throwEgg();
			player.throwEgg();
			player.throwEgg();
			player.throwEgg();
			
}
		}
		}
}
}