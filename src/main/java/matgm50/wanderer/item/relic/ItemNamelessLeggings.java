package matgm50.wanderer.item.relic;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.wanderer.lib.ItemLib;
import matgm50.wanderer.lib.ModLib;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

/**
 * Created by MasterAbdoTGM50 on 10/2/2014.
 */

public class ItemNamelessLeggings extends ItemNamelessArmor {

    public ItemNamelessLeggings() {

        super(2);
        setUnlocalizedName(ItemLib.NAMELESS_LEGGINGSS_NAME);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {

        itemIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "namelessLeggings");

    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {

        return "wanderer:textures/models/nameless_2.png";

    }

}
