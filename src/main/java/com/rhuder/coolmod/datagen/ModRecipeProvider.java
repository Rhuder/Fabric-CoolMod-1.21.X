package com.rhuder.coolmod.datagen;

import com.rhuder.coolmod.block.ModBlocks;
import com.rhuder.coolmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> URANIUM_INGOT_SMELTABLES = List.of(ModItems.RAW_URANIUM, ModBlocks.URANIUM_ORE);

        offerSmelting(recipeExporter, URANIUM_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.URANIUM_INGOT, 0.25f, 200, "uranium_ingot");
        offerBlasting(recipeExporter, URANIUM_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.URANIUM_INGOT, 0.25f, 100, "uranium_ingot");

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.URANIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.URANIUM_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.URANIUM_NUGGET, RecipeCategory.MISC, ModItems.URANIUM_INGOT);


    }
}
