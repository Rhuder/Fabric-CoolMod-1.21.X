package com.rhuder.coolmod.item;

import com.rhuder.coolmod.CoolMod;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item URANIUM_INGOT = registerItem("uranium_ingot", new Item(new Item.Settings()));
    public static final Item URANIUM_NUGGET = registerItem("uranium_nugget", new Item(new Item.Settings()));
    public static final Item RAW_URANIUM = registerItem("raw_uranium", new Item(new Item.Settings()));
    public static final Item URANIUM_INFUSED_COAL = registerItem("uranium_infused_coal", new Item(new Item.Settings()));
    public static final Item SUPERCHARGED_URANIUM_INGOT = registerItem("supercharged_uranium_ingot", new Item(new Item.Settings()));
    public static final Item SUPERCHARGED_URANIUM_PICKAXE = registerItem("supercharged_uranium_pickaxe", new PickaxeItem(ModToolMaterials.SUPERCHARGED_URANIUM,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SUPERCHARGED_URANIUM,1.0F, -2.8F))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CoolMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CoolMod.LOGGER.info("Registering Mod Items for " + CoolMod.MOD_ID);

    }
}