package cubewrench202.powerred.api.energy;

/**
 * Created by Master801 on 12/17/2014 at 8:25 PM.
 * @author Master801
 */
public interface IBlulectric {

    short getMaxVoltageResistance(int metadata);

    VoltageTypes getVoltageType(int metadata);

    short getMaxAmps(int metadata);

    public static enum VoltageTypes {

        LOW_VOLTAGE,

        HIGH_VOLTAGE;

    }

}
