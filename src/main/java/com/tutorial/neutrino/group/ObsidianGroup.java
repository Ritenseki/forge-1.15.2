package com.tutorial.neutrino.group;

import com.tutorial.neutrino.item.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ObsidianGroup extends ItemGroup {
    public ObsidianGroup() {
        super("ObsidianGroup");
    }
    @Override
    public ItemStack createIcon(){
        return new ItemStack(ItemRegistry.obsidianIngot.get());
    }
}
