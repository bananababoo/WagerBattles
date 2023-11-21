package me.bananababoo.wagerbattles;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Optional;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.entity.Player;

@CommandAlias("wager-battles|wb")
public class WagerCommand extends BaseCommand {

    @Default
    public void onDefault(Player player) {
        // Command
    }

    @Subcommand("spectate")
    public void wagerBattles(Player p, @Optional Player pl){

    }

    @Subcommand("test")
    public void test(Player p){
        NMSTesting.doNMS(p);
    }


}
