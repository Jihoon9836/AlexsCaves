package com.github.alexmodguy.alexscaves.server.item;

import com.github.alexmodguy.alexscaves.server.potion.ACEffectRegistry;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ACFoods {
    public static final FoodProperties TRILOCARIS_TAIL = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).meat().build();
    public static final FoodProperties TRILOCARIS_TAIL_COOKED = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.5F).meat().build();
    public static final FoodProperties PINE_NUTS = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.175F).build();
    public static final FoodProperties DINOSAUR_NUGGETS = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).meat().fast().build();
    public static final FoodProperties SERENE_SALAD = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.35F).build();
    public static final FoodProperties SEETHING_STEW = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).effect(() -> new MobEffectInstance(ACEffectRegistry.RAGE.get(), 2200), 1.0F).build();
    public static final FoodProperties PRIMORDIAL_SOUP = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 800), 1.0F).build();
    public static final FoodProperties RADGILL = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).effect(() -> new MobEffectInstance(ACEffectRegistry.IRRADIATED.get(), 2000), 1.0F).build();
    public static final FoodProperties RADGILL_COOKED = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.3F).effect(() -> new MobEffectInstance(ACEffectRegistry.IRRADIATED.get(), 1000), 0.1F).build();
    public static final FoodProperties SPELUNKIE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).fast().build();
    public static final FoodProperties SLAM = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F).meat().effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400), 1.0F).build();
    public static final FoodProperties SOYLENT_GREEN = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.35F).alwaysEat().meat().build();
    public static final FoodProperties LANTERNFISH = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.175F).fast().build();
    public static final FoodProperties LANTERNFISH_COOKED = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).fast().build();
    public static final FoodProperties TRIPODFISH = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).build();
    public static final FoodProperties TRIPODFISH_COOKED = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.34F).build();
    public static final FoodProperties SEA_PIG = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 1200), 0.7F).build();
    public static final FoodProperties MUSSEL_COOKED = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).fast().build();
    public static final FoodProperties DEEP_SEA_SUSHI_ROLL = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.4F).build();
    public static final FoodProperties STINKY_FISH = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.STUNNED.get(), 100), 1.0F).build();
    public static final FoodProperties VESPER_WING = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2F).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 1200), 1.0F).build();
    public static final FoodProperties VESPER_SOUP = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.3F).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 2400), 1.0F).build();
    public static final FoodProperties DARKENED_APPLE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.35F).alwaysEat().build();

    public static final FoodProperties BLOCK_OF_CHOCOLATE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties BLOCK_OF_FROSTING = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.02F).build();
    public static final FoodProperties SWEET_PUFF = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.02F).build();
    public static final FoodProperties CAKE_LAYER = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.02F).build();
    public static final FoodProperties COOKIE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties COOKIE_HALF = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.05F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties DOUGH = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties LICOROOT = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.1F).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 0.1F).build();
    public static final FoodProperties LICOROOT_VINE = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 0.1F).build();
    public static final FoodProperties SMALL_PEPPERMINT = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.15F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties LARGE_PEPPERMINT = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.15F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties VANILLA_ICE_CREAM = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.2F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.03F).build();
    public static final FoodProperties CHOCOLATE_ICE_CREAM = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.2F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.03F).build();
    public static final FoodProperties SWEETBERRY_ICE_CREAM = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.2F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.03F).build();
    public static final FoodProperties SUNDAE = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.35F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 400), 0.2F).build();
    public static final FoodProperties SPRINKLES = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties GIANT_SWEETBERRY = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.2F).build();
    public static final FoodProperties CANDY_CANE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties CANDY_CANE_POLE = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties LOLLIPOP_BUNCH = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties FROSTMINT = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties SUGAR_GLASS = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties SUNDROP = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.2F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.05F).build();
    public static final FoodProperties GUMMY_RING = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.15F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties ROCK_CANDY = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties JELLY_BEAN = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.05F).build();
    public static final FoodProperties GINGERBREAD = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties GINGERBREAD_HALF = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties GINGERBREAD_CRUMBS = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties PURPLE_SODA_BOTTLE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties SWEETISH_FISH = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties GELATIN = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.25F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties HOT_CHOCOLATE_BOTTLE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.25F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.02F).build();
    public static final FoodProperties PEPPERMINT_POWDER = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).fast().effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties CARAMEL = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.04F).build();
    public static final FoodProperties CARAMEL_APPLE = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.2F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.02F).build();
    public static final FoodProperties GUMBALL_PILE = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2F).effect(() -> new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 200), 0.01F).build();
    public static final FoodProperties ALEX_MEAL = (new FoodProperties.Builder()).nutrition(40).saturationMod(5.0F).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 1.0F).effect(() -> new MobEffectInstance(MobEffects.BAD_OMEN, 48000), 1.0F).build();
    public static final FoodProperties BIOME_TREAT = (new FoodProperties.Builder()).nutrition(20).saturationMod(0.1F).build();
    public static final FoodProperties BIOME_TREAT_DONE = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).build();

}
