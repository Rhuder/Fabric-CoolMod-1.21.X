package com.rhuder.coolmod.block;

import com.rhuder.coolmod.CoolMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block URANIUM_BLOCK = registerBlock("uranium_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.METAL).resistance(5f)));
    public static final Block URANIUM_ORE = registerBlock("uranium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),AbstractBlock.Settings.create()
                    .strength(3f).requiresTool().sounds(BlockSoundGroup.STONE).resistance(3f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CoolMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CoolMod.MOD_ID,name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CoolMod.LOGGER.info("Registering Mod Blocks for " + CoolMod.MOD_ID);
    }
}
