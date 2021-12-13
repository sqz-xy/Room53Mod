package com.github.Room53Mod.init;

import com.github.Room53Mod.objects.items.materials.CumiumGem;
import com.github.Room53Mod.objects.items.testitems.TestItem;
import com.github.Room53Mod.objects.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    // Init
    public static final List<Item> ITEMS = new ArrayList<>();

    // Tool Materials
    public static final Item.ToolMaterial TOOL_PURPLE = EnumHelper.addToolMaterial("tool_purple",4, 1500, 5.0f, 10.0f, 19);

    // Items
    public static final Item TEST_ITEM = new TestItem("test_item");

    // Tools - Sword
    public static final Item PURPLE_SWORD = new ToolSword("cumium_sword", TOOL_PURPLE);

    // Materials
    public static final Item CUMIUM_GEM = new CumiumGem("cumium_gem");

}
