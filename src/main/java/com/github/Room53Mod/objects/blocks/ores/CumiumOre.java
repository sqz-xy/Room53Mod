package com.github.Room53Mod.objects.blocks.ores;

import com.github.Room53Mod.Room53Mod;
import com.github.Room53Mod.init.ItemInit;
import com.github.Room53Mod.objects.blocks.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class CumiumOre extends BlockBase {
    public CumiumOre(String pName, Material pMaterial) {
        super(pName, pMaterial);
        setCreativeTab(Room53Mod.ROOM53MODTAB);
        setHardness(4.5f);
        setHarvestLevel("pickaxe", 3);
    }

    @Override
    public Item getItemDropped(IBlockState pState, Random pRand, int pFortune) {
        return ItemInit.CUMIUM_GEM;
    }


}
