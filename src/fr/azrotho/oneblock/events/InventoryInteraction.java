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
                    event.getWhoClicked().sendMessage("§aVous avez choisi le biome §2§lPlaine");
                    Main.currentVague = "plaine";
                    break;
                case SAND:
                    if(Main.blockMined <= 1000){
                        event.getWhoClicked().sendMessage("§cVous devez avoir miné §4§l1000 §cblocs pour débloquer ce biome");
                    }else{
                        event.getWhoClicked().sendMessage("§aVous avez choisi le biome §e§lDésert");
                        Main.currentVague = "desert";
                    }
                    break;
                case STONE:
                    if(Main.blockMined <= 2500){
                        event.getWhoClicked().sendMessage("§cVous devez avoir miné §4§l2500 §cblocs pour débloquer ce biome");
                    }else{
                        event.getWhoClicked().sendMessage("§aVous avez choisi le biome §f§lMine");
                        Main.currentVague = "mine";
                    }
                    break;
                case PRISMARINE:
                    if(Main.blockMined <= 5000){
                        event.getWhoClicked().sendMessage("§cVous devez avoir miné §4§l5000 §cblocs pour débloquer ce biome");
                    }else{
                        event.getWhoClicked().sendMessage("§aVous avez choisi le biome §b§lOcéan");
                        Main.currentVague = "ocean";
                    }
                    break;
                case NETHERRACK:
                    if(Main.blockMined <= 10000){
                        event.getWhoClicked().sendMessage("§cVous devez avoir miné §4§l10000 §cblocs pour débloquer ce biome");
                    }else{
                        event.getWhoClicked().sendMessage("§aVous avez choisi le biome §c§lNether");
                        Main.currentVague = "nether";
                    }
                    break;
                case END_STONE:
                    if(Main.blockMined <= 25000){
                        event.getWhoClicked().sendMessage("§cVous devez avoir miné §4§l25000 §cblocs pour débloquer ce biome");
                    }else{
                        event.getWhoClicked().sendMessage("§aVous avez choisi le biome §d§lEnd");
                        Main.currentVague = "end";
                    }
                    break;
                case COMMAND_BLOCK:
                    if(Main.blockMined <= 100000){
                        event.getWhoClicked().sendMessage("§cVous devez avoir miné §4§l50000 §cblocs pour débloquer ce biome");
                    }else{
                        event.getWhoClicked().sendMessage("§aVous avez choisi le biome §c§lR§6§lA§e§LN§a§lD§b§lO§d§lM");
                        Main.currentVague = "command";
                    }
                case BARRIER:
                    event.getWhoClicked().sendMessage("§cVous avez annulé la sélection du biome");
                    event.getWhoClicked().closeInventory();
                    break;
            }
        }
    }
}
