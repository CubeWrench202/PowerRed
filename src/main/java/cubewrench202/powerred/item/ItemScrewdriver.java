package cubewrench202.powerred.item;

import core.helpers.PlayerHelper;
import core.helpers.RotationHelper;
import core.item.ItemCoreBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cubewrench202.powerred.api.items.IScrewdriver;
import cubewrench202.powerred.blocks.BlockRedstoneMachines;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class ItemScrewdriver extends ItemCoreBase implements IScrewdriver {
	
	public ItemScrewdriver() {
        super(false);
        setMaxDamage(145);
        setMaxStackSize(1);
        setNoRepair();
	}

	@Override
	public boolean onItemUseFirst(ItemStack is, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ){
		Block b = world.getBlock(x, y, z);
        if (PlayerHelper.isPlayerNotSneaking(player)) {
            if (b instanceof BlockRedstoneMachines || b instanceof BlockPistonBase) {
                return b.rotateBlock(world, x, y, z, RotationHelper.convertByteToForgeDirection((byte)side));
            }
        }
		return false;
	}

	@Override
	public void damageScrewdriver(World world, EntityPlayer player) {
		ItemStack driver = player.getItemInUse();
        if (driver != null) {
            driver.setItemDamage(driver.getItemDamage() - 1);
        }
	}

    @Override
    public String getUnlocalizedName(int metadata) {
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    protected void registerIcons(TextureMap textureMap) {
    }

}
