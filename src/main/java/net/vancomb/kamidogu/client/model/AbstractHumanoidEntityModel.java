package net.vancomb.kamidogu.client.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.vancomb.kamidogu.entity.AbstractHumanoidEntity;

public class AbstractHumanoidEntityModel<T extends AbstractHumanoidEntity> extends HumanoidModel<T>  {

    public AbstractHumanoidEntityModel(ModelPart modelPart) { super(modelPart);}

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F);
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

}
