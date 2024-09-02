package net.vancomb.kamidogu.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vancomb.kamidogu.Kamidogu;

public class ModItems {


    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Kamidogu.MOD_ID);

    //CREATIVE TAB LOGO

   public static final RegistryObject<Item> KAMIDOGU_ICON = ITEMS.register("kamidogu_icon",
           () -> new Item(new Item.Properties()));

    //ITEMS

    //WEAPONS

    //SPAWN EGGS


    //Registers the class in main Kamidogu class
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);


    }
}

/* Example:

    public static final RegistryObject<Item> KOMBAT_KOIN = ITEMS.register("kombat_koin",
            () -> new Item(new Item.Properties().tab(CreativeModeTabs.KAMIDOGU)));

*/