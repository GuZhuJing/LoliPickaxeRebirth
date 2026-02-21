package com.guzhujing.lolipickaxerebirth.common;

import com.guzhujing.lolipickaxerebirth.lolipickaxerebirth;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;

public class registerItem {
    // 注册物品：普通萝莉
    public static final DeferredItem<Item> COMMON_LOLIPICKAXE = lolipickaxerebirth.ITEMS.register("common_lolipickaxe", () -> register.builder().maxStackSize(1).rarity(Rarity.UNCOMMON).build());
    // 注册物品：氪金萝莉
    public static final DeferredItem<Item> LOLIPICKAXE = lolipickaxerebirth.ITEMS.register("lolipickaxe", () -> register.builder().maxStackSize(1).rarity(Rarity.EPIC).build());

    //注册物品：萝莉卡片
    public static final DeferredItem<Item> LOLICARD = lolipickaxerebirth.ITEMS.register("lolicard", () -> register.builder().maxStackSize(64).build());
    // 注册物品：萝莉网络卡片
    public static final DeferredItem<Item> LOLI_CARD_ONLINE = lolipickaxerebirth.ITEMS.register("loli_card_online", () -> register.builder().maxStackSize(1).build());
    // 注册物品：萝莉卡册
    public static final DeferredItem<Item> LOLI_ALBUM = lolipickaxerebirth.ITEMS.register("loli_album", () -> register.builder().maxStackSize(1).build());

    // 回到过去升级：煤炭
    public static final DeferredItem<Item> COAL_ADDON = lolipickaxerebirth.ITEMS.register("loli_coal_addon", () -> register.builder().maxStackSize(64).maxMaterialLevel(10).build());
    // 采集速度升级：铁
    public static final DeferredItem<Item> IRON_ADDON = lolipickaxerebirth.ITEMS.register("loli_iron_addon", () -> register.builder().maxStackSize(64).maxMaterialLevel(10).build());
    // 攻击伤害升级：金
    public static final DeferredItem<Item> GOLD_ADDON = lolipickaxerebirth.ITEMS.register("loli_gold_addon", () -> register.builder().maxStackSize(64).maxMaterialLevel(7).build());
    // 攻击速度升级：红石
    public static final DeferredItem<Item> REDSTONE_ADDON = lolipickaxerebirth.ITEMS.register("loli_redstone_addon", () -> register.builder().maxStackSize(64).maxMaterialLevel(4).build());
    // 时运掠夺升级：青金石
    public static final DeferredItem<Item> LAPIS_ADDON = lolipickaxerebirth.ITEMS.register("loli_lapis_addon", () -> register.builder().maxStackSize(64).maxMaterialLevel(6).build());
    // 采集等级升级：钻石
    public static final DeferredItem<Item> DIAMOND_ADDON = lolipickaxerebirth.ITEMS.register("loli_diamond_addon", () -> register.builder().maxStackSize(64).maxMaterialLevel(6).build());
    // 采集范围升级：绿宝石
    public static final DeferredItem<Item> EMERALD_ADDON = lolipickaxerebirth.ITEMS.register("loli_emerald_addon", () -> register.builder().maxStackSize(64).maxMaterialLevel(5).build());
    // 勇气之霎升级：黑曜石
    public static final DeferredItem<Item> OBSIDIAN_ADDON = lolipickaxerebirth.ITEMS.register("loli_obsidian_addon", () -> register.builder().maxStackSize(64).maxMaterialLevel(10).build());
    // 状态效果升级：萤石
    public static final DeferredItem<Item> GLOW_ADDON = lolipickaxerebirth.ITEMS.register("loli_glow_addon", () -> register.builder().maxStackSize(64).maxMaterialLevel(3).build());
    // 攻击范围升级：石英
    public static final DeferredItem<Item> QUARTZ_ADDON = lolipickaxerebirth.ITEMS.register("loli_quartz_addon", () -> register.builder().maxStackSize(64).maxMaterialLevel(3).build());
    // 超位加权升级：下界合金
    public static final DeferredItem<Item> NETHERITE_ADDON = lolipickaxerebirth.ITEMS.register("loli_netherite_addon", () -> register.builder().maxStackSize(64).rarity(Rarity.RARE).build());
    // 储存容量升级：下界之星
    public static final DeferredItem<Item> NETHER_STAR_ADDON = lolipickaxerebirth.ITEMS.register("loli_nether_star_addon", () -> register.builder().maxStackSize(64).maxMaterialLevel(5).enchantmentGlintOverride(true).build());
    // 自动冶炼升级：熔炉
    public static final DeferredItem<Item> LOLI_AUTO_FURNACE_ADDON = lolipickaxerebirth.ITEMS.register("loli_auto_furnace_addon", () -> register.builder().maxStackSize(64).rarity(Rarity.RARE).build());
    // 飞行升级
    public static final DeferredItem<Item> LOLI_FLY_ADDON = lolipickaxerebirth.ITEMS.register("loli_fly_addon", () -> register.builder().maxStackSize(64).rarity(Rarity.RARE).build());
    // 生物灵魂
    public static final DeferredItem<Item> LOLI_SOUL = lolipickaxerebirth.ITEMS.register("loli_soul", () -> register.builder().maxStackSize(64).maxMaterialLevel(7).build());
}
