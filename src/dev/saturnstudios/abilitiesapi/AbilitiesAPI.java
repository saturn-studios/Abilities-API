package dev.saturnstudios.abilitiesapi;

import dev.saturnstudios.abilitiesapi.ability.Ability;
import org.bukkit.plugin.IllegalPluginAccessException;


import java.util.List;

public class AbilitiesAPI {

    public static AbilitiesAPI INSTANCE;

    public AbilitiesAPI() {
    }

    public List<Ability> getAbilities() {
        throw new IllegalPluginAccessException("The API Is not registered.");
    }

}
