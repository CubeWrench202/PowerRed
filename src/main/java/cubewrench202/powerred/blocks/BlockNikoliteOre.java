package cubewrench202.powerred.blocks;

import java.util.Random;

import cubewrench202.powerred.PowerRed;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockNikoliteOre extends Block{

	public BlockNikoliteOre(Material material) {
		super(material);
		this.setHardness(1.0F);
		this.setHarvestLevel("pickaxe", 2);
		// TODO Auto-generated constructor stub
	}
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return PowerRed.itemNikolite;
 }
	public int quantityDropped(Random rand){
		return 3 + rand.nextInt(4);
	}}
