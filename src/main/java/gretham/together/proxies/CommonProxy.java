package gretham.together.proxies;

import gretham.together.capabilities.IProfessionCapability;
import gretham.together.capabilities.ProfessionCapability;
import gretham.together.capabilities.factories.ProfessionCapabilityFactory;
import gretham.together.capabilities.storages.ProfessionStorage;
import net.minecraftforge.common.capabilities.CapabilityManager;

public class CommonProxy {
    public void init() {
        CapabilityManager.INSTANCE.register(IProfessionCapability.class, new ProfessionStorage(), new ProfessionCapabilityFactory(ProfessionCapability.class));
    }
}
