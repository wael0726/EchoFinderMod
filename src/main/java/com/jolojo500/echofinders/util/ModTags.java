package com.jolojo500.echofinders.util;

import com.jolojo500.echofinders.EchoFindersMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_MALEKIUM_TOOL = createTag("needs_malekium_tool");
        public static final TagKey<Block> INCORRECT_FOR_MALEKIUM_TOOL = createTag("incorrect_for_malekium_tool");
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(EchoFindersMod.MODID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(EchoFindersMod.MODID, name));
        }
    }
}
