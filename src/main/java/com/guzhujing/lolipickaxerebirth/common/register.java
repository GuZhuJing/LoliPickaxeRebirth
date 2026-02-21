package com.guzhujing.lolipickaxerebirth.common;

import com.guzhujing.lolipickaxerebirth.lolipickaxerebirth;
import com.mojang.serialization.Codec;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredHolder;

public class register extends Item implements interfaceItem {
    private final int maxMaterialLevel;
    private final boolean enchantmentGlintOverride;
    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Integer>> materialLevel = lolipickaxerebirth.DATA_COMPONENTS.register("maxMaterialLevel", () -> DataComponentType.<Integer>builder().persistent(Codec.INT).build());
    public static class Builder {
        private int maxStackSize = 64;
        private int maxMaterialLevel = 0;
        private boolean enchantmentGlintOverride = false;
        private Rarity rarity = Rarity.COMMON;
        public Builder maxStackSize(int maxStackSize) {
            this.maxStackSize = maxStackSize;
            return this;}
        public Builder maxMaterialLevel(int maxMaterialLevel) {
            this.maxMaterialLevel = maxMaterialLevel;
            return this;}
        public Builder enchantmentGlintOverride(boolean override) {
            this.enchantmentGlintOverride = override;
            return this;}
        public Builder rarity(Rarity rarity) {
            this.rarity = rarity;
            return this;}
        public register build() {
            return new register(maxStackSize, maxMaterialLevel, enchantmentGlintOverride, rarity);}}
    private register(int maxStackSize, int maxMaterialLevel, boolean enchantmentGlintOverride, Rarity rarity) {
        super(new Item.Properties().stacksTo(maxStackSize).rarity(rarity));
        this.maxMaterialLevel = maxMaterialLevel;
        this.enchantmentGlintOverride = enchantmentGlintOverride;}
    
    @Override  // 获取最大材料等级
    public int getMaxMaterialLevel() {
        return maxMaterialLevel;}
    @Override  // 设置当前材质等级
    public void setMaterialLevel(ItemStack stack, int level) {
        stack.set(materialLevel, level);}
    @Override  // 是否显示附魔光效
    public boolean isFoil(ItemStack stack) {
        if (enchantmentGlintOverride) {
            return true;}
        return false;}
    public static Builder builder() {
        return new Builder();}
}
