package com.rhuder.coolmod;

import com.rhuder.coolmod.block.ModBlocks;
import com.rhuder.coolmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoolMod implements ModInitializer {
	public static final String MOD_ID = "coolmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.URANIUM_INFUSED_COAL,3200);
	}
}