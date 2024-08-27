package kirb.chaoticneutral;


import kirb.chaoticneutral.entity.FlintlockProjectile;
import kirb.chaoticneutral.item.ModItems;
import kirb.chaoticneutral.recipes.ModRecipesCrafting;
import kirb.chaoticneutral.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.entity.SnowballRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.EntityHelper;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class ChaoticNeutral implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "chaotic_neutral";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
		LOGGER.info("Initializing some wacky items...");
		ModItems.init();
		LOGGER.info("and entities too while we are at it !");

		LOGGER.info("Generating some sounds, otherwise we are deaf");
		ModSounds.init();
		LOGGER.info("Chaos level has been successfully set to 100%. Ready commander!");
    }

	@Override
	public void beforeGameStart() {
		EntityHelper.createEntity(FlintlockProjectile.class, 2000, "flintlockProjectile", () -> new SnowballRenderer(ModItems.lead_ball));
	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {
		LOGGER.info("Now time to start writing those recipes");
		ModRecipesCrafting.init();
	}

	@Override
	public void initNamespaces() {
	}
}
