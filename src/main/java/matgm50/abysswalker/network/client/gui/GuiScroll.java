package matgm50.abysswalker.network.client.gui;

import matgm50.abysswalker.lib.LibMod;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by MasterAbdoTGM50 on 4/26/2014.
 */

public class GuiScroll extends GuiScreen {

    private final int scrollWidth = 192;
    private final int scrollHeight = 248;
    private int startX, startY;
    private static final ResourceLocation texture = new ResourceLocation(LibMod.ID.toLowerCase(), "textures/gui/scroll.png");
    private String text;

    public GuiScroll(String text) {

        this.text = text;

    }

    @Override
    public void initGui() {

        super.initGui();

        startX = (width - scrollWidth) / 2;
        startY = (height - scrollHeight) / 2;

    }

    @Override
    public boolean doesGuiPauseGame() {return false;}

    @Override
    public void drawScreen(int par1, int par2, float par3) {

        GL11.glColor4f(1, 1, 1, 1);

        mc.getTextureManager().bindTexture(texture);
        drawTexturedModalRect(startX, startY, 0, 0, scrollWidth, scrollHeight);
        fontRendererObj.drawSplitString(text ,startX + 20, startY + 30, 154, 0);

        super.drawScreen(par1, par2, par3);

    }

}
