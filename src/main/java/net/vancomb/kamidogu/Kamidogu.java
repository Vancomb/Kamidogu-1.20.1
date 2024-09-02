package net.vancomb.kamidogu;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.vancomb.kamidogu.entity.ModEntityTypes;
import net.vancomb.kamidogu.item.CreativeModeTabs;
import net.vancomb.kamidogu.item.ModItems;
import org.slf4j.Logger;

@Mod(Kamidogu.MOD_ID)
public class Kamidogu {
    public static final String MOD_ID = "kamidogu";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Kamidogu() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);           //Registered ModItems Class
        ModEntityTypes.register(modEventBus);     //Registered ModEntityTypes Class
        CreativeModeTabs.register(modEventBus);   //Registered CreateModeTabs Class
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

}
