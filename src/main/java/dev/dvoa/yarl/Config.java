package dev.dvoa.yarl;

import com.moandjiezana.toml.Toml;
import com.moandjiezana.toml.TomlWriter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Config {
    public static String IMPORTANT;
    public static boolean LOAD_RESOURCES;
    private static File CONFIG_FILE;

    public static void load() {
        CONFIG_FILE = Path.of("config", "yarl-client.toml").toFile();

        Toml toml;
        if (CONFIG_FILE.exists()) {
            toml = new Toml().read(CONFIG_FILE);
        } else {
            toml = new Toml();
        }

        IMPORTANT = toml.getString("IMPORTANT", "DO NOT SHIP THIS CONFIG FILE IN A MODPACK! Stores whether is the first time opening the game.");
        LOAD_RESOURCES = toml.getBoolean("loadResources", true);
        save();
    }

    public static void save() {
        TomlWriter writer = new TomlWriter();
        java.util.Map<String, Object> data = new java.util.HashMap<>();
        data.put("IMPORTANT", IMPORTANT);
        data.put("loadResources", LOAD_RESOURCES);

        try {
            writer.write(data, CONFIG_FILE);
        } catch (IOException e) {
            YARL.LOGGER.error("Could not write to config file!");
        }
    }
}
