package emeraldsword.emeraldsword;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class EmeraldSword extends JavaPlugin {

    @Override
    public void onEnable(){
        Bukkit.addRecipe(getItem());
    }

    public Recipe getItem(){
        ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta itemMeta = itemStack.getItemMeta();
        assert itemMeta != null;
        itemMeta.setDisplayName("§aEmerald Sword");
        itemMeta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemStack.setItemMeta(itemMeta);

        NamespacedKey namespacedKey = new NamespacedKey(this,"Emerald_Sword");
        ShapedRecipe shapedRecipe = new ShapedRecipe(namespacedKey, itemStack);

        shapedRecipe.shape("A", "B", "C");
        shapedRecipe.setIngredient('A', Material.EMERALD);
        shapedRecipe.setIngredient('B', Material.EMERALD);
        shapedRecipe.setIngredient('C', Material.STICK);
        return shapedRecipe;
    }


    @Override
    public void onDisable() {

    }
}
