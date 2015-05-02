package matgm50.wanderer.item.relic;

import matgm50.wanderer.Wanderer;
import matgm50.wanderer.lib.ItemLib;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemThriftyTear extends Item {

    public ItemThriftyTear() {

        super();
        setUnlocalizedName(ItemLib.THRIFTY_TEAR_NAME);
        setCreativeTab(Wanderer.tabWanderer);
        setMaxStackSize(1);

    }

    @Override
    public boolean getShareTag() {return true;}

    @Override
    public EnumRarity getRarity(ItemStack stack) {return EnumRarity.EPIC;}

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {

        if(stack.getTagCompound() == null) {stack.setTagCompound(new NBTTagCompound());}

        int currentSlot = getSlotContainingItem(player, stack);

        if(player.isSneaking()) {

            int[] coord = {(int)player.posX, (int)player.posY, (int)player.posZ};

            stack.getTagCompound().setIntArray("COORD" + currentSlot, coord);

        } else {

            if(stack.getTagCompound().hasKey("COORD" + currentSlot)) {

                int[] coord = stack.getTagCompound().getIntArray("COORD" + currentSlot);

                player.setPosition(coord[0], coord[1], coord[2]);

            }

        }

        return super.onItemRightClick(stack, world, player);

    }

    public int getSlotContainingItem(EntityPlayer player, ItemStack stack) {

        for(int i = 0; i < 10; i++) {

            if (player.inventory.getStackInSlot(i) == stack) {

                return i;

            }

        }

        return 0;

    }

}
