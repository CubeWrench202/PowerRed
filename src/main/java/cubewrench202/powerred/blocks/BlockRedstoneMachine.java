package cubewrench202.powerred.blocks;

import cubewrench202.powerred.PowerRed;
import cubewrench202.powerred.tileentities.TileEntityRedstoneMachine;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Master801 on 12/15/2014 at 5:57 PM.
 * @author Master801
 */
public abstract class BlockRedstoneMachine extends BlockContainer {

    protected abstract TileEntityRedstoneMachine createTileEntity(int metadata);

    protected BlockRedstoneMachine(Material material, String blockName) {
        super(material);
        setCreativeTab(PowerRed.CREATIVE_TAB_RED_REDSTONE_MACHINES);
        setBlockName(blockName);
    }

    @Override
    public final TileEntity createNewTileEntity(World world, int metadata) {
        return createTileEntity(metadata);
    }

    @Override
    public final void onBlockPlacedBy(World world, int xCoord, int yCoord, int zCoord, EntityLivingBase entity, ItemStack stack) {
        TileEntity tile = world.getTileEntity(xCoord, yCoord, zCoord);
        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;
            onBlockPlacedBy(world, xCoord, yCoord, zCoord, player, stack);
            if (tile instanceof TileEntityRedstoneMachine) {
                TileEntityRedstoneMachine redstoneMachine = (TileEntityRedstoneMachine) tile;
                redstoneMachine.setDirectionToFace((byte) BlockPistonBase.determineOrientation(world, xCoord, yCoord, zCoord, player));
            }
        }
    }

    @Override
    public final boolean onBlockActivated(World world, int xCoord, int yCoord, int zCoord, EntityPlayer player, int metadata, float hitX, float hitY, float hitZ) {
        TileEntity tile = world.getTileEntity(xCoord, yCoord, zCoord);
        if (tile instanceof TileEntityRedstoneMachine) {
            return ((TileEntityRedstoneMachine)tile).onBlockActivated(player, hitX, hitY, hitZ);
        }
        return onBlockActivated(world, xCoord, yCoord, zCoord, player, hitX, hitY, hitZ);
    }

    protected void onBlockPlacedBy(World world, int xCoord, int yCoord, int zCoord, EntityPlayer player, ItemStack stack) {
    }

    protected boolean onBlockActivated(World world, int xCoord, int yCoord, int zCoord, EntityPlayer player, float hitX, float hitY, float hitZ) {
        return false;
    }

}
