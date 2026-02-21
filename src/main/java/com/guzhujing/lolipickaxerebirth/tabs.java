package com.guzhujing.lolipickaxerebirth;

import com.guzhujing.lolipickaxerebirth.common.register;
import com.guzhujing.lolipickaxerebirth.common.registerItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;

public class tabs {
    // 功能氪金萝莉：重生标签页
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LOLIR_TAB = lolipickaxerebirth.TABS.register("lolipickaxerebirthTab",() -> CreativeModeTab.builder()
        .title(Component.translatable("itemGroup.lolipickaxerebirth.lolipickaxerebirth_tab"))
        .icon(() -> new ItemStack(registerItem.LOLIPICKAXE.get()))
        .displayItems((parameters, output) -> {
            output.accept(new ItemStack(registerItem.COMMON_LOLIPICKAXE.get()));
            output.accept(new ItemStack(registerItem.LOLIPICKAXE.get()));
            output.accept(new ItemStack(registerItem.LOLICARD.get()));
            output.accept(new ItemStack(registerItem.LOLI_CARD_ONLINE.get()));
            output.accept(new ItemStack(registerItem.LOLI_ALBUM.get()));
        }).build());
    
    // 功能氪金萝莉：材质标签页
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LOLI_MATERIAL_TAB = lolipickaxerebirth.TABS.register("lolipickaxerebirthMaterialTab", () -> CreativeModeTab.builder()
        .title(Component.translatable("itemGroup.lolipickaxerebirth.lolipickaxerebirthMaterialTab"))
        .icon(() -> new ItemStack(registerItem.LOLI_SOUL.get()))
        .displayItems((parameters, output) -> {
            var materialItems = new Item[]{
                registerItem.COAL_ADDON.get(),
                registerItem.IRON_ADDON.get(),
                registerItem.GOLD_ADDON.get(),
                registerItem.REDSTONE_ADDON.get(),
                registerItem.LAPIS_ADDON.get(),
                registerItem.DIAMOND_ADDON.get(),
                registerItem.EMERALD_ADDON.get(),
                registerItem.OBSIDIAN_ADDON.get(),
                registerItem.GLOW_ADDON.get(),
                registerItem.QUARTZ_ADDON.get(),
                registerItem.NETHER_STAR_ADDON.get(),
                registerItem.LOLI_SOUL.get()
            };
            for (var item : materialItems) {addMaterialLevelItems(output, (register)item);}
            output.accept(new ItemStack(registerItem.NETHERITE_ADDON.get()));
            output.accept(new ItemStack(registerItem.LOLI_AUTO_FURNACE_ADDON.get()));
            output.accept(new ItemStack(registerItem.LOLI_FLY_ADDON.get()));
        }).build());
    // 作用递归添加物品
    private static void addMaterialLevelItems(CreativeModeTab.Output output, register item) {
        for (int i = 0; i < item.getMaxMaterialLevel(); i++) {
            ItemStack stack = new ItemStack(item);
            item.setMaterialLevel(stack, i + 1);
            var registryName = BuiltInRegistries.ITEM.getKey(item);
            if (registryName != null) {
                stack.set(DataComponents.CUSTOM_NAME, Component.translatable("item.lolipickaxerebirth." + registryName.getPath() + ".level" + (i + 1)));
            }
            output.accept(stack);
        }
    }
}
