package cubewrench202.powerred.api.energy;

/**
 * Created by Master801 on 12/15/2014 at 6:36 PM.
 * <p>
 *     This is only used on machines or tile-entities that take in energy.
 * </p>
 * @author Master801
 */
public interface IBlulectricSink extends IBlulectric, IBlulectricConnector {//TODO Need to work on this some more.

    VoltageTypes getVoltage();

    int getMaxVoltageCapacity();

}
