package cubewrench202.powerred.tileentities.redstone.conductors;

import core.api.tileentity.IRedstoneControl;
import cubewrench202.powerred.tileentities.TileEntityWire;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Master801 on 12/18/2014 at 7:15 AM.
 * @author Master801
 */
public class TileEntityRedstoneWire extends TileEntityWire implements IRedstoneControl {

    @Override
    public int getWeakPower(ForgeDirection side) {
        return 0;
    }

    @Override
    public int getStrongPower(ForgeDirection side) {
        return 0;
    }

}
