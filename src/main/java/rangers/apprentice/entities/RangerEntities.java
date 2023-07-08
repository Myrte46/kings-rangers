package rangers.apprentice.entities;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import rangers.apprentice.RangerMod;

public class RangerEntities {
    public static final EntityType<SaxeKnifeEntity> SAXE_KNIFE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(RangerMod.MOD_ID, "saxe_knife"),
            FabricEntityTypeBuilder.<SaxeKnifeEntity>create(SpawnGroup.MISC, SaxeKnifeEntity::new)
            .dimensions(EntityDimensions.fixed(0.25F, 0.25F))
            .trackRangeBlocks(4).trackedUpdateRate(10)
            .build());

    public static final EntityType<ThrowingKnifeEntity> THROWING_KNIFE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(RangerMod.MOD_ID, "throwing_knife"),
            FabricEntityTypeBuilder.<ThrowingKnifeEntity>create(SpawnGroup.MISC, ThrowingKnifeEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F))
                    .trackRangeBlocks(4).trackedUpdateRate(10)
                    .build());

    public static void registerModEntities() {
        RangerMod.LOGGER.info("Regestering Mod Items for " + RangerMod.MOD_ID);

    }
}
