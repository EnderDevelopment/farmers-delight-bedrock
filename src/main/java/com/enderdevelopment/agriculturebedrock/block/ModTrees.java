package com.enderdevelopment.agriculturebedrock.block;

import com.enderdevelopment.agriculturebedrock.AgricultureBedrockMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModTrees {
    public static final Block OLIVE_LOG = registerBlock("olive_log",
            new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block OLIVE_LEAVES = registerBlock("olive_leaves",
            new Block(Block.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block OLIVE_SAPLING = registerBlock("olive_sapling",
            new SaplingBlock(new SaplingGenerator(), Block.Settings.copy(Blocks.OAK_SAPLING)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AgricultureBedrockMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AgricultureBedrockMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModTrees() {
        AgricultureBedrockMod.LOGGER.info("Registering ModTrees for " + AgricultureBedrockMod.MOD_ID);
    }
}