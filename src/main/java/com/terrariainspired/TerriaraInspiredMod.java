package com.terrariainspired;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.terrariainspired.registry.*;

public class TerriaraInspiredMod implements ModInitializer {
	public static final String MOD_ID = "terraria-inspired-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Terraria Inspired Mod inicializando...");
		
		// Registrar minérios
		ModOreRegistry.register();
		
		// Registrar itens
		ModItemRegistry.register();
		
		// Registrar blocos
		ModBlockRegistry.register();
		
		// Registrar entidades (bosses e mobs)
		ModEntityRegistry.register();
		
		// Registrar receitas
		ModRecipeRegistry.register();
		
		LOGGER.info("Terraria Inspired Mod carregado com sucesso!");
	}
}