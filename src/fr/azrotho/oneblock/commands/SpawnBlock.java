package fr.azrotho.oneblock.commands;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SpawnBlock implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Block block = commandSender.getServer().getWorld("world").getBlockAt(0, 0, 0);
        block.setType(Material.DIRT);
        Block block2 = commandSender.getServer().getWorld("world").getBlockAt(0, -1, 0);
        block2.setType(Material.BEDROCK);
        return true;
    }
}
