package net.the2019.abilitycraft.Abilitys;

import java.util.HashSet;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class cobladDrill implements Listener {

    private final Set<Material> ORES = new HashSet<>(); // Set of ores to mine

    public void VeinMinerPickaxe() {
        // Add all the ores you want to mine with vein miner here
        ORES.add(Material.COAL_ORE);
        ORES.add(Material.DIAMOND_ORE);
        ORES.add(Material.EMERALD_ORE);
        ORES.add(Material.GOLD_ORE);
        ORES.add(Material.IRON_ORE);
        ORES.add(Material.LAPIS_ORE);
        ORES.add(Material.NETHER_QUARTZ_ORE);
        ORES.add(Material.REDSTONE_ORE);
        ORES.add(Material.COPPER_ORE);
        ORES.add(Material.DEEPSLATE_COAL_ORE);
        ORES.add(Material.DEEPSLATE_DIAMOND_ORE);
        ORES.add(Material.DEEPSLATE_EMERALD_ORE);
        ORES.add(Material.DEEPSLATE_GOLD_ORE);
        ORES.add(Material.DEEPSLATE_IRON_ORE);
        ORES.add(Material.DEEPSLATE_LAPIS_ORE);
        ORES.add(Material.DEEPSLATE_REDSTONE_ORE);
        ORES.add(Material.DEEPSLATE_COPPER_ORE);
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        VeinMinerPickaxe();

        if(player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("When mining can instabreak blocks and has vein miner.")){

            if (ORES.contains(event.getBlock().getType())) {
                Block block = event.getBlock();
                Location loc = block.getLocation();

                // Recursively mine all blocks of the same type in a 3x3x3 area around the initial block
                mineBlock(loc, block.getType());

                // Reduce durability of pickaxe
            }
        }
    }

    private void mineBlock(Location loc, Material type) {
        Block block = loc.getBlock();
        if (block.getType().equals(type)) {
            block.breakNaturally();
            for (int x = -1; x <= 1; x++) {
                for (int y = -1; y <= 1; y++) {
                    for (int z = -1; z <= 1; z++) {
                        if (!(x == 0 && y == 0 && z == 0)) {
                            Location newLoc = loc.clone().add(x, y, z);
                            mineBlock(newLoc, type);
                        }
                    }
                }
            }
        }
    }
}
