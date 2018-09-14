package gretham.together.control;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class KeyBindings {
    public static KeyBinding[] keyBindings;

    public static void registerKeyBindings() {
        keyBindings = new KeyBinding[1];

        keyBindings[0] = new KeyBinding("key.hud.desc", Keyboard.KEY_P, "key.together.category");

        for (int i = 0; i < keyBindings.length; ++i)
        {
            ClientRegistry.registerKeyBinding(keyBindings[i]);
        }
    }
}
