package matgm50.abysswalker.client.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import matgm50.abysswalker.Abysswalker;
import matgm50.abysswalker.api.scroll.ScrollRegistry;
import matgm50.abysswalker.scroll.ScrollUtil;
import net.minecraft.entity.player.EntityPlayer;
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
            case 0 : return new GuiScroll(player);
        }

        return null;

    }

}
