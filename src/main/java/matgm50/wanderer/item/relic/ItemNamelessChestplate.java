package matgm50.wanderer.item.relic;

import matgm50.wanderer.Wanderer;
import matgm50.wanderer.lib.ItemLib;
import matgm50.wanderer.lib.ModLib;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ItemNamelessChestplate extends ItemArmor implements ISpecialArmor {

    public static ArmorMaterial materialNameless = EnumHelper.addArmorMaterial("NAMELESS", ModLib.ID.toLowerCase() + ":textures/models/nameless", 0, new int[]{0, 0, 0, 0}, 0);

    public ItemNamelessChestplate() {

        super(materialNameless, 3, 1);
        setUnlocalizedName(ItemLib.NAMELESS_CHESTPLATE_NAME);
        setCreativeTab(Wanderer.tabWanderer);
        setMaxStackSize(1);

    }

    @Override
    public boolean getShareTag() {return true;}

    @Override
    public EnumRarity getRarity(ItemStack par1ItemStack) {return EnumRarity.EPIC;}

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {return false;}

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {return ModLib.ID.toLowerCase() + ":textures/models/nameless.png";}

    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot) {return new ArmorProperties(0, 0, 0);}

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {return getArmorMaterial().getDamageReductionAmount(slot);}

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {}

}
