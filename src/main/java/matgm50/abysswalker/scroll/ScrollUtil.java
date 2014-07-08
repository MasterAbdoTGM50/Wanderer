package matgm50.abysswalker.scroll;

import matgm50.abysswalker.api.scroll.ScrollEntry;
import matgm50.abysswalker.api.scroll.ScrollRegistry;
import matgm50.abysswalker.item.ItemScroll;
import matgm50.abysswalker.item.ModItems;
import matgm50.abysswalker.lib.ScrollLib;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by MasterAbdoTGM50 on 7/8/2014.
 */

public class ScrollUtil {

    public static void setKey(ItemStack stack, String key) {

        if(stack.stackTagCompound == null) {

            stack.setTagCompound(new NBTTagCompound());

        }

        stack.stackTagCompound.setString("key", key);

    }

    public static String getKey(ItemStack stack) {

        if(stack.stackTagCompound != null) {

            if(stack.stackTagCompound.hasKey("key")) {

                return stack.stackTagCompound.getString("key");

            } else {

                return ScrollLib.LEGACY_KEY;
            }

        } else {

            return ScrollLib.LEGACY_KEY;

        }

    }

    public static ItemStack createScroll(String key) {

        ItemStack scroll = new ItemStack(ModItems.itemScroll);

        setKey(scroll, key);

        return scroll;

    }

    public static ScrollEntry getEquippedScrollEntry(EntityPlayer player) {

        if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemScroll) {

            return ScrollRegistry.getEntry(getKey(player.getCurrentEquippedItem()));

        } else {

            return ScrollRegistry.getEntry(ScrollLib.LEGACY_KEY);

        }

    }

}
