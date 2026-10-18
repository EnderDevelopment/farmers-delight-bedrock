package com.enderdevelopment.agriculturebedrock;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AgricultureBedrockMod implements ModInitializer {
    public static final String MOD_ID = "agriculturebedrock";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
                LOGGER.info("Initializing Agriculture Bedrock Mod");
                ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}