package net.the2019.abilitycraft;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class grappling_hook implements Listener{
    
    @EventHandler
    public void onFish(PlayerFishEvent event){
        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();
        ItemMeta meta = item.getItemMeta();
        String name = meta.getDisplayName();

        if(name.equals("§6Grappling Hook")){
            if(event.getState().equals(PlayerFishEvent.State.REEL_IN)){
                Location playerloc = player.getLocation();
                Location hookLocation = event.getHook().getLocation();
                Location  change = hookLocation.subtract(playerloc);
                player.setVelocity(change.toVector().multiply(1));
            }
        }
    }
}
