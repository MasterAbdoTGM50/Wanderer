package matgm50.wanderer.util.helper;

import matgm50.wanderer.lib.ScrollLib;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class RelicHelper {

    public static String getUpgrade(ItemStack stack) {

        if(stack.getTagCompound() != null) {

            if(stack.getTagCompound().hasKey("upgrade")) {

                return stack.getTagCompound().getString("upgrade");

            } else {

                return ScrollLib.LOST_KEY;

            }

        } else {

            return ScrollLib.LOST_KEY;

        }

    }

    public static void setUpgrade(ItemStack stack, String key) {

        if(stack.getTagCompound() == null) {

            stack.setTagCompound(new NBTTagCompound());

        }

        stack.getTagCompound().setString("upgrade", key);

    }

    public static int getCharge(ItemStack stack) {

        if(stack.getTagCompound() != null) {

            if(stack.getTagCompound().hasKey("charge")) {

                return stack.getTagCompound().getInteger("upgrade");

            } else {

                return 0;

            }

        } else {

            return 0;

        }

    }

    public static void setCharge(ItemStack stack, int charge) {

        if(stack.getTagCompound() == null) {

            stack.setTagCompound(new NBTTagCompound());

        }

        stack.getTagCompound().setInteger("upgrade", charge);

    }

}