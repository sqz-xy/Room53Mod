package com.github.Room53Mod.objects.items;

import com.github.Room53Mod.Room53Mod;
import com.github.Room53Mod.init.ItemInit;
import com.github.Room53Mod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public abstract class FoodBase extends ItemFood implements IHasModel {
    public FoodBase(String pName, float pSaturation, int pAmount, boolean isWolfFood) {
        super(pAmount, pSaturation, isWolfFood);
        setUnlocalizedName(pName);
        setRegistryName(pName);
        setCreativeTab(CreativeTabs.FOOD);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Room53Mod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
