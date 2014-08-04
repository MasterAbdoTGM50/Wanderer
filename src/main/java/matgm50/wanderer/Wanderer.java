package matgm50.wanderer;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import matgm50.wanderer.blocks.ModBlocks;
import matgm50.wanderer.client.gui.GuiHandler;
import matgm50.wanderer.item.ModItems;
import matgm50.wanderer.lib.ModLib;
import matgm50.wanderer.proxy.CommonProxy;
import matgm50.wanderer.scroll.ScrollEntries;
import matgm50.wanderer.util.TabWanderer;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by MasterAbdoTGM50 on 4/23/2014.
 */

@Mod(modid = ModLib.ID, name = ModLib.NAME, version = ModLib.VERSION)

public class Wanderer {

    @Instance(ModLib.ID)
    public static Wanderer instance;

    @SidedProxy(serverSide = ModLib.COMMONPROXY, clientSide = ModLib.CLIENTPROXY)
    public static CommonProxy proxy;

    public static CreativeTabs tabWanderer = new TabWanderer(ModLib.ID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        GuiHandler.init();

        ModItems.init();
        ModBlocks.init();

        ScrollEntries.init();

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
