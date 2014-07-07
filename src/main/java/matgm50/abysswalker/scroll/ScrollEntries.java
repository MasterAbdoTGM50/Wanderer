package matgm50.abysswalker.scroll;

import matgm50.abysswalker.lib.ScrollLib;

/**
 * Created by MasterAbdoTGM50 on 5/25/2014.
 */

public class ScrollEntries {

    public static ScrollEntry LEGACY;

    public static void init() {

        LEGACY = new ScrollEntry(ScrollLib.LEGACY_KEY, 2).registerEntry();

    }

}
