package com.github.Room53Mod;

import com.github.Room53Mod.proxy.CommonProxy;
import com.github.Room53Mod.recipes.SmeltingRecipes;
import com.github.Room53Mod.tabs.Room53Tab;
import com.github.Room53Mod.util.Reference;
import com.github.Room53Mod.world.gen.WorldGenOres;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Room53Mod
{
    @Mod.Instance
    public static Room53Mod instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    public static final CreativeTabs ROOM53MODTAB = new Room53Tab("Room53Tab");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        GameRegistry.registerWorldGenerator(new WorldGenOres(), 3);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        SmeltingRecipes.init();

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

    @EventHandler
    public void serverInit(FMLServerStartingEvent event){

    }
}
