package matgm50.abysswalker.client.gui.scroll.button;

import matgm50.abysswalker.lib.ModLib;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by MasterAbdoTGM50 on 5/23/2014.
 */

public class ButtonPrev extends GuiButton {

    public ButtonPrev(int par1, int par2, int par3) {

        super(par1, par2, par3, 18, 10, "");

    }

    @Override
    public void drawButton(Minecraft par1Minecraft, int par2, int par3) {

        if(enabled) {

            boolean flag = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
            int xIncrease = 0;

            if(getHoverState(flag) == 2) {

                xIncrease = 10;

            }

            par1Minecraft.renderEngine.bindTexture(new ResourceLocation(ModLib.ID.toLowerCase(), "textures/gui/scroll.png"));

            GL11.glColor4f(1F, 1F, 1F, 1F);
            drawTexturedModalRect(xPosition, yPosition, 0, 168 + xIncrease, 18, 10);

        }

    }


}
