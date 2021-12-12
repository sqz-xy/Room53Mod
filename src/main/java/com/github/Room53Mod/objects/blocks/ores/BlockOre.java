package com.github.Room53Mod.objects.blocks.ores;

import com.github.Room53Mod.Room53Mod;
import com.github.Room53Mod.objects.blocks.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockOre extends BlockBase {

    Item toDrop;
    int minDropAmount = 1;
    int maxDropAmount = 0;

    public BlockOre(String pName, Material pMaterial) {
        super(pName, pMaterial);
        setCreativeTab(Room53Mod.ROOM53MODTAB);
    }

    public BlockOre(String pName, Material pMaterial, Item pToDrop) {
        super(pName, pMaterial);
        setCreativeTab(Room53Mod.ROOM53MODTAB);
        toDrop = pToDrop;
    }

    public BlockOre(String pName, Material pMaterial, Item pToDrop, int pDropAmount) {
        super(pName, pMaterial);
        setCreativeTab(Room53Mod.ROOM53MODTAB);
        toDrop = pToDrop;
        minDropAmount = pDropAmount;
        maxDropAmount = pDropAmount;
    }

    public BlockOre(String pName, Material pMaterial, Item pToDrop, int pMinDropAmount, int pMaxDropAmount) {
        super(pName, pMaterial);
        setCreativeTab(Room53Mod.ROOM53MODTAB);
        toDrop = pToDrop;
        minDropAmount = pMinDropAmount;
        maxDropAmount = pMaxDropAmount;
    }
}
