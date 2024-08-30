package kirb.chaoticneutral.recipes;

import kirb.chaoticneutral.ChaoticNeutral;
import kirb.chaoticneutral.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;

public class ModRecipesCrafting {

	public static void init(){
		/* Hoi every ! It's I, Kirb/Hoi_Kirb/Mercy. Creator of the mod
		*  If you're here it's probably to see how you can make a recipe. Is that so ?
		*  (if it's not then it's okay... i'm not crying... You are !)
		*
		*  If yes however then might as well teach ya something ;)
		*  First well you want to make an initialisation function than you then want to call
		*  in your main file (here kirb/chaoticneutral/ChaoticNeutral) and in
		*  public void onRecipesReady() {}  you want to type
		*  thisfile.yourinitfunction();
		*
		*  ALRIGHT BUD ! You did it !
		*  now getting started on actually making the recipes,
		*  You want first RecipeBuilder to create a new recipe, and for any recipe you want
		*  an Input and an Output, and if your recipe is shaped or shapeless
		*  Shaped and Shapeless is dictated by adding .Shaped / .Shapeless in RecipeBuilder
		*  the Input is made using .addInput('X', Item/Block, meta) -- X is a SINGLE ascii character of your choosing
		*  the Output is made using .create("recipeID", new ItemStack(yourItem/Block , quantity))
		*
		*  For Shaped Crafting, just add .setShape("XXX","XXX","XXX")
		*
		*  However, if you want to do something like : "I want any wool/log/plank type to be considered valid items"
		*  then you may want to do in .addInput() were instead of Item/Block, a string saying like "minecraft:wools"
		*  NOTE it doesn't work for any kinds of groups, you must rely on minecraft having an existing group made
		*  in that case try creating a group of items by yourself
		*
		*  Well hope this helped you in any way :) hava nice day ! ♥                                                 */

		RecipeBuilder.Shapeless(ChaoticNeutral.MOD_ID)
			.addInput(Block.wool, 1)
			.addInput(Block.wool, 2)
			.addInput(Block.wool, 6)
			.addInput(Item.string)
			.create("authors_plushy",new ItemStack(ModItems.authors_plushy));

		RecipeBuilder.Shapeless(ChaoticNeutral.MOD_ID)
			.addInput(Block.wool, 0)
			.addInput(Block.wool, 8)
			.addInput(Block.wool, 11)
			.addInput(Item.string)
			.create("cat_plushy",new ItemStack(ModItems.cat_plushy));

		RecipeBuilder.Shapeless(ChaoticNeutral.MOD_ID)
			.addInput(Block.wool, 0)
			.addInput(Block.wool, 1)
			.addInput(Block.wool, 11)
			.addInput(Item.string)
			.create("penguin_plushy",new ItemStack(ModItems.penguin_plushy));

		RecipeBuilder.Shaped(ChaoticNeutral.MOD_ID)
			.setShape(
				"LS ",
				" LS",
				" GL")
			.addInput('L', ("minecraft:logs"))
			.addInput('S', Item.ingotSteel)
			.addInput('G', Item.ingotGold)
			.create("flintlock_pistol",new ItemStack(ModItems.flintlock_pistol));

		RecipeBuilder.Shaped(ChaoticNeutral.MOD_ID)
			.setShape(
				"▼ ▲",
				"♣S♣",
				"   ")
			.addInput('♣', Block.glass)
			.addInput('▲', Item.dye, 11)
			.addInput('▼', Item.dye, 13)
			.addInput('S', Item.string)
			.create("n1_rat3d_$alesm4n",new ItemStack(ModItems.specil_dealers_glasses));

		RecipeBuilder.Shapeless(ChaoticNeutral.MOD_ID)
			.addInput(Item.ingotSteel)
			.addInput(Item.ingotSteel)
			.addInput(Item.ingotIron)
			.addInput(Item.ingotIron)
			.create("iron_bullet",new ItemStack(ModItems.iron_bullet, 2));
	}
}

