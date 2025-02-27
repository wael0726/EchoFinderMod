package com.jolojo500.echofinders.item;

import com.jolojo500.echofinders.EchoFindersMod;
import com.jolojo500.echofinders.item.custom.EchoFinderItem;
import com.jolojo500.echofinders.item.custom.HammerItem;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(
            //no need to specify a registry since it extends Deferred register but is for well Items thus making it built for it
            EchoFindersMod.MODID
    );

    public static  void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static final DeferredItem<Item> MALEKIUM = ITEMS.register("malekium", ()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> MALEKIUMINGOT = ITEMS.register("ingot", ()->new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> MALEKIUM_SWORD = ITEMS.register("malekiumsword",
            () -> new SwordItem(ModToolTiers.MALEKIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.MALEKIUM, 3.5f, -2.4f))));

    public static final DeferredItem<PickaxeItem> MALEKIUM_PICKAXE = ITEMS.register("malekiumpickaxe",
            () -> new PickaxeItem(ModToolTiers.MALEKIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.MALEKIUM, 1.5f, -2.8f))));

    public static final DeferredItem<ShovelItem> MALEKIUM_SHOVEL = ITEMS.register("malekiumshovel",
            () -> new ShovelItem(ModToolTiers.MALEKIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.MALEKIUM, 2f, -3.0f))));

    public static final DeferredItem<AxeItem> MALEKIUM_AXE = ITEMS.register("malekiumaxe",
            () -> new AxeItem(ModToolTiers.MALEKIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.MALEKIUM, 5, -3f))));

    public static final DeferredItem<HoeItem> MALEKIUM_HOE = ITEMS.register("malekiumhoe",
            () -> new HoeItem(ModToolTiers.MALEKIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.MALEKIUM, -3.0f, 0))));

    public static final DeferredItem<ArmorItem> MALEKIUM_HELMET = ITEMS.register("malekiumhelmet",
            () -> new ArmorItem(ModArmorMaterials.MALEKIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(34))));

    public static final DeferredItem<ArmorItem> MALEKIUM_CHESTPLATE = ITEMS.register("malekiumchestplate",
            () -> new ArmorItem(ModArmorMaterials.MALEKIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(34))));

    public static final DeferredItem<ArmorItem> MALEKIUM_LEGGINGS = ITEMS.register("malekiumleggings",
            () -> new ArmorItem(ModArmorMaterials.MALEKIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(34))));

    public static final DeferredItem<ArmorItem> MALEKIUM_BOOTS = ITEMS.register("malekiumboots",
            () -> new ArmorItem(ModArmorMaterials.MALEKIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(34))));

    public static final DeferredItem<HammerItem> MALEKIUM_HAMMER = ITEMS.register("malekiumhammer",
            () -> new HammerItem(ModToolTiers.MALEKIUM, new Item.Properties()
                    .attributes(HammerItem.createAttributes(ModToolTiers.MALEKIUM, 7F, -3.5f))));

    public static final DeferredItem<EchoFinderItem> ECHO_FINDER = ITEMS.registerItem("echofinder", EchoFinderItem::new,
            new Item.Properties().stacksTo(1)
            ); //need to double check

}
