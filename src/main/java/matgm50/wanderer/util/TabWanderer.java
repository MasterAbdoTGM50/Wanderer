package matgm50.wanderer.util;

import matgm50.wanderer.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabWanderer extends CreativeTabs {

    public TabWanderer(String label) {

        super(label);

    }

    @Override
    public Item getTabIconItem() {

        return ModItems.itemScroll;

    }

}
