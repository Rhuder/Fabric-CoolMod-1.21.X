package com.rhuder.coolmod.datagen;

import com.rhuder.coolmod.block.ModBlocks;
import com.rhuder.coolmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.URANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.URANIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUPERCHARGED_URANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.URANIUM_INFUSED_COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_URANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUPERCHARGED_URANIUM_PICKAXE, Models.GENERATED);

    }
}
