package matgm50.wanderer.scroll;

import net.minecraft.util.StatCollector;

import java.util.ArrayList;

/**
 * Created by MasterAbdoTGM50 on 5/19/2014.
 */

public class ScrollEntry {

    private String key;
    private ArrayList<ScrollPage> pages = new ArrayList<ScrollPage>();

    public ScrollEntry(String key, ScrollPage... pages) {

        setKey(key);
        setPages(pages);

    }

    public void setKey(String key) {

        this.key = key;

    }

    public String getKey() {

        return this.key;

    }

    public void setPages(ScrollPage... pages) {

        for(int i = 0; i < pages.length; i++) {

            (pages[i]).setText(StatCollector.translateToLocal("scroll." + key + ".text." + i));

            this.pages.add(pages[i]);

        }

    }

    public ArrayList getPages() {

        return this.pages;

    }

    public ScrollPage getPage(int pageIndex) {

        return this.pages.get(pageIndex);

    }

}
