package matgm50.wanderer.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.wanderer.Wanderer;
import matgm50.wanderer.lib.ItemLib;
import matgm50.wanderer.lib.ModLib;
import matgm50.wanderer.util.helper.ScrollHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by MasterAbdoTGM50 on 4/23/2014.
 */

public class ItemScroll extends Item {

    public ItemScroll() {

        super();
        setUnlocalizedName(ItemLib.SCROLL_NAME);
        setCreativeTab(Wanderer.tabWanderer);
        setMaxStackSize(1);

    }

    @Override
    public boolean getShareTag() {return true;}

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {

        par3List.add(StatCollector.translateToLocal("scroll." + ScrollHelper.getKeyFromStack(par1ItemStack) + ".name"));

    }

    @Override
    public EnumRarity getRarity(ItemStack par1ItemStack) {return EnumRarity.uncommon;}

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {

        if(par2World.isRemote) {

            par3EntityPlayer.openGui(Wanderer.instance, 0, par2World, 0, 0, 0);

        }

        return par1ItemStack;

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {

        itemIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":scroll");

    }

}
