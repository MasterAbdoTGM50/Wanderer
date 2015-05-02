package matgm50.wanderer.scroll;

import matgm50.wanderer.lib.ScrollLib;
import matgm50.wanderer.util.helper.ScrollHelper;

public class ScrollEntries {

    public static ScrollEntry LOST = new ScrollEntry(ScrollLib.LOST_KEY);
    public static ScrollEntry ORIGIN1 = new ScrollEntry(ScrollLib.ORIGIN1_KEY);
    public static ScrollEntry ORIGIN2 = new ScrollEntry(ScrollLib.ORIGIN2_KEY);

    public static void init() {

        ScrollHelper.addEntry(LOST);
        ScrollHelper.addEntry(ORIGIN1);
        ScrollHelper.addEntry(ORIGIN2);

    }

}
