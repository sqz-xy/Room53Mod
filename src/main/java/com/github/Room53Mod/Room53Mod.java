package com.github.Room53Mod;

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

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) { /* logger = event.getModLog(); */ }

    @EventHandler
    public void init(FMLInitializationEvent event) { /* logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName()); */ }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) { /*logger = event.getModLog(); */ }

}
