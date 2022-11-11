package fr.azrotho.oneblock.commands;

import fr.azrotho.oneblock.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class saveconfig implements CommandExecutor {

    public saveconfig(Main main) {
        this.main = main;
    }

    private Main main;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        final File file = new File(main.getDataFolder(), "data.yml");
        final YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
        config.set("blockMined", Main.blockMined);
        config.set("currentVague", Main.currentVague);

        try {
            config.save(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return true;
    }
}
