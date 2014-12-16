package cubewrench202.powerred.common;

import cpw.mods.fml.common.registry.GameRegistry;
import cubewrench202.powerred.PowerRed;
import cubewrench202.powerred.blocks.*;
import cubewrench202.powerred.tileentities.TileEntityBlockBreaker;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PRBlocks {

	public static Block blockCopperOre;
	public static Block blockCopperBlock;
	public static Block blockSilverOre;
	public static Block blockSilverBlock;
	public static Block blockNikoliteOre;
	public static Block blockTinOre;
	public static Block blockTinBlock;
	public static Block blockBasalt;
	public static Block blockMarble;
	public static Block blockBasaltBrick;
	public static Block blockMarbleBrick;
	public static Block blockBasaltPolished;
	public static Block blockBasaltChiseled;
	public static Block blockBasaltCobblestone;
	public static Block blockRubyOre;
	public static Block blockRubyBlock;
	public static Block blockSapphireOre;
	public static Block blockSapphireBlock;
	public static Block blockPeridiotOre;
	public static Block blockPeridiotBlock;
	public static Block blockBlockBreaker = new BlockBlockBreaker();
	public static Block blockAlloyFurnace;
	public static Block blockBlockDeployer;
	
	public static void registerBlocks(){
		blockBasalt = new BlockBasalt(Material.rock)
			.setBlockName("BlockBasalt").setBlockTextureName("pr:Basalt")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockMarble = new BlockMarble(Material.rock)
			.setBlockName("BlockMarble").setBlockTextureName("pr:Marble")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockBasaltBrick = new BlockBasaltBrick(Material.rock)
			.setBlockName("BlockBasaltBrick")
			.setBlockTextureName("pr:Basalt_Brick")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockMarbleBrick = new BlockMarbleBrick(Material.rock)
			.setBlockName("BlockMarbleBrick")
			.setBlockTextureName("pr:Marble_Brick")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockBasaltPolished = new BlockBasaltPolished(Material.rock)
			.setBlockName("BlockBasaltPolished")
			.setBlockTextureName("pr:Basalt_Polished")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockBasaltChiseled = new BlockBasaltChiseled(Material.rock)
			.setBlockName("BlockBasaltChiseled")
			.setBlockTextureName("pr:Basalt_Chiseled")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockBasaltCobblestone = new BlockBasaltCobblestone(Material.rock)
			.setBlockName("BlockBasaltCobblestone")
			.setBlockTextureName("pr:Basalt_Cobblestone")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockRubyOre = new BlockRubyOre(Material.rock)
			.setBlockName("BlockRubyOre")
			.setBlockTextureName("pr:Ruby_Ore")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockRubyBlock = new blockRubyBlock(Material.rock)
			.setBlockName("BlockRubyBlock")
			.setBlockTextureName("pr:Ruby_Block")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockSapphireOre = new blockSapphireOre(Material.rock)
			.setBlockName("BlockSapphireOre")
			.setBlockTextureName("pr:Sapphire_Ore")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockSapphireBlock = new blockSapphireBlock(Material.rock)
			.setBlockName("BlockSapphireBlock")
			.setBlockTextureName("pr:Sapphire_Block")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockPeridiotOre = new blockPeridiotOre(Material.rock)
			.setBlockName("BlockPeridiotOre")
			.setBlockTextureName("pr:Peridiot_Ore")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockPeridiotBlock = new blockPeridiotBlock(Material.rock)
			.setBlockName("BlockPeridiotBlock")
			.setBlockTextureName("pr:Peridiot_Block")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockCopperOre = new BlockCopperOre(Material.rock)
			.setBlockName("BlockCopperOre")
			.setBlockTextureName("pr:Copper_Ore")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockCopperBlock = new BlockCopperBlock(Material.rock)
			.setBlockName("BlockCopperBlock")
			.setBlockTextureName("pr:Copper_Block")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockSilverOre = new BlockSilverOre(Material.rock)
			.setBlockName("BlockSilverOre")
			.setBlockTextureName("pr:Silver_Ore")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockSilverBlock = new BlockSilerBlock(Material.rock)
			.setBlockName("BlockSilverBlock")
			.setBlockTextureName("pr:Silver_Block")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockNikoliteOre = new BlockNikoliteOre(Material.rock)
			.setBlockName("BlockNikoliteOre")
			.setBlockTextureName("pr:Nikolite_Ore")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockTinOre = new BlockTinOre(Material.rock)
			.setBlockName("BlockTinOre").setBlockTextureName("pr:Tin_Ore")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		blockTinBlock = new BlockTinBlock(Material.rock)
			.setBlockName("BlockTinBlock")
			.setBlockTextureName("pr:Tin_Block")
			.setCreativeTab(PowerRed.tabPowerRedWorld);
		
		GameRegistry.registerBlock(blockBasalt, blockBasalt
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockCopperOre, blockCopperOre
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockCopperBlock, blockCopperBlock
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockSilverOre, blockSilverOre
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockSilverBlock, blockSilverBlock
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockNikoliteOre, blockNikoliteOre
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockTinOre, blockTinOre
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockTinBlock, blockTinBlock
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockMarble, blockMarble
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockBasaltBrick, blockBasaltBrick
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockMarbleBrick, blockMarbleBrick
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockBasaltPolished, blockBasaltPolished
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockBasaltChiseled, blockBasaltChiseled
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockBasaltCobblestone,
				blockBasaltCobblestone.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockRubyOre, blockRubyOre
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockRubyBlock, blockRubyBlock
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockSapphireOre, blockSapphireOre
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockSapphireBlock, blockSapphireBlock
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockPeridiotOre, blockPeridiotOre
				.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockPeridiotBlock, blockPeridiotBlock
				.getUnlocalizedName().substring(5));
        GameRegistry.registerTileEntity(TileEntityBlockBreaker.class "blockBreaker");
        GameRegistry.registerBlock(blockBlockBreaker, blockBlockBreaker
                .getUnlocalizedName().substring(5));
	}
}
