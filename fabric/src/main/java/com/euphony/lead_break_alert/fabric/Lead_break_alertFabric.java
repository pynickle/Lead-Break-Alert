package com.euphony.lead_break_alert.fabric;

import com.euphony.lead_break_alert.Lead_break_alert;
import net.fabricmc.api.ModInitializer;

public final class Lead_break_alertFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        Lead_break_alert.init();
    }
}
