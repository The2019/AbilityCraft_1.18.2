package net.the2019.abilitycraft.drops;

import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import net.the2019.abilitycraft.items.drops;

import java.util.Random;

public class zombiDrops implements Listener {

    @EventHandler
    public void onEntityDeath(EntityDeathEvent event) {
        if (event.getEntity() instanceof Zombie) {
            Random rand = new Random();
            int chance_healWandCore = rand.nextInt(1);  //100
            int chance_healPast = rand.nextInt(1);  //10
            if (chance_healPast == 0) {
                event.getDrops().add(drops.healpast);
                Player player = event.getEntity().getKiller();
                if (player != null) {
                    player.sendMessage("§7You got a common item drop!");
                }
            }
            if (chance_healWandCore == 0) {
                event.getDrops().add(drops.healwandcore);
                Player player = event.getEntity().getKiller();
                if (player != null) {
                    player.sendMessage("§6You got a rare item drop!");
                }
            }
        }
    }
}
