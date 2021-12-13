package com.github.Room53Mod.objects.items.food;

import com.github.Room53Mod.Room53Mod;
import com.github.Room53Mod.objects.items.FoodBase;
import com.github.Room53Mod.tabs.Room53Tab;
import com.github.Room53Mod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CumiumApple extends FoodBase implements IHasModel {
    public CumiumApple(String pName, float pSaturation, int pAmount, boolean pIsWolfFood) {
        super(pName, pSaturation, pAmount, pIsWolfFood);
        setCreativeTab(Room53Mod.ROOM53MODTAB);
        setAlwaysEdible();

    }

    @Override
    public ItemStack onItemUseFinish(ItemStack pStack, World pWorld, EntityLivingBase pEntityLiving) {
        pEntityLiving.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 6000, 3, false, false));
        pEntityLiving.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 6000, 4, false, false));
        pEntityLiving.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 6000, 4, false, false));
        pEntityLiving.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 6000, 4, false, false));
        return super.onItemUseFinish(pStack, pWorld, pEntityLiving);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
