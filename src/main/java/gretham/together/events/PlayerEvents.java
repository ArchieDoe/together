package gretham.together.events;

import gretham.together.TogetherMod;
import gretham.together.capabilities.IProfessionCapability;
import gretham.together.capabilities.ProfessionCapabilityProvider;
import gretham.together.professions.IProfession;
import gretham.together.professions.Miner;
import gretham.together.professions.Smith;
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
public class PlayerEvents {

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
    public static void onEvent(InputEvent.KeyInputEvent event)
    {
    }
}
