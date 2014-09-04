package matgm50.wanderer.util.helper;

import matgm50.wanderer.item.ItemScroll;
import matgm50.wanderer.item.ModItems;
import matgm50.wanderer.lib.ScrollLib;
import matgm50.wanderer.scroll.ScrollEntry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.HashMap;

/**
 * Created by MasterAbdoTGM50 on 7/15/2014.
 */

public class ScrollHelper {

    public static HashMap<String, ScrollEntry> entries = new HashMap<String, ScrollEntry>();

    public static void addEntry(String key, ScrollEntry entry) {

        entries.put(key, entry);

    }

    public static ScrollEntry getEntry(String key) {

        return entries.get(key);

    }

    public static void setKeyOnStack(ItemStack stack, String key) {

        if(stack.stackTagCompound == null) {

            stack.setTagCompound(new NBTTagCompound());

        }

        stack.stackTagCompound.setString("key", key);

    }

    public static String getKeyFromStack(ItemStack stack) {

        if(stack.stackTagCompound != null) {

            if(stack.stackTagCompound.hasKey("key")) {

                return stack.stackTagCompound.getString("key");

            } else {

                return ScrollLib.LOST_KEY;
            }

        } else {

            return ScrollLib.LOST_KEY;

        }

    }

    public static ItemStack createScroll(String key) {

        ItemStack scroll = new ItemStack(ModItems.itemScroll);

        setKeyOnStack(scroll, key);

        return scroll;

    }

    public static ScrollEntry getEquippedScrollEntryFromPlayer(EntityPlayer player) {

        if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemScroll) {

            return getEntry(getKeyFromStack(player.getCurrentEquippedItem()));

        } else {

            return getEntry(ScrollLib.LOST_KEY);

        }

    }

}