package cubewrench202.powerred.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Master801 on 12/15/2014 at 6:45 PM.
 * @author Master801
 */
public class TileEntityPowerRed extends TileEntity {

    private byte direction = 0;

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        direction = nbt.getByte("facing");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setByte("facing", direction);
    }

    /**
     * @return The direction the redstone machine is facing.
     */
    public final byte getDirectionFacing() {
        return direction;
    }

    public final ForgeDirection getFacingForgeDirection() {
        return TileEntityRedstoneMachine.convertFacingToForgeDirection(getDirectionFacing());
    }

    public final void setDirectionToFace(byte newFacing) {
        direction = newFacing;
    }

    public boolean onBlockActivated(EntityPlayer player, float hitX, float hitY, float hitZ) {
        return false;
    }

    public String getInventoryName() {
        return worldObj.getBlock(xCoord, yCoord, zCoord).getUnlocalizedName();
    }

    public boolean hasCustomInventoryName() {
        return false;
    }

    public int getInventoryStackLimit() {
        return 64;
    }

    public boolean isUseableByPlayer(EntityPlayer player) {
        return false;
    }

    public void openInventory() {
    }

    public void closeInventory() {
    }

    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        return true;
    }

    public static ForgeDirection convertFacingToForgeDirection(byte direction) {
        return ForgeDirection.VALID_DIRECTIONS[(int)direction];
    }

}
