package cubewrench202.powerred.blocks;

import java.util.Random;

import cubewrench202.powerred.PowerRed;
import cubewrench202.powerred.common.PRItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class blockSapphireOre extends Block {

	public blockSapphireOre(Material material) {
		super(material);
		this.setHardness(1.0F);
		this.setHarvestLevel("pickaxe", 2);
	}

	public Item getItemDropped(int metadata, Random rand, int fortune) {
		return PRItems.itemSapphire;
	}

	public int quantityDropped(Random rand) {
		return 1 + rand.nextInt(3);
	}
}