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
		this.setBlockBounds(xMin, 0.0, zMin, (1.0F - f), f2, (1.0F - f));
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
		return AABB.getBoundingBoxFromPool(((float)x + xMin), y, ((float)z + zMin), ((float)(x + 1) - f), ((float)y + f2 - f), ((float)(z + 1) - f));
	}

	public AABB getSelectedBoundingBoxFromPool( WorldSource world, int x, int y, int z) {
		int l = world.getBlockMetadata(x, y, z);
		float f = 0.0625f;
		float xMin = l >= 2 ? 0.5f : f;
		float zMin = l >= 3 ? 0.5f : f;
		float f2 = 0.5625f;
		return AABB.getBoundingBoxFromPool(((float)x + xMin), y, ((float)z + zMin), ((float)(x + 1) - f), ((float)y + f2 - f), ((float)(z + 1) - f));
	}

}
