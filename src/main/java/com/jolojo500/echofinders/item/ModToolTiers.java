package com.jolojo500.echofinders.item;

import com.jolojo500.echofinders.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier MALEKIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_MALEKIUM_TOOL,
            1400, 4f, 3f, 28, () -> Ingredient.of(ModItems.MALEKIUM));
}
