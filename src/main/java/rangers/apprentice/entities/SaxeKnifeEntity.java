package rangers.apprentice.entities;

import net.minecraft.entity.*;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import rangers.apprentice.items.RangerItems;

public class SaxeKnifeEntity extends ThrownItemEntity {
    public SaxeKnifeEntity(EntityType<? extends SaxeKnifeEntity> entityType, World world) {
        super((EntityType<? extends ThrownItemEntity>)entityType, world);
    }

    public SaxeKnifeEntity(World world, LivingEntity owner) {
        super((EntityType<? extends ThrownItemEntity>)RangerEntities.SAXE_KNIFE, owner, world);
    }

    public SaxeKnifeEntity(World world, double x, double y, double z) {
        super((EntityType<? extends ThrownItemEntity>)RangerEntities.SAXE_KNIFE, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return RangerItems.SAXE_KNIFE;
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        entity.damage(this.getDamageSources().thrown(this, this.getOwner()), 5);
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult){
        this.getWorld().spawnEntity(new ItemEntity(this.getWorld(), this.getX(), this.getY(), this.getZ(), this.getStack()));
        this.kill();
    }
}

