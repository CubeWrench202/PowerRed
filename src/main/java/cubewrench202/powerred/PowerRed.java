package cubewrench202.powerred;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cubewrench202.powerred.blocks.BlockBasalt;
import cubewrench202.powerred.blocks.BlockBasaltBrick;
import cubewrench202.powerred.blocks.BlockBasaltChiseled;
import cubewrench202.powerred.blocks.BlockBasaltCobblestone;
import cubewrench202.powerred.blocks.BlockBasaltPolished;
import cubewrench202.powerred.blocks.BlockCopperBlock;
import cubewrench202.powerred.blocks.BlockCopperOre;
import cubewrench202.powerred.blocks.BlockMarble;
import cubewrench202.powerred.blocks.BlockMarbleBrick;
import cubewrench202.powerred.blocks.BlockNikoliteOre;
import cubewrench202.powerred.blocks.BlockRubyOre;
import cubewrench202.powerred.blocks.BlockSilerBlock;
import cubewrench202.powerred.blocks.BlockSilverOre;
import cubewrench202.powerred.blocks.BlockTinBlock;
import cubewrench202.powerred.blocks.BlockTinOre;
import cubewrench202.powerred.blocks.blockPeridiotBlock;
import cubewrench202.powerred.blocks.blockPeridiotOre;
import cubewrench202.powerred.blocks.blockRubyBlock;
import cubewrench202.powerred.blocks.blockSapphireBlock;
import cubewrench202.powerred.blocks.blockSapphireOre;
import cubewrench202.powerred.item.ItemAthame;
import cubewrench202.powerred.item.ItemCanvas;
import cubewrench202.powerred.item.ItemCanvasBag;
import cubewrench202.powerred.item.ItemCopperIngot;
import cubewrench202.powerred.item.ItemDiamondHandsaw;
import cubewrench202.powerred.item.ItemDrawplate;
import cubewrench202.powerred.item.ItemFineCopperWire;
import cubewrench202.powerred.item.ItemFineIronWire;
import cubewrench202.powerred.item.ItemIronHandsaw;
import cubewrench202.powerred.item.ItemMotor;
import cubewrench202.powerred.item.ItemNikolite;
import cubewrench202.powerred.item.ItemPeridiot;
import cubewrench202.powerred.item.ItemPeridiotAxe;
import cubewrench202.powerred.item.ItemPeridiotHandsaw;
import cubewrench202.powerred.item.ItemPeridiotHoe;
import cubewrench202.powerred.item.ItemPeridiotPickaxe;
import cubewrench202.powerred.item.ItemPeridiotShovel;
import cubewrench202.powerred.item.ItemPeridiotSword;
import cubewrench202.powerred.item.ItemRuby;
import cubewrench202.powerred.item.ItemRubyAxe;
import cubewrench202.powerred.item.ItemRubyHandsaw;
import cubewrench202.powerred.item.ItemRubyHoe;
import cubewrench202.powerred.item.ItemRubyPickaxe;
import cubewrench202.powerred.item.ItemRubyShovel;
import cubewrench202.powerred.item.ItemRubySword;
import cubewrench202.powerred.item.ItemSapphire;
import cubewrench202.powerred.item.ItemSapphireAxe;
import cubewrench202.powerred.item.ItemSapphireHandsaw;
import cubewrench202.powerred.item.ItemSapphireHoe;
import cubewrench202.powerred.item.ItemSapphirePickaxe;
import cubewrench202.powerred.item.ItemSapphireShovel;
import cubewrench202.powerred.item.ItemSapphireSword;
import cubewrench202.powerred.item.ItemScrewdriver;
import cubewrench202.powerred.item.ItemSilverIngot;
import cubewrench202.powerred.item.ItemTinIngot;
import cubewrench202.powerred.item.ItemWoolCard;
import cubewrench202.powerred.world.OreGeneration;

@Mod(modid = "pr", name = "PowerRed", version = "0.1.0")
public class PowerRed {

