package net.vancomb.kamidogu.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.vancomb.kamidogu.Kamidogu;
import net.vancomb.kamidogu.entity.MaskedGuard;
import net.vancomb.kamidogu.entity.ModEntityTypes;

@Mod.EventBusSubscriber(modid = Kamidogu.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonEvents {

    //To register a new mobs attributes just copy "event.put(ModEntityTypes.RANDOM_MOB.get(), MaskedGuard.setAttributes());"
    //and replace RANDOM_MOB with your mob

    @SubscribeEvent
    public static void onAttributeCreate(EntityAttributeCreationEvent event) {

        //ENTITY LIST
        event.put(ModEntityTypes.MASKEDGUARD.get(), MaskedGuard.setAttributes());

    }
}
