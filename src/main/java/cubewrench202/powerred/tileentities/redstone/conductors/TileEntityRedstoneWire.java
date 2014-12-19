package cubewrench202.powerred.tileentities.redstone.conductors;

import core.api.tileentity.IRedstoneControl;
import cubewrench202.powerred.tileentities.TileEntityWire;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Master801 on 12/18/2014 at 7:15 AM.
 * @author Master801
 */
public class TileEntityRedstoneWire extends TileEntityWire implements IRedstoneControl {

    private byte weakPower;
    private byte strongPower;

    @Override
    public byte getWeakPower(ForgeDirection side) {
        return weakPower;
    }

    @Override
    public byte getStrongPower(ForgeDirection side) {
        return strongPower;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        weakPower = nbt.getByte("weak");
        strongPower = nbt.getByte("strong");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setByte("weak", weakPower);
        nbt.setByte("strong", strongPower);
    }

}
