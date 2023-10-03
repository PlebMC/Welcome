package net.lonestar;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class Background implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player user = event.getPlayer();
        Command welcome;
        int count = 0;
        if(!(user.hasPlayedBefore())) {
            count++;
            user.sendMessage("Welcome to the server " + user.getName() + "!\nYou are player #" + Integer.toString(count));
        }
        else {
            user.sendMessage("Welcome back " + user.getName() + "!");
        }
    }
}
