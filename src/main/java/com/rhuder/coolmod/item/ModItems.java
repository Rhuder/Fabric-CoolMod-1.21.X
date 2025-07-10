package com.rhuder.coolmod.item;

import com.rhuder.coolmod.CoolMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item URANIUM_INGOT = registerItem("uranium_ingot", new Item(new Item.Settings()));
    public static final Item URANIUM_NUGGET = registerItem("uranium_nugget", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CoolMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CoolMod.LOGGER.info("Registering Mod Items for " + CoolMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(URANIUM_INGOT);
            fabricItemGroupEntries.add(URANIUM_NUGGET);
        });

    }
}