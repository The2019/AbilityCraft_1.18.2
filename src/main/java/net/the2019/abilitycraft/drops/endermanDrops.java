package net.the2019.abilitycraft.drops;

import org.bukkit.entity.Enderman;
import org.bukkit.entity.Player;
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
            int chance_enderheart = rand.nextInt(1);    //1 in 250 chance
            int chance_enderreligt = rand.nextInt(1);   //1 in 500 chance
            if (chance_enderheart == 0) {
                event.getDrops().add(drops.enderheart);
                Player killer = event.getEntity().getKiller();
                if (killer != null) {
                    killer.sendMessage("§6You got a rare item drop!");
                }
            }
            if (chance_enderreligt == 0) {
                event.getDrops().add(drops.enderreligt);
                Player killer = event.getEntity().getKiller();
                if (killer != null) {
                    killer.sendMessage("§cYou got a special item drop!");
                }
            }
        }
    }
}
