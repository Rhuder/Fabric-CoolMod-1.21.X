package com.rhuder.coolmod.item;

import com.rhuder.coolmod.CoolMod;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item URANIUM_INGOT = registerItem("uranium_ingot", new Item(new Item.Settings()));
    public static final Item URANIUM_NUGGET = registerItem("uranium_nugget", new Item(new Item.Settings()));
    public static final Item RAW_URANIUM = registerItem("raw_uranium", new Item(new Item.Settings()));
    public static final Item URANIUM_INFUSED_COAL = registerItem("uranium_infused_coal", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CoolMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CoolMod.LOGGER.info("Registering Mod Items for " + CoolMod.MOD_ID);

    }
}