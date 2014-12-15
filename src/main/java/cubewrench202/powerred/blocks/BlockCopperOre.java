package cubewrench202.powerred.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCopperOre extends Block{

	public BlockCopperOre(Material material) {
		super(material);
		this.setHardness(1.0F);
		this.setHarvestLevel("pickaxe", 1);
		// TODO Auto-generated constructor stub
	}

}
