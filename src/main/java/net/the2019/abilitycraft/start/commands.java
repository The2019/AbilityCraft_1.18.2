package net.the2019.abilitycraft.start;

import net.the2019.abilitycraft.items.items;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(!(sender instanceof Player)){
            sender.sendMessage("Only Players can use that command");
            return true;
        }
        
        Player player = (Player) sender;
        if(player.hasPermission("op")){
            if(cmd.getName().equalsIgnoreCase("givegrapplinghook")){
                player.getInventory().addItem(items.GrapplingHook);
            }
            if(cmd.getName().equalsIgnoreCase("givebloodscyth")){
                player.getInventory().addItem(items.BloodScyth);
            }
            if(cmd.getName().equalsIgnoreCase("givepumkinaxe")){
                player.getInventory().addItem(items.PumkinAxe);
            }
            if(cmd.getName().equalsIgnoreCase("givemelonecapitor")){
                player.getInventory().addItem(items.MeloneCapitor);
            }
            if(cmd.getName().equalsIgnoreCase("givecrimsonchestplate")){
                player.getInventory().addItem(items.CrimsonChestplate);
            }
        }
        else{
            sender.sendMessage("Your not allowed to use that Command");
        }
        return true;
    }

}
