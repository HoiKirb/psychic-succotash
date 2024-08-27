package kirb.chaoticneutral.entity;

import kirb.chaoticneutral.ChaoticNeutral;
import net.minecraft.client.render.entity.SnowballRenderer;
import net.minecraft.core.HitResult;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.entity.projectile.EntityProjectile;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.world.Explosion;
import net.minecraft.core.world.World;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.EntityHelper;

public class FlintlockProjectile extends EntityProjectile {

	public FlintlockProjectile(World world, EntityLiving owner) {
		super(world, owner);
		this.modelItem = Item.ammoSnowball;
	}

	@Override
	public void onHit(HitResult hitResult) {
		if (hitResult == null) {
			return;
		}
		if (hitResult.hitType == HitResult.HitType.ENTITY ) {
			hitResult.entity.hurt(this.owner, 16, DamageType.COMBAT);
		}
		this.remove();
	}
}
