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
    public static void ringoftheragon(AbilityCraft plugin) {
        // Create the recipe
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "ring_of_the_dragon"), items.ringofthedragon);
        recipe.shape(" N ", "EDE", " N ");
        recipe.setIngredient('N', Material.NETHER_STAR);
        recipe.setIngredient('D', Material.DRAGON_EGG);
        recipe.setIngredient('E', Material.ELYTRA);
        plugin.getServer().addRecipe(recipe);
    }
    public static void bloodscyth(AbilityCraft plugin) {
        // Create the recipe
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "blood_scyth"), items.BloodScyth);
        recipe.shape("PPP", "PS ", " S ");
        recipe.setIngredient('P', new RecipeChoice.ExactChoice(drops.piglinblood));
        recipe.setIngredient('S', Material.STICK);
        plugin.getServer().addRecipe(recipe);
    }
    public static void cobalddrill(AbilityCraft plugin) {
        // Create the recipe
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "cobald_drill"), items.cobaldDrill);
        recipe.shape(" P ", "PNP", " S ");
        recipe.setIngredient('P', new RecipeChoice.ExactChoice(drops.cobaldingot));
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('N', Material.NETHERITE_INGOT);
        plugin.getServer().addRecipe(recipe);
    }
}
