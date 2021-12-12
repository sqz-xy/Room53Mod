package com.github.Room53Mod.objects.blocks;

import com.github.Room53Mod.Room53Mod;
import net.minecraft.block.material.Material;

public class TestBlock extends BlockBase{
    public TestBlock(String pName, Material pMaterial) {
        super(pName, pMaterial);
        setCreativeTab(Room53Mod.ROOM53MODTAB);
    }
}
