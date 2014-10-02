package matgm50.wanderer.scroll;

import matgm50.wanderer.lib.ScrollLib;
import matgm50.wanderer.util.helper.ScrollHelper;

/**
 * Created by MasterAbdoTGM50 on 5/25/2014.
 */

public class ScrollEntries {

    public static ScrollEntry LOST = new ScrollEntry(ScrollLib.LOST_KEY);
    public static ScrollEntry ORIGIN1 = new ScrollEntry(ScrollLib.ORIGIN1_KEY);
    public static ScrollEntry ORIGIN2 = new ScrollEntry(ScrollLib.ORIGIN2_KEY);

    public static void init() {

        ScrollHelper.addEntry(ScrollLib.LOST_KEY, LOST);
        ScrollHelper.addEntry(ScrollLib.ORIGIN1_KEY, ORIGIN1);
        ScrollHelper.addEntry(ScrollLib.ORIGIN2_KEY, ORIGIN2);

    }

}
