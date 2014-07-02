package matgm50.abysswalker.scroll;

import matgm50.abysswalker.scroll.page.PageText;
import matgm50.abysswalker.lib.ScrollLib;

/**
 * Created by MasterAbdoTGM50 on 5/25/2014.
 */

public class ScrollEntries {

    public static ScrollEntry LEGACY;

    public static void init() {

        initEntries();

    }

    public static void initEntries() {

        LEGACY = new ScrollEntry(ScrollLib.LEGACY_KEY, new PageText(), new PageText()).registerEntry();

    }

}
