package gretham.together.blocks;

import gretham.together.TogetherMod;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(
    modid = TogetherMod.MODID
)
public class ModBlocks {
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        Block leafBlock = new BlockLeaf();

        event.getRegistry().registerAll(leafBlock);
    }
}
