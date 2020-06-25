package com.rainfractals.pokemonmod.init;
import java.util.function.Supplier;

import com.rainfractals.pokemonmod.PokemonMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.AbsorptionEffect;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;



import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import com.rainfractals.pokemonmod.PokemonMod;
import com.rainfractals.pokemonmod.PokemonMod.PokemonModItemGroup;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = PokemonMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(PokemonMod.MOD_ID)
public class ItemInit {

    public static final Item pig_item = null;
    public static final Item test_item = null;
    public static final Item pikachu_item = null;
    public static final Item charmander_item = null;

    public static final Item helmet = null;
    public static final Item chest_plate = null;
    public static final Item legging = null;
    public static final Item boot = null;

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("pig_item"));
        event.getRegistry().register(new Item(new Item.Properties().group(PokemonModItemGroup.instance).food(new Food.Builder().hunger(1).saturation(1.2f).effect(new EffectInstance(Effects.ABSORPTION, 6000, 5), 0.2f).build())).setRegistryName("charmander_item"));
        event.getRegistry().register(new Item(new Item.Properties().group(PokemonModItemGroup.instance).food(new Food.Builder().hunger(1).saturation(1.2f).effect(new EffectInstance(Effects.ABSORPTION, 6000, 5), 0.2f).build())).setRegistryName("pikachu_item"));

        event.getRegistry().register(new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(PokemonModItemGroup.instance)).setRegistryName("helmet"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(PokemonModItemGroup.instance)).setRegistryName("chest_plate"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(PokemonModItemGroup.instance)).setRegistryName("legging"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(PokemonModItemGroup.instance)).setRegistryName("boot"));


    }


    public enum ModArmorMaterial implements IArmorMaterial {
        RUBY(PokemonMod.MOD_ID + ":ruby", 5, new int[]{7, 9, 11, 7}, 420, SoundEvents.field_226142_fM_, 6.9F, () -> {
            return Ingredient.fromItems(ItemInit.test_item);
        });

        private static final int[] MAX_DAMAGE_ARRAY = new int[]{16, 16, 16, 16};
        private final String name;
        private final int maxDamageFactor;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final float toughness;
        private final LazyValue<Ingredient> repairMaterial;

        private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn,
                                 int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn,
                                 Supplier<Ingredient> repairMaterialIn) {
            this.name = nameIn;
            this.maxDamageFactor = maxDamageFactorIn;
            this.damageReductionAmountArray = damageReductionAmountIn;
            this.enchantability = enchantabilityIn;
            this.soundEvent = soundEventIn;
            this.toughness = toughnessIn;
            this.repairMaterial = new LazyValue<>(repairMaterialIn);
        }

        @Override
        public int getDurability(EquipmentSlotType slotIn) {
            return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType slotIn) {
            return this.damageReductionAmountArray[slotIn.getIndex()];
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return this.soundEvent;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }

        @OnlyIn(Dist.CLIENT)

        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public float getToughness() {
            return this.toughness;
        }
    }
}