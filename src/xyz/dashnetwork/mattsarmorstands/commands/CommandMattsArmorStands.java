package xyz.dashnetwork.mattsarmorstands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandMattsArmorStands implements CommandExecutor {
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("§c§lMattsArmorStands §6§l>> §6Developed by MM5. Version §cv1.0");
        
        return true;
    }
    
}