	public static Item itemFineIronWire;
	public static Item itemFineCopperWire;
	public static Item itemDrawplate;
	public static Item itemCanvas;
	public static Item itemCanvasBag;
	public static Item itemScrewdriver;
	public static Item itemMotor;
	public static Item itemPeridiotHandsaw;
	public static Item itemSapphireHandsaw;
	public static Item itemRubyHandsaw;
	public static Item itemDiamondHandsaw;
	public static Item itemIronHandsaw;
	public static Item itemBrassIngot;
	public static Item itemRedAlloyIngot;
	public static Item itemBlueAlloyIngot;
	public static Item itemAthame;
	public static Item itemWoolCard;
	public static Item itemRedDoperWafer;
	public static Item itemBlueDoperWafer;
	public static Item itemSiliconWafer;
	public static Item itemZincPlate;
	public static Item itemSiliconBoule;
	public static Item itemCopperIngot;
	public static Item itemNikolite;
	public static Item itemSilverIngot;
	public static Item itemTinIngot;
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
	public static Item itemRuby;
	public static Item itemSapphire;
	public static Item itemPeridiot;
	public static Item RubyPickaxe;
	public static Item RubySword;
	public static Item RubyShovel;
	public static Item RubyAxe;
	public static Item RubyHoe;
	public static Item SapphireSword;
	public static Item SapphireShovel;
	public static Item SapphireAxe;
	public static Item SapphireHoe;
	public static Item SapphirePickaxe;
	public static Item PeridiotPickaxe;
	public static Item PeridiotSword;
	public static Item PeridiotShovel;
	public static Item PeridiotAxe;
	public static Item PeridiotHoe;
	public static Block blockBlockBreaker;
	public static Block blockAlloyFurnace;
	public static Block blockBlockDeployer;

