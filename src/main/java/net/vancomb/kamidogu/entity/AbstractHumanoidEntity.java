package net.vancomb.kamidogu.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.vancomb.kamidogu.Kamidogu;

public abstract class AbstractHumanoidEntity extends Monster {

    public AbstractHumanoidEntity(EntityType<? extends Monster> entityType, Level level) { super(entityType, level); }

    public ResourceLocation getResourceLocation() {
        return new ResourceLocation(Kamidogu.MOD_ID, "textures/entities/whatever_your_texture_is.png");
    }

}
