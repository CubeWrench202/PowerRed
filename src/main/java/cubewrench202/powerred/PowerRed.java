package cubewrench202.powerred;

import core.api.common.IConfigFile;
import core.api.common.mod.IMod;
import core.api.network.proxy.IProxy;
import core.helpers.ConfigFileHelper;
import core.helpers.ProxyHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cubewrench202.powerred.blocks.BlockRedstoneMachines;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.GameRegistry;
import cubewrench202.powerred.common.*;
import cubewrench202.powerred.recipes.*;
import cubewrench202.powerred.world.OreGeneration;

@Mod(modid = PowerRed.POWER_RED_MOD_ID, name = "PowerRed", version = "@VERSION@")
public final class PowerRed implements IMod {

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
    public static final String POWER_RED_CLIENT_PROXY = "cubewrench202.powerred.proxies.PowerRedClientProxy";
    public static final String POWER_RED_SERVER_PROXY = "cubewrench202.powerred.proxies.PowerRedServerProxy";

    public static final IConfigFile POWER_RED_CONFIG_FILE = ConfigFileHelper.createNewConfigFile(PowerRed.instance, "Power Red", " \n Power Red \n ");

    @Instance(PowerRed.POWER_RED_MOD_ID)
    public static IMod instance;

    @SidedProxy(serverSide = PowerRed.POWER_RED_SERVER_PROXY, clientSide = PowerRed.POWER_RED_CLIENT_PROXY)
    public static IProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
        PowerRed.POWER_RED_CONFIG_FILE.loadConfigFile();
        //TODO Mo' config options.
        PowerRed.POWER_RED_CONFIG_FILE.saveConfigFile();
		PRBlocks.registerBlocks();
		PRItems.registerItems();
		GameRegistry.registerWorldGenerator(new OreGeneration(), 0);
        ProxyHelper.addProxyToMapping(PowerRed.proxy);
    }

	@EventHandler
	public void init(FMLInitializationEvent event) {
		ShapedRecipes.addRecipes();
		SmeltingRecipes.addRecipes();
	}

	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
	}

    public static CreativeTabs CREATIVE_TAB_RED_REDSTONE_MACHINES = new CreativeTabs("tabPowerRedRedstoneMachines") {

        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return new ItemStack(PRBlocks.BLOCK_REDSTONE_MACHINES, 1, BlockRedstoneMachines.RedstoneMachines.BLOCK_BREAKER.ordinal()).getItem();
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

    @Override
    public String getModID() {
        return PowerRed.POWER_RED_MOD_ID;
    }

    @Override
    public IMod getInstance() {
        return PowerRed.instance;
    }

}