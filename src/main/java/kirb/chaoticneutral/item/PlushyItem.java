package kirb.chaoticneutral.item;

import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import java.util.Random;

public class PlushyItem extends Item {
	public PlushyItem(String name, int id) {
		super(name, id);
	}

	@Override
	public ItemStack onUseItem(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		entityplayer.swingItem();
		world.playSoundAtEntity(entityplayer, entityplayer, "chaotic_neutral.squeak", 1f,0.75f + (new Random().nextFloat() * 0.5F));
		return itemstack;
	}
}
