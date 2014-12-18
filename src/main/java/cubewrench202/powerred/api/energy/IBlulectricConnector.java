package cubewrench202.powerred.api.energy;

import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Master801 on 12/15/2014 at 5:55 PM.
 * <p>
 *     Allows this tile to connect to blulectric conductors/sinks/sources.
 * </p>
 * @author Master801
 */
public interface IBlulectricConnector {

    boolean canConnectToBlulectric(ForgeDirection facing, IBlulectric tile);

}
