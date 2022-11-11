package fr.azrotho.oneblock.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemConstructor {
    public static ItemStack getItem(Material material, String customName, Boolean glow, Integer amount){
        ItemStack it = new ItemStack(material, amount);
        ItemMeta itM = it.getItemMeta();
        if(customName != null) itM.setDisplayName(customName);
        if(glow) {
            itM.addEnchant(Enchantment.LUCK, 0, true);
            itM.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        }
        it.setItemMeta(itM);
        return it;
    }
}
