package net.the2019.abilitycraft.drops;

import org.bukkit.entity.PiglinBrute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import net.the2019.abilitycraft.items.drops;

import java.util.Random;

public class piglinBrutDrops implements Listener {

    @EventHandler
    public void onEntityDeath(EntityDeathEvent event) {
        if (event.getEntity() instanceof PiglinBrute) {
            Random rand = new Random();
            int chance_piglinblood = rand.nextInt(1);   //1 in 150 chance
            if (chance_piglinblood == 0) {
                event.getDrops().add(drops.piglinblood);
                Player killer = event.getEntity().getKiller();
                if (killer != null) {
                    killer.sendMessage("§6You got a rare item drop!");
                }
            }
        }
    }
}
