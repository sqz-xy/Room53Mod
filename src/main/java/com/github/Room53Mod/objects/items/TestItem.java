package com.github.Room53Mod.objects.items;

import com.github.Room53Mod.Room53Mod;
import com.github.Room53Mod.tabs.Room53Tab;
import net.minecraft.creativetab.CreativeTabs;

public class TestItem extends ItemBase{
    public TestItem(String pName) {
        super(pName);
        setCreativeTab(Room53Mod.ROOM53MODTAB);
    }
}
