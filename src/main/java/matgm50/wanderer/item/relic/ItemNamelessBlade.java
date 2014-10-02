package matgm50.wanderer.item.relic;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.wanderer.Wanderer;
import matgm50.wanderer.lib.ItemLib;
import matgm50.wanderer.lib.ModLib;
import matgm50.wanderer.lib.ScrollLib;
import matgm50.wanderer.util.DamageSourceNameless;
import matgm50.wanderer.util.helper.RelicHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

import java.util.List;

/**
 * Created by MasterAbdoTGM50 on 9/26/2014.
 */

public class ItemNamelessBlade extends Item {

    public ItemNamelessBlade() {

        super();
        setUnlocalizedName(ItemLib.NAMELESS_BLADE_NAME);
        setCreativeTab(Wanderer.tabWanderer);
        setMaxStackSize(1);

        setFull3D();

    }

    @Override
    public boolean getShareTag() {return true;}

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {return false;}

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {}

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {

        DamageSource damageSource = new DamageSourceNameless("nameless", player);

        entity.attackEntityFrom(damageSource, 5);

        return super.onLeftClickEntity(stack, player, entity);

    }

    @Override
    public EnumRarity getRarity(ItemStack par1ItemStack) {return EnumRarity.epic;}

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {

        itemIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":namelessBlade");

    }

}
