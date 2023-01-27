package net.obed.modprueba;

import net.fabricmc.api.ModInitializer;
import net.obed.modprueba.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModPrueba implements ModInitializer {

	public static final String MOD_ID = "modprueba";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}
