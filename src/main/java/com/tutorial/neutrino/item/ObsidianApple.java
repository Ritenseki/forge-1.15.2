package com.tutorial.neutrino.item;

import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ObsidianApple extends Item {
    public static EffectInstance effectInstance =new EffectInstance(Effects.POISON, 3 * 20, 1);
    public static Food food = (new Food.Builder())
            .saturation(10)
            .hunger(20)
            .effect(effectInstance, 1)
            .build();
    public ObsidianApple() {
            super(new Properties().food(food).group(ItemGroup.FOOD));
    }

}
