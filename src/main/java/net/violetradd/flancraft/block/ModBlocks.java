package net.violetradd.flancraft.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.violetradd.flancraft.Flancraft;

public class ModBlocks {
    public static final Block FLAN_BLOCK = registerBlock("flan_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(1f)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SLIME)));

    public static final Block CUSTARD_BLOCK = registerBlock("custard_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(1f)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SLIME)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Flancraft.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Flancraft.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Flancraft.LOGGER.info("Registering Mod Blocks for " + Flancraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(FLAN_BLOCK);
            entries.add(CUSTARD_BLOCK);
        });
    }
}
