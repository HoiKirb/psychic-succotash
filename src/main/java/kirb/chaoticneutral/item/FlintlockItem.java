package kirb.chaoticneutral.item;

import kirb.chaoticneutral.ChaoticNeutral;
import kirb.chaoticneutral.entity.FlintlockProjectile;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.world.World;

import java.util.Random;

public class FlintlockItem extends Item {
	// Requested by mzov4J
	public FlintlockItem(String name, int id) {
		super(name, id);
	}

	public ItemStack onUseItem(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		if (entityplayer.hasItem(ModItems.lead_ball)) {
			world.playSoundAtEntity(entityplayer, entityplayer, "random.bow", 0.5f, 0.4f / (new Random().nextFloat() * 0.2f + 0.3f));
			FlintlockProjectile Flintlock_pistol = new FlintlockProjectile(world, entityplayer);
			float pitch = entityplayer.xRot;
			float yaw = entityplayer.yRot;
			float force = 0.6f;

			double motionX = -MathHelper.sin(yaw / 180.0f * (float)Math.PI) * MathHelper.cos(pitch / 180.0f * (float)Math.PI) * force;
			double motionZ = MathHelper.cos(yaw / 180.0f * (float)Math.PI) * MathHelper.cos(pitch / 180.0f * (float)Math.PI) * force;
			double motionY = -MathHelper.sin(pitch / 180.0f * (float)Math.PI) * force;

			Flintlock_pistol.setHeading(motionX, motionY, motionZ, 4f, 0.2f);
			world.entityJoinedWorld(Flintlock_pistol);

			itemstack.damageItem(1, entityplayer);
			entityplayer.inventory.consumeInventoryItem(ModItems.lead_ball.id);
		}
		return itemstack;
	}

}
