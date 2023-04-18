package net.the2019.abilitycraft;

import net.the2019.abilitycraft.items.items;
import net.the2019.abilitycraft.items.drops;
import org.bukkit.Bukkit;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class TickRunnable implements Runnable {

    private Plugin plugin;

    public TickRunnable(Plugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        for(Player player : Bukkit.getOnlinePlayers()){

            ItemStack chestplate = player.getInventory().getChestplate();
            ItemStack mainhand = player.getInventory().getItemInMainHand();


            if(chestplate != null && chestplate.isSimilar(items.CrimsonChestplate)){
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20, 3));
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20, 2));
                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20, 5));
                player.spawnParticle(Particle.DRIP_LAVA, player.getLocation(), 0,0,0,1);
            }
        }
    }

    // Method to start the tick runnable
    public void start() {
        // Schedule the tick runnable to run every tick
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, this, 0L, 1L);
    }

    // Method to stop the tick runnable
    public void stop() {
        // Cancel the tick runnable
        Bukkit.getScheduler().cancelTasks(plugin);
    }
}