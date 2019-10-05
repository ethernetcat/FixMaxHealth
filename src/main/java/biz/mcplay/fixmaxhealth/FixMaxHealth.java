package biz.mcplay.fixmaxhealth;

import org.bukkit.attribute.Attribute;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class FixMaxHealth extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        if (e.getPlayer().getHealth() >= 20) {
            e.getPlayer().setHealth(20.0);
        }
        e.getPlayer().getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(20.0);
    }
}