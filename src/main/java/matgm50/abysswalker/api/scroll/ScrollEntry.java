package matgm50.abysswalker.api.scroll;

import matgm50.abysswalker.api.scroll.page.ScrollPage;
import matgm50.abysswalker.api.scroll.page.ScrollPageText;
import matgm50.abysswalker.scroll.ScrollHandler;
import net.minecraft.util.StatCollector;

import java.util.ArrayList;

/**
 * Created by MasterAbdoTGM50 on 5/19/2014.
 */

public class ScrollEntry {

    private String key;
    private int textPageCount = 0;
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

            if(pages[i] instanceof ScrollPageText) {

                ((ScrollPageText)pages[i]).setText(StatCollector.translateToLocal("scroll." + key + ".text" + "." + textPageCount));
                textPageCount++;

            }

            this.pages.add(pages[i]);

        }

    }

    public ArrayList getPages() {

        return this.pages;

    }

    public ScrollEntry registerEntry() {

        ScrollHandler.addEntry(getKey(), this);
        return this;

    }

}
