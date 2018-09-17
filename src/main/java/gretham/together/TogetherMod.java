package gretham.together;

import gretham.together.alterations.BlockAlterations;
import gretham.together.handlers.EventsHandler;
import gretham.together.proxies.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = TogetherMod.MODID, name = TogetherMod.NAME, version = TogetherMod.VERSION)
public class TogetherMod
{
    public static final String MODID = "together";
    public static final String NAME = "Together";
    public static final String VERSION = "1.0";

    EventsHandler handler = new EventsHandler();

    private static Logger logger;

    @SidedProxy(serverSide = "gretham.together.proxies.ServerProxy", clientSide = "gretham.together.proxies.ClientProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // BlockAlterations.alterBlocks();
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();

        handler.registerEvents();
    }
}
