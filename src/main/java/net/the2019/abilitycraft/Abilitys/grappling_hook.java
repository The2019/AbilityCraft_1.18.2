package net.the2019.abilitycraft.Abilitys;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.plugin.Plugin;

public class grappling_hook implements Listener {

    private final Plugin plugin;

    public grappling_hook(Plugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onFish(PlayerFishEvent event) {
        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();
        ItemMeta meta = item.getItemMeta();
        String name = meta.getDisplayName();

        if (name.equals("§6Grappling Hook")) {
            if (event.getState().equals(PlayerFishEvent.State.REEL_IN)) {
                Location playerLoc = player.getLocation();
                Location hookLoc = event.getHook().getLocation();
                Location change = hookLoc.subtract(playerLoc);
                player.setVelocity(change.toVector().multiply(1));
                player.setFallDistance(-100f); // sets the player's fall distance to a high negative value to prevent fall damage
                player.setMetadata("GrapplingHook", new FixedMetadataValue(plugin, true)); // sets metadata to identify that the player used the grappling hook
            } else if (event.getState().equals(PlayerFishEvent.State.IN_GROUND) || event.getState().equals(PlayerFishEvent.State.FAILED_ATTEMPT)) {
                if (player.hasMetadata("GrapplingHook")) { // checks if the player used the grappling hook earlier
                    player.removeMetadata("GrapplingHook", plugin); // removes the metadata
                }
            }
        }
    }
}
