package matgm50.wanderer.item;

import matgm50.wanderer.Wanderer;
import matgm50.wanderer.lib.ItemLib;
import net.minecraft.item.ItemShears;

public class ItemStoneShears extends ItemShears {

    public ItemStoneShears() {

        super();
        setUnlocalizedName(ItemLib.SHEARS_NAME);
        setCreativeTab(Wanderer.tabWanderer);
        setMaxDamage(97);

    }

}
