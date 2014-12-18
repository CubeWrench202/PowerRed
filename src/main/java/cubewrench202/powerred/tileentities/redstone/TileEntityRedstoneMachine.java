package cubewrench202.powerred.tileentities.redstone;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Master801 on 12/15/2014 at 6:08 PM.
 * @author Master801
 */
public class TileEntityRedstoneMachine extends TileEntityPowerRed {

    private boolean isRedstonePowered = false;

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        isRedstonePowered = nbt.getBoolean("redstone");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setBoolean("redstone", isRedstonePowered);
    }

    @Override
    public void updateEntity() {
        super.updateEntity();
//        setRedstonePowered(worldObj.isBlockIndirectlyGettingPowered(xCoord, yCoord, zCoord));//TODO
        if (isRedstonePowered()) {
            onRedstonePowered();
        }
    }

    protected void onRedstonePowered() {
    }

    public final boolean isRedstonePowered() {
        return isRedstonePowered;
    }

    public final void setRedstonePowered(boolean powered) {
        isRedstonePowered = powered;
    }

}
