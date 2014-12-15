package cubewrench202.powerred.blocks;

import java.util.Random;

import cubewrench202.powerred.PowerRed;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockRubyOre extends Block {

	public BlockRubyOre(Material material) {
		super(material);
		this.setHardness(1.0F);
		this.setHarvestLevel("pickaxe", 2);
		// TODO Auto-generated constructor stub
	}

	public Item getItemDroped(int metadata, Random rand, int fortune) {
		return PowerRed.itemRuby;
	}

	public int quantityDropped(Random rand) {
		return 1 + rand.nextInt(3);
	}
}