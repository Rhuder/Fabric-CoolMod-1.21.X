package com.rhuder.coolmod.item;

import com.rhuder.coolmod.CoolMod;
import com.rhuder.coolmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup COOLMOD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CoolMod.MOD_ID, "coolmod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.URANIUM_INGOT))
                    .displayName(Text.translatable("itemgroup.coolmod.coolmod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.URANIUM_INGOT);
                        entries.add(ModItems.URANIUM_NUGGET);
                        entries.add(ModItems.URANIUM_INFUSED_COAL);
                        entries.add(ModBlocks.URANIUM_BLOCK);
                        entries.add(ModBlocks.URANIUM_ORE);
                        entries.add(ModItems.RAW_URANIUM);
                        entries.add(ModItems.SUPERCHARGED_URANIUM_INGOT);
                        entries.add(ModItems.SUPERCHARGED_URANIUM_PICKAXE);
                    })

                    .build());

    public static void registerItemGroups() {
        CoolMod.LOGGER.info("Registering Item groups for " + CoolMod.MOD_ID);


    }
}
