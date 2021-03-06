package matgm50.wanderer.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import matgm50.wanderer.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModRecipes {

    public static void init() {

        initVanilla();
        initOreDic();

    }

    public static void initVanilla() {

        GameRegistry.addRecipe(new ItemStack(ModItems.itemStoneShears), " X", "X ", 'X', new ItemStack(Blocks.cobblestone));

    }

    public static void initOreDic() {

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.itemGrassSoup), Items.bowl, "treeLeaves"));

    }

}
