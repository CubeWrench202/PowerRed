package cubewrench202.powerred.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cubewrench202.powerred.PowerRed;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
/**
 * Used for basic item creation; crafting items.
 * 
 * @author xbony2
 */
public class PRItem extends Item{
	/**
	 * 
	 * @param unlocalizedName the unlocalized name
	 * @param textureName the texture name
	 * @param oreDict the ore dictionary name. Start it with "PR:" as a private prefix.
	 */
	public PRItem(String unlocalizedName, String textureName, String oreDict){
		super();
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(PowerRed.tabPowerRedItems);
		this.setTextureName(textureName);
		OreDictionary.registerOre(oreDict, this);
		GameRegistry.registerItem(this, unlocalizedName.substring(5));
	}
}
