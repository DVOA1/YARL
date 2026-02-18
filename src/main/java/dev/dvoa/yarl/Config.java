package dev.dvoa.yarl;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public final ModConfigSpec.ConfigValue<String> welcomeMessage = BUILDER
            .define("IMPORTANT", "DO NOT SHIP THIS CONFIG FILE IN A MODPACK!");

    public static final ModConfigSpec.BooleanValue LOAD_RESOURCES = BUILDER
            .gameRestart()
            .comment("- USED INTERNALLY! Stores whether is the first time opening the game.")
            .define("loadResources", true);

    static final ModConfigSpec SPEC = BUILDER.build();
}