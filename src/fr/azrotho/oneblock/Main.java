package fr.azrotho.oneblock;

import fr.azrotho.oneblock.commands.ChooseWave;
import fr.azrotho.oneblock.commands.SpawnBlock;
import fr.azrotho.oneblock.commands.saveconfig;
import fr.azrotho.oneblock.events.InventoryInteraction;
import fr.azrotho.oneblock.events.OnBlockBreak;
import fr.azrotho.oneblock.utils.SaveAll;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class Main extends JavaPlugin {

    public static int blockMined = 0;
    public static String currentVague = "Plaine";

    @Override
    public void onEnable() {
        getLogger().info("OneBlock is enabled!");
        getServer().getPluginManager().registerEvents(new OnBlockBreak(), this);
        getServer().getPluginManager().registerEvents(new InventoryInteraction(), this);
        getCommand("spawnblock").setExecutor(new SpawnBlock());
        getCommand("choosewave").setExecutor(new ChooseWave());
        getCommand("saveconfig").setExecutor(new saveconfig(this));
        SaveAll saveAll = new SaveAll(this);
        saveAll.runTaskTimer(this, 0, 20 * 60);




        File file = new File(this.getDataFolder(), "data.yml");

        if(!file.exists()){
            try {
                file.createNewFile();
                getLogger().info("OneBlock is disabled!");
                final YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
                config.set("blockMined", Main.blockMined);
                config.set("currentVague", Main.currentVague);
                try {
                    config.save(file);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

            blockMined = config.getInt("blockMined");
            currentVague = config.getString("currentVague");
    }

    @Override
    public void onDisable() {
        getLogger().info("OneBlock is disabled!");
        final File file = new File(this.getDataFolder(), "data.yml");
        final YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
        config.set("blockMined", Main.blockMined);
        config.set("currentVague", Main.currentVague);

        try {
            config.save(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