	public static final Item.ToolMaterial PeridiotToolMaterial = EnumHelper
			.addToolMaterial("PeridiotToolMaterial", 3, 1250, 6.0F, 2.0F, 30);
	public static final Item.ToolMaterial RubyToolMaterial = EnumHelper
			.addToolMaterial("RubyToolMaterial", 3, 1250, 6.0F, 2.0F, 30);
	public static final Item.ToolMaterial SapphireToolMaterial = EnumHelper
			.addToolMaterial("SapphireToolMaterial", 3, 1250, 6.0F, 2.0F, 30);
	public static final Item.ToolMaterial AthameToolMaterial = EnumHelper
			.addToolMaterial("AthameToolMaterial", 0, 650, (float) 0.5, 2.0F,
					28);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		itemWoolCard = new ItemWoolCard().setUnlocalizedName("ItemWoolCard")
				.setTextureName("pr:Wool_Card")
				.setCreativeTab(tabPowerRedItems);
		itemDrawplate = new ItemDrawplate().setUnlocalizedName("ItemDrawplate")
				.setTextureName("pr:Drawplate")
				.setCreativeTab(tabPowerRedItems);
		itemCanvas = new ItemCanvas().setUnlocalizedName("ItemCanvas")
				.setTextureName("pr:Canvas").setCreativeTab(tabPowerRedItems);
		blockBasalt = new BlockBasalt(Material.rock)
				.setBlockName("BlockBasalt").setBlockTextureName("pr:Basalt")
				.setCreativeTab(tabPowerRedWorld);
		blockMarble = new BlockMarble(Material.rock)
				.setBlockName("BlockMarble").setBlockTextureName("pr:Marble")
				.setCreativeTab(tabPowerRedWorld);
		blockBasaltBrick = new BlockBasaltBrick(Material.rock)
				.setBlockName("BlockBasaltBrick")
				.setBlockTextureName("pr:Basalt_Brick")
				.setCreativeTab(tabPowerRedWorld);
		blockMarbleBrick = new BlockMarbleBrick(Material.rock)
				.setBlockName("BlockMarbleBrick")
				.setBlockTextureName("pr:Marble_Brick")
				.setCreativeTab(tabPowerRedWorld);
		blockBasaltPolished = new BlockBasaltPolished(Material.rock)
				.setBlockName("BlockBasaltPolished")
				.setBlockTextureName("pr:Basalt_Polished")
				.setCreativeTab(tabPowerRedWorld);
		blockBasaltChiseled = new BlockBasaltChiseled(Material.rock)
				.setBlockName("BlockBasaltChiseled")
				.setBlockTextureName("pr:Basalt_Chiseled")
				.setCreativeTab(tabPowerRedWorld);
		blockBasaltCobblestone = new BlockBasaltCobblestone(Material.rock)
				.setBlockName("BlockBasaltCobblestone")
				.setBlockTextureName("pr:Basalt_Cobblestone")
				.setCreativeTab(tabPowerRedWorld);
		blockRubyOre = new BlockRubyOre(Material.rock)
				.setBlockName("BlockRubyOre")
				.setBlockTextureName("pr:Ruby_Ore")
				.setCreativeTab(tabPowerRedWorld);
		blockRubyBlock = new blockRubyBlock(Material.rock)
				.setBlockName("BlockRubyBlock")
				.setBlockTextureName("pr:Ruby_Block")
				.setCreativeTab(tabPowerRedWorld);
		blockSapphireOre = new blockSapphireOre(Material.rock)
				.setBlockName("BlockSapphireOre")
				.setBlockTextureName("pr:Sapphire_Ore")
				.setCreativeTab(tabPowerRedWorld);
		blockSapphireBlock = new blockSapphireBlock(Material.rock)
				.setBlockName("BlockSapphireBlock")
				.setBlockTextureName("pr:Sapphire_Block")
				.setCreativeTab(tabPowerRedWorld);
		blockPeridiotOre = new blockPeridiotOre(Material.rock)
				.setBlockName("BlockPeridiotOre")
				.setBlockTextureName("pr:Peridiot_Ore")
				.setCreativeTab(tabPowerRedWorld);
		blockPeridiotBlock = new blockPeridiotBlock(Material.rock)
				.setBlockName("BlockPeridiotBlock")
				.setBlockTextureName("pr:Peridiot_Block")
				.setCreativeTab(tabPowerRedWorld);
		itemPeridiot = new ItemPeridiot().setUnlocalizedName("ItemPeridiot")
				.setTextureName("pr:Peridiot").setCreativeTab(tabPowerRedItems);
		itemRuby = new ItemRuby().setUnlocalizedName("ItemRuby")
				.setTextureName("pr:Ruby").setCreativeTab(tabPowerRedItems);
		itemFineIronWire = new ItemFineIronWire()
				.setUnlocalizedName("ItemFineIronWire")
				.setTextureName("pr:FineIronWire")
				.setCreativeTab(tabPowerRedItems);
		itemFineCopperWire = new ItemFineCopperWire()
				.setUnlocalizedName("ItemFineCopperWire")
				.setTextureName("pr:FineCopperWire")
				.setCreativeTab(tabPowerRedItems);
		itemScrewdriver = new ItemScrewdriver()
				.setUnlocalizedName("ItemScrewdriver")
				.setTextureName("pr:Screwdriver")
				.setCreativeTab(tabPowerRedTools);

