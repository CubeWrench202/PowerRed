package cubewrench202.powerred.blocks;

import core.block.BlockCoreBase;
import core.helpers.ReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cubewrench202.powerred.PowerRed;
import cubewrench202.powerred.tileentities.TileEntityBlockBreaker;
import cubewrench202.powerred.tileentities.TileEntityRedstoneMachine;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Master801 on 12/15/2014 at 5:57 PM.
 * @author Master801
 */
public class BlockRedstoneMachines extends BlockCoreBase {

    public BlockRedstoneMachines() {
        super(Material.circuits, true);
        setCreativeTab(PowerRed.CREATIVE_TAB_RED_REDSTONE_MACHINES);
    }

    @Override
    @SideOnly(Side.CLIENT)
    protected void registerIcon(TextureMap map) {
        //TODO?
    }

    @Override
    public final String getAdjustedUnlocalizedName() {
        return null;//This is already handled by the item block.
    }

    @Override
    protected final int getAmountOfSubtypes() {
        return RedstoneMachines.values().length + 1;
    }

    @Override
    public final TileEntity createTileEntity(int metadata) {
        return ReflectionHelper.createNewInstanceOfClass(RedstoneMachines.values()[metadata].getRedstoneMachineClass());
    }

    public static enum RedstoneMachines {

        BLOCK_BREAKER(TileEntityBlockBreaker.class, "blockBreaker");

        private final Class<? extends TileEntityRedstoneMachine> tileentityClass;

        private final String unlocalisedName;

        private RedstoneMachines(Class<? extends TileEntityRedstoneMachine> tileentityClass, String unlocalisedName) {
            this.tileentityClass = tileentityClass;
            this.unlocalisedName = unlocalisedName;
        }

        public Class<? extends TileEntityRedstoneMachine> getRedstoneMachineClass() {
            return tileentityClass;
        }

        public String getUnlocalisedName() {
            return unlocalisedName;
        }

    }

}
