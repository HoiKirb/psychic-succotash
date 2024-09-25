package kirb.chaoticneutral.item;

import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.gamemode.Gamemode;
import net.minecraft.core.world.World;

public class PepperItem extends Item {
	public PepperItem(String name, int id) {
		super(name, id);
	}

	@Override
	public ItemStack onUseItem(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		if (entityplayer.getHealth() < entityplayer.getMaxHealth()) {
			super.onUseItem(itemstack, world, entityplayer);
			entityplayer.remainingFireTicks = 80;
			itemstack.consumeItem(entityplayer);
		}
		return itemstack;
	}
}
