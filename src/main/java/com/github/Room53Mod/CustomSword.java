package com.github.Room53Mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {

    public CustomSword(ToolMaterial material) {
        super(Room53Mod.myToolMaterial);
        this.setRegistryName("my_sword");
        this.setUnlocalizedName("my_sword");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }

}
