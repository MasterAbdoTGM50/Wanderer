package matgm50.abysswalker;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import matgm50.abysswalker.item.ModItems;
import matgm50.abysswalker.scroll.ScrollEntries;
import matgm50.abysswalker.lib.ModLib;
import matgm50.abysswalker.client.gui.GuiHandler;
import matgm50.abysswalker.proxy.CommonProxy;
import matgm50.abysswalker.scroll.ScrollHandler;
import matgm50.abysswalker.util.TabAbysswalker;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by MasterAbdoTGM50 on 4/23/2014.
 */

@Mod(modid = ModLib.ID, name = ModLib.NAME, version = ModLib.VERSION)

public class Abysswalker {

    @Instance(ModLib.ID)
    public static Abysswalker instance;

    @SidedProxy(serverSide = ModLib.COMMONPROXY, clientSide = ModLib.CLIENTPROXY)
    public static CommonProxy proxy;

    public static CreativeTabs tabAbysswalker = new TabAbysswalker(ModLib.ID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        ScrollHandler.init();
        GuiHandler.init();

        ModItems.init();

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        ScrollEntries.init();

    }

}
