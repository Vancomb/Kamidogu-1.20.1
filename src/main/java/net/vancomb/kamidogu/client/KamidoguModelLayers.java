package net.vancomb.kamidogu.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.vancomb.kamidogu.Kamidogu;

public class KamidoguModelLayers {

    public static final ModelLayerLocation HUMANOID_ENTITY = register("humanoid_entity");

    private static ModelLayerLocation register(String name) {
        return new ModelLayerLocation(new ResourceLocation(Kamidogu.MOD_ID, name), "main");
    }

    private static ModelLayerLocation register(String name, String layerName) {
        return new ModelLayerLocation(new ResourceLocation(Kamidogu.MOD_ID, name), layerName);
    }
}
