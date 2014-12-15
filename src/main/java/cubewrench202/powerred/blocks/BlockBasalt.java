package cubewrench202.powerred.blocks;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import cubewrench202.powerred.PowerRed;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockBasalt extends Block {

	public BlockBasalt(Material material) {
		super(material);
		this.setHardness(1.0F);
		this.setHarvestLevel("pickaxe", 1);}	
		
		public Block getBlockDropped(int metadata, Random rand, int fortune) {
			return PowerRed.blockBasaltCobblestone;
	}
}
