package me.bananababoo.wagerbattles;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.game.ClientboundContainerSetSlotPacket;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_20_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class NMSTesting {

    public static void doNMS(Player p){
        Inventory inv = Bukkit.createInventory(p, InventoryType.CHEST);
        p.openInventory(inv);
        ServerPlayer ep= ((CraftPlayer)p).getHandle();
        Bukkit.getLogger().info("ep.containerMenu.containerId: " + ep.containerMenu.containerId);
        CompoundTag ct = new CompoundTag() {{
            putString("id", "");
            putInt("count", 2);
        }};
        new ClientboundContainerSetSlotPacket(ep.containerMenu.containerId
                , 0,0,
                ItemStack.of(ct)
        );
    }
}
