package matgm50.abysswalker.scroll;

import matgm50.abysswalker.api.scroll.ScrollEntry;
import matgm50.abysswalker.api.scroll.ScrollRegistry;
import matgm50.abysswalker.api.scroll.page.ScrollPageText;
import matgm50.abysswalker.lib.ScrollLib;

/**
 * Created by MasterAbdoTGM50 on 5/25/2014.
 */

public class ScrollEntries {

    public static ScrollEntry LEGACY = new ScrollEntry(ScrollLib.LEGACY_KEY, new ScrollPageText(), new ScrollPageText());

    public static void init() {

        ScrollRegistry.registerScroll(ScrollLib.LEGACY_KEY, LEGACY);

    }

}
