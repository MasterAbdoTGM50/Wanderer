package matgm50.wanderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import matgm50.wanderer.client.gui.GuiHandler;
import matgm50.wanderer.crafting.ModRecipes;
import matgm50.wanderer.item.ModItems;
import matgm50.wanderer.lib.ModLib;
import matgm50.wanderer.proxy.CommonProxy;
import matgm50.wanderer.scroll.ScrollEntries;
import matgm50.wanderer.util.CommandWanderer;
import matgm50.wanderer.util.ModEvents;
import matgm50.wanderer.util.TabWanderer;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = ModLib.ID, name = ModLib.NAME, version = ModLib.VERSION)

public class Wanderer {

    @Mod.Instance(ModLib.ID)
    public static Wanderer instance;

    @SidedProxy(serverSide = ModLib.COMMONPROXY, clientSide = ModLib.CLIENTPROXY)
    public static CommonProxy proxy;

    public static CreativeTabs tabWanderer = new TabWanderer(ModLib.ID);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        GuiHandler.init();

        ModItems.init();

        ModRecipes.init();

        ModEvents.init();

        ScrollEntries.init();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.initItemModels();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event) {

        event.registerServerCommand(new CommandWanderer());

    }

}
