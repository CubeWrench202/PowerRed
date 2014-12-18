package cubewrench202.powerred.api.energy;

/**
 * Created by Master801 on 12/15/2014 at 6:37 PM.
 * <p>
 *     This is only used for conductors (wiring).
 * </p>
 * @author Master801
 */
public interface IBlulectricConductor extends IBlulectric {

    short getMaxResistance(int metadata);

    IBlulectricSink.VoltageTypes getVoltageLevel(int metadata);

    short getMaxAmps(int metadata);

    /**
     * @return The amount of amps you lose per conductor.
     */
    short getAmpLoss(int metadata);

}
