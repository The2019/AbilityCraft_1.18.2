package net.the2019.abilitycraft.drops;

import org.bukkit.Bukkit;
import org.bukkit.entity.Enderman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import net.the2019.abilitycraft.items.drops;

import java.util.Random;

public class endermanDrops implements Listener {

    @EventHandler
    public void onEntityDeath(EntityDeathEvent event) {
        if (event.getEntity() instanceof Enderman) {
            Random rand = new Random();
            int chance_enderheart = rand.nextInt(256);
            int chance_enderreligt = rand.nextInt(500);
            if (chance_enderheart == 0) {
                event.getDrops().add(drops.enderheart);
                Bukkit.broadcastMessage("§6A rare Item has droped!");
            }
            if (chance_enderreligt == 0) {
                event.getDrops().add(drops.enderreligt);
                Bukkit.broadcastMessage("§6A rare Item has droped!");
            }
        }
    }
}
