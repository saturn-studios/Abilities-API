package dev.saturnstudios.abilitiesapi.ability;

import dev.saturnstudios.abilitiesapi.utils.Cooldown;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

public class Ability {

    public String getName() {
        throw new IllegalPluginAccessException("The API Is not registered.");
    }

    public String getDisplayName() {
        throw new IllegalPluginAccessException("The API Is not registered.");
    }

    public List<String> getLore() {
        throw new IllegalPluginAccessException("The API Is not registered.");
    }

    public int getCooldownTime() {
        throw new IllegalPluginAccessException("The API Is not registered.");
    }

    public Cooldown getCooldown() {
        throw new IllegalPluginAccessException("The API Is not registered.");
    }

    public ItemStack getItemStack() {
        throw new IllegalPluginAccessException("The API Is not registered.");
    }

    public boolean isEnabled() {
        throw new IllegalPluginAccessException("The API Is not registered.");
    }

    public String getInfo() {
        throw new IllegalPluginAccessException("The API Is not registered.");
    }

    public boolean isCustom() {
        throw new IllegalPluginAccessException("The API Is not registered.");
    }

    public boolean isItem(ItemStack item) {
        throw new IllegalPluginAccessException("The API Is not registered.");
    }

}
