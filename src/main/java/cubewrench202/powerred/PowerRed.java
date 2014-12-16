package cubewrench202.powerred;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cubewrench202.powerred.common.PRBlocks;
import cubewrench202.powerred.common.PRItems;
import cubewrench202.powerred.recipes.ShapedRecipes;
import cubewrench202.powerred.recipes.SmeltingRecipes;
import cubewrench202.powerred.world.OreGeneration;

@Mod(modid = PowerRed.POWER_RED_MOD_ID, name = "PowerRed", version = "@VERSION@")
public class PowerRed {

	public static final Item.ToolMaterial PeridiotToolMaterial = EnumHelper
			.addToolMaterial("PeridiotToolMaterial", 3, 1250, 6.0F, 2.0F, 30);
	public static final Item.ToolMaterial RubyToolMaterial = EnumHelper
			.addToolMaterial("RubyToolMaterial", 3, 1250, 6.0F, 2.0F, 30);
	public static final Item.ToolMaterial SapphireToolMaterial = EnumHelper
			.addToolMaterial("SapphireToolMaterial", 3, 1250, 6.0F, 2.0F, 30);
	public static final Item.ToolMaterial AthameToolMaterial = EnumHelper
			.addToolMaterial("AthameToolMaterial", 0, 650, (float) 0.5, 2.0F,
					28);

    public static final String POWER_RED_MOD_ID = "pr";

    @Instance(PowerRed.POWER_RED_MOD_ID)
    public static PowerRed instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		PRBlocks.registerBlocks();
		PRItems.registerItems();
		GameRegistry.registerWorldGenerator(new OreGeneration(), 0);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		ShapedRecipes.addRecipes();
		SmeltingRecipes.addRecipes();
	}

	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
	}

	public static CreativeTabs tabPowerRedMachines = new CreativeTabs(
			"tabPowerRedMachines") {

		@Override
        @SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Items.apple;
		}

	};

    public static CreativeTabs CREATIVE_TAB_RED_REDSTONE_MACHINES = new CreativeTabs("tabPowerRedRedstoneMachines") {

        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock(PRBlocks.blockBlockBreaker);
        }

    };

	public static CreativeTabs tabPowerRedItems = new CreativeTabs(
			"tabPowerRedItems") {

		@Override
        @SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return PRItems.itemMotor;
		}

	};

	public static CreativeTabs tabPowerRedWorld = new CreativeTabs(
			"tabPowerRedWorld") {

		@Override
        @SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(PRBlocks.blockBasaltBrick);
		}

	};
	public static CreativeTabs tabPowerRedTools = new CreativeTabs(
			"tabPowerRedTools") {

		@Override
        @SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return PRItems.itemScrewdriver;
		}

	};
}