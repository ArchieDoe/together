package gretham.together.events;

import gretham.together.TogetherMod;
import gretham.together.capabilities.ProfessionCapabilityProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(
    modid = TogetherMod.MODID
)
public class CapabilityEvents {

    public static final ResourceLocation PROFESSION_CAP = new ResourceLocation(TogetherMod.MODID, "profession");

    @SubscribeEvent
    public static void registerCapability(AttachCapabilitiesEvent<Entity> event) {
        Entity obj = event.getObject();
        if (obj instanceof EntityPlayer && !(obj instanceof FakePlayer)) {
            event.addCapability(PROFESSION_CAP, new ProfessionCapabilityProvider());
        }
    }
}
