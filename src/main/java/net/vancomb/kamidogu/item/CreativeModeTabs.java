package net.vancomb.kamidogu.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.vancomb.kamidogu.Kamidogu;

public class CreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Kamidogu.MOD_ID);

    public static final RegistryObject<CreativeModeTab> KAMIDOGU_TAB = CREATIVE_MODE_TABS.register("kamidogu_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KAMIDOGU_ICON.get()))
                    .title(Component.translatable("creativetab.kamidogu_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //List Items Here
                        pOutput.accept(ModItems.KAMIDOGU_ICON.get()); //Can remove once actual items are listed.

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}


