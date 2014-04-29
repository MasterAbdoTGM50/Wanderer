package matgm50.abysswalker.network.client.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import matgm50.abysswalker.Abysswalker;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by MasterAbdoTGM50 on 4/28/2014.
 */

public class GuiHandler implements IGuiHandler {

    public void init() {

        NetworkRegistry.INSTANCE.registerGuiHandler(Abysswalker.instance, this);

    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        return null;

    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        switch(ID) {
            case 0 : return new GuiScroll();
        }

        return null;

    }
}
