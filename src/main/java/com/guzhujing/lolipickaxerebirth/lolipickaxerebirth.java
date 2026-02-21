package com.guzhujing.lolipickaxerebirth;

import com.mojang.logging.LogUtils;

import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(lolipickaxerebirth.MODID)
public class lolipickaxerebirth {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "lolipickaxe_rebirth";
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
     public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENTS = DeferredRegister.create(Registries.DATA_COMPONENT_TYPE, MODID);
    public static final DeferredRegister.Entities ENTITIES = DeferredRegister.createEntities(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public lolipickaxerebirth(IEventBus modEventBus, ModContainer modContainer) {
        BLOCKS.register(modEventBus);
        ENTITIES.register(modEventBus);
        ITEMS.register(modEventBus);
        TABS.register(modEventBus);
        LOGGER.debug("{} 已注册。", MODID);
    }
}
