package matgm50.abysswalker.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.abysswalker.Abysswalker;
import matgm50.abysswalker.lib.BlockLib;
import matgm50.abysswalker.lib.ModLib;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by MasterAbdoTGM50 on 7/9/2014.
 */

public class BlockSigil extends Block {

    protected BlockSigil() {

        super(Material.circuits);
        setBlockName(BlockLib.SIGIL_NAME);
        setCreativeTab(Abysswalker.tabAbysswalker);
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F);

    }

    @Override
    public boolean renderAsNormalBlock() {return false;}

    @Override
    public boolean isOpaqueCube() {return false;}

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {

        blockIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "sigilactivated");

    }

}
