package matgm50.wanderer.item;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.wanderer.lib.ItemLib;
import net.minecraft.item.Item;

/**
 * Created by MasterAbdoTGM50 on 4/23/2014.
 */

public class ModItems {

    public static Item itemScroll = new ItemScroll();
    public static Item itemBrush = new ItemBrush();
    public static Item itemBowblade = new ItemBowblade();

    public static void init() {

        GameRegistry.registerItem(itemScroll, ItemLib.SCROLL_NAME);
        GameRegistry.registerItem(itemBrush, ItemLib.BRUSH_NAME);
        GameRegistry.registerItem(itemBowblade, ItemLib.BOWBLADE_NAME);

    }

}
