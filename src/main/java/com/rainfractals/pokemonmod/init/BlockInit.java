package com.rainfractals.pokemonmod.init;

import com.rainfractals.pokemonmod.PokemonMod;
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
import com.rainfractals.pokemonmod.PokemonMod;
import net.minecraftforge.registries.ObjectHolder;


import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@ObjectHolder(PokemonMod.MOD_ID)
@Mod.EventBusSubscriber(modid = PokemonMod.MOD_ID, bus = Bus.MOD)
public class BlockInit {
    public static final Block orange_block = null;
    public static final Block rainbow_block = null;
    public static final Block pokemon_block = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new Block( Block.Properties.create(Material.IRON).hardnessAndResistance(0.5f, 15.0f)
                .harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName("rainbow_block"));
        event.getRegistry().register(new Block( Block.Properties.create(Material.IRON).hardnessAndResistance(0.5f, 15.0f)
                .harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName("orange_block"));
        event.getRegistry().register(new Block( Block.Properties.create(Material.IRON).hardnessAndResistance(0.5f, 15.0f)
                .harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName("pokemon_block"));
    }

    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new BlockItem( rainbow_block, new Item.Properties().group(ItemGroup.MISC).maxStackSize(16)).setRegistryName("rainbow_block"));
        event.getRegistry().register(new BlockItem( orange_block, new Item.Properties().group(ItemGroup.MISC).maxStackSize(16)).setRegistryName("orange_block"));
        event.getRegistry().register(new BlockItem( pokemon_block, new Item.Properties().group(ItemGroup.MISC).maxStackSize(16)).setRegistryName("pokemon_block"));
    }
}
