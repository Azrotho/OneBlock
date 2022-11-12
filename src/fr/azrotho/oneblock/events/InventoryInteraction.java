package fr.azrotho.oneblock.events;

import fr.azrotho.oneblock.Main;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryInteraction implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){
        if(event.getView().getTitle().contains("§c§l")){
            event.setCancelled(true);
            switch(event.getCurrentItem().getType()) {
                case GRASS_BLOCK:
                    event.getWhoClicked().sendMessage("§aYou have chosen the biome §2§lPlain");
                    Main.currentVague = "plaine";
                    break;
                case SAND:
                    if(Main.blockMined <= 1000){
                        event.getWhoClicked().sendMessage("§cYou must have mined §4§l1000 §cblocks to unlock this biome");
                    }else{
                        event.getWhoClicked().sendMessage("§aYou have chosen the biome §e§lDésert");
                        Main.currentVague = "desert";
                    }
                    break;
                case STONE:
                    if(Main.blockMined <= 2500){
                        event.getWhoClicked().sendMessage("§cYou must have mined §4§l2500 §cblocks to unlock this biome");
                    }else{
                        event.getWhoClicked().sendMessage("§aYou have chosen the biome §f§lMine");
                        Main.currentVague = "mine";
                    }
                    break;
                case PRISMARINE:
                    if(Main.blockMined <= 5000){
                        event.getWhoClicked().sendMessage("§cYou must have mined §4§l5000 §cblocks to unlock this biome");
                    }else{
                        event.getWhoClicked().sendMessage("§aYou have chosen the biome §b§lOcéan");
                        Main.currentVague = "ocean";
                    }
                    break;
                case NETHERRACK:
                    if(Main.blockMined <= 10000){
                        event.getWhoClicked().sendMessage("§cYou must have mined §4§l10000 §cblocks to unlock this biome");
                    }else{
                        event.getWhoClicked().sendMessage("§aYou have chosen the biome §c§lNether");
                        Main.currentVague = "nether";
                    }
                    break;
                case END_STONE:
                    if(Main.blockMined <= 25000){
                        event.getWhoClicked().sendMessage("§cYou must have mined §4§l25000 §cblocks to unlock this biome");
                    }else{
                        event.getWhoClicked().sendMessage("§aYou have chosen the biome §d§lEnd");
                        Main.currentVague = "end";
                    }
                    break;
                case COMMAND_BLOCK:
                    if(Main.blockMined <= 100000){
                        event.getWhoClicked().sendMessage("§cYou must have mined §4§l50000 §cblocks to unlock this biome");
                    }else{
                        event.getWhoClicked().sendMessage("§aYou have chosen the biome §c§lR§6§lA§e§LN§a§lD§b§lO§d§lM");
                        Main.currentVague = "command";
                    }
                case BARRIER:
                    event.getWhoClicked().sendMessage("§c:c");
                    event.getWhoClicked().closeInventory();
                    break;
            }
        }
    }
}
