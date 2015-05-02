package matgm50.wanderer.proxy;

import matgm50.wanderer.item.ModItems;
import matgm50.wanderer.lib.ModLib;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;

public class ClientProxy extends CommonProxy {

    @Override
    public void initItemModels() {

        ItemModelMesher itemModelMesher = FMLClientHandler.instance().getClient().getRenderItem().getItemModelMesher();

        itemModelMesher.register(ModItems.itemScroll, 0, new ModelResourceLocation(ModLib.ID.toLowerCase() + ":itemScroll", "inventory"));
        itemModelMesher.register(ModItems.itemStoneShears, 0, new ModelResourceLocation(ModLib.ID.toLowerCase() + ":itemStoneShears", "inventory"));
        itemModelMesher.register(ModItems.itemGrassSoup, 0, new ModelResourceLocation(ModLib.ID.toLowerCase() + ":itemGrassSoup", "inventory"));
        itemModelMesher.register(ModItems.itemNamelessBlade, 0, new ModelResourceLocation(ModLib.ID.toLowerCase() + ":itemNamelessBlade", "inventory"));
        itemModelMesher.register(ModItems.itemNamelessChestplate, 0, new ModelResourceLocation(ModLib.ID.toLowerCase() + ":itemNamelessChestplate", "inventory"));
        itemModelMesher.register(ModItems.itemThriftyTear, 0, new ModelResourceLocation(ModLib.ID.toLowerCase() + ":itemThriftyTear", "inventory"));

    }

}
