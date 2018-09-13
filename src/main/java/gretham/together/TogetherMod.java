package gretham.together;

import gretham.together.handlers.EventsHandler;
import gretham.together.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = TogetherMod.MODID, name = TogetherMod.NAME, version = TogetherMod.VERSION)
public class TogetherMod
{
    public static final String MODID = "gretham/together";
    public static final String NAME = "Together";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @SidedProxy(serverSide = "gretham.together.proxies.ServerProxy", clientSide = "gretham.together.proxies.ClientProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("Mod initialized");
    }
}
