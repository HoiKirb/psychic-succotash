package kirb.chaoticneutral.item;

import kirb.chaoticneutral.ChaoticNeutral;
import kirb.chaoticneutral.Utilities;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.ItemBed;
import net.minecraft.core.item.ItemFood;
import net.minecraft.core.item.material.ArmorMaterial;
import org.lwjgl.openal.Util;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.ItemBuilder;

public class ModItems {

	public static ArmorMaterial dealerArmor  = ArmorHelper.createArmorMaterial(ChaoticNeutral.MOD_ID, "specil_glasses", 26, -20f, 10f, 10f, 10f);
	public static ArmorMaterial propellerArmor = ArmorHelper.createArmorMaterial(ChaoticNeutral.MOD_ID, "propeller_hat", 128, 0,0,0,80);

	public static Item authors_plushy = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/dumdum")
		.build(new PlushyItem("authors_plushy", Utilities.nextItemID() ));

	public static Item cat_plushy = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/catfromgame")
		.build(new PlushyItem("cat_plushy", Utilities.nextItemID() ));

	public static Item penguin_plushy = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/lovelypenguin")
		.build(new PlushyItem("penguin_plushy", Utilities.nextItemID() ));

	public static Item flintlock_pistol = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/flintlock")
		.setStackSize(1)
		.build(new FlintlockItem("flintlock_pistol", Utilities.nextItemID() ));

	public static Item iron_bullet = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/iron_bullet")
		.setStackSize(4)
		.build(new Item("iron_bullet", Utilities.nextItemID() ));

	public static Item specil_dealers_glasses = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/specil_dealers_glasses")
		.setStackSize(1)
		.build(new ItemArmor("specil_glasses", Utilities.nextItemID(), dealerArmor, 0));

	public static Item yomi_plushy = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/thaboar")
		.build(new PlushyItem("yomi_plushy", Utilities.nextItemID() ));
	// This is a Thaboar character that has been requested to be added by @Bigjango

	public static Item pepper = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/pepper")
		.setStackSize(8)
		.build(new PepperItem("pepper", Utilities.nextItemID()));

	public static Item tabasco = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/tabasco")
		.build(new ItemFood("tabasco", Utilities.nextItemID(), 2, 2,false,4));

	public static Item codpie = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/codpie")
		.setStackSize(1)
		.build(new Item("codpie", Utilities.nextItemID() ));
	// BE WARNED ! UNSTABLE !

	public static Item spaceman_plushy = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/spaceman")
		.build(new PlushyItem("spaceman_plushy", Utilities.nextItemID() ));

	public static Item plaguedoc_plushy = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/plague_doc")
		.build(new PlushyItem("plaguedoc_plushy", Utilities.nextItemID() ));

	public static Item propeller_hat = new ItemBuilder(ChaoticNeutral.MOD_ID)
		.setIcon(ChaoticNeutral.MOD_ID + ":item/propeller_hat")
		.setStackSize(1)
		.build(new PropellerHatItem("propeller_hat", Utilities.nextItemID(), propellerArmor, 0));
	// Suggested by ObviousAnonymous in a vc

	public static void init() {

	}

}
