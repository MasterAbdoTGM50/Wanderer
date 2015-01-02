package matgm50.wanderer.proxy;

import matgm50.wanderer.item.ModItems;
import matgm50.wanderer.lib.ModLib;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;

public class ClientProxy extends CommonProxy {

    @Override
    public void initItemModels() {

        RenderItem renderItem = FMLClientHandler.instance().getClient().getRenderItem();
        ItemModelMesher itemModelMesher = renderItem.getItemModelMesher();

        itemModelMesher.register(ModItems.itemScroll, 0, new ModelResourceLocation(ModLib.ID.toLowerCase() + ":scroll", "inventory"));

    }

}
