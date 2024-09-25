package kirb.chaoticneutral.block.model;

import kirb.chaoticneutral.ChaoticNeutral;
import kirb.chaoticneutral.block.CodpieBlock;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.stitcher.IconCoordinate;
import net.minecraft.client.render.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;

public class CodpieBlockModel<T extends Block> extends BlockModelStandard<T> {
	protected IconCoordinate pizzaInner = TextureRegistry.getTexture(ChaoticNeutral.MOD_ID + ":block/pizza_inner");

	public CodpieBlockModel(Block block){
		super(block);
		float f = 0.0625F;
		float f1 = 0.25f;
		this.withCustomItemBounds(f, 0.0F, f, 1.0F - f, f1, 1.0F - f);
	}
}
