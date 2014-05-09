package matgm50.abysswalker;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import matgm50.abysswalker.item.ModItems;
import matgm50.abysswalker.lib.LibMod;
import matgm50.abysswalker.network.client.gui.GuiHandler;
import matgm50.abysswalker.network.proxy.CommonProxy;
import matgm50.abysswalker.util.TabAbysswalker;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by MasterAbdoTGM50 on 4/23/2014.
 */

@Mod(modid = LibMod.ID, name = LibMod.NAME, version = LibMod.VERSION)

public class Abysswalker {

    @Instance(LibMod.ID)
    public static Abysswalker instance;

    @SidedProxy(serverSide = LibMod.COMMONPROXY, clientSide = LibMod.CLIENTPROXY)
    public static CommonProxy proxy;

    public static GuiHandler guiHandler = new GuiHandler();

    public static CreativeTabs tabAbysswalker = new TabAbysswalker(LibMod.ID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        guiHandler.init();

        ModItems.init();

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
