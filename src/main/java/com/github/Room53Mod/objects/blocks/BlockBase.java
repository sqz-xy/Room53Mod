package com.github.Room53Mod.objects.blocks;

import com.github.Room53Mod.Room53Mod;
import com.github.Room53Mod.init.BlockInit;
import com.github.Room53Mod.init.ItemInit;
import com.github.Room53Mod.util.interfaces.IHasModel;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Objects;

public abstract class BlockBase extends Block implements IHasModel {
    public BlockBase(String pName, Material pMaterial) {
        super(pMaterial);
        setUnlocalizedName(pName);
        setRegistryName(pName);
        setCreativeTab(CreativeTabs.MATERIALS);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName()))); //Revert this to just this.getRegistryName if it breaks
    }

    @Override
    public void registerModels() {
        Room53Mod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
