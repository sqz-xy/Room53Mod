package com.github.Room53Mod.init;

import com.github.Room53Mod.objects.blocks.BlockBase;
import com.github.Room53Mod.objects.blocks.TestBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList();

    public static final Block TEST_BLOCK = new TestBlock("test_block", Material.IRON);
}
