package com.figgity.endtools.init;

import com.figgity.endtools.EndTools;
import com.figgity.endtools.item.AstralObsidianSword;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, EndTools.MODID);

    public static final RegistryObject<AstralObsidianSword> ASTRAL_OBSIDIAN_SWORD = Items.register("astral_obsidian_sword",
            () -> new AstralObsidianSword(new Item.Properties()));
}