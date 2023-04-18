package net.the2019.abilitycraft;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class join implements Listener {
    
    @EventHandler
    public void onjoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.sendMessage("§cWillkommen zurück, auf Ability Craft!");

    }
}
