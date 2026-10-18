package com.enderdevelopment.agriculturebedrock.block;

import com.enderdevelopment.agriculturebedrock.AgricultureBedrockMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CATEGORY_1_PLANT = registerBlock("category_1_plant",
            new CropBlock(Block.Settings.copy(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AgricultureBedrockMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AgricultureBedrockMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        AgricultureBedrockMod.LOGGER.info("Registering ModBlocks for " + AgricultureBedrockMod.MOD_ID);
    }
}