package com.maideniles.maidensmaterials.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import net.minecraftforge.fml.loading.FMLConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import static com.maideniles.maidensmaterials.util.ConfigKeys.*;
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
        return key + ": " + value.toString();
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
                makeConfigEntry(MY_KEY_1, 1),
                makeConfigEntry(MY_KEY_2, true)

                //End of config file contents
        );
    }


}

public static class ConfigKeys {
    public static final String
            MY_KEY_1 = "foo",
            MY_KEY_2 = "bar"
                    ;
}