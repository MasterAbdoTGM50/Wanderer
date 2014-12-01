package matgm50.wanderer.scroll;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;

import java.util.ArrayList;

/**
 * Created by MasterAbdoTGM50 on 5/23/2014.
 */

public class ScrollPage {

    private String text;

    public void drawPage(int startX, int startY) {

        drawText(Minecraft.getMinecraft().fontRenderer, text, startX + 14, startY + 14);

    }

    public void drawText(FontRenderer fontRenderer, String text,  int startX, int startY) {

        String[] paragraphs = text.split("<br>");
        boolean isUnicode = fontRenderer.getUnicodeFlag();
        fontRenderer.setUnicodeFlag(true);

        for(String paragraph : paragraphs) {

            ArrayList<String> lines = new ArrayList();
            String beingFormatted = "";

            String[] words = paragraph.split(" ");

            int operations = 0;

            for(String word : words) {

                if(fontRenderer.getStringWidth(beingFormatted + " " + word) >= 116) {

                    lines.add(beingFormatted);
                    beingFormatted = "";

                }

                if(beingFormatted == "") {

                    beingFormatted = word;

                } else {

                    beingFormatted = beingFormatted + " " + word;

                }


                if(operations == words.length - 1) {

                    lines.add(beingFormatted);

                }

                ++operations;

            }

            for (String line : lines) {

                fontRenderer.drawString(line, startX, startY, 0);
                startY += 10;

            }

            startY += 10;

        }

        fontRenderer.setUnicodeFlag(isUnicode);

    }

    public void setText(String text) {

        this.text = text;

    }

    public String getText() {

        return this.text;

    }

}