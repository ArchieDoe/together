package gretham.together.events;

import gretham.together.capabilities.IProfessionCapability;
import gretham.together.capabilities.ProfessionProvider;
import gretham.together.professions.IProfession;
import gretham.together.professions.Miner;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

import java.util.List;

public class PlayerEvents {

    @SubscribeEvent
    public void onPlayerLogsIn(PlayerEvent.PlayerLoggedInEvent event)
    {
        EntityPlayer player = event.player;
        IProfessionCapability professionCapability = player.getCapability(ProfessionProvider.CAPABILITY_PROFESSION, null);

        professionCapability.addProfession(new Miner());

        List<IProfession> playerProfessions = professionCapability.getProfessions();

        for (IProfession profession : playerProfessions) {
            player.sendMessage(new TextComponentString(String.format("You got profession: %s", profession.getName())));
        }
    }
}
