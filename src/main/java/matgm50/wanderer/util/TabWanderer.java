package matgm50.wanderer.util;

import matgm50.wanderer.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by MasterAbdoTGM50 on 4/23/2014.
 */

public class TabWanderer extends CreativeTabs {

    public TabWanderer(String label) {

        super(label);

    }

    @Override
    public Item getTabIconItem() {

        return ModItems.itemScroll;

    }

}
