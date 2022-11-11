package fr.azrotho.oneblock.utils;

import fr.azrotho.oneblock.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BlocksGestion {
    public static Material getNewBlock() {

        if(Main.currentVague.equals(null)){
            Main.currentVague = "Plaine";
        }

        Material block = Material.STONE;
        int random = (int) (Math.random() * 100);

            if(Main.currentVague.equalsIgnoreCase("Plaine")){
                if(random < 10){
                    block = getRandomLog();
                } else if(random < 20){
                    block = Material.STONE;
                } else if(random < 30){
                    block = Material.COBBLESTONE;
                } else if(random < 40){
                    block = Material.DIRT;
                } else if(random < 50){
                    block = Material.GRASS_BLOCK;
                } else if(random < 60){
                    block = Material.BONE_BLOCK;
                } else if(random < 70){
                    block = Material.COAL_ORE;
                } else if(random < 75){
                    block = Material.IRON_ORE;
                } else if(random < 78){
                    block = Material.GOLD_ORE;
                } else if(random < 85){
                    block = Material.CHEST;
                } else if(random < 100){
                    block = getRandomWool();
                }
            }

        if(Main.currentVague.equalsIgnoreCase("Desert")) {
                if (random < 10) {
                    block = getRandomLog();
                } else if (random < 10) {
                    block = Material.STONE;
                } else if (random < 20) {
                    block = Material.COBBLESTONE;
                } else if (random < 60) {
                    block = Material.SAND;
                } else if (random < 68) {
                    block = Material.COAL_ORE;
                } else if (random < 75) {
                    block = Material.IRON_ORE;
                } else if (random < 80){
                    block = Material.GOLD_ORE;
                } else if (random < 85) {
                    block = Material.CHEST;
                } else if (random < 100) {
                    block = getRandomWool();
                }
            }

        if(Main.currentVague.equalsIgnoreCase("Mine")){
            if(random < 10){
                block = getRandomLog();
            } else if(random < 10){
                block = Material.STONE;
            }  else if(random < 50){
                block = Material.COAL_ORE;
            } else if(random < 68){
                block = Material.IRON_ORE;
            } else if(random < 75){
                block = Material.GOLD_ORE;
            } else if(random < 80){
                block = Material.DIAMOND_ORE;
            } else if(random < 85){
                block = Material.CHEST;
            } else if(random < 100){
                block = getRandomWool();
            }
        }

        if(Main.currentVague.equalsIgnoreCase("ocean")){
            if(random < 10){
                block = getRandomLog();
            } else if(random < 20){
                block = Material.STONE;
            } else if(random < 30){
                block = Material.COBBLESTONE;
            } else if(random < 40){
                block = Material.GRAVEL;
            } else if(random < 50){
                block = Material.SAND;
            } else if(random < 60){
                block = Material.CLAY;
            } else if(random < 70){
                block = Material.BONE_BLOCK;
            } else if(random < 75){
                block = Material.COAL_ORE;
            } else if(random < 80){
                block = Material.IRON_ORE;
            } else if(random < 85){
                block = Material.CHEST;
            } else if(random < 100){
                block = getRandomWool();
            }
        }

        if(Main.currentVague.equalsIgnoreCase("Nether")){
            if(random < 10){
                block = getRandomLog();
            } else if(random < 20){
                block = Material.STONE;
            } else if(random < 30){
                block = Material.COBBLESTONE;
            } else if(random < 40){
                block = Material.NETHERRACK;
            } else if(random < 50){
                block = Material.SOUL_SAND;
            } else if(random < 60){
                block = Material.GRAVEL;
            } else if(random < 70){
                block = Material.BONE_BLOCK;
            } else if(random < 75){
                block = Material.COAL_ORE;
            } else if(random < 80){
                block = Material.IRON_ORE;
            } else if(random < 85){
                block = Material.CHEST;
            } else if(random < 100){
                block = getRandomWool();
            }
        }

        if(Main.currentVague.equalsIgnoreCase("End")){
            if(random < 10){
                block = getRandomLog();
            } else if(random < 10){
                block = Material.PRISMARINE;
            } else if(random < 30){
                block = Material.DARK_PRISMARINE;
            } else if(random < 40){
                block = Material.SEA_LANTERN;
            } else if(random < 50){
                block = Material.SAND;
            } else if(random < 60){
                block = Material.GRAVEL;
            } else if(random < 70){
                block = Material.CLAY;
            } else if(random < 75){
                block = Material.SPONGE;
            } else if(random < 80){
                block = Material.BRAIN_CORAL_BLOCK;
            } else if(random < 85){
                block = Material.CHEST;
            } else if(random < 90){
                block = Material.BUBBLE_CORAL_BLOCK;
            } else if(random < 95){
                block = Material.FIRE_CORAL_BLOCK;
            } else if(random < 100){
                block = Material.TUBE_CORAL_BLOCK;
            }
        }

        if(Main.currentVague.equalsIgnoreCase("Nether")) {
            if (random < 10) {
                block = Material.NETHER_BRICKS;
            } else if (random < 20) {
                block = Material.NETHER_QUARTZ_ORE;
            } else if (random < 50) {
                block = Material.NETHERRACK;
            } else if (random < 60){
              block = Material.GLOWSTONE;
            } else if (random < 70){
                block = Material.NETHER_GOLD_ORE;
            } else if(random < 71){
                block = Material.ANCIENT_DEBRIS;
            } else if (random < 85) {
                block = Material.CHEST;
            } else if (random < 100) {
                block = getRandomWool();
            }
        }
        if(Main.currentVague.equalsIgnoreCase("End")) {
            if (random < 80) {
                block = Material.END_STONE;
            } else if (random < 90) {
                block = Material.PURPUR_BLOCK;
            } else if (random < 100) {
                block = Material.CHEST;
            }
        }

        if(Main.currentVague.equalsIgnoreCase("random")){
            List<Material> blocks = new ArrayList<>();
            for(Material material : Material.values()){
                if(material.isBlock()){
                    blocks.add(material);
                }
            }
            Collections.shuffle(blocks);
            block = blocks.get(0);
        }

        return block;
    }

    public static Material getRandomWool(){
        List<Material> wools = new ArrayList<Material>();
        wools.add(Material.WHITE_WOOL);
        wools.add(Material.ORANGE_WOOL);
        wools.add(Material.MAGENTA_WOOL);
        wools.add(Material.LIGHT_BLUE_WOOL);
        wools.add(Material.YELLOW_WOOL);
        wools.add(Material.LIME_WOOL);
        wools.add(Material.PINK_WOOL);
        wools.add(Material.GRAY_WOOL);
        wools.add(Material.LIGHT_GRAY_WOOL);
        wools.add(Material.CYAN_WOOL);
        wools.add(Material.PURPLE_WOOL);
        wools.add(Material.BLUE_WOOL);
        wools.add(Material.BROWN_WOOL);
        wools.add(Material.GREEN_WOOL);
        wools.add(Material.RED_WOOL);
        wools.add(Material.BLACK_WOOL);
        return wools.get((int) (Math.random() * wools.size()));
    }

    public static Material getRandomLog(){
        List<Material> logs = new ArrayList<Material>();
        logs.add(Material.OAK_LOG);
        logs.add(Material.SPRUCE_LOG);
        logs.add(Material.BIRCH_LOG);
        logs.add(Material.JUNGLE_LOG);
        logs.add(Material.ACACIA_LOG);
        logs.add(Material.DARK_OAK_LOG);
        return logs.get((int) (Math.random() * logs.size()));
    }

    public static ItemStack getRandomItem(){
        List<ItemStack> items = new ArrayList<ItemStack>();

        if(Main.currentVague.equalsIgnoreCase("plaine")){
            items.add(new ItemStack(Material.STONE_SWORD));
            items.add(new ItemStack(Material.STONE_AXE));
            items.add(new ItemStack(Material.STONE_PICKAXE));
            items.add(new ItemStack(Material.STONE_SHOVEL));
            items.add(new ItemStack(Material.STONE_HOE));
            items.add(new ItemStack(Material.WHEAT_SEEDS));
            items.add(new ItemStack(Material.POTATOES));
            items.add(new ItemStack(Material.CARROTS));
            items.add(new ItemStack(Material.BEETROOT_SEEDS));
            items.add(new ItemStack(Material.APPLE));
            items.add(new ItemStack(Material.LAVA_BUCKET));
            items.add(new ItemStack(Material.WATER_BUCKET));
            items.add(new ItemStack(Material.OAK_SAPLING));
            items.add(new ItemStack(Material.SPRUCE_SAPLING));
            items.add(new ItemStack(Material.BIRCH_SAPLING));
            items.add(new ItemStack(Material.JUNGLE_SAPLING));
            items.add(new ItemStack(Material.ACACIA_SAPLING));
            items.add(new ItemStack(Material.DARK_OAK_SAPLING));
            items.add(new ItemStack(Material.BREAD));
            items.add(new ItemStack(Material.COOKED_BEEF));
            items.add(new ItemStack(Material.MUSIC_DISC_FAR));
        }

        if(Main.currentVague.equalsIgnoreCase("desert")){
            items.add(new ItemStack(Material.STONE_SWORD));
            items.add(new ItemStack(Material.STONE_AXE));
            items.add(new ItemStack(Material.STONE_PICKAXE));
            items.add(new ItemStack(Material.STONE_SHOVEL));
            items.add(new ItemStack(Material.STONE_HOE));
            items.add(new ItemStack(Material.CACTUS));
            items.add(new ItemStack(Material.SAND));
            items.add(new ItemStack(Material.SANDSTONE));
            items.add(new ItemStack(Material.RED_SAND));
            items.add(new ItemStack(Material.RED_SANDSTONE));
            items.add(new ItemStack(Material.LAVA_BUCKET));
            items.add(new ItemStack(Material.WATER_BUCKET));
            items.add(new ItemStack(Material.GUNPOWDER));
            items.add(new ItemStack(Material.BONE));
            items.add(new ItemStack(Material.SUGAR_CANE));
            items.add(new ItemStack(Material.BREAD));
            items.add(new ItemStack(Material.TNT));
            items.add(new ItemStack(Material.MUSIC_DISC_CAT));
        }

        if(Main.currentVague.equalsIgnoreCase("Mine")){
            items.add(new ItemStack(Material.IRON_AXE));
            items.add(new ItemStack(Material.IRON_PICKAXE));
            items.add(new ItemStack(Material.IRON_SHOVEL));
            items.add(new ItemStack(Material.GLOW_BERRIES));
            items.add(new ItemStack(Material.GOLDEN_APPLE));
            items.add(new ItemStack(Material.GOLDEN_CARROT));
            items.add(new ItemStack(Material.GOLDEN_SWORD));
            items.add(new ItemStack(Material.TNT));
            items.add(new ItemStack(Material.LAVA_BUCKET));
            items.add(new ItemStack(Material.WATER_BUCKET));
            items.add(new ItemStack(Material.BREAD));
            items.add(new ItemStack(Material.GOLD_INGOT));
            items.add(new ItemStack(Material.IRON_INGOT));
            items.add(new ItemStack(Material.DIAMOND));
            items.add(new ItemStack(Material.EMERALD));
            items.add(new ItemStack(Material.GLOW_INK_SAC));
            items.add(new ItemStack(Material.MUSIC_DISC_OTHERSIDE));
        }

        if(Main.currentVague.equalsIgnoreCase("ocean")){
            items.add(new ItemStack(Material.STONE_SWORD));
            items.add(new ItemStack(Material.STONE_AXE));
            items.add(new ItemStack(Material.STONE_PICKAXE));
            items.add(new ItemStack(Material.STONE_SHOVEL));
            items.add(new ItemStack(Material.STONE_HOE));
            items.add(new ItemStack(Material.WET_SPONGE));
            items.add(new ItemStack(Material.COD));
            items.add(new ItemStack(Material.SALMON));
            items.add(new ItemStack(Material.PUFFERFISH));
            items.add(new ItemStack(Material.TROPICAL_FISH));
            items.add(new ItemStack(Material.LAVA_BUCKET));
            items.add(new ItemStack(Material.WATER_BUCKET));
            items.add(new ItemStack(Material.BREAD));
            items.add(new ItemStack(Material.HEART_OF_THE_SEA));
            items.add(new ItemStack(Material.MAP));
            items.add(new ItemStack(Material.MUSIC_DISC_CHIRP));

        }

        if(Main.currentVague.equalsIgnoreCase("nether")){
            items.add(new ItemStack(Material.GOLDEN_SWORD));
            items.add(new ItemStack(Material.GOLDEN_AXE));
            items.add(new ItemStack(Material.GOLDEN_PICKAXE));
            items.add(new ItemStack(Material.GOLDEN_SHOVEL));
            items.add(new ItemStack(Material.GOLDEN_HOE));
            items.add(new ItemStack(Material.GOLDEN_APPLE));
            items.add(new ItemStack(Material.GOLDEN_CARROT));
            items.add(new ItemStack(Material.GOLDEN_HELMET));
            items.add(new ItemStack(Material.GOLDEN_CHESTPLATE));
            items.add(new ItemStack(Material.GOLDEN_LEGGINGS));
            items.add(new ItemStack(Material.GOLDEN_BOOTS));
            items.add(new ItemStack(Material.GOLD_INGOT));
            items.add(new ItemStack(Material.BLAZE_POWDER));
            items.add(new ItemStack(Material.BLAZE_ROD));
            items.add(new ItemStack(Material.ENDER_PEARL));
            items.add(new ItemStack(Material.LAVA_BUCKET));
            items.add(new ItemStack(Material.END_PORTAL_FRAME));
            items.add(new ItemStack(Material.MUSIC_DISC_PIGSTEP));
        }

        if(Main.currentVague.equalsIgnoreCase("end")){
            items.add(new ItemStack(Material.DIAMOND_SWORD));
            items.add(new ItemStack(Material.DIAMOND_AXE));
            items.add(new ItemStack(Material.DIAMOND_PICKAXE));
            items.add(new ItemStack(Material.DIAMOND_SHOVEL));
            items.add(new ItemStack(Material.DIAMOND_HELMET));
            items.add(new ItemStack(Material.DIAMOND_CHESTPLATE));
            items.add(new ItemStack(Material.DIAMOND_LEGGINGS));
            items.add(new ItemStack(Material.DIAMOND_BOOTS));
            items.add(new ItemStack(Material.ENDER_PEARL));
            items.add(new ItemStack(Material.ENDER_EYE));
            items.add(new ItemStack(Material.ENDER_CHEST));
            items.add(new ItemStack(Material.END_PORTAL_FRAME));
            items.add(new ItemStack(Material.MUSIC_DISC_STAL));
            items.add(new ItemStack(Material.DRAGON_BREATH));
            items.add(new ItemStack(Material.DRAGON_HEAD));
            items.add(new ItemStack(Material.DRAGON_EGG));
            items.add(new ItemStack(Material.ELYTRA));
            items.add(new ItemStack(Material.SHULKER_SHELL));
            items.add(new ItemStack(Material.SHULKER_BOX));
            items.add(new ItemStack(Material.FIREWORK_ROCKET, 10));
        }

        return items.get((int) (Math.random() * items.size()));
    }

}
