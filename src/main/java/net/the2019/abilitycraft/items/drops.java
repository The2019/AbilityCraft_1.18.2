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
    public static ItemStack enderreligt;


    public static void init(){
        CreateEnderHeart();
        CreateEnderReligt();
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
    private static void CreateEnderReligt() {
        ItemStack item = new ItemStack(Material.DIAMOND, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Enderman Religt");
        List<String> lore = new ArrayList<>();
        lore.add("§7 A rare drop from Enderman.");
        lore.add("§7 Its used to craft the Hermit Bow.");
        lore.add("§7 One of the strongest weapons in the game.");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
        item.setItemMeta(meta);
        enderreligt = item;
    }
}