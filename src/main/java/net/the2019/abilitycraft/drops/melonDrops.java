package net.the2019.abilitycraft.drops;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class melonDrops implements Listener {

    @EventHandler
    public void onBreake(BlockBreakEvent event){
        Block block = event.getBlock();
        Player player = event.getPlayer();
        Material material = block.getType();

        Random random = new Random();

        if(material.equals(Material.MELON)){
            int chance_compackedmelon = random.nextInt(1);    //1 in 80 chance
            if(chance_compackedmelon == 0) {
                event.setDropItems(false);
                player.getInventory().addItem(new ItemStack(Material.MELON, 1)); //Melon Compacked
            }
        }
    }
}
