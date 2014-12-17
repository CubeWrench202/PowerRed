package cubewrench202.powerred.itemblocks;

import core.itemblock.ItemBlockCoreBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cubewrench202.powerred.blocks.BlockRedstoneMachines;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Master801 on 12/16/2014 at 9:19 PM.
 * @author Master801
 */
public class ItemBlockRedstoneMachines extends ItemBlockCoreBase {

    public ItemBlockRedstoneMachines(Block block) {
        super(block, true);
    }

    @Override
    protected String getUnlocalizedName(int metadata) {
        return BlockRedstoneMachines.RedstoneMachines.values()[metadata].getUnlocalisedName();
    }

    @Override
    @SideOnly(Side.CLIENT)
    protected List<String> addInformation(ItemStack stack, EntityPlayer player, boolean var3) {
        final List<String> list = new ArrayList<String>();
        //TODO
        return list;
    }

}
