package matgm50.abysswalker.client.gui;

import matgm50.abysswalker.client.gui.button.ButtonNext;
import matgm50.abysswalker.scroll.ScrollEntry;
import matgm50.abysswalker.scroll.ScrollPage;
import matgm50.abysswalker.lib.ModLib;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;

/**
 * Created by MasterAbdoTGM50 on 4/26/2014.
 */

public class GuiScroll extends GuiScreen {

    private final int guiWidth = 132;
    private final int guiHeight = 168;
    private int startX, startY;
    private static final ResourceLocation texture = new ResourceLocation(ModLib.ID.toLowerCase(), "textures/gui/scroll.png");
    private GuiButton buttonPrev, buttonNext;
    private ArrayList<ScrollPage> pages = new ArrayList<ScrollPage>();
    private int currentlyOpenedPage = 0;

    public GuiScroll(ScrollEntry entry) {

        this.pages = entry.getPages();

    }

    @Override
    public void initGui() {

        super.initGui();

        startX = (width - guiWidth) / 2;
        startY = (height - guiHeight) / 2;

        playSound();

        buttonList.clear();

        buttonList.add(buttonPrev = new ButtonNext(0, startX - 9, startY + (guiHeight - 5), false));
        buttonList.add(buttonNext = new ButtonNext(1, startX + (guiWidth - 9), startY + (guiHeight - 5), true));

        updateButtons();

    }

    public void updateButtons() {

        if(currentlyOpenedPage == 0) {

            buttonNext.enabled = true;
            buttonPrev.enabled = false;

        } else if(currentlyOpenedPage > 0 && currentlyOpenedPage < pages.size() - 1) {

            buttonNext.enabled = true;
            buttonPrev.enabled = true;

        } else if(currentlyOpenedPage == pages.size() - 1) {

            buttonNext.enabled = false;
            buttonPrev.enabled = true;

        } else {

            buttonNext.enabled = false;
            buttonPrev.enabled = false;

        }

    }

    @Override
    public boolean doesGuiPauseGame() {return false;}

    @Override
    protected void actionPerformed(GuiButton par1GuiButton) {

        switch(par1GuiButton.id) {

            case 0:
                stopSound();
                currentlyOpenedPage--;
                playSound();
                updateButtons();
                updateScreen();
                break;
            case 1:
                stopSound();
                currentlyOpenedPage++;
                playSound();
                updateButtons();
                updateScreen();
                break;

        }

    }

    public void playSound() {

        Minecraft.getMinecraft().getSoundHandler().playSound((pages.get(currentlyOpenedPage).getSound()));

    }

    public void stopSound() {

        Minecraft.getMinecraft().getSoundHandler().stopSound((pages.get(currentlyOpenedPage).getSound()));

    }

    @Override
    public void drawScreen(int par1, int par2, float par3) {

        GL11.glColor4f(1, 1, 1, 1);

        mc.getTextureManager().bindTexture(texture);
        drawTexturedModalRect(startX, startY, 0, 0, guiWidth, guiHeight);

        if((pages.get(currentlyOpenedPage)) != null) {

            (pages.get(currentlyOpenedPage)).drawScreen(fontRendererObj, startX, startY);

        }

        super.drawScreen(par1, par2, par3);

    }

}