package gretham.together.events;

import gretham.together.TogetherMod;
import gretham.together.capabilities.IProfessionCapability;
import gretham.together.capabilities.ProfessionCapabilityProvider;
import gretham.together.control.KeyBindings;
import gretham.together.gui.ProfessionGui;
import gretham.together.professions.IProfession;
import gretham.together.professions.Miner;
import gretham.together.professions.Smith;
import gretham.together.proxies.ClientProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

@Mod.EventBusSubscriber(
    modid = TogetherMod.MODID
)
public class PlayerEventsHandler {

    @SubscribeEvent
    public static void onPlayerLogsIn(PlayerEvent.PlayerLoggedInEvent event) {
        EntityPlayer player = event.player;
        IProfessionCapability professionCapability = player.getCapability(ProfessionCapabilityProvider.CAPABILITY_PROFESSION, null);

        if (professionCapability == null) {
            return;
        }

        List<IProfession> playerProfessions = professionCapability.getProfessions();

        for (IProfession profession : playerProfessions) {
            player.sendMessage(new TextComponentString(String.format("You got profession: %s", profession.getName())));
        }
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority= EventPriority.NORMAL, receiveCanceled=true)
    public static void onKeyPressed(InputEvent.KeyInputEvent event)
    {
        Minecraft mc = Minecraft.getMinecraft();

        KeyBinding[] keyBindings = KeyBindings.keyBindings;

        if (keyBindings[0].isPressed()) {
            Minecraft.getMinecraft().displayGuiScreen(new ProfessionGui());
        }
    }
}
