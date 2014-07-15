package matgm50.abysswalker.client.gui.button;

import matgm50.abysswalker.lib.ModLib;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by MasterAbdoTGM50 on 7/1/2014.
 */

public class ButtonSound extends GuiButton {

    public ButtonSound(int par1, int par2, int par3) {

        super(par1, par2, par3, 10, 10, "");

    }

    @Override
    public void drawButton(Minecraft par1Minecraft, int par2, int par3) {

        if(enabled) {

            boolean isHovering = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
            int yIncrease = 0;

            if(getHoverState(isHovering) == 2) {

                yIncrease = 10;

            }

            par1Minecraft.renderEngine.bindTexture(new ResourceLocation(ModLib.ID.toLowerCase(), "textures/gui/scroll.png"));

            GL11.glColor4f(1F, 1F, 1F, 1F);
            drawTexturedModalRect(xPosition, yPosition, 36, 168 + yIncrease, 10, 10);

        }

    }

    @Override
    public void func_146113_a(SoundHandler p_146113_1_) {}

}
