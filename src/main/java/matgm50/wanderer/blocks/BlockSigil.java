package matgm50.wanderer.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.wanderer.Wanderer;
import matgm50.wanderer.lib.BlockLib;
import matgm50.wanderer.lib.ModLib;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;

/**
 * Created by MasterAbdoTGM50 on 7/9/2014.
 */

public class BlockSigil extends Block {

    private IIcon sigilDeactivated, sigilActivated;

    protected BlockSigil() {

        super(Material.circuits);
        setBlockName(BlockLib.SIGIL_NAME);
        setCreativeTab(Wanderer.tabWanderer);
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F);

    }

    @Override
    public boolean renderAsNormalBlock() {return false;}

    @Override
    public boolean isOpaqueCube() {return false;}

    @Override
    public IIcon getIcon(int side, int meta) {

        if(meta == 0) {

            return sigilDeactivated;

        } else if(meta == 1) {

            return sigilActivated;

        } else {

            return sigilDeactivated;

        }

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {

        sigilDeactivated = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "sigildeactivated");
        sigilActivated = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "sigilactivated");

    }

}
