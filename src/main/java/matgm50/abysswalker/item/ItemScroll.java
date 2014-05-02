package matgm50.abysswalker.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.abysswalker.Abysswalker;
import matgm50.abysswalker.lib.LibItem;
import matgm50.abysswalker.lib.LibMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

/**
 * Created by MasterAbdoTGM50 on 4/23/2014.
 */

public class ItemScroll extends Item {

    private String text;

    public ItemScroll(String key) {

        super();
        setUnlocalizedName(LibItem.SCROLL_NAME);
        setCreativeTab(Abysswalker.tabAbysswalker);
        setMaxStackSize(1);
        setText(key);

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

        itemIcon = register.registerIcon(LibMod.ID.toLowerCase() + ":" + "scroll");

    }

    private void setText(String key) {

        text = StatCollector.translateToLocal("scroll." + key + ".text");

    }

    public String getText() {return text;}

}
