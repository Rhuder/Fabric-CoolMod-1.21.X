package com.rhuder.coolmod.util;

import com.rhuder.coolmod.CoolMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> NEEDS_SUPERCHARGED_URANIUM_TOOL = createTag("needs_supercharged_uranium_tool");
        public static final TagKey<Block> INCORRECT_FOR_SUPERCHARGED_URANIUM_TOOL = createTag("needs_supercharged_uranium_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(CoolMod.MOD_ID, name));
        }
    }

}