		itemSapphire = new ItemSapphire().setUnlocalizedName("ItemSapphire")
				.setTextureName("pr:Sapphire").setCreativeTab(tabPowerRedItems);
		RubyPickaxe = new ItemRubyPickaxe(RubyToolMaterial)
				.setUnlocalizedName("ItemRubyPickaxe")
				.setTextureName("pr:Ruby_Pickaxe")
				.setCreativeTab(tabPowerRedTools);
		RubyShovel = new ItemRubyShovel(RubyToolMaterial)
				.setUnlocalizedName("ItemRubyShovel")
				.setTextureName("pr:Ruby_Shovel")
				.setCreativeTab(tabPowerRedTools);
		RubyAxe = new ItemRubyAxe(RubyToolMaterial)
				.setUnlocalizedName("ItemRubyAxe")
				.setTextureName("pr:Ruby_Axe").setCreativeTab(tabPowerRedTools);
		RubyHoe = new ItemRubyHoe(RubyToolMaterial)
				.setUnlocalizedName("ItemRubyHoe")
				.setTextureName("pr:Ruby_Hoe").setCreativeTab(tabPowerRedTools);
		RubySword = new ItemRubySword(RubyToolMaterial)
				.setUnlocalizedName("ItemRubySword")
				.setTextureName("pr:Ruby_Sword")
				.setCreativeTab(tabPowerRedTools);
		PeridiotPickaxe = new ItemPeridiotPickaxe(PeridiotToolMaterial)
				.setUnlocalizedName("ItemPeridiotPickaxe")
				.setTextureName("pr:Peridiot_Pickaxe")
				.setCreativeTab(tabPowerRedTools);
		PeridiotShovel = new ItemPeridiotShovel(PeridiotToolMaterial)
				.setUnlocalizedName("ItemPeridiotShovel")
				.setTextureName("pr:Peridiot_Shovel")
				.setCreativeTab(tabPowerRedTools);
		PeridiotAxe = new ItemPeridiotAxe(PeridiotToolMaterial)
				.setUnlocalizedName("ItemPeridiotAxe")
				.setTextureName("pr:Peridiot_Axe")
				.setCreativeTab(tabPowerRedTools);
		PeridiotHoe = new ItemPeridiotHoe(PeridiotToolMaterial)
				.setUnlocalizedName("ItemPeridiotHoe")
				.setTextureName("pr:Peridiot_Hoe")
				.setCreativeTab(tabPowerRedTools);
		PeridiotSword = new ItemPeridiotSword(PeridiotToolMaterial)
				.setUnlocalizedName("ItemPeridiotSword")
				.setTextureName("pr:Peridiot_Sword")
				.setCreativeTab(tabPowerRedTools);
		SapphirePickaxe = new ItemSapphirePickaxe(SapphireToolMaterial)
				.setUnlocalizedName("ItemSapphirePickaxe")
				.setTextureName("pr:Sapphire_Pickaxe")
				.setCreativeTab(tabPowerRedTools);
		SapphireShovel = new ItemSapphireShovel(SapphireToolMaterial)
				.setUnlocalizedName("ItemSapphireShovel")
				.setTextureName("pr:Sapphire_Shovel")
				.setCreativeTab(tabPowerRedTools);
		SapphireAxe = new ItemSapphireAxe(SapphireToolMaterial)
				.setUnlocalizedName("ItemSapphireAxe")
				.setTextureName("pr:Sapphire_Axe")
				.setCreativeTab(tabPowerRedTools);
		SapphireHoe = new ItemSapphireHoe(SapphireToolMaterial)
				.setUnlocalizedName("ItemSapphireHoe")
				.setTextureName("pr:Sapphire_Hoe")
				.setCreativeTab(tabPowerRedTools);
		SapphireSword = new ItemSapphireSword(SapphireToolMaterial)
				.setUnlocalizedName("ItemSapphireSword")
				.setTextureName("pr:Sapphire_Sword")
				.setCreativeTab(tabPowerRedTools);
		blockCopperOre = new BlockCopperOre(Material.rock)
				.setBlockName("BlockCopperOre")
				.setBlockTextureName("pr:Copper_Ore")
				.setCreativeTab(tabPowerRedWorld);
		blockCopperBlock = new BlockCopperBlock(Material.rock)
				.setBlockName("BlockCopperBlock")
				.setBlockTextureName("pr:Copper_Block")
				.setCreativeTab(tabPowerRedWorld);
		blockSilverOre = new BlockSilverOre(Material.rock)
				.setBlockName("BlockSilverOre")
				.setBlockTextureName("pr:Silver_Ore")
				.setCreativeTab(tabPowerRedWorld);
		blockSilverBlock = new BlockSilerBlock(Material.rock)
				.setBlockName("BlockSilverBlock")
				.setBlockTextureName("pr:Silver_Block")
				.setCreativeTab(tabPowerRedWorld);
		blockNikoliteOre = new BlockNikoliteOre(Material.rock)
				.setBlockName("BlockNikoliteOre")
				.setBlockTextureName("pr:Nikolite_Ore")
				.setCreativeTab(tabPowerRedWorld);
		blockTinOre = new BlockTinOre(Material.rock)
				.setBlockName("BlockTinOre").setBlockTextureName("pr:Tin_Ore")
				.setCreativeTab(tabPowerRedWorld);
		blockTinBlock = new BlockTinBlock(Material.rock)
				.setBlockName("BlockTinBlock")
				.setBlockTextureName("pr:Tin_Block")
				.setCreativeTab(tabPowerRedWorld);
		itemCopperIngot = new ItemCopperIngot()
				.setUnlocalizedName("ItemCopperIngot")
				.setTextureName("pr:Copper_Ingot")
				.setCreativeTab(tabPowerRedItems);
		itemNikolite = new ItemNikolite().setUnlocalizedName("ItemNikolite")
				.setTextureName("pr:Nikolite").setCreativeTab(tabPowerRedItems);
		itemSilverIngot = new ItemSilverIngot()
				.setUnlocalizedName("ItemSilverIngot")
				.setTextureName("pr:Silver_Ingot")
				.setCreativeTab(tabPowerRedItems);
		itemTinIngot = new ItemTinIngot().setUnlocalizedName("ItemTinIngot")
				.setTextureName("pr:Tin_Ingot")
				.setCreativeTab(tabPowerRedItems);
		itemAthame = new ItemAthame(AthameToolMaterial)
				.setUnlocalizedName("ItemAthame").setTextureName("pr:Athame")
				.setCreativeTab(tabPowerRedTools);
		itemMotor = new ItemMotor().setUnlocalizedName("ItemMotor")
				.setTextureName("pr:Motor").setCreativeTab(tabPowerRedItems);
		itemPeridiotHandsaw = new ItemPeridiotHandsaw()
				.setUnlocalizedName("ItemPeridiotHandsaw")
				.setTextureName("pr:Peridiot_Handsaw")
				.setCreativeTab(tabPowerRedTools);
		itemSapphireHandsaw = new ItemSapphireHandsaw()
				.setUnlocalizedName("ItemSapphireHandsaw")
				.setTextureName("pr:Sapphire_Handsaw")
				.setCreativeTab(tabPowerRedTools);
		itemRubyHandsaw = new ItemRubyHandsaw()
				.setUnlocalizedName("ItemRubyHandsaw")
				.setTextureName("pr:Ruby_Handsaw")
				.setCreativeTab(tabPowerRedTools);
		itemDiamondHandsaw = new ItemDiamondHandsaw()
				.setUnlocalizedName("ItemDiamondHandsaw")
				.setTextureName("pr:Diamond_Handsaw")
				.setCreativeTab(tabPowerRedTools);
		itemIronHandsaw = new ItemIronHandsaw()
				.setUnlocalizedName("ItemIronHandsaw")
				.setTextureName("pr:Iron_Handsaw")
				.setCreativeTab(tabPowerRedTools);
		itemCanvasBag = new ItemCanvasBag().setUnlocalizedName("ItemCanvasBag")
				.setTextureName("pr:Canvas_Bag_White")
				.setCreativeTab(tabPowerRedItems);
		GameRegistry.registerBlock(blockBasalt, blockBasalt
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemMotor, itemMotor.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(itemTinIngot, itemTinIngot
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemSilverIngot, itemSilverIngot
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemNikolite, itemNikolite
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemCopperIngot, itemCopperIngot
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
		GameRegistry.registerItem(itemPeridiot, itemPeridiot
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRuby, itemRuby.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(itemSapphire, itemSapphire
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(RubyPickaxe, RubyPickaxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(RubyShovel, RubyShovel.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(RubyAxe, RubyAxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(RubyHoe, RubyHoe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(RubySword, RubySword.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(itemAthame, itemAthame.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(itemCanvas, itemCanvas.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(itemCanvasBag, itemCanvasBag
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemDrawplate, itemDrawplate
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemWoolCard, itemWoolCard
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SapphirePickaxe, SapphirePickaxe
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SapphireShovel, SapphireShovel
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SapphireAxe, SapphireAxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(SapphireHoe, SapphireHoe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(SapphireSword, SapphireSword
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(PeridiotPickaxe, PeridiotPickaxe
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(PeridiotShovel, PeridiotShovel
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(PeridiotAxe, PeridiotAxe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(PeridiotHoe, PeridiotHoe.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(PeridiotSword, PeridiotSword
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemScrewdriver, itemScrewdriver
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemSapphireHandsaw, itemSapphireHandsaw
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRubyHandsaw, itemRubyHandsaw
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemPeridiotHandsaw, itemPeridiotHandsaw
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemIronHandsaw, itemIronHandsaw
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemDiamondHandsaw, itemDiamondHandsaw
				.getUnlocalizedName().substring(5));
		GameRegistry.registerWorldGenerator(new OreGeneration(), 0);

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		GameRegistry.addRecipe(new ItemStack(blockBasaltBrick), new Object[] {
				"CC ", "CC ", "   ", 'C', blockBasalt });
		GameRegistry.addRecipe(new ItemStack(blockBasaltChiseled),
				new Object[] { "CC ", "CC ", "   ", 'C', blockBasaltBrick });
		GameRegistry.addRecipe(new ItemStack(blockMarbleBrick), new Object[] {
				"CC ", "CC ", "   ", 'C', blockMarble });
		GameRegistry.addRecipe(new ItemStack(RubyPickaxe), new Object[] {
				"CCC", " S ", " S ", 'C', itemRuby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(RubySword), new Object[] { " C ",
				" C ", " S ", 'C', itemRuby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(RubyAxe), new Object[] { " CC",
				" SC", " S ", 'C', itemRuby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(RubyShovel), new Object[] { " C ",
				" S ", " S ", 'C', itemRuby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(RubyHoe), new Object[] { " CC",
				" S ", " S ", 'C', itemRuby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(PeridiotPickaxe), new Object[] {
				"CCC", " S ", " S ", 'C', itemPeridiot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(PeridiotSword), new Object[] {
				" C ", " C ", " S ", 'C', itemPeridiot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(PeridiotAxe), new Object[] {
				" CC", " SC", " S ", 'C', itemPeridiot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(PeridiotShovel), new Object[] {
				" C ", " S ", " S ", 'C', itemPeridiot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(PeridiotHoe), new Object[] {
				" CC", " S ", " S ", 'C', itemPeridiot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(SapphirePickaxe), new Object[] {
				"CCC", " S ", " S ", 'C', itemSapphire, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(SapphireSword), new Object[] {
				" C ", " C ", " S ", 'C', itemSapphire, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(SapphireAxe), new Object[] {
				" CC", " SC", " S ", 'C', itemSapphire, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(SapphireShovel), new Object[] {
				" C ", " S ", " S ", 'C', itemSapphire, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(SapphireHoe), new Object[] {
				" CC", " S ", " S ", 'C', itemSapphire, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(blockCopperBlock), new Object[] {
				"CCC", "CCC", "CCC", 'C', itemCopperIngot });
		GameRegistry.addRecipe(new ItemStack(blockTinBlock), new Object[] {
				"CCC", "CCC", "CCC", 'C', itemTinIngot });
		GameRegistry.addRecipe(new ItemStack(itemAthame), new Object[] { "   ",
				" C ", "S  ", 'S', Items.stick, 'C', itemSilverIngot });
		GameRegistry.addRecipe(new ItemStack(blockSilverBlock), new Object[] {
				"CCC", "CCC", "CCC", 'C', itemSilverIngot });
		GameRegistry.addRecipe(new ItemStack(itemPeridiotHandsaw),
				new Object[] { "SSS", " II", " PP", 'S', Items.stick, 'I',
						Items.iron_ingot, 'P', itemPeridiot });
		GameRegistry.addRecipe(new ItemStack(itemSapphireHandsaw),
				new Object[] { "SSS", " II", " ZZ", 'S', Items.stick, 'I',
						Items.iron_ingot, 'Z', itemSapphire });
		GameRegistry.addRecipe(new ItemStack(itemRubyHandsaw), new Object[] {
				"SSS", " II", " RR", 'S', Items.stick, 'I', Items.iron_ingot,
				'R', itemRuby });
		GameRegistry.addRecipe(new ItemStack(itemIronHandsaw), new Object[] {
				"SSS", " II", " II", 'S', Items.stick, 'I', Items.iron_ingot });
		GameRegistry.addRecipe(new ItemStack(itemDiamondHandsaw), new Object[] {
				"SSS", " II", " DD", 'S', Items.stick, 'I', Items.iron_ingot,
				'D', Items.diamond });
		GameRegistry.addRecipe(new ItemStack(itemScrewdriver), new Object[] {
				"   ", " S ", "T  ", 'S', Items.iron_ingot, 'T', Items.stick });
		GameRegistry.addRecipe(new ItemStack(itemCanvas), new Object[] { "SSS",
				"STS", "SSS", 'S', Items.string, 'T', Items.stick });
		GameRegistry.addRecipe(new ItemStack(itemCanvasBag), new Object[] {
				"SSS", "S S", "SSS", 'S', itemCanvas });
		GameRegistry.addRecipe(new ItemStack(itemDrawplate), new Object[] {
				" I ", "IDI", " I ", 'I', Blocks.iron_block, 'D',
				Blocks.diamond_block });
		GameRegistry.addRecipe(new ItemStack(itemFineCopperWire), new Object[] {
				"   ", "CD ", "   ", 'I', Blocks.iron_block, 'D',
				Blocks.diamond_block });
		GameRegistry.addRecipe(new ItemStack(itemFineIronWire),
				new Object[] { "   ", "CD ", "   ", 'C', Items.iron_ingot, 'D',
						itemDrawplate });
		GameRegistry.addRecipe(new ItemStack(itemWoolCard), new Object[] {
				"F  ", "W  ", "S  ", 'F', itemFineIronWire, 'W', Blocks.planks,
				'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(Items.string, 4), new Object[] {
				"   ", "WL ", "   ", 'W', itemWoolCard, 'L', Blocks.wool });

		GameRegistry.addSmelting(blockCopperOre,
				new ItemStack(itemCopperIngot), 0.5F);
		GameRegistry
				.addSmelting(blockTinOre, new ItemStack(itemTinIngot), 0.5F);
		GameRegistry.addSmelting(blockSilverOre,
				new ItemStack(itemSilverIngot), 0.5F);
		GameRegistry.addSmelting(blockBasaltBrick, new ItemStack(
				blockBasaltPolished), 0.5F);
		GameRegistry.addSmelting(blockBasaltCobblestone, new ItemStack(
				blockBasalt), 0.5F);
	}

	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {

	}

	public static CreativeTabs tabPowerRedMachines = new CreativeTabs(
			"tabPowerRedMachines") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(Items.apple).getItem();
		}
	};

	public static CreativeTabs tabPowerRedItems = new CreativeTabs(
			"tabPowerRedItems") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(itemMotor).getItem();
		}
	};

	public static CreativeTabs tabPowerRedWorld = new CreativeTabs(
			"tabPowerRedWorld") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(blockBasaltBrick).getItem();
		}
	};
	public static CreativeTabs tabPowerRedTools = new CreativeTabs(
			"tabPowerRedTools") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(itemScrewdriver).getItem();
		}
	};
};