package com.example;
import com.example.items.LifestealEnchantment;

import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {



//	public static final Item NEW_ITEM = new NewItem(new FabricItemSettings());

	public static Enchantment LIFESTEAL = new LifestealEnchantment();

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("enchantment");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


		LOGGER.info("Hello Fabric world!");

//		Registry.register(Registries.ITEM, new Identifier("enchantment", "new_item"), NEW_ITEM);
		Registry.register(Registries.ENCHANTMENT, new Identifier("enchantment", "lifesteal"), LIFESTEAL);

//		MinecraftServer server;
//		((StuffTimerAccess) server).yourmod_setTimer(100L); // do something after 100 ticks

//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
//			content.addAfter(Items.ENCHANTED_BOOK, NEW_ITEM);
	}
}