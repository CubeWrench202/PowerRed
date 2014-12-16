/*package cubewrench202.powerred.blocks;

import java.util.Random;

import cubewrench202.powerred.PowerRed;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockWhiteLamp extends Block{

	public final boolean isOn;
	
	public BlockWhiteLamp(boolean isOn) {
		super(Material.redstoneLight);
		
		this.isOn = isOn;
		
		if (isOn) {
			this.setLightLevel(1.0F);
		}
	}
	
	
	
	public void onBlockAdded(World world, int x, int y, int z) {
		
		if (!world.isRemote) {
			if(this.isOn && !world .isBlockIndirectlyGettingPowered(x, y, z)) {
				world.scheduleBlockUpdate(x, y, z, this, 4);
			}else if (this.isOn && world .isBlockIndirectlyGettingPowered(x, y, z)) {
				world.setBlock(x, y, z, BlockWhiteLampOn, 0, 2);
			}
		}
	}
	
	public void onNeighborBlockChange(World world, int x, int y, int z, int par1) {
		if (!world.isRemote) {
			if(this.isOn && !world .isBlockIndirectlyGettingPowered(x, y, z)) {
				world.scheduleBlockUpdate(x, y, z, this, 4);
			}else if (this.isOn && world .isBlockIndirectlyGettingPowered(x, y, z)) {
				world.setBlock(x, y, z, blockWhiteLampOn, 0, 2);
			}
		}
	}
	public void updateTick(World world, int x, int y, int z, Random random) {
		
		if(!world.isRemote && this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
			world.setBlock(x, y, z, BlockWhiteLampOff, 0, 2);
		}
	}
	
	public Item getItemDropped(int i, Random random, int j) {
		return Item.getItemFromBlock(blockWhiteLampOff);
	}
	
	public ItemStack createStackedBlock(int i) {
		return new ItemStack(blockWhiteLampOff);
	}
}
*/