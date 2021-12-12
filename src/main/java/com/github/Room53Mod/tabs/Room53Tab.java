package com.github.Room53Mod.tabs;

import com.github.Room53Mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class Room53Tab extends CreativeTabs {
    public Room53Tab(String pLabel) {
        super(pLabel);
        this.setBackgroundImageName("room53mod.png");
    }

    @Override
    public @NotNull ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.TEST_ITEM);
    }
}
