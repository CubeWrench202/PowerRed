package cubewrench202.powerred.tileentities.redstone;

import net.minecraft.block.Block;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;

/**
 * Created by Master801 on 12/15/2014 at 6:08 PM.
 * @author Master801
 */
public class TileEntityBlockBreaker extends TileEntityRedstoneMachine implements ISidedInventory {

    @Override
    protected void onRedstonePowered() {
        Block block = worldObj.getBlock(xCoord + getFacingForgeDirection().offsetX, yCoord + getFacingForgeDirection().offsetY, zCoord + getFacingForgeDirection().offsetZ);
        if (block != null) {
//            block.breakBlock(worldObj, xCoord, yCoord, zCoord, block, 0);//FIXME Not the correct parameters.
        }
    }

    @Override
    public int[] getAccessibleSlotsFromSide(int side) {
        return null;
    }

    @Override
    public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
        return false;
    }

    @Override
    public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
        return false;
    }

    @Override
    public int getSizeInventory() {
        return 0;
    }

    @Override
    public ItemStack getStackInSlot(int p_70301_1_) {
        return null;
    }

    @Override
    public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) {
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
        return null;
    }

    @Override
    public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {
    }

}
