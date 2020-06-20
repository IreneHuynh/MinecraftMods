package com.rainefractals.mysamplemod.init;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.AbsorptionEffect;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;



import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import com.rainefractals.mysamplemod.MySampleMod;
import com.rainefractals.mysamplemod.MySampleMod.MySampleModItemGroup;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = MySampleMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(MySampleMod.MOD_ID)
public class ItemInit {

    public static final Item example_item = null;
    public static final Item test_item = null;

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("example_item"));
        event.getRegistry().register(new Item(new Item.Properties().group(MySampleModItemGroup.instance).food(new Food.Builder().hunger(1).saturation(1.2f).effect(new EffectInstance(Effects.ABSORPTION, 6000, 5), 0.2f).build())).setRegistryName("test_item"));
    }
}
