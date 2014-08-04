package matgm50.wanderer.scroll;

import matgm50.wanderer.lib.ScrollLib;
import matgm50.wanderer.util.helper.ScrollHelper;

/**
 * Created by MasterAbdoTGM50 on 5/25/2014.
 */

public class ScrollEntries {

    public static ScrollEntry LEGACY = new ScrollEntry(ScrollLib.LEGACY_KEY, new ScrollPage(), new ScrollPage());

    public static void init() {

        ScrollHelper.addEntry(ScrollLib.LEGACY_KEY, LEGACY);

    }

}
