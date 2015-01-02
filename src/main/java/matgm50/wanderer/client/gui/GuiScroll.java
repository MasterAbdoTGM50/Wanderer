package matgm50.wanderer.client.gui;

import matgm50.wanderer.client.gui.button.ButtonArrow;
import matgm50.wanderer.lib.GuiLib;
import matgm50.wanderer.scroll.ScrollEntry;
import matgm50.wanderer.util.helper.ScrollHelper;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;

import org.lwjgl.opengl.GL11;

public class GuiScroll extends GuiScreen {

    private int startX, startY;
    private GuiButton buttonPrev, buttonNext;
    private ScrollEntry entry;
    private int currentlyOpenedPage = 0;

    public GuiScroll(EntityPlayer player) {

        this.entry = ScrollHelper.getEquippedScrollEntryFromPlayer(player);

    }

    @Override
    public void initGui() {

        super.initGui();

        startX = (width - GuiLib.SCROLL_TEXTURE_WIDTH) / 2;
        startY = (height - GuiLib.SCROLL_TEXTURE_HEIGHT) / 2;

        buttonList.clear();

        buttonList.add(buttonPrev = new ButtonArrow(0, startX, startY + (GuiLib.SCROLL_TEXTURE_HEIGHT - GuiLib.SCROLL_ARROW_HEIGHT / 2), false));
        buttonList.add(buttonNext = new ButtonArrow(1, startX + (GuiLib.SCROLL_TEXTURE_WIDTH - GuiLib.SCROLL_ARROW_WIDTH), startY + (GuiLib.SCROLL_TEXTURE_HEIGHT - GuiLib.SCROLL_ARROW_HEIGHT / 2), true));

        updateButtons();

    }

    public void updateButtons() {

        if(currentlyOpenedPage == 0 && entry.getPages().size() == 1) {

            buttonNext.enabled = false;
            buttonPrev.enabled = false;

        } else if(currentlyOpenedPage == 0) {

            buttonNext.enabled = true;
            buttonPrev.enabled = false;

        } else if(currentlyOpenedPage > 0 && currentlyOpenedPage < entry.getPages().size() - 1) {

            buttonNext.enabled = true;
            buttonPrev.enabled = true;

        } else if(currentlyOpenedPage == entry.getPages().size() - 1) {

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
                currentlyOpenedPage--;
                updateButtons();
                updateScreen();
                break;
            case 1:
                currentlyOpenedPage++;
                updateButtons();
                updateScreen();
                break;

        }

    }

    @Override
    public void drawScreen(int par1, int par2, float par3) {

        GL11.glColor4f(1, 1, 1, 1);

        mc.getTextureManager().bindTexture(GuiLib.SCROLL_TEXTURE);
        drawTexturedModalRect(startX, startY, 0, 0, GuiLib.SCROLL_TEXTURE_WIDTH, GuiLib.SCROLL_TEXTURE_HEIGHT);

        if((entry.getPage(currentlyOpenedPage)) != null) {

            (entry.getPage(currentlyOpenedPage)).drawPage(startX, startY);

        }

        super.drawScreen(par1, par2, par3);

    }

}