package com.jolojo500.echofinders.item;

import com.jolojo500.echofinders.EchoFindersMod;
import com.jolojo500.echofinders.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EchoFindersMod.MODID);

    public static final Supplier<CreativeModeTab> MALEKIUM_ITEMS_TAB = CREATIVE_MODE_TAB.register("malekium_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.MALEKIUM.get()))
                    .title(Component.translatable("creativetab.jolojo500echofinders.malekium_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.MALEKIUM.get());
                        output.accept(ModItems.MALEKIUMINGOT.get());

                        output.accept(ModItems.MALEKIUM_SWORD.get());
                        output.accept(ModItems.MALEKIUM_PICKAXE.get());
                        output.accept(ModItems.MALEKIUM_AXE.get());
                        output.accept(ModItems.MALEKIUM_SHOVEL.get());
                        output.accept(ModItems.MALEKIUM_HOE.get());
                        output.accept(ModItems.MALEKIUM_HAMMER.get());

                        output.accept(ModItems.MALEKIUM_HELMET.get());
                        output.accept(ModItems.MALEKIUM_CHESTPLATE.get());
                        output.accept(ModItems.MALEKIUM_LEGGINGS.get());
                        output.accept(ModItems.MALEKIUM_BOOTS.get());
                    })
                    .build());

    public static final Supplier<CreativeModeTab> MALEKIUM_BLOCKS_TAB = CREATIVE_MODE_TAB.register("malekium_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.MALEKIUM_BLOCK.get()))
                    .title(Component.translatable("creativetab.jolojo500echofinders.malekium_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.MALEKIUM_BLOCK.get());
                        output.accept(ModBlocks.MALEKIUM_ORE_BLOCK.get());
                        output.accept(ModBlocks.MALEKIUM_DEEPSLATE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
