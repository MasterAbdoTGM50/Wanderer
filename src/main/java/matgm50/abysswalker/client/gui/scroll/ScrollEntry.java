package matgm50.abysswalker.client.gui.scroll;

import matgm50.abysswalker.client.gui.scroll.page.ScrollPage;
import matgm50.abysswalker.client.gui.scroll.page.ScrollPageText;
import net.minecraft.util.StatCollector;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by MasterAbdoTGM50 on 5/19/2014.
 */

public class ScrollEntry {

    private String key, title;
    private int textPageCount = 0;
    private ArrayList<ScrollPage> pages = new ArrayList<ScrollPage>();

    public ScrollEntry(String key) {

        setKey(key);

    }

    public void addPages(ScrollPage... pages) {

        for(int i = 0; i < pages.length; i++) {

            if(pages[i] instanceof ScrollPageText) {

                ((ScrollPageText)pages[i]).setText(StatCollector.translateToLocal("scroll." + key + ".text" + "." + textPageCount));
                textPageCount++;

            }

            this.pages.add(pages[i]);

        }

    }

    public void setKey(String key) {

        this.key = key;

    }

    public String getKey() {

        return this.key;

    }

    public ArrayList getPages() {

        return this.pages;

    }

}
