package net.violetradd.flancraft;

import net.fabricmc.api.ModInitializer;

import net.violetradd.flancraft.block.ModBlocks;
import net.violetradd.flancraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Flancraft implements ModInitializer {
	public static final String MOD_ID = "flancraft";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}