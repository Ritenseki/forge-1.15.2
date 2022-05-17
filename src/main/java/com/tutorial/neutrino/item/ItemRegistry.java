package com.tutorial.neutrino.item;


import com.tutorial.neutrino.block.BlockRegistry;
import com.tutorial.neutrino.group.ModGroup;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.obj.OBJModel;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "neutrino");
    public static RegistryObject<Item> obsidianIngot = ITEMS.register("obsidian_ingot", ()->{
        return new ObsidianIngot();
    });
    public static RegistryObject<Item> obsidianApple = ITEMS.register("obsidian_apple", ()->{
        return new ObsidianApple();
    });
    public static RegistryObject<Item> obsidianSword = ITEMS.register("obsidian_sword", ()-> {
        return new ObsidianSword();
    });
    public static RegistryObject<Item> obsidianBlock = ITEMS.register("obsidian_block", ()-> {
        return new BlockItem(BlockRegistry.obsidianBlock.get(), new Item.Properties().group(ModGroup.itemGroup));
    });
}