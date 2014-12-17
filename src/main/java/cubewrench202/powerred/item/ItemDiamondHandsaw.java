package cubewrench202.powerred.item;

import core.item.ItemCoreBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cubewrench202.powerred.PowerRed;
import net.minecraft.client.renderer.texture.TextureMap;

public class ItemDiamondHandsaw extends ItemCoreBase {

    public ItemDiamondHandsaw() {
        super(false);
        setMaxStackSize(1);
        setCreativeTab(PowerRed.tabPowerRedItems);//FIXME Not sure if this is the correct tab.
    }

    @Override
    public String getUnlocalizedName(int metadata) {
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    protected void registerIcons(TextureMap textureMap) {
    }

}
