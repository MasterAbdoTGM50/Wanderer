package matgm50.wanderer.item;

import net.minecraftforge.fml.common.registry.GameRegistry;
import matgm50.wanderer.item.relic.*;
import matgm50.wanderer.lib.ItemLib;
import net.minecraft.item.Item;

public class ModItems {

    public static Item itemScroll = new ItemScroll();
    public static Item itemStoneShears = new ItemStoneShears();
    public static Item itemGrassSoup = new ItemGrassSoup();
    public static Item itemNamelessBlade = new ItemNamelessBlade();
    public static Item itemNamelessChestplate = new ItemNamelessChestplate();
    public static Item itemThriftyTear = new ItemThriftyTear();

    public static void init() {

        GameRegistry.registerItem(itemScroll, ItemLib.SCROLL_NAME);
        GameRegistry.registerItem(itemStoneShears, ItemLib.SHEARS_NAME);
        GameRegistry.registerItem(itemGrassSoup, ItemLib.SOUP_NAME);
        GameRegistry.registerItem(itemNamelessBlade, ItemLib.NAMELESS_BLADE_NAME);
        GameRegistry.registerItem(itemNamelessChestplate, ItemLib.NAMELESS_CHESTPLATE_NAME);
        GameRegistry.registerItem(itemThriftyTear, ItemLib.THRIFTY_TEAR_NAME);

    }

}
