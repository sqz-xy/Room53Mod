package com.github.Room53Mod.init;

import com.github.Room53Mod.objects.items.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList();

    public static final Block TEST_BLOCK = new BlockBase("test_block", Material.IRON);
}
