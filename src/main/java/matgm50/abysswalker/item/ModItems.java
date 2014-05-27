package matgm50.abysswalker.item;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.abysswalker.lib.ItemLib;
import net.minecraft.item.Item;

/**
 * Created by MasterAbdoTGM50 on 4/23/2014.
 */

public class ModItems {

    public static Item itemScroll;

    public static void init() {

        itemScroll = new ItemScroll();

        GameRegistry.registerItem(itemScroll, ItemLib.SCROLL_NAME);

    }

}
