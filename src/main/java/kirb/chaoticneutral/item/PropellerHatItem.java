package kirb.chaoticneutral.item;

import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.player.inventory.slot.Slot;

import static kirb.chaoticneutral.item.ModItems.propellerArmor;

public class PropellerHatItem extends ItemArmor {
	public PropellerHatItem(String name, int id, ArmorMaterial ArmorMaterial, int i){
		super(name, id, propellerArmor, i);
	}

	@Override
	public ItemStack onInventoryInteract(EntityPlayer player, Slot slot, ItemStack stackInSlot, boolean isItemGrabbed) {

		return super.onInventoryInteract(player, slot, stackInSlot, isItemGrabbed);
	}
}
