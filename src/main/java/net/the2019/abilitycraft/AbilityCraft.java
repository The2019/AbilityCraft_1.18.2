package net.the2019.abilitycraft;

import net.the2019.abilitycraft.Abilitys.*;
import net.the2019.abilitycraft.drops.endermanDrops;
import net.the2019.abilitycraft.items.items;
import net.the2019.abilitycraft.items.drops;
import net.the2019.abilitycraft.start.commands;
import net.the2019.abilitycraft.start.join;
import org.bukkit.plugin.java.JavaPlugin;


public final class AbilityCraft extends JavaPlugin {

    private TickRunnable tickRunnable;

    @Override
    public void onEnable() {
        items.init();
        drops.init();
        this.getCommand("givegrapplinghook").setExecutor(new commands());
        this.getCommand("givebloodscyth").setExecutor(new commands());
        this.getCommand("givepumkinaxe").setExecutor(new commands());
        this.getCommand("givemelonecapitor").setExecutor(new commands());
        this.getCommand("givecrimsonchestplate").setExecutor(new commands());
        this.getCommand("giveenderbow").setExecutor(new commands());
        this.getServer().getPluginManager().registerEvents(new grappling_hook(),this);
        this.getServer().getPluginManager().registerEvents(new join(),this);
        this.getServer().getPluginManager().registerEvents(new blood_scyth(this), this);
        this.getServer().getPluginManager().registerEvents(new pumkin_axe(),this);
        this.getServer().getPluginManager().registerEvents(new melone_capitor(),this);
        this.getServer().getPluginManager().registerEvents(new endermanDrops(),this);
        this.getServer().getPluginManager().registerEvents(new enderBow(this), this);



        tickRunnable = new TickRunnable(this);

        tickRunnable.start();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
