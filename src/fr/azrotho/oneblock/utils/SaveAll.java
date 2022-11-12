package fr.azrotho.oneblock.utils;

import fr.azrotho.oneblock.Main;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.File;
import java.io.IOException;

public class SaveAll extends BukkitRunnable {

    private final Main main;

    public SaveAll(Main main) {
        this.main = main;
    }

    @Override
    public void run() {
        final File file = new File(main.getDataFolder(), "data.yml");
        final YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
        config.set("blockMined", Main.blockMined);
        config.set("currentVague", Main.currentVague);

        try {
            config.save(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(Player p : Bukkit.getOnlinePlayers()){
            p.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent("§a§lGame Saved."));
        }
    }
}
