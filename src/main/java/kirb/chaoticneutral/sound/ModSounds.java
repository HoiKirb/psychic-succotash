package kirb.chaoticneutral.sound;

import kirb.chaoticneutral.ChaoticNeutral;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.SoundHelper;

public class ModSounds {

	public static void init() {
		// Loads Sounds... Yep...
		SoundHelper.addSound(ChaoticNeutral.MOD_ID, "squeak.ogg");
	}
}
