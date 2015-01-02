package matgm50.wanderer.item;

import matgm50.wanderer.Wanderer;
import matgm50.wanderer.lib.ItemLib;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGrassSoup extends ItemFood {

    public ItemGrassSoup() {

        super(2, true);
        setUnlocalizedName(ItemLib.SOUP_NAME);
        setCreativeTab(Wanderer.tabWanderer);
        setMaxStackSize(1);

    }

    @Override
    public void onFoodEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_) {

        super.onFoodEaten(p_77654_1_, p_77654_2_, p_77654_3_);

    }

}
