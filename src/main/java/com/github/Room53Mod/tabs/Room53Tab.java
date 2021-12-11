package com.github.Room53Mod.tabs;

import com.github.Room53Mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Room53Tab extends CreativeTabs {
    public Room53Tab(String pLabel) {
        super("Room53ModTab");
        this.setBackgroundImageName("room53mod.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.TEST_ITEM);
    }
}
