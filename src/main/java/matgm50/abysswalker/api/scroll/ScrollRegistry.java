package matgm50.abysswalker.api.scroll;

import java.util.HashMap;

/**
 * Created by MasterAbdoTGM50 on 5/26/2014.
 */

public class ScrollRegistry {

    public static HashMap<String, ScrollEntry> entries = new HashMap<String, ScrollEntry>();

    public static void registerScroll(String key, ScrollEntry entry) {

        addEntry(key, entry);

    }

    public static void addEntry(String key, ScrollEntry entry) {

        entries.put(key, entry);

    }

    public static ScrollEntry getEntry(String key) {

        return entries.get(key);

    }

}
