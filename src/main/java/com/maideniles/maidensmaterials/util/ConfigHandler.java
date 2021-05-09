package com.maideniles.maidensmaterials.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

import com.maideniles.maidensmaterials.world.gen.ore.OreType;
import net.minecraftforge.fml.loading.FMLConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import static com.maideniles.maidensmaterials.util.ConfigHandler.ConfigKeys.*;
import static com.maideniles.maidensmaterials.MaidensMaterials.MOD_ID;

public class ConfigHandler {

    public static KVP getConfig() {
        String contents = "";

        try {
            contents = new String(
                    Files.readAllBytes(
                            getConfigPath()
                    )
            );
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return KVP.parse(contents);
    }

    public static Path getConfigPath() {
        return FMLPaths.GAMEDIR.get().resolve(FMLConfig.defaultConfigPath()).resolve(MOD_ID + ".kvp");
    }


    private static String multilineString(String... args) {
        return String.join("\n", args);
    }

    private static String makeConfigEntry(String key, Object value) {
        return KVP.escape(key) + ": " + KVP.escape(value.toString());
    }





    public static boolean makeConfigIfAbsent() {
        try {
            File config = getConfigPath().toFile();
            if(!config.exists()){
                config.createNewFile();
                try(FileWriter fileWriter = new FileWriter(config.getAbsoluteFile())) {
                    fileWriter.write(getDefaultConfigContents());
                }
            }
            return true;
        } catch (IOException exception) {
            exception.printStackTrace();
            return false;
        }
    }

    private static String getDefaultConfigContents() {
        return multilineString(
                //Start of config file contents

                "!Maiden's Marvelous Materials Config",

                "!Biome Weights",
                makeConfigEntry(ORNAMENTAL_FOREST_WEIGHT, 100),
                makeConfigEntry(ORNAMENTAL_ORCHARD_WEIGHT, 100),
                makeConfigEntry(OASIS_SHORES_WEIGHT, 100),
                makeOreConfig()
                //End of config file contents
        );
    }




public static class ConfigKeys {
    public static final String

            ORNAMENTAL_FOREST_WEIGHT = "Ornamental Forest Biome Weight",
            ORNAMENTAL_ORCHARD_WEIGHT = "Ornamental Orchard Biome Weight",
    OASIS_SHORES_WEIGHT = "Oasis Shores Biome Weight"
                    ;
}


    public static String makeOreConfig()
    {
        String result = "";
        for(OreType ore : OreType.values()){
            result += multilineString(
                    "",
                    "!" + ore.getName() + " Generation Options",
                    makeConfigEntry(ore.getName() + " max vein size", ore.getMaxVeinSize()),
                    makeConfigEntry(ore.getName() + " min height", ore.getMinHeight()),
                    makeConfigEntry(ore.getName() + " max height", ore.getMaxHeight()),
                    ""
            );
        }
        return result;
    }

}