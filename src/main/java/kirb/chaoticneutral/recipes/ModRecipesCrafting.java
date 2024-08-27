package kirb.chaoticneutral.recipes;

import kirb.chaoticneutral.ChaoticNeutral;
import kirb.chaoticneutral.item.ModItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;

public class ModRecipesCrafting {

	public static void init(){
		RecipeBuilder.Shapeless(ChaoticNeutral.MOD_ID)
			.addInput(Block.wool, 1)
			.addInput(Block.wool, 2)
			.addInput(Block.wool, 6)
			.addInput(Item.string)
			.create("authors_plushy",new ItemStack(ModItems.authors_plushy, 1));

		RecipeBuilder.Shapeless(ChaoticNeutral.MOD_ID)
			.addInput(Block.wool, 0)
			.addInput(Block.wool, 8)
			.addInput(Block.wool, 11)
			.addInput(Item.string)
			.create("cat_plushy",new ItemStack(ModItems.cat_plushy, 1));

		RecipeBuilder.Shapeless(ChaoticNeutral.MOD_ID)
			.addInput(Block.wool, 0)
			.addInput(Block.wool, 1)
			.addInput(Block.wool, 11)
			.addInput(Item.string)
			.create("penguin_plushy",new ItemStack(ModItems.penguin_plushy, 1));
	}
}

