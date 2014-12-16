package cubewrench202.powerred.blocks;

import cubewrench202.powerred.tileentities.TileEntityBlockBreaker;
import cubewrench202.powerred.tileentities.TileEntityRedstoneMachine;
import net.minecraft.block.material.Material;

public class BlockBlockBreaker extends BlockRedstoneMachine {

    public BlockBlockBreaker() {
        super(Material.circuits, "blockbreaker");
    }

    @Override
    protected TileEntityRedstoneMachine createTileEntity(int metadata) {
        return new TileEntityBlockBreaker();
    }

}