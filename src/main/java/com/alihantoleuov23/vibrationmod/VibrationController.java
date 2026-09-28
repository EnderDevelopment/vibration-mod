package com.alihantoleuov23.vibrationmod;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;

public
class VibrationController {
    public static void register() {
        PlayerBlockBreakEvents.AFTER.register((world, player, pos, state, blockEntity) -> {
            if (!world.isClient) {
                triggerVibration(player, VibrationConfig.BREAK_VIBRATION_DURATION);
            }
        });

        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            if (!world.isClient && hand == Hand.MAIN_HAND) {
                triggerVibration(player, VibrationConfig.PLACE_VIBRATION_DURATION);
            }
            return ActionResult.PASS;
        });
    }

    private static void triggerVibration(PlayerEntity player, int duration) {
        if (duration > 0) {
            // Implement vibration logic here
            VibrationMod.LOGGER.info("Triggering vibration for " + duration + " ms");
        }
    }
}
