package net.the2019.abilitycraft.craftingRecepie;

import net.the2019.abilitycraft.items.items;
import net.the2019.abilitycraft.items.drops;
import net.the2019.abilitycraft.AbilityCraft;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

public class craftingRecepie {

    public static void enderbow(AbilityCraft plugin) {
        // Create the recipe
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "ender_bow"), items.enderbow);
        recipe.shape(" ST", "SHT", " ST");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('T', Material.STRING);
        recipe.setIngredient('H', new RecipeChoice.ExactChoice(drops.enderheart));
        plugin.getServer().addRecipe(recipe);
    }
    public static void hermitbow(AbilityCraft plugin) {
        // Create the recipe
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "hermit_bow"), items.hermitbow);
        recipe.shape(" ST", "SBH", " ST");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('T', Material.STRING);
        recipe.setIngredient('H', new RecipeChoice.ExactChoice(drops.enderreligt));
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(items.enderbow));
        plugin.getServer().addRecipe(recipe);
    }
    public static void pumkinaxe(AbilityCraft plugin) {
        // Create the recipe
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "pumkin_axe"), items.PumkinAxe);
        recipe.shape("DD ", "DB ", " S ");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(drops.compackedpumkin));
        plugin.getServer().addRecipe(recipe);
    }
    public static void meloncapitator(AbilityCraft plugin) {
        // Create the recipe
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "melon_capitator"), items.MeloneCapitor);
        recipe.shape("DD ", "DB ", " S ");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(drops.compackedmelon));
        plugin.getServer().addRecipe(recipe);
    }
    public static void healwand(AbilityCraft plugin) {
        // Create the recipe
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "heal_wand"), items.healwand);
        recipe.shape(" B ", " S ", " S ");
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(drops.healwandcore));
        plugin.getServer().addRecipe(recipe);
    }
}
