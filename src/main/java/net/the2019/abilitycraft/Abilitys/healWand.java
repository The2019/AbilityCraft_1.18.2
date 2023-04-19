package net.the2019.abilitycraft.Abilitys;

import net.the2019.abilitycraft.items.drops;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.PlayerInventory;


public class healWand implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR) ){
            if(player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("When Right cliked it heals the owner 1 HP,")){
                PlayerInventory inventory = player.getInventory();

                if (inventory.containsAtLeast(drops.healpast, 1)) {
                    inventory.removeItem(drops.healpast);

                    double newHealth = Math.min(player.getHealth() + 1, player.getMaxHealth());
                    player.setHealth(newHealth);

                    event.setCancelled(true);
                }
            }
        }
    }
}
