package matgm50.abysswalker.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.abysswalker.Abysswalker;
import matgm50.abysswalker.client.gui.scroll.ScrollEntry;
import matgm50.abysswalker.lib.ItemLib;
import matgm50.abysswalker.lib.ModLib;
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

    private String name;
    private ScrollEntry entry;

    public ItemScroll(ScrollEntry entry) {

        super();
        setUnlocalizedName(ItemLib.SCROLL_NAME);
        setCreativeTab(Abysswalker.tabAbysswalker);
        setMaxStackSize(1);
        setEntry(entry);
        setName(entry.getKey());

    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {

        par3List.add(name);

    }

    @Override
    public EnumRarity getRarity(ItemStack par1ItemStack) {

        return EnumRarity.uncommon;

    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {

        par3EntityPlayer.openGui(Abysswalker.instance, 0, par2World, 0, 0, 0);

        return par1ItemStack;

    }

    @Override
    public boolean isFull3D() {return true;}

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {

        itemIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "scroll");

    }

    private void setEntry(ScrollEntry entry) {

        this.entry = entry;

    }

    public ScrollEntry getEntry() {return this.entry;}

    private void setName(String key) {

        name = StatCollector.translateToLocal("scroll." + key + ".name");

    }

    public String getName() {return name;}

}
