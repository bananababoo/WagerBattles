package me.bananababoo.wagerbattles;

import co.aikar.commands.PaperCommandManager;
import lombok.Getter;
import mc.obliviate.inventory.InventoryAPI;
import org.bukkit.plugin.java.JavaPlugin;

public final class WagerBattles extends JavaPlugin {

    @Getter
    PaperCommandManager manager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        new InventoryAPI(this).init();
        manager = new PaperCommandManager(this);
        manager.registerCommand(new WagerCommand());
    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
