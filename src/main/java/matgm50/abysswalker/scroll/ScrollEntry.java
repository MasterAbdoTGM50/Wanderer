package matgm50.abysswalker.scroll;

import net.minecraft.util.StatCollector;

import java.util.ArrayList;

/**
 * Created by MasterAbdoTGM50 on 5/19/2014.
 */

public class ScrollEntry {

    private String key;
    private int pageCount = 0;
    private ArrayList<ScrollPage> pages = new ArrayList<ScrollPage>();

    public ScrollEntry(String key, int pagesAmount) {

        setKey(key);
        createPages(pagesAmount);

    }

    public void setKey(String key) {

        this.key = key;

    }

    public String getKey() {

        return this.key;

    }

    public void createPages(int pagesAmount) {

        for(int i = 0; i < pagesAmount; i++) {

            ScrollPage page = new ScrollPage();

            page.setText(StatCollector.translateToLocal("scroll." + key + ".text" + "." + pageCount));
            page.setSound(key, pageCount);
            pageCount++;

            this.pages.add(page);

        }

    }

    public void overridePage(int pageIndex, ScrollPage page) {

        this.pages.set(pageIndex, page);

    }

    public ArrayList getPages() {

        return this.pages;

    }

    public ScrollPage getPage(int pageIndex) {

        return this.pages.get(pageIndex);

    }

    public ScrollEntry registerEntry() {

        ScrollHandler.addEntry(getKey(), this);
        return this;

    }

}
