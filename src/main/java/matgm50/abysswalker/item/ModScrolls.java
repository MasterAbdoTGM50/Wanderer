package matgm50.abysswalker.item;

import matgm50.abysswalker.api.scroll.ScrollEntry;
import matgm50.abysswalker.api.scroll.page.ScrollPageText;
import matgm50.abysswalker.lib.ScrollLib;
import matgm50.abysswalker.scroll.ScrollHandler;

/**
 * Created by MasterAbdoTGM50 on 5/25/2014.
 */

public class ModScrolls {

    public static ScrollEntry ABYSSWALKER;

    public static void init() {

        initEntries();

    }

    public static void initEntries() {

        ABYSSWALKER = new ScrollEntry(ScrollLib.ABYSSWALKER_KEY, new ScrollPageText(), new ScrollPageText()).registerEntry();

    }

}
