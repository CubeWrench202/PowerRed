package cubewrench202.powerred.common;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cubewrench202.powerred.PowerRed;
import cubewrench202.powerred.item.*;
import cubewrench202.powerred.world.OreGeneration;

public class PRItems {
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

	public static void registerItems() {
		itemWoolCard = new ItemWoolCard().setUnlocalizedName("ItemWoolCard")
				.setTextureName("pr:Wool_Card")
				.setCreativeTab(PowerRed.tabPowerRedItems);
		itemDrawplate = new ItemDrawplate().setUnlocalizedName("ItemDrawplate")
				.setTextureName("pr:Drawplate")
				.setCreativeTab(PowerRed.tabPowerRedItems);
		itemCanvas = new ItemCanvas().setUnlocalizedName("ItemCanvas")
				.setTextureName("pr:Canvas")
				.setCreativeTab(PowerRed.tabPowerRedItems);

		itemPeridiot = new PRItem("ItemPeridiot", "pr:Peridiot", "gemPeridiot");
		itemRuby = new PRItem("ItemRuby", "pr:Ruby", "gemRuby");
		itemFineIronWire = new ItemFineIronWire()
				.setUnlocalizedName("ItemFineIronWire")
				.setTextureName("pr:FineIronWire")
				.setCreativeTab(PowerRed.tabPowerRedItems);
		itemFineCopperWire = new ItemFineCopperWire()
				.setUnlocalizedName("ItemFineCopperWire")
				.setTextureName("pr:FineCopperWire")
				.setCreativeTab(PowerRed.tabPowerRedItems);
		itemScrewdriver = new ItemScrewdriver()
				.setUnlocalizedName("ItemScrewdriver")
				.setTextureName("pr:Screwdriver")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		itemRedAlloyIngot = new ItemRedAlloyIngot()
				.setUnlocalizedName("ItemRedAlloyIngot")
				.setTextureName("pr:Red_Alloy_Ingot")
				.setCreativeTab(PowerRed.tabPowerRedItems);
		itemBlueAlloyIngot = new ItemBlueAlloyIngot()
				.setUnlocalizedName("ItemBlueAlloyIngot")
				.setTextureName("pr:Blue_Alloy_Ingot")
				.setCreativeTab(PowerRed.tabPowerRedItems);
		itemBrassIngot = new ItemBrassIngot()
				.setUnlocalizedName("ItemBrassIngot")
				.setTextureName("pr:Brass_Ingot")
				.setCreativeTab(PowerRed.tabPowerRedItems);

		itemSapphire = new PRItem("ItemSapphire", "pr:Sapphire", "gemSapphire");
		RubyPickaxe = new ItemRubyPickaxe(PowerRed.RubyToolMaterial)
				.setUnlocalizedName("ItemRubyPickaxe")
				.setTextureName("pr:Ruby_Pickaxe")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		RubyShovel = new ItemRubyShovel(PowerRed.RubyToolMaterial)
				.setUnlocalizedName("ItemRubyShovel")
				.setTextureName("pr:Ruby_Shovel")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		RubyAxe = new ItemRubyAxe(PowerRed.RubyToolMaterial)
				.setUnlocalizedName("ItemRubyAxe")
				.setTextureName("pr:Ruby_Axe")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		RubyHoe = new ItemRubyHoe(PowerRed.RubyToolMaterial)
				.setUnlocalizedName("ItemRubyHoe")
				.setTextureName("pr:Ruby_Hoe")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		RubySword = new ItemRubySword(PowerRed.RubyToolMaterial)
				.setUnlocalizedName("ItemRubySword")
				.setTextureName("pr:Ruby_Sword")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		PeridiotPickaxe = new ItemPeridiotPickaxe(PowerRed.PeridiotToolMaterial)
				.setUnlocalizedName("ItemPeridiotPickaxe")
				.setTextureName("pr:Peridiot_Pickaxe")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		PeridiotShovel = new ItemPeridiotShovel(PowerRed.PeridiotToolMaterial)
				.setUnlocalizedName("ItemPeridiotShovel")
				.setTextureName("pr:Peridiot_Shovel")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		PeridiotAxe = new ItemPeridiotAxe(PowerRed.PeridiotToolMaterial)
				.setUnlocalizedName("ItemPeridiotAxe")
				.setTextureName("pr:Peridiot_Axe")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		PeridiotHoe = new ItemPeridiotHoe(PowerRed.PeridiotToolMaterial)
				.setUnlocalizedName("ItemPeridiotHoe")
				.setTextureName("pr:Peridiot_Hoe")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		PeridiotSword = new ItemPeridiotSword(PowerRed.PeridiotToolMaterial)
				.setUnlocalizedName("ItemPeridiotSword")
				.setTextureName("pr:Peridiot_Sword")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		SapphirePickaxe = new ItemSapphirePickaxe(PowerRed.SapphireToolMaterial)
				.setUnlocalizedName("ItemSapphirePickaxe")
				.setTextureName("pr:Sapphire_Pickaxe")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		SapphireShovel = new ItemSapphireShovel(PowerRed.SapphireToolMaterial)
				.setUnlocalizedName("ItemSapphireShovel")
				.setTextureName("pr:Sapphire_Shovel")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		SapphireAxe = new ItemSapphireAxe(PowerRed.SapphireToolMaterial)
				.setUnlocalizedName("ItemSapphireAxe")
				.setTextureName("pr:Sapphire_Axe")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		SapphireHoe = new ItemSapphireHoe(PowerRed.SapphireToolMaterial)
				.setUnlocalizedName("ItemSapphireHoe")
				.setTextureName("pr:Sapphire_Hoe")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		SapphireSword = new ItemSapphireSword(PowerRed.SapphireToolMaterial)
				.setUnlocalizedName("ItemSapphireSword")
				.setTextureName("pr:Sapphire_Sword")
				.setCreativeTab(PowerRed.tabPowerRedTools);

		itemCopperIngot = new PRItem("ItemCopperIngot", "pr:Copper_Ingot",
				"ingotCopper");
		itemNikolite = new PRItem("ItemNikolite", "pr:Nikolite", "dustNikolite");
		itemSilverIngot = new PRItem("ItemSilverIngot", "pr:Silver_Ingot",
				"ingotSilver");
		itemTinIngot = new PRItem("ItemTinIngot", "pr:Tin_Ingot", "ingotTin");
		itemAthame = new ItemAthame(PowerRed.AthameToolMaterial)
				.setUnlocalizedName("ItemAthame").setTextureName("pr:Athame")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		itemMotor = new PRItem("ItemMotor", "pr:Motor", "PR:itemMotor");
		itemPeridiotHandsaw = new ItemPeridiotHandsaw()
				.setUnlocalizedName("ItemPeridiotHandsaw")
				.setTextureName("pr:Peridiot_Handsaw")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		itemSapphireHandsaw = new ItemSapphireHandsaw()
				.setUnlocalizedName("ItemSapphireHandsaw")
				.setTextureName("pr:Sapphire_Handsaw")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		itemRubyHandsaw = new ItemRubyHandsaw()
				.setUnlocalizedName("ItemRubyHandsaw")
				.setTextureName("pr:Ruby_Handsaw")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		itemDiamondHandsaw = new ItemDiamondHandsaw()
				.setUnlocalizedName("ItemDiamondHandsaw")
				.setTextureName("pr:Diamond_Handsaw")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		itemIronHandsaw = new ItemIronHandsaw()
				.setUnlocalizedName("ItemIronHandsaw")
				.setTextureName("pr:Iron_Handsaw")
				.setCreativeTab(PowerRed.tabPowerRedTools);
		itemCanvasBag = new ItemCanvasBag().setUnlocalizedName("ItemCanvasBag")
				.setTextureName("pr:Canvas_Bag_White")
				.setCreativeTab(PowerRed.tabPowerRedItems);
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
		GameRegistry.registerItem(itemBlueAlloyIngot, itemBlueAlloyIngot
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRedAlloyIngot, itemRedAlloyIngot
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemBrassIngot, itemBrassIngot
				.getUnlocalizedName().substring(5));

	}
}
