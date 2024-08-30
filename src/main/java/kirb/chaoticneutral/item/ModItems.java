package kirb.chaoticneutral.item;

import kirb.chaoticneutral.ChaoticNeutral;
import kirb.chaoticneutral.Utilities;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.ItemBuilder;

public class ModItems {

	public static ArmorMaterial dealerArmor  = ArmorHelper.createArmorMaterial(ChaoticNeutral.MOD_ID, "specil_glasses", 26, -20f, 10f, 10f, 10f);

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
		.build(new FlintlockItem("flintlock_pistol", Utilities.nextID() ));

	public static Item iron_bullet = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/iron_bullet")
		.setStackSize(4)
		.build(new Item("iron_bullet", Utilities.nextID() ));

	public static Item specil_dealers_glasses = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/specil_dealers_glasses")
		.setStackSize(1)
		.build(new ItemArmor("specil_glasses", Utilities.nextID(), dealerArmor, 0));

	public static void init() {

	}

}
