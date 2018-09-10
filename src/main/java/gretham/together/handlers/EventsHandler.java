package gretham.together.handlers;

import gretham.together.events.CapabilityEvents;
import gretham.together.events.PlayerEvents;
import net.minecraftforge.common.MinecraftForge;

public class EventsHandler {

    /**
     * Registers all mod gretham.together.events.
     */
    public void registerEvents() {
        MinecraftForge.EVENT_BUS.register(new PlayerEvents());
        MinecraftForge.EVENT_BUS.register(new CapabilityEvents());
    }
}
