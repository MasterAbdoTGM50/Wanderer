package matgm50.wanderer.util;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import matgm50.wanderer.item.relic.ItemNamelessBlade;
import matgm50.wanderer.item.ItemScroll;
import matgm50.wanderer.item.ModItems;
import matgm50.wanderer.lib.ScrollLib;
import matgm50.wanderer.util.helper.RelicHelper;
import matgm50.wanderer.util.helper.ScrollHelper;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AnvilUpdateEvent;

public class ModEvents {

    public static void init() {

        //MinecraftForge.EVENT_BUS.register(new ModEvents());

    }

    @SubscribeEvent
    public void onAnvilUpdate(AnvilUpdateEvent event) {

        if(event.left.getItem() instanceof ItemNamelessBlade) {

            if(event.right.getItem() instanceof ItemScroll) {

                if(ScrollHelper.getKeyFromStack(event.right).equals(ScrollLib.LOST_KEY)) {

                    ItemStack blade = new ItemStack(ModItems.itemNamelessBlade);
                    RelicHelper.setUpgrade(blade, ScrollLib.LOST_KEY);

                    event.cost = 10;
                    event.output = blade;

                }

                if(ScrollHelper.getKeyFromStack(event.right).equals(ScrollLib.ORIGIN2_KEY)) {

                    ItemStack blade = new ItemStack(ModItems.itemNamelessBlade);
                    RelicHelper.setUpgrade(blade, ScrollLib.ORIGIN2_KEY);

                    event.cost = 10;
                    event.output = blade;

                }

            }

        }

    }

}
