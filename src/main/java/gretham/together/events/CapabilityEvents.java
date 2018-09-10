package gretham.together.events;

import gretham.together.TogetherMod;
import gretham.together.capabilities.ProfessionProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CapabilityEvents {

    public static final ResourceLocation PROFESSION_CAP = new ResourceLocation(TogetherMod.MODID, "profession");

    @SubscribeEvent
    public void registerCapability(AttachCapabilitiesEvent<Entity> event) {
        Entity obj = event.getObject();
        if (obj instanceof EntityPlayer && !(obj instanceof FakePlayer)) {
            event.addCapability(PROFESSION_CAP, new ProfessionProvider());
        }
    }
}
