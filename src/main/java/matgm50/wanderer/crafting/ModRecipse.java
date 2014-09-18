package matgm50.wanderer.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.wanderer.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/**
 * Created by MasterAbdoTGM50 on 9/16/2014.
 */

public class ModRecipse {

    public static void init() {

        initVanilla();

    }

    public static void  initVanilla() {

        GameRegistry.addRecipe(new ItemStack(ModItems.itemStoneShears), " X", "X ", 'X', new ItemStack(Blocks.cobblestone));

    }

}
