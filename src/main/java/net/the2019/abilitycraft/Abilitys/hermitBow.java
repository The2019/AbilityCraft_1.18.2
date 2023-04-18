package net.the2019.abilitycraft.Abilitys;

import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.plugin.Plugin;

public class hermitBow implements Listener {

    private final Plugin plugin;

    public hermitBow(Plugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void enderBowShoot(PlayerInteractEvent event){
        Player player = event.getPlayer();

        if(event.getAction().equals(Action.LEFT_CLICK_AIR) || event.getAction().equals(Action.LEFT_CLICK_BLOCK) ){
            if(player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("Is crafted with a special item and can shoot 3 arrow instantly.")){
                if(player.getInventory().contains(Material.ARROW)){
                    Arrow arrow = (Arrow) player.getWorld().spawnEntity(player.getEyeLocation(), EntityType.ARROW);
                    arrow.setVelocity(player.getLocation().getDirection().multiply(3));
                    arrow.setFireTicks(Integer.MAX_VALUE);
                    arrow.setShooter(player);
                    arrow.setPickupStatus(Arrow.PickupStatus.DISALLOWED);
                    arrow.setCritical(true);
                    arrow.setMetadata("damage", new FixedMetadataValue(plugin, 5));
                    arrow.getWorld().spawnParticle(Particle.DRIP_LAVA, arrow.getLocation(), 20, 0,0,0);

                    Arrow arrow1 = (Arrow) player.getWorld().spawnEntity(player.getEyeLocation(), EntityType.ARROW);
                    arrow1.setVelocity(arrow.getVelocity().rotateAroundY(Math.toRadians(15)));
                    arrow1.setFireTicks(Integer.MAX_VALUE);
                    arrow1.setShooter(player);
                    arrow1.setPickupStatus(Arrow.PickupStatus.DISALLOWED);
                    arrow1.setCritical(true);
                    arrow1.setMetadata("damage", new FixedMetadataValue(plugin, 5));
                    arrow1.getWorld().spawnParticle(Particle.DRIP_LAVA, arrow1.getLocation(), 20, 0,0,0);

                    Arrow arrow2 = (Arrow) player.getWorld().spawnEntity(player.getEyeLocation(), EntityType.ARROW);
                    arrow2.setVelocity(arrow.getVelocity().rotateAroundY(Math.toRadians(-15)));
                    arrow2.setFireTicks(Integer.MAX_VALUE);
                    arrow2.setShooter(player);
                    arrow2.setPickupStatus(Arrow.PickupStatus.DISALLOWED);
                    arrow2.setCritical(true);
                    arrow2.setMetadata("damage", new FixedMetadataValue(plugin, 5));
                    arrow2.getWorld().spawnParticle(Particle.DRIP_LAVA, arrow2.getLocation(), 20, 0,0,0);
                }
            }
        }
    }
}
