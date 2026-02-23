package dev.dvoa.yarl;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue LOAD_RESOURCES = BUILDER
            .gameRestart()
            .comment("- USED INTERNALLY! Stores whether is the first time opening the game.")
            .define("loadResources", true);

    static final ModConfigSpec SPEC = BUILDER.build();
}