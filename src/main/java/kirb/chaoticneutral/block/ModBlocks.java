package kirb.chaoticneutral.block;

import kirb.chaoticneutral.ChaoticNeutral;
import kirb.chaoticneutral.Utilities;
import net.minecraft.client.render.block.model.BlockModelHorizontalRotation;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSound;
import turniplabs.halplibe.helper.BlockBuilder;

public class ModBlocks {
	public static Block miku_block;
	public static Block calcite;
	public static CodpieBlock codpie;

	public static void init(){
		miku_block = new BlockBuilder(ChaoticNeutral.MOD_ID)
			.setBlockSound(new BlockSound("step.wool", "break.wool", 1f, 1f))
			.setBlockDrop(ModBlocks.miku_block)
			.setHardness(1f)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.setBlockModel(BlockModelHorizontalRotation::new)
			.setTopTexture(ChaoticNeutral.MOD_ID + ":block/miku_top")
			.setBottomTexture(ChaoticNeutral.MOD_ID + ":block/miku_bottom")
			.setNorthTexture(ChaoticNeutral.MOD_ID + ":block/miku_front")
			.setSouthTexture(ChaoticNeutral.MOD_ID + ":block/miku_back")
			.setEastTexture(ChaoticNeutral.MOD_ID + ":block/miku_east")
			.setWestTexture(ChaoticNeutral.MOD_ID + ":block/miku_west")
			.build(new MikuBlock("miku_block", Utilities.nextBlockID(), Material.stone));

		calcite = new BlockBuilder(ChaoticNeutral.MOD_ID)
			.setBlockSound(new BlockSound("step.stone", "step.stone", 1f, 1f))
			.setTextures(ChaoticNeutral.MOD_ID + ":block/calcite")
			.build(new Block("calcite", Utilities.nextBlockID(), Material.stone));

		/*codpie = new BlockBuilder(ChaoticNeutral.MOD_ID)
			.setBlockSound(new BlockSound("step.slime", "break.wool", 1f, 1f))
			.setTopTexture(ChaoticNeutral.MOD_ID + ":block/cod_pie_top")
			.setBottomTexture(ChaoticNeutral.MOD_ID +":block/pie_bottom")
			.setSideTextures(ChaoticNeutral.MOD_ID +":block/pie_side")
			.setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.NOT_IN_CREATIVE_MENU)
			.build(new CodpieBlock("cod_pie_block", Utilities.nextBlockID() ));*/
		// Unstable. please be warned
	}
}
