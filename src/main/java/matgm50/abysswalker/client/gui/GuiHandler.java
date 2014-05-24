package matgm50.abysswalker.client.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import matgm50.abysswalker.Abysswalker;
import matgm50.abysswalker.client.gui.scroll.ScrollEntry;
import matgm50.abysswalker.item.ItemScroll;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

/**
 * Created by MasterAbdoTGM50 on 4/28/2014.
 */

public class GuiHandler implements IGuiHandler {

    public static void init() {

        NetworkRegistry.INSTANCE.registerGuiHandler(Abysswalker.instance, new GuiHandler());

    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        return null;

    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        switch(ID) {
            case 0 : return new GuiScroll(getCurrentScrollEntry(player));
        }

        return null;

    }

    private ScrollEntry getCurrentScrollEntry(EntityPlayer player) {

        Item currentItem = player.getCurrentEquippedItem().getItem();
        if (currentItem != null) {

            if(currentItem instanceof ItemScroll) {

                return ((ItemScroll)currentItem).getEntry();

            } else {return null;}

        } else {return null;}

    }

}
