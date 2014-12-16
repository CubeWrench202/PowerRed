package cubewrench202.powerred.item;

import cubewrench202.powerred.api.items.IScrewdriver;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class ItemScrewdriver extends Item implements IScrewdriver{
	
	public ItemScrewdriver() {
	
	this.setMaxDamage(145);
	this.setMaxStackSize(1);
	this.setNoRepair();
	this.setFull3D();
	}

	@Override
	public boolean onItemUseFirst(ItemStack is, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ){
		Block b = world.getBlock(x, y, z);
		if (b != null && !player.isSneaking()){
			ForgeDirection mySide = ForgeDirection.getOrientation( side );
		}
		return true;
	}

	@Override
	public void damageScrewdriver(World world, EntityPlayer player) {
		ItemStack driver = player.getItemInUse();
		driver.setItemDamage(driver.getItemDamage() - 1);
	}
}
