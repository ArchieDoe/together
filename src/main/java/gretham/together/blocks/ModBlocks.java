package gretham.together.blocks;

import gretham.together.TogetherMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.lang.reflect.Field;
import java.util.Collection;

@EventBusSubscriber(
    modid = TogetherMod.MODID
)
public class ModBlocks {
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        Material woodMaterial = Material.WOOD;

        try {
            Field requiresToolField = woodMaterial.getClass().getDeclaredField("requiresNoTool");
            requiresToolField.setAccessible(true);
            requiresToolField.set(woodMaterial, false);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            int a = 3;
        }
//        Block leafBlock = new BlockLeaf();
//        Block logBlock = new BlockLog();
//
//        Collection<Block> blockCollection = event.getRegistry().getValuesCollection();
//        event.getRegistry().registerAll(leafBlock, logBlock);
    }
}
