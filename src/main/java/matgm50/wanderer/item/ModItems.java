package matgm50.wanderer.item;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.wanderer.lib.ItemLib;
import net.minecraft.item.Item;

/**
 * Created by MasterAbdoTGM50 on 4/23/2014.
 */

public class ModItems {

    public static Item itemScroll = new ItemScroll();
    public static Item itemStoneShears = new ItemStoneShears();

    public static void init() {

        GameRegistry.registerItem(itemScroll, ItemLib.SCROLL_NAME);
        GameRegistry.registerItem(itemStoneShears, ItemLib.SHEARS_NAME);

    }

}
