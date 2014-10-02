package matgm50.wanderer.item;

import matgm50.wanderer.Wanderer;
import matgm50.wanderer.lib.ItemLib;
import matgm50.wanderer.lib.ModLib;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by MasterAbdoTGM50 on 9/24/2014.
 */

public class ItemGrassSoup extends ItemFood {

    public ItemGrassSoup() {

        super(2, true);
        setUnlocalizedName(ItemLib.SOUP_NAME);
        setCreativeTab(Wanderer.tabWanderer);
        setMaxStackSize(1);

    }

    @Override
    public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_) {

        super.onEaten(p_77654_1_, p_77654_2_, p_77654_3_);

        return new ItemStack(Items.bowl);

    }

    @Override
    public void registerIcons(IIconRegister register) {

        itemIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":grassSoup");

    }

}
