package com.github.Room53Mod.objects.blocks.materialblocks;

import com.github.Room53Mod.Room53Mod;
import com.github.Room53Mod.objects.blocks.BlockBase;
import net.minecraft.block.material.Material;

public class CumiumBlock extends BlockBase {
    public CumiumBlock(String pName, Material pMaterial) {
        super(pName, pMaterial);
        setCreativeTab(Room53Mod.ROOM53MODTAB);
        setHardness(4.5f);
    }
}
