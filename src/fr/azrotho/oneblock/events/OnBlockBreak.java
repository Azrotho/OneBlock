package fr.azrotho.oneblock.events;

import fr.azrotho.oneblock.Main;
import fr.azrotho.oneblock.utils.BlocksGestion;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class OnBlockBreak implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event){

        if(event.getBlock().getLocation().equals(new Location(event.getBlock().getWorld(), 0, 0, 0))){
            Main.blockMined++;

            if(Main.blockMined == 1000){
                Bukkit.broadcastMessage("§a§lVous avez débloqué le §e§lDésert !");
            }
            if(Main.blockMined == 2500){
                Bukkit.broadcastMessage("§a§lVous avez débloqué la §f§lMine !");
            }
            if(Main.blockMined == 5000){
                Bukkit.broadcastMessage("§a§lVous avez débloqué l'§b§lOcéan !");
            }
            if(Main.blockMined == 10000){
                Bukkit.broadcastMessage("§a§lVous avez débloqué le §c§lNether !");
            }
            if(Main.blockMined == 25000){
                Bukkit.broadcastMessage("§a§lVous avez débloqué l'§d§lEnd !");
            }


            Material newBlock = BlocksGestion.getNewBlock();
            event.setCancelled(true);
            event.getBlock().breakNaturally();
            event.getBlock().setType(newBlock);
            event.getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent("§c§lBlocks minés: §6" + Main.blockMined));
            if(newBlock == Material.CHEST){
                int random = (int) (Math.random() * 10);
                for(int i = 0; i < random; i++){
                    Chest chest = (Chest) event.getBlock().getState();
                    chest.getBlockInventory().addItem(BlocksGestion.getRandomItem());
                }
            }
        }
    }
}
