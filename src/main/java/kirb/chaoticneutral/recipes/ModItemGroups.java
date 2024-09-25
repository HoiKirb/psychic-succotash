package kirb.chaoticneutral.recipes;

import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;

public class ModItemGroups {

	public static void init(){
		Registries.ITEM_GROUPS.register("chaotic_neutral:records", Registries.stackListOf(Item.record13,
			new ItemStack(Item.record13),
			new ItemStack(Item.recordCat),
			new ItemStack(Item.recordBlocks),
			new ItemStack(Item.recordChirp),
			new ItemStack(Item.recordFar),
			new ItemStack(Item.recordMall),
			new ItemStack(Item.recordMellohi),
			new ItemStack(Item.recordStal),
			new ItemStack(Item.recordStrad),
			new ItemStack(Item.recordWard),
			new ItemStack(Item.recordWait),
			new ItemStack(Item.recordDog)));


	}
}
