package fr.azrotho.oneblock.commands;

import fr.azrotho.oneblock.Main;
import fr.azrotho.oneblock.utils.ItemConstructor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ChooseWave implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        Inventory inventory = Bukkit.createInventory(null, 18, "§c§lChoisir un biome");
        p.openInventory(inventory);

        for(int i = 0; i < 18; i++){
            inventory.setItem(i, ItemConstructor.getItem(Material.GRAY_STAINED_GLASS_PANE, "", false, 1));
            if(i == 1) inventory.setItem(i, ItemConstructor.getItem(Material.GRASS_BLOCK, "§a§lPlaine", Main.currentVague.equalsIgnoreCase("plaine"), 1));
            if(i == 3) inventory.setItem(i, ItemConstructor.getItem(Material.SAND, "§e§lDésert", Main.currentVague.equalsIgnoreCase("desert"), 1));
            if(i == 5) inventory.setItem(i, ItemConstructor.getItem(Material.STONE, "§f§lMine", Main.currentVague.equalsIgnoreCase("mine"), 1));
            if(i == 7) inventory.setItem(i, ItemConstructor.getItem(Material.PRISMARINE, "§b§lOcéan", Main.currentVague.equalsIgnoreCase("ocean"), 1));
            if(i == 11) inventory.setItem(i, ItemConstructor.getItem(Material.NETHERRACK, "§c§lNether", Main.currentVague.equalsIgnoreCase("nether"), 1));
            if(i == 13) inventory.setItem(i, ItemConstructor.getItem(Material.END_STONE, "§d§lEnd", Main.currentVague.equalsIgnoreCase("end"), 1));
            if(i == 15) inventory.setItem(i, ItemConstructor.getItem(Material.BARRIER, "§c§lFermer", false, 1));
        }
        return true;
    }
}
