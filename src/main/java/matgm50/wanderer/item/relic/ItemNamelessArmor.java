package matgm50.wanderer.item.relic;

import matgm50.wanderer.Wanderer;
import matgm50.wanderer.lib.ModLib;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ItemNamelessArmor extends ItemArmor implements ISpecialArmor {

    public static ArmorMaterial materialNameless = EnumHelper.addArmorMaterial("NAMELESS", ModLib.ID.toLowerCase() + ":textures/models/armor/nameless", 0, new int[]{2, 6, 5, 2}, 0);

    public ItemNamelessArmor(int type) {

        super(materialNameless, 3, type);
        setCreativeTab(Wanderer.tabWanderer);
        setMaxStackSize(1);

    }

    @Override
    public boolean getShareTag() {return true;}

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {return false;}

    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot) {

        return new ArmorProperties(0, getArmorMaterial().getDamageReductionAmount(slot) / 25D, 20);

    }

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {return getArmorMaterial().getDamageReductionAmount(slot);}

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {}

}
