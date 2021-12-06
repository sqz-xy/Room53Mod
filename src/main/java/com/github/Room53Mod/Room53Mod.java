package com.github.Room53Mod;

import com.github.Room53Mod.util.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Room53Mod
{
    @Mod.Instance
    public static Room53Mod instance;

    private static Logger logger;

    public static Item.ToolMaterial myToolMaterial;
    public static Item mySword;


    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        /* logger = event.getModLog(); */

        myToolMaterial = EnumHelper.addToolMaterial("Cum", 4, 5, 100.0F,1000.0F, 300);
        mySword = new CustomSword(myToolMaterial);

    }

    @EventHandler
    public void init(FMLInitializationEvent event) { /* logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName()); */ }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) { /*logger = event.getModLog(); */ }

}
