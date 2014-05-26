package matgm50.abysswalker.item;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.abysswalker.client.gui.scroll.ScrollEntry;
import matgm50.abysswalker.client.gui.scroll.page.ScrollPageText;
import matgm50.abysswalker.lib.ItemLib;
import matgm50.abysswalker.lib.ScrollLib;
import net.minecraft.item.Item;

/**
 * Created by MasterAbdoTGM50 on 5/25/2014.
 */

public class ModScrolls {

    public static ScrollEntry ABYSSWALKER;

    public static Item itemScrollAbysswalker;

    public static void init() {

        initEntries();
        initScrolls();

    }

    public static void initEntries() {

        ABYSSWALKER = new ScrollEntry(ScrollLib.ABYSSWALKER_KEY);
        ABYSSWALKER.setPages(new ScrollPageText(), new ScrollPageText());

    }

    public static void initScrolls() {

        itemScrollAbysswalker = new ItemScroll(ABYSSWALKER);

        registerScrollItem(itemScrollAbysswalker);

    }

    public static void registerScrollItem(Item item) {

        if(item instanceof ItemScroll) {

            ItemScroll scroll = (ItemScroll)item;
            String key = scroll.getEntry().getKey();

            GameRegistry.registerItem(scroll, ItemLib.SCROLL_NAME + key.substring(0, 1).toUpperCase() + key.substring(1).toLowerCase());

        }

    }


}
