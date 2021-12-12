package com.github.Room53Mod.objects.items;

import com.github.Room53Mod.Room53Mod;
import com.github.Room53Mod.init.ItemInit;
import com.github.Room53Mod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public abstract class ItemBase extends Item implements IHasModel {
    public ItemBase(String pName) {
        setUnlocalizedName(pName);
        setRegistryName(pName);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Room53Mod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
