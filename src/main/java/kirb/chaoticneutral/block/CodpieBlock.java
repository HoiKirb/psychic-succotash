package kirb.chaoticneutral.block;

import kirb.chaoticneutral.ChaoticNeutral;
import kirb.chaoticneutral.item.ModItems;
import net.minecraft.client.render.stitcher.IconCoordinate;
import net.minecraft.client.render.stitcher.TextureRegistry;
import net.minecraft.core.block.BlockEdible;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;
import org.jetbrains.annotations.NotNull;

public class CodpieBlock extends BlockEdible {
	IconCoordinate slice = TextureRegistry.getTexture(ChaoticNeutral.MOD_ID + ":block/cod_pie_inside");
	public CodpieBlock(String key, int id) {
		super(key, id, 4, 4, () -> ModItems.codpie);
	}

	public void setBlockBoundsBasedOnState(WorldSource world, int x, int y, int z) {
		int l = world.getBlockMetadata(x, y, z);
		float f = 0.0625f;
		float xMin = l >= 2 ? 0.5f : f;
		float zMin = l >= 3 ? 0.5f : f;
		float f2 = 0.5f;
		this.setBlockBounds((double)xMin, 0.0, (double)zMin, (double)(1.0F - f), (double)f2, (double)(1.0F - f));
	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		return dropCause != EnumDropCause.PICK_BLOCK && meta != 0 ? null : new ItemStack[]{new ItemStack(ModItems.codpie)};
	}

	public AABB getCollisionBoundingBoxFromPool(WorldSource world, int x, int y, int z) {
		int l = world.getBlockMetadata(x, y, z);
		float f = 0.0625f;
		float xMin = l >= 2 ? 0.5f : f;
		float zMin = l >= 3 ? 0.5f : f;
		float f2 = 0.5625f;
		return AABB.getBoundingBoxFromPool((double) ((float)x + xMin), (double)y, (double)((float)z + zMin), (double)((float)(x + 1) - f), (double)((float)y + f2 - f), (double)((float)(z + 1) - f));
	}

	public AABB getSelectedBoundingBoxFromPool( WorldSource world, int x, int y, int z) {
		int l = world.getBlockMetadata(x, y, z);
		float f = 0.0625f;
		float xMin = l >= 2 ? 0.5f : f;
		float zMin = l >= 3 ? 0.5f : f;
		float f2 = 0.5625f;
		return AABB.getBoundingBoxFromPool((double)((float)x + xMin), (double)y, (double)((float)z + zMin), (double)((float)(x + 1) - f), (double)((float)y + f2 - f), (double)((float)(z + 1) - f));
	}

}
