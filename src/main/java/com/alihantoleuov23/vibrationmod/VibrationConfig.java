package com.alihantoleuov23.vibrationmod;

public
class VibrationConfig {
    public static int BREAK_VIBRATION_DURATION = 100;
    public static int PLACE_VIBRATION_DURATION = 100;

    public static void loadConfig() {
        // Load configuration from file or use defaults
        VibrationMod.LOGGER.info("Loading VibrationMod configuration");
    }
}
