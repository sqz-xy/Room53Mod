package com.github.Room53Mod.init;

import com.github.Room53Mod.objects.items.ItemBase;
import com.github.Room53Mod.objects.items.TestItem;
import com.github.Room53Mod.objects.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Item TEST_ITEM = new TestItem("test_item");
}
