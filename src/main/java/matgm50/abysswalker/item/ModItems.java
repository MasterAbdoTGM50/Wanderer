package matgm50.abysswalker.item;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.abysswalker.client.gui.scroll.ScrollEntry;
import matgm50.abysswalker.client.gui.scroll.page.ScrollPageText;
import matgm50.abysswalker.lib.ItemLib;
import matgm50.abysswalker.lib.ScrollLib;
import net.minecraft.item.Item;

/**
 * Created by MasterAbdoTGM50 on 4/23/2014.
 */

public class ModItems {

    public static Item itemScroll;
    public static ScrollEntry TESTENTRY;

    public static void init() {

        TESTENTRY = new ScrollEntry(ScrollLib.ABYSSWALKER_KEY);
        TESTENTRY.addPages(new ScrollPageText(), new ScrollPageText());

        itemScroll = new ItemScroll(TESTENTRY);

        GameRegistry.registerItem(itemScroll, ItemLib.SCROLL_NAME);

    }

}
