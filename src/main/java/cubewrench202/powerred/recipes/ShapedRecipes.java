package cubewrench202.powerred.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import cubewrench202.powerred.common.PRBlocks;
import cubewrench202.powerred.common.PRItems;

public class ShapedRecipes {
	private static final String[] HELMET = new String[]{"XXX", "x x"};
	private static final String[] CHESTPLATE = new String[]{"X X", "XXX", "XXX"};
	private static final String[] LEGGINGS = new String[]{"XXX", "X X", "X X"};
	private static final String[] BOOTS = new String[]{"X X", "X X"};
	private static final String[] PICKAXE = new String[]{"XXX", " S ", " S "};
	private static final String[] SWORD = new String[]{" X ", " X ", " S "};
	private static final String[] SHOVEL = new String[]{"X", "S", "S"};
	private static final String[] AXE = new String[]{"XX", "XS", " S"};
	private static final String[] COMPACT_BLOCK = new String[]{"XXX", "XXX", "XXX"};
	private static final String[] BRICKS = new String[]{"XX", "XX"};
	
	public static void addRecipes(){
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRBlocks.blockBasaltBrick), new Object[] {
			BRICKS, 'X', PRBlocks.blockBasalt }));
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRBlocks.blockBasaltChiseled),
			new Object[] { BRICKS, 'X', PRBlocks.blockBasaltBrick }));
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRBlocks.blockMarbleBrick), new Object[] {
			BRICKS, 'X', PRBlocks.blockMarble }));
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.RubyPickaxe), new Object[] {
			PICKAXE, 'X', "gemRuby", 'S', "stickWood" }));
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.RubySword), new Object[] {
			SWORD, 'X', "gemRuby", 'S', "stickWood" }));
	GameRegistry.addRecipe(new ItemStack(PRItems.RubyAxe), new Object[] { " CC",
			" SC", " S ", 'C', PRItems.itemRuby, 'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(PRItems.RubyShovel), new Object[] { " C ",
			" S ", " S ", 'C', PRItems.itemRuby, 'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(PRItems.RubyHoe), new Object[] { " CC",
			" S ", " S ", 'C', PRItems.itemRuby, 'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(PRItems.PeridiotPickaxe), new Object[] {
			"CCC", " S ", " S ", 'C', PRItems.itemPeridiot, 'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(PRItems.PeridiotSword), new Object[] {
			" C ", " C ", " S ", 'C', PRItems.itemPeridiot, 'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(PRItems.PeridiotAxe), new Object[] {
			" CC", " SC", " S ", 'C', PRItems.itemPeridiot, 'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(PRItems.PeridiotShovel), new Object[] {
			" C ", " S ", " S ", 'C', PRItems.itemPeridiot, 'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(PRItems.PeridiotHoe), new Object[] {
			" CC", " S ", " S ", 'C', PRItems.itemPeridiot, 'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(PRItems.SapphirePickaxe), new Object[] {
			"CCC", " S ", " S ", 'C', PRItems.itemSapphire, 'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(PRItems.SapphireSword), new Object[] {
			" C ", " C ", " S ", 'C', PRItems.itemSapphire, 'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(PRItems.SapphireAxe), new Object[] {
			" CC", " SC", " S ", 'C', PRItems.itemSapphire, 'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(PRItems.SapphireShovel), new Object[] {
			" C ", " S ", " S ", 'C', PRItems.itemSapphire, 'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(PRItems.SapphireHoe), new Object[] {
			" CC", " S ", " S ", 'C', PRItems.itemSapphire, 'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(PRBlocks.blockCopperBlock), new Object[] {
			"CCC", "CCC", "CCC", 'C', PRItems.itemCopperIngot });
	GameRegistry.addRecipe(new ItemStack(PRBlocks.blockTinBlock), new Object[] {
			"CCC", "CCC", "CCC", 'C', PRItems.itemTinIngot });
	GameRegistry.addRecipe(new ItemStack(PRItems.itemAthame), new Object[] { "   ",
			" C ", "S  ", 'S', Items.stick, 'C', PRItems.itemSilverIngot });
	GameRegistry.addRecipe(new ItemStack(PRBlocks.blockSilverBlock), new Object[] {
			"CCC", "CCC", "CCC", 'C', PRItems.itemSilverIngot });
	GameRegistry.addRecipe(new ItemStack(PRItems.itemPeridiotHandsaw),
			new Object[] { "SSS", " II", " PP", 'S', Items.stick, 'I',
					Items.iron_ingot, 'P', PRItems.itemPeridiot });
	GameRegistry.addRecipe(new ItemStack(PRItems.itemSapphireHandsaw),
			new Object[] { "SSS", " II", " ZZ", 'S', Items.stick, 'I',
					Items.iron_ingot, 'Z', PRItems.itemSapphire });
	GameRegistry.addRecipe(new ItemStack(PRItems.itemRubyHandsaw), new Object[] {
			"SSS", " II", " RR", 'S', Items.stick, 'I', Items.iron_ingot,
			'R', PRItems.itemRuby });
	GameRegistry.addRecipe(new ItemStack(PRItems.itemIronHandsaw), new Object[] {
			"SSS", " II", " II", 'S', Items.stick, 'I', Items.iron_ingot });
	GameRegistry.addRecipe(new ItemStack(PRItems.itemDiamondHandsaw), new Object[] {
			"SSS", " II", " DD", 'S', Items.stick, 'I', Items.iron_ingot,
			'D', Items.diamond });
	GameRegistry.addRecipe(new ItemStack(PRItems.itemScrewdriver), new Object[] {
			"   ", "S  ", " T ", 'S', Items.iron_ingot, 'T', Items.stick });
	GameRegistry.addRecipe(new ItemStack(PRItems.itemCanvas), new Object[] { "SSS",
			"STS", "SSS", 'S', Items.string, 'T', Items.stick });
	GameRegistry.addRecipe(new ItemStack(PRItems.itemCanvasBag), new Object[] {
			"SSS", "S S", "SSS", 'S', PRItems.itemCanvas });
	GameRegistry.addRecipe(new ItemStack(PRItems.itemDrawplate), new Object[] {
			" I ", "IDI", " I ", 'I', Blocks.iron_block, 'D',
			Blocks.diamond_block });
	GameRegistry.addRecipe(new ItemStack(PRItems.itemFineCopperWire), new Object[] {
			"   ", "CD ", "   ", 'I', Blocks.iron_block, 'D',
			Blocks.diamond_block });
	GameRegistry.addRecipe(new ItemStack(PRItems.itemFineIronWire),
			new Object[] { "   ", "CD ", "   ", 'C', Items.iron_ingot, 'D',
		PRItems.itemDrawplate });
	GameRegistry.addRecipe(new ItemStack(PRItems.itemWoolCard), new Object[] {
			"F  ", "W  ", "S  ", 'F', PRItems.itemFineIronWire, 'W', Blocks.planks,
			'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(Items.string, 4), new Object[] {
			"   ", "WL ", "   ", 'W', PRItems.itemWoolCard, 'L', Blocks.wool });
	}
}
