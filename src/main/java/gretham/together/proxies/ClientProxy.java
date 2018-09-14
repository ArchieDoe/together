package gretham.together.proxies;

import gretham.together.control.KeyBindings;

public class ClientProxy extends CommonProxy {
    @Override
    public void init() {
        super.init();

        KeyBindings.registerKeyBindings();
    }
}
