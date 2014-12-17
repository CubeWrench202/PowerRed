package cubewrench202.powerred.blocks;

import core.block.BlockCoreBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Master801 on 12/17/2014 at 8:39 AM.
 * @author Master801
 */
public class BlockLamp extends BlockCoreBase {

    public final boolean isOn;

    public BlockLamp(boolean isOn) {
        super(Material.glass, true);
        this.isOn = isOn;
    }

    @Override
    @SideOnly(Side.CLIENT)
    protected void registerIcon(TextureMap map) {
    }

    @Override
    public String getAdjustedUnlocalizedName() {
        return null;
    }

    @Override
    public TileEntity createTileEntity(int metadata) {
        return null;
    }

}
