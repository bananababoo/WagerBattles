package me.bananababoo.wagerbattles;

import mc.obliviate.inventory.Gui;
import mc.obliviate.inventory.Icon;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class WagerMainGUI extends Gui {

    private static final Icon grayGlass = new Icon(Material.GRAY_STAINED_GLASS).setName("");
    private static final Icon redGlass = new Icon(Material.RED_STAINED_GLASS).setName("");


    public WagerMainGUI(@NotNull Player player) {
        super(player, "main", "Main menu", 6);
    }

    @Override
    public void onOpen(InventoryOpenEvent event){
        //background
        addItem(grayGlass,0,1,7,8,9,10,11,15,16,17,19,21,23,25,29,33,37,39,41,43,45,46,52,53);
        addItem(redGlass,2,3,4,5,6,12,13,14,18,22,26,27,28,30,31,32,34,35,36,38,42,44,47,48,49,50,51);
        addItem(new ItemStack(Material.BARRIER));

    }
}
