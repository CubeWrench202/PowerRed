package cubewrench202.powerred.itemblocks;

import core.itemblock.ItemBlockCoreBase;
import cubewrench202.powerred.blocks.BlockOre;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Master801 on 12/17/2014 at 7:14 PM.
 * @author Master801
 */
public class ItemBlockOre extends ItemBlockCoreBase {

    public ItemBlockOre(Block block) {
        super(block, true);
    }

    @Override
    protected String getUnlocalizedName(int metadata) {
        return BlockOre.BlockOreTypes.VALUES[metadata].getUnlocalisedName();
    }

    @Override
    protected List<String> addInformation(ItemStack stack, EntityPlayer player, boolean var3) {
        return null;
    }

}
