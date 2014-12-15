package cubewrench202.powerred.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSilverOre extends Block{

	public BlockSilverOre(Material material) {
		super(material);
		this.setHardness(1.0F);
		this.setHarvestLevel("pickaxe", 2);
		// TODO Auto-generated constructor stub
	}

}
