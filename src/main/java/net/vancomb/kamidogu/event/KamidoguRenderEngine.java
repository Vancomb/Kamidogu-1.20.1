package net.vancomb.kamidogu.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.vancomb.kamidogu.Kamidogu;
import net.vancomb.kamidogu.client.KamidoguModelLayers;
import net.vancomb.kamidogu.client.model.AbstractHumanoidEntityModel;
import net.vancomb.kamidogu.client.render.AbstractHumanoidEntityRenderer;
import net.vancomb.kamidogu.entity.ModEntityTypes;

@Mod.EventBusSubscriber(modid = Kamidogu.MOD_ID , bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KamidoguRenderEngine {

    public KamidoguRenderEngine() {
    }

    @SubscribeEvent
    public static void registerEntityLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(KamidoguModelLayers.HUMANOID_ENTITY, AbstractHumanoidEntityModel::createBodyLayer);
    }


    //To register a new mobs renderer just copy "event.registerEntityRenderer(ModEntityTypes.RANDOM_MOB.get(), AbstractKombatantEntityRenderer::new);"
    //and replace RANDOM_MOB with your mob

    @SubscribeEvent
    public static void register(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.MASKEDGUARD.get(), AbstractHumanoidEntityRenderer::new);

    }
}