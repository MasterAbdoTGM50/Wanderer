package matgm50.abysswalker.scroll;

import matgm50.abysswalker.api.scroll.ScrollEntry;
import matgm50.abysswalker.lib.ScrollLib;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.HashMap;

/**
 * Created by MasterAbdoTGM50 on 5/26/2014.
 */

public class ScrollHandler {

    public static HashMap<String, ScrollEntry> entries;

    public static void init() {

        entries = new HashMap<String, ScrollEntry>();

    }

    public static void addEntry(String key, ScrollEntry entry) {

        entries.put(key, entry);

    }

    public static ScrollEntry getEntry(String key) {

        return entries.get(key);

    }

    public static ItemStack createScroll(ItemStack stack, String key) {

        if(stack.stackTagCompound == null) {

            stack.setTagCompound(new NBTTagCompound());

        }

        stack.stackTagCompound.setString("key", key);

        return stack;

    }

    public static String getKey(ItemStack stack) {

        if(stack.stackTagCompound != null) {

            if(stack.stackTagCompound.hasKey("key")) {

                return stack.stackTagCompound.getString("key");

            } else {

                return null;
            }

        } else {

            return null;

        }

    }

}
