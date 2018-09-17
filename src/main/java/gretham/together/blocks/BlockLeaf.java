package gretham.together.blocks;

import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockLeaf extends BlockOldLeaf {
    public BlockLeaf() {
        super();

        setUnlocalizedName("leaves");
        setRegistryName("minecraft:leaves");
    }

    @Override
    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
        if (worldIn.rand.nextFloat() <= 0.5F) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.STICK, 1, 0));
        }
    }
}
