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
    public static Item itemNamelessHelm = new ItemNamelessHelmet();
    public static Item itemNamelessChestplate = new ItemNamelessChestplate();
    public static Item itemNamelessLeggings = new ItemNamelessLeggings();
    public static Item itemNamelessBoots = new ItemNamelessBoots();

    public static void init() {

        GameRegistry.registerItem(itemScroll, ItemLib.SCROLL_NAME);
        GameRegistry.registerItem(itemStoneShears, ItemLib.SHEARS_NAME);
        GameRegistry.registerItem(itemGrassSoup, ItemLib.SOUP_NAME);
        GameRegistry.registerItem(itemNamelessBlade, ItemLib.NAMELESS_BLADE_NAME);
        GameRegistry.registerItem(itemNamelessHelm, ItemLib.NAMELESS_HELMET_NAME);
        GameRegistry.registerItem(itemNamelessChestplate, ItemLib.NAMELESS_CHESTPLATE_NAME);
        GameRegistry.registerItem(itemNamelessLeggings, ItemLib.NAMELESS_LEGGINGSS_NAME);
        GameRegistry.registerItem(itemNamelessBoots, ItemLib.NAMELESS_BOOTS_NAME);

    }

}
