package net.lonestar;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class Welcome extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Welcome plugin has been enabled!");
        Objects.requireNonNull(getCommand("welcome")).setExecutor(this);
        getServer().getPluginManager().registerEvents(new Background(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Welcome plugin has been disabled!");
    }

    @Override
    public void onLoad() {
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command welcome, @NotNull String label, String[] args) {
        if (label.equalsIgnoreCase("welcome")) {
            sender.sendMessage("Welcome command executed!");
            return true;
        }
        return false;
    }
}
