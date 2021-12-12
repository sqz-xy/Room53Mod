package com.github.Room53Mod.objects.items.tools;

import com.github.Room53Mod.Room53Mod;
import com.github.Room53Mod.init.ItemInit;
import com.github.Room53Mod.tabs.Room53Tab;
import com.github.Room53Mod.util.interfaces.IHasModel;

import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{
    public ToolSword(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Room53Mod.ROOM53MODTAB);

        ItemInit.ITEMS.add(this);

    }

    @Override
    public void registerModels() {
        Room53Mod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
