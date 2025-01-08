package com.jolojo500.echofinders.worldgen;

import com.jolojo500.echofinders.EchoFindersMod;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_MALEKIUM_ORE = registerKey("oreblock");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);
        // All Biomes
        //context.register(ADD_MALEKIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                //biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                //HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MALEKIUM_ORE_PLACED_KEY)),
                //GenerationStep.Decoration.UNDERGROUND_ORES));

        // Biomes individuels
        context.register(ADD_MALEKIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                 HolderSet.direct(biomes.getOrThrow(Biomes.PLAINS), biomes.getOrThrow(Biomes.DEEP_DARK)),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MALEKIUM_ORE_PLACED_KEY)),
                 GenerationStep.Decoration.UNDERGROUND_ORES));

    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(EchoFindersMod.MODID, name));
    }
}