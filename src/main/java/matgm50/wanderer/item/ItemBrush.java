package matgm50.wanderer.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.wanderer.Wanderer;
import matgm50.wanderer.lib.ItemLib;
import matgm50.wanderer.lib.ModLib;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * Created by MasterAbdoTGM50 on 7/26/2014.
 */

public class ItemBrush extends Item{

    public ItemBrush() {

        super();
        setUnlocalizedName(ItemLib.BRUSH_NAME);
        setCreativeTab(Wanderer.tabWanderer);
        setMaxStackSize(1);

        setFull3D();

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {

        itemIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "brush");

    }

}
