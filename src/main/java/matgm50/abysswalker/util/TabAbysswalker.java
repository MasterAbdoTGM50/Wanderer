package matgm50.abysswalker.util;

import matgm50.abysswalker.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by MasterAbdoTGM50 on 4/23/2014.
 */

public class TabAbysswalker extends CreativeTabs {

    public TabAbysswalker(String label) {

        super(label);

    }

    @Override
    public Item getTabIconItem() {

        return ModItems.itemScroll;

    }
}
