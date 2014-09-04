package matgm50.wanderer.scroll;

import matgm50.wanderer.lib.ScrollLib;
import matgm50.wanderer.util.helper.ScrollHelper;

/**
 * Created by MasterAbdoTGM50 on 5/25/2014.
 */

public class ScrollEntries {

    public static ScrollEntry LOST = new ScrollEntry(ScrollLib.LOST_KEY, new ScrollPage());

    public static void init() {

        ScrollHelper.addEntry(ScrollLib.LOST_KEY, LOST);

    }

}
