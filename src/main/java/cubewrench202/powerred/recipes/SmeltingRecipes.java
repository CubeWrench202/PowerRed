package cubewrench202.powerred.recipes;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cubewrench202.powerred.common.PRBlocks;
import cubewrench202.powerred.common.PRItems;

public class SmeltingRecipes {
	public static void addRecipes(){
		GameRegistry.addSmelting(PRBlocks.blockCopperOre,
				new ItemStack(PRItems.itemCopperIngot), 0.5F);
		GameRegistry
				.addSmelting(PRBlocks.blockTinOre, new ItemStack(PRItems.itemTinIngot), 0.5F);
		GameRegistry.addSmelting(PRBlocks.blockSilverOre,
				new ItemStack(PRItems.itemSilverIngot), 0.5F);
		GameRegistry.addSmelting(PRBlocks.blockBasaltBrick, new ItemStack(
				PRBlocks.blockBasaltPolished), 0.5F);
		GameRegistry.addSmelting(PRBlocks.blockBasaltCobblestone, new ItemStack(
				PRBlocks.blockBasalt), 0.5F);
	}
}
