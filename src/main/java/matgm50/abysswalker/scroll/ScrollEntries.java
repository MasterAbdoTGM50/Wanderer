package matgm50.abysswalker.scroll;

import matgm50.abysswalker.lib.ScrollLib;
import matgm50.abysswalker.util.hooker.ScrollHooker;

/**
 * Created by MasterAbdoTGM50 on 5/25/2014.
 */

public class ScrollEntries {

    public static ScrollEntry LEGACY = new ScrollEntry(ScrollLib.LEGACY_KEY, new ScrollPage(), new ScrollPage());

    public static void init() {

        ScrollHooker.addEntry(ScrollLib.LEGACY_KEY, LEGACY);

    }

}
