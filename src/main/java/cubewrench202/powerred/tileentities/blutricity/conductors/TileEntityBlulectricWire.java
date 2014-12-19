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
    public short getMaxVoltageResistance(int metadata) {
        return 0;
    }

    @Override
    public VoltageTypes getVoltageType(int metadata) {
        switch(metadata) {
            case 0:
                return VoltageTypes.LOW_VOLTAGE;
            case 1:
                return VoltageTypes.HIGH_VOLTAGE;
            default:
                return VoltageTypes.LOW_VOLTAGE;
        }
    }

    @Override
    public short getMaxAmps(int metadata) {
        return 0;
    }

    @Override
    public float getConductorResistance(int metadata) {
        switch(metadata) {
            case 0:
                return 0.01F;
            case 1:
                return 1.0F;
            default:
                return 1.0F;
        }
    }

}
