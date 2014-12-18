package cubewrench202.powerred.tileentities.blutricity.conductors;

import cubewrench202.powerred.api.energy.IBlulectricConductor;
import cubewrench202.powerred.api.energy.IBlulectricSink;
import cubewrench202.powerred.tileentities.TileEntityWire;

/**
 * Created by Master801 on 12/18/2014 at 7:12 AM.
 * @author Master801
 */
public class TileEntityBlulectricWire extends TileEntityWire implements IBlulectricConductor {

    @Override
    public short getMaxResistance(int metadata) {
        return 0;
    }

    @Override
    public IBlulectricSink.VoltageTypes getVoltageLevel(int metadata) {
        return null;
    }

    @Override
    public short getMaxAmps(int metadata) {
        return 0;
    }

    @Override
    public short getAmpLoss(int metadata) {
        return 0;
    }

}
