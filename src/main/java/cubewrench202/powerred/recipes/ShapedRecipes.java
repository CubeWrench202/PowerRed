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
	private static final String[] HOE = new String[]{"XX", " S", " S"};
	private static final String[] COMPACT_BLOCK = new String[]{"XXX", "XXX", "XXX"};
	private static final String[] BRICKS = new String[]{"XX", "XX"};
	
	public static void addRecipes(){
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRBlocks.blockBasaltBrick), new Object[] {
			BRICKS, 'X', PRBlocks.blockBasalt }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRBlocks.blockBasaltChiseled), new Object[] { 
			BRICKS, 'X', PRBlocks.blockBasaltBrick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRBlocks.blockMarbleBrick), new Object[] {
			BRICKS, 'X', PRBlocks.blockMarble }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.RubyPickaxe), new Object[] {
			PICKAXE, 'X', "gemRuby", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.RubySword), new Object[] {
			SWORD, 'X', "gemRuby", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.RubyAxe), new Object[] {
			AXE, 'X', "gemRuby", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.RubyShovel), new Object[] {
			SHOVEL, 'X', "gemRuby", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.RubyHoe), new Object[] {
			HOE, 'X', "gemRuby", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.PeridiotPickaxe), new Object[] {
			PICKAXE, 'X', "gemPeridiot", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.PeridiotSword), new Object[] {
			SWORD, 'X', "gemPeridiot", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.PeridiotAxe), new Object[] {
			AXE, 'X', "gemPeridiot", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.PeridiotShovel), new Object[] {
			SHOVEL, 'X', "gemPeridiot", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.PeridiotHoe), new Object[] {
			HOE, 'X', "gemPeridiot", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.SapphirePickaxe), new Object[] {
			PICKAXE, 'X', "gemSapphire", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.SapphireSword), new Object[] {
			SWORD, 'X', "gemSapphire", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.SapphireAxe), new Object[] {
			AXE, 'X', "gemSapphire", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.SapphireShovel), new Object[] {
			SHOVEL, 'X', "gemSapphire", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.SapphireHoe), new Object[] {
			HOE, 'X', "gemSapphire", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRBlocks.blockCopperBlock), new Object[] {
			COMPACT_BLOCK, 'X', "ingotCopper" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRBlocks.blockTinBlock), new Object[] {
			COMPACT_BLOCK, 'X', "ingotTin" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRBlocks.blockSilverBlock), new Object[] {
			COMPACT_BLOCK, 'X', "ingotSilver" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRBlocks.blockRubyBlock), new Object[] {
			COMPACT_BLOCK, 'X', "gemRuby" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRBlocks.blockSapphireBlock), new Object[] {
			COMPACT_BLOCK, 'X', "gemSapphire" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRBlocks.blockPeridiotBlock), new Object[] {
			COMPACT_BLOCK, 'X', "gemPeridiot" }));	
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.itemAthame), new Object[] {
			" I", "S ", 'S', "stickWood", 'I', "ingotSilver" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.itemPeridiotHandsaw), new Object[] { 
			"SSS", " II", " PP", 'S', "stickWood", 'I', "ingotIron", 'P', "gemPeridiot" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.itemSapphireHandsaw),
			new Object[] { "SSS", " II", " ZZ", 'S', "stickWood", 'I', "ingotIron", 'Z', "gemSapphire" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.itemRubyHandsaw), new Object[] {
			"SSS", " II", " RR", 'S', "stickWood", 'I', "ingotIron", 'R', "gemRuby" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.itemIronHandsaw), new Object[] {
			"SSS", " II", " II", 'S', "stickWood", 'I', "ingotIron" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.itemDiamondHandsaw), new Object[] {
			"SSS", " II", " DD", 'S', "stickWood", 'I', "ingotIron", 'D', "gemDiamond" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.itemScrewdriver), new Object[] {
			"I  ", " S ", 'I', "ingotIron", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.itemCanvas), new Object[] { 
			"SSS", "STS", "SSS", 'S', Items.string, 'T', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.itemCanvasBag), new Object[] {
			"SSS", "S S", "SSS", 'S', PRItems.itemCanvas }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.itemDrawplate), new Object[] {
			" I ", "IDI", " I ", 'I', "blockIron", 'D', "blockDiamond" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.itemFineCopperWire), new Object[] {
			"CD ", 'C', "blockIron", 'D',
			"blockDiamond" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.itemFineIronWire), new Object[] { 
			"CD ", 'C', "ingotIron", 'D', PRItems.itemDrawplate }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PRItems.itemWoolCard), new Object[] {
			"F  ", "W  ", "S  ", 'F', PRItems.itemFineIronWire, 'W', "plankWood", 'S', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.string, 4), new Object[] {
			"WL ", 'W', PRItems.itemWoolCard, 'L', Blocks.wool }));
	}
}
