package net.the2019.abilitycraft.items;

import java.util.ArrayList;
import java.util.List;


import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class items {
    public static ItemStack GrapplingHook;
    public static ItemStack BloodScyth;
    public static ItemStack PumkinAxe;
    public static ItemStack MeloneCapitor;
    public static ItemStack CrimsonChestplate;

    public static void init(){
        CreateGrapplingHook();
        CreateBloodScyth();
        CreatePumkinAxe();
        CreateMeloneCapitor();
        CreateCrimsonChestplate();
    }



    private static void CreateGrapplingHook() {

        ItemStack item = new ItemStack(Material.FISHING_ROD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Grappling Hook");
        List <String> lore = new ArrayList<>();
        lore.add("§7 Travel in the direction that you looking");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        GrapplingHook = item;
    }
    private static void CreateBloodScyth(){
        ItemStack item = new ItemStack(Material.IRON_HOE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3Blood Scyth");
        List <String> lore = new ArrayList<>();
        lore.add("§7Item Ability: ");
        lore.add("Shoots a blood orb that deals ");
        lore.add("30 Damage per hit.");
        lore.add("");
        lore.add("§7LEGENDARY");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        BloodScyth = item;
    }
    private static void CreatePumkinAxe(){
        ItemStack item = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Pumkin Axe");
        List <String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7Farms Pumkins more efficent and double drops ");
        lore.add("");
        lore.add("§7LEGENDARY");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
        PumkinAxe = item;
    }
    private static void CreateMeloneCapitor(){
        ItemStack item = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Melone Capitor");
        List <String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7Farms Melonoes more efficent and tribels drops ");
        lore.add("");
        lore.add("§7LEGENDARY");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
        MeloneCapitor = item;
    }
    private static void CreateCrimsonChestplate(){
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Crimson Chestplate");
        List <String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7Gives Strenth, Speed and Jum Boost.");
        lore.add("");
        lore.add("§6LEGENDARY");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        CrimsonChestplate = item;
    }
}

