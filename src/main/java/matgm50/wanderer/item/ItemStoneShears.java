package matgm50.wanderer.item;

import matgm50.wanderer.Wanderer;
import matgm50.wanderer.lib.ItemLib;
import matgm50.wanderer.lib.ModLib;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemShears;

/**
 * Created by MasterAbdoTGM50 on 9/16/2014.
 */

public class ItemStoneShears extends ItemShears {

    public ItemStoneShears() {

        super();
        setUnlocalizedName(ItemLib.SHEARS_NAME);
        setCreativeTab(Wanderer.tabWanderer);
        setMaxDamage(97);

    }

    @Override
    public void registerIcons(IIconRegister register) {

        itemIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":shears");

    }
}
