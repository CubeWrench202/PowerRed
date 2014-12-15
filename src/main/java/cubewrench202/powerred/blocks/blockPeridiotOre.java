package cubewrench202.powerred.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cubewrench202.powerred.common.PRItems;

public class blockPeridiotOre extends Block{

	public blockPeridiotOre(Material material) {
		super(material);
		this.setHardness(1.0F);
		this.setHarvestLevel("pickaxe", 2);
		
	}
	
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return PRItems.itemPeridiot;
	}
	
	public int quantityDropped(Random rand){
		return 1 + rand.nextInt(3);
	}
}
