package kirb.chaoticneutral.block;

import net.minecraft.core.block.BlockRotatableHorizontal;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

public class MikuBlock extends BlockRotatableHorizontal {
	public MikuBlock(String key, int id, Material material) {
		super(key, id, material);
		this.setTicking(true);
	}
	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
		this.setDefaultDirection(world, x, y, z);
	}
}
