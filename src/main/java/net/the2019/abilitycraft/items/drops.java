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
    public static ItemStack healpast;
    public static ItemStack healwandcore;
    public static ItemStack compackedpumkin;
    public static ItemStack compackedmelon;


    public static void init(){
        CreateEnderHeart();
        CreateEnderReligt();
        CreateHealPast();
        CreateHealWandCore();
        CreateCompackedPumkin();
        CreatecompackedMelon();
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
    private static void CreateHealPast() {
        ItemStack item = new ItemStack(Material.INK_SAC, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§7Heal Past");
        List<String> lore = new ArrayList<>();
        lore.add("§7 A common drop from Zombies.");
        lore.add("§7 Its used to heal you with the healing Wand.");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        healpast = item;
    }
    private static void CreateHealWandCore() {
        ItemStack item = new ItemStack(Material.BONE_MEAL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Heal Wand Core");
        List<String> lore = new ArrayList<>();
        lore.add("§7 A rare drop from Zombies.");
        lore.add("§7 Its used to craft the Healing Wand.");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.addUnsafeEnchantment(Enchantment.LUCK, 1);
        item.setItemMeta(meta);
        healwandcore = item;
    }
    private static void CreatecompackedMelon() {
        ItemStack item = new ItemStack(Material.BONE_MEAL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Compacked Melon");
        List<String> lore = new ArrayList<>();
        lore.add("§7 A rare drop from Melons.");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.addUnsafeEnchantment(Enchantment.LUCK, 1);
        item.setItemMeta(meta);
        compackedmelon = item;
    }
    private static void CreateCompackedPumkin() {
        ItemStack item = new ItemStack(Material.ORANGE_DYE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Compacked Pumkin");
        List<String> lore = new ArrayList<>();
        lore.add("§7 A rare drop from Pumkins.");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.addUnsafeEnchantment(Enchantment.LUCK, 1);
        item.setItemMeta(meta);
        compackedpumkin = item;
    }
}