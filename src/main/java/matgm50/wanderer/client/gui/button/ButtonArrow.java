package matgm50.wanderer.client.gui.button;

import matgm50.wanderer.lib.GuiLib;
import matgm50.wanderer.lib.ModLib;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class ButtonArrow extends GuiButton {

    private boolean isNext;

    public ButtonArrow(int par1, int par2, int par3, boolean par4) {

        super(par1, par2, par3, GuiLib.SCROLL_ARROW_WIDTH, GuiLib.SCROLL_ARROW_HEIGHT, "");
        isNext = par4;

    }

    @Override
    public void drawButton(Minecraft par1Minecraft, int par2, int par3) {

        if(enabled) {

            boolean isHovering = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
            int xIncrease = 0;
            int yIncrease = 0;

            if(isNext) {

                xIncrease = GuiLib.SCROLL_ARROW_WIDTH;

            }

            if(getHoverState(isHovering) == 2) {

                yIncrease = GuiLib.SCROLL_ARROW_HEIGHT;

            }

            par1Minecraft.renderEngine.bindTexture(GuiLib.SCROLL_TEXTURE);

            GL11.glColor4f(1F, 1F, 1F, 1F);
            drawTexturedModalRect(xPosition, yPosition, xIncrease, GuiLib.SCROLL_TEXTURE_HEIGHT + yIncrease, GuiLib.SCROLL_ARROW_WIDTH, GuiLib.SCROLL_ARROW_HEIGHT);

        }

    }


}
