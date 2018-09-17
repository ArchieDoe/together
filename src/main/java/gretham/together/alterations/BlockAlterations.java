package gretham.together.alterations;


import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class BlockAlterations {
    public static void alterBlocks() {
        Block leavesBlock = Block.getBlockFromName("leaves");
        leavesBlock.setHardness(50F);
    }
}
