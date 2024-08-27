package kirb.chaoticneutral.item;

import kirb.chaoticneutral.ChaoticNeutral;
import kirb.chaoticneutral.Utilities;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemBuilder;

public class ModItems {

	public static Item authors_plushy = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/dumdum")
		.build(new PlushyItem("authors_plushy", Utilities.nextID() ));

	public static Item cat_plushy = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/catfromgame")
		.build(new PlushyItem("cat_plushy", Utilities.nextID() ));

	public static Item penguin_plushy = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/lovelypenguin")
		.build(new PlushyItem("penguin_plushy", Utilities.nextID() ));

	public static Item flintlock_pistol = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/flintlock")
		.setStackSize(1)
		.setMaxDamage(15)
		.build(new FlintlockItem("flintlock_pistol", Utilities.nextID() ));

	public static Item lead_ball = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/lead_ball")
		.setStackSize(4)
		.build(new Item("lead_ball", Utilities.nextID() ));

	public static void init() {

	}

}
