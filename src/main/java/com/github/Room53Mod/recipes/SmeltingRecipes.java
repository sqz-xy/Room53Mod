package com.github.Room53Mod.recipes;

import com.github.Room53Mod.init.BlockInit;
import com.github.Room53Mod.init.ItemInit;
import com.github.Room53Mod.objects.blocks.ores.CumiumOre;
import com.github.Room53Mod.objects.items.materials.CumiumGem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {

    public static void init() {
        // Add more smelting recipes here
        GameRegistry.addSmelting(new ItemStack(BlockInit.CUMIUM_ORE), new ItemStack(ItemInit.CUMIUM_GEM), 0.4f);
    }
}
