package cubewrench202.powerred.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cubewrench202.powerred.common.PRItems;

public class BlockNikoliteOre extends Block{

	public BlockNikoliteOre(Material material) {
		super(material);
		this.setHardness(1.0F);
		this.setHarvestLevel("pickaxe", 2);
	}
	
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return PRItems.itemNikolite;
	}
	
	public int quantityDropped(Random rand){
		return 3 + rand.nextInt(4);
	}
}
