package com.alihantoleuov23.vibrationmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class VibrationMod implements ModInitializer {
    public static final String MOD_ID = "vibrationmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing VibrationMod");
        VibrationController.register();
    }
}
