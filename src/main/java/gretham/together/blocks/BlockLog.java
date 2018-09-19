package gretham.together.blocks;

import net.minecraft.block.BlockOldLog;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockLog extends BlockOldLog {
    public BlockLog() {
        super();

        setUnlocalizedName("log");
        setRegistryName("minecraft:log");

        setHarvestLevel("axe", 1);
    }

//    @Override
//    public boolean canHarvestBlock(IBlockAccess world, BlockPos pos, EntityPlayer player) {
//        IBlockState state = this.getDefaultState();
//        ItemStack stack = player.getHeldItemMainhand();
//        String tool = this.getHarvestTool(state);
//
//        if (stack.isEmpty() || tool == null)
//        {
//            return false;
//        }
//
//        int toolLevel = stack.getItem().getHarvestLevel(stack, tool, player, state);
//        if (toolLevel < 0)
//        {
//            return player.canHarvestBlock(state);
//        }
//
//        return toolLevel >= this.getHarvestLevel(state);
//    }
}
