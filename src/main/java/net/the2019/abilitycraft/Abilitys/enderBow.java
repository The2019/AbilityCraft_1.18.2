package net.the2019.abilitycraft.Abilitys;

import net.the2019.abilitycraft.AbilityCraft;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.plugin.Plugin;

public class enderBow implements Listener {

    private final Plugin plugin;

    public enderBow(Plugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void enderBowShoot(PlayerInteractEvent event){
        Player player = event.getPlayer();

        if(event.getAction().equals(Action.LEFT_CLICK_AIR) || event.getAction().equals(Action.LEFT_CLICK_BLOCK) ){
            if(player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("Is crafted with a rare item and can shoot 1 arrow instantly.")){
                if(player.getInventory().contains(Material.ARROW)) {
                    Arrow arrow = (Arrow) player.getWorld().spawnEntity(player.getEyeLocation(), EntityType.ARROW);
                    arrow.setVelocity(player.getLocation().getDirection().multiply(2));
                    arrow.setFireTicks(Integer.MAX_VALUE);
                    arrow.setShooter(player);
                    arrow.setPickupStatus(Arrow.PickupStatus.DISALLOWED);
                    arrow.setCritical(true);
                    arrow.setMetadata("damage", new FixedMetadataValue(plugin, 5));
                }
            }
        }
    }
}
