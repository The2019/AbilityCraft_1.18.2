package net.the2019.abilitycraft.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class drops {

    public static ItemStack enderheart;


    public static void init(){
        CreateEnderHeart();
    }


    private static void CreateEnderHeart() {

        ItemStack item = new ItemStack(Material.DIAMOND, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Enderman Heart");
        List<String> lore = new ArrayList<>();
        lore.add("§7 It´s used to craft the Ender Bow");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        enderheart = item;
    }
}