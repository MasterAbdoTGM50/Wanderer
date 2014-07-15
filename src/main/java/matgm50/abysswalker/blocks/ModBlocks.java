package matgm50.abysswalker.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.abysswalker.lib.BlockLib;
import net.minecraft.block.Block;

/**
 * Created by MasterAbdoTGM50 on 7/9/2014.
 */

public class ModBlocks {

    public static Block blockSigil = new BlockSigil();

    public static void init() {

        GameRegistry.registerBlock(blockSigil, BlockLib.SIGIL_NAME);

    }

}
