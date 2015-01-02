package matgm50.wanderer.item.relic;

import matgm50.wanderer.lib.ItemLib;
import matgm50.wanderer.lib.ModLib;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemNamelessBoots extends ItemNamelessArmor {

    public ItemNamelessBoots() {

        super(3);
        setUnlocalizedName(ItemLib.NAMELESS_BOOTS_NAME);

    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {

        return ModLib.ID.toLowerCase() + ":textures/models/nameless_1.png";

    }

}
