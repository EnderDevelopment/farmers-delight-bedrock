package com.enderdevelopment.agriculturebedrock.item;

import com.enderdevelopment.agriculturebedrock.AgricultureBedrockMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FRUIT = registerItem("fruit", new Item(new Item.Settings().food(ModFoodComponents.FRUIT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AgricultureBedrockMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AgricultureBedrockMod.LOGGER.info("Registering Mod Items for " + AgricultureBedrockMod.MOD_ID);
    }
}