package xyz.dashnetwork.mattsarmorstands;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.dashnetwork.mattsarmorstands.commands.CommandMattsArmorStands;

public class MattsArmorStandsMain extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("mattsarmorstands").setExecutor(new CommandMattsArmorStands());
    }

}
