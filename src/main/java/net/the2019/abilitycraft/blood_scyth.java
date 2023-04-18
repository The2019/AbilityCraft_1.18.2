package net.the2019.abilitycraft;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import net.the2019.abilitycraft.AbilityCraft;


public class blood_scyth implements Listener {
 
    AbilityCraft plugin;

    public blood_scyth(AbilityCraft plugin){
        this.plugin = plugin;
    }

        @EventHandler
        public void onInteriect(PlayerInteractEvent event){
            Player player = event.getPlayer();

            if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR) ){
                if(player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("Shoots a blood orb that deals ")){


                ArmorStand ams = (ArmorStand) player.getWorld().spawnEntity(player.getLocation().add(0, 0.5, 0), EntityType.ARMOR_STAND);

            
                ams.setArms(true);
                ams.setVisible(false);
                ams.setGravity(false);
                ams.setMarker(true);
                ams.setSmall(true);
                ams.setSilent(true);
                ams.setHelmet(new ItemStack(Material.RED_DYE));

                Location loc = player.getLocation().add(player.getLocation().getDirection().multiply(10));
                Vector vec = loc.subtract(player.getLocation()).toVector();
                    
                new BukkitRunnable() {
                    int distance = 60;
                    int i = 0;

                    public void run(){

                        ams.teleport(ams.getLocation().add(vec.normalize()));
                        ams.getWorld().spawnParticle(Particle.ASH, ams.getLocation(), 1, 0, 0, 0);


                        for(Entity entity : ams.getLocation().getChunk().getEntities() ){
                            if(!ams.isDead()){
                                if(ams.getLocation().distanceSquared(entity.getLocation()) <= 1){
                                    if(entity instanceof LivingEntity){
                                        if(entity != player && entity != ams){
                                            LivingEntity livingentity = (LivingEntity) entity;
                                            livingentity.damage(30, player);
                                            ams.remove();
                                    
                                            cancel();
                                        }          
                                    }
                                }
                            }
                        }

                        if(i > distance){
                            if(!ams.isDead()){
                                ams.remove();
                                
                                cancel();
                            }
                        }
                        i++;
                    }
                }.runTaskTimer(plugin, 1, 1);
            }
        }
    }
}