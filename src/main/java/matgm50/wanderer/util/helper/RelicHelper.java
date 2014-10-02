package matgm50.wanderer.util.helper;

import matgm50.wanderer.lib.ScrollLib;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by MasterAbdoTGM50 on 9/13/2014.
 */

public class RelicHelper {

    public static String getUpgrade(ItemStack stack) {

        if(stack.stackTagCompound != null) {

            if(stack.stackTagCompound.hasKey("upgrade")) {

                return stack.stackTagCompound.getString("upgrade");

            } else {

                return ScrollLib.LOST_KEY;

            }

        } else {

            return ScrollLib.LOST_KEY;

        }

    }

    public static void setUpgrade(ItemStack stack, String key) {

        if(stack.stackTagCompound == null) {

            stack.setTagCompound(new NBTTagCompound());

        }

        stack.stackTagCompound.setString("upgrade", key);

    }

}