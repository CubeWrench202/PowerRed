package cubewrench202.powerred.proxies;

import core.api.common.mod.IMod;
import core.api.network.proxy.IProxy;
import cpw.mods.fml.relauncher.Side;
import cubewrench202.powerred.PowerRed;

/**
 * Created by Master801 on 12/16/2014 at 9:02 PM.
 * @author Master801
 */
public final class PowerRedServerProxy implements IProxy {

    @Override
    public void registerBlockRenderers() {
        //Do nothing since this is the server side.
    }

    @Override
    public void registerTileEntityRenderers() {
        //Do nothing since this is the server side.
    }

    @Override
    public void registerItemRenderers() {
        //Do nothing since this is the server side.
    }

    @Override
    public void addRenderID(String id, int renderID) {
        //Do nothing since this is the server side.
    }

    @Override
    public int getRenderIDFromSpecialID(String id) {
        return 0;//Return 0 since this is the server side.
    }

    @Override
    public Side getSide() {
        return Side.SERVER;
    }

    @Override
    public IMod getOwningMod() {
        return PowerRed.instance;
    }

}
