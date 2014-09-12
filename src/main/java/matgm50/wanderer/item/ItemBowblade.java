package matgm50.wanderer.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.wanderer.Wanderer;
import matgm50.wanderer.lib.ItemLib;
import matgm50.wanderer.lib.ModLib;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * Created by MasterAbdoTGM50 on 9/12/2014.
 */

public class ItemBowblade extends Item {

    public ItemBowblade() {

        super();
        setUnlocalizedName(ItemLib.BOWBLADE_NAME);
        setCreativeTab(Wanderer.tabWanderer);
        setMaxStackSize(1);

        setFull3D();

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {

        itemIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "bowblade");

    }

}
