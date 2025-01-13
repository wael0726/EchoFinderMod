package com.jolojo500.echofinders.component;

import com.jolojo500.echofinders.EchoFindersMod;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponentType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.UnaryOperator;

public class ModDataComponents {
    public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENT_TYPES =
            DeferredRegister.createDataComponents(EchoFindersMod.MODID);

    private static <T>DeferredHolder<DataComponentType<?>, DataComponentType<T>> register(String name,
                                                                                          UnaryOperator<DataComponentType.Builder<T>> builderOperator){
        return DATA_COMPONENT_TYPES.register(name, ()->builderOperator.apply(DataComponentType.builder()).build());
    }

    public static final DeferredHolder<DataComponentType<?>,DataComponentType<BlockPos>> COORDINATES = register("findernearestobject",
            builder -> builder.persistent(BlockPos.CODEC));
}
