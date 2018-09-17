package gretham.together.gui;

import gretham.together.TogetherMod;
import gretham.together.professions.Profession;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class ProfessionGui extends GuiScreen {

    private static final ResourceLocation MAIN_TEXTURE = new ResourceLocation(TogetherMod.MODID, "textures/gui/profession_gui.png");
    private int guiWidth = 160;
    private int guiHeight = 192 ;

    public ProfessionGui() {
        super();

        this.allowUserInput = true;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        Minecraft mc = Minecraft.getMinecraft();

        this.drawDefaultBackground();
        mc.renderEngine.bindTexture(MAIN_TEXTURE);

        this.drawTexturedModalRect(0, 0, 0, 0, this.guiWidth, this.guiHeight);

        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode) throws IOException {
        super.keyTyped(typedChar, keyCode);

        Minecraft.getMinecraft().player.closeScreen();
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
