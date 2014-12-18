package cubewrench202.powerred.tileentities.blutricity;

import cubewrench202.powerred.api.energy.IBlulectricConductor;
import cubewrench202.powerred.api.energy.IBlulectricSink;
import cubewrench202.powerred.tileentities.TileEntityPowerRed;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Master801 on 12/15/2014 at 6:45 PM.
 * @author Master801
 */
public class TileEntityBlulectricMachine extends TileEntityPowerRed implements IBlulectricSink, IBlulectricConductor {

    @Override
    public boolean canConnect(ForgeDirection facing) {
        return true;
    }

    @Override
    public VoltageTypes getVoltage() {
        return VoltageTypes.LOW_VOLTAGE;
    }

}
