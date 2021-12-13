package com.github.Room53Mod.objects.items.food;

import com.github.Room53Mod.Room53Mod;
import com.github.Room53Mod.objects.items.FoodBase;
import com.github.Room53Mod.tabs.Room53Tab;
import com.github.Room53Mod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class CumiumApple extends FoodBase implements IHasModel {
    public CumiumApple(String pName, float pSaturation, int pAmount, boolean pIsWolfFood) {
        super(pName, pSaturation, pAmount, pIsWolfFood);
        setCreativeTab(Room53Mod.ROOM53MODTAB);
    }
}
