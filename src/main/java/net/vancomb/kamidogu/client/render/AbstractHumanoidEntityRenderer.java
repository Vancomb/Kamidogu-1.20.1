package net.vancomb.kamidogu.client.render;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.vancomb.kamidogu.client.KamidoguModelLayers;
import net.vancomb.kamidogu.client.model.AbstractHumanoidEntityModel;
import net.vancomb.kamidogu.entity.AbstractHumanoidEntity;

public class AbstractHumanoidEntityRenderer extends HumanoidMobRenderer<AbstractHumanoidEntity, AbstractHumanoidEntityModel<AbstractHumanoidEntity>> {

    public AbstractHumanoidEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new AbstractHumanoidEntityModel<>(context.bakeLayer(KamidoguModelLayers.HUMANOID_ENTITY)), 0.5F);

    }

     @Override
    public ResourceLocation getTextureLocation(AbstractHumanoidEntity entity) { return entity.getResourceLocation(); }
}
