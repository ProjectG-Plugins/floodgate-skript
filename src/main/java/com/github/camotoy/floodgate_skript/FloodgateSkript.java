package com.github.camotoy.floodgate_skript;

import ch.njol.skript.Skript;
import ch.njol.skript.SkriptAddon;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public final class FloodgateSkript extends JavaPlugin {

    @Override
    public void onEnable() {
        SkriptAddon addonInstance = Skript.registerAddon(this);
        try {
            addonInstance.loadClasses("com.github.camotoy.floodgate_skript", "expressions", "conditions");
        } catch (IOException e) {
            getLogger().warning("IOException caught. Disabling plugin.");
            getServer().getPluginManager().disablePlugin(this);
        }
    }
}
