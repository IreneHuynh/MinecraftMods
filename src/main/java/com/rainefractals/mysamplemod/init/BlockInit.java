package com.rainefractals.mysamplemod.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import com.rainefractals.mysamplemod.MySampleMod;
import net.minecraftforge.registries.ObjectHolder;


import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@ObjectHolder(MySampleMod.MOD_ID)
@Mod.EventBusSubscriber(modid = MySampleMod.MOD_ID, bus = Bus.MOD)
public class BlockInit {
    public static final Block example_block = null;
    public static final Block example_rainbow_block = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new Block( Block.Properties.create(Material.IRON).hardnessAndResistance(0.5f, 15.0f)
                .harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName("example_rainbow_block"));
        event.getRegistry().register(new Block( Block.Properties.create(Material.IRON).hardnessAndResistance(0.5f, 15.0f)
                .harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName("example_block"));
    }

    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new BlockItem( example_rainbow_block, new Item.Properties().group(ItemGroup.MISC).maxStackSize(16)).setRegistryName("example_rainbow_block"));
        event.getRegistry().register(new BlockItem( example_block, new Item.Properties().group(ItemGroup.MISC).maxStackSize(16)).setRegistryName("example_block"));
    }
}
