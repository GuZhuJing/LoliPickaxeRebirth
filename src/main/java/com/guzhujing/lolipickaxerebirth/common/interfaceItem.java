package com.guzhujing.lolipickaxerebirth.common;

import net.minecraft.world.item.ItemStack;

public interface interfaceItem {
    int getMaxMaterialLevel();
    void setMaterialLevel(ItemStack stack, int level);
}
