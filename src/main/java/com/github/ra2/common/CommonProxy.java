package com.github.ra2.common;

import com.github.ra2.block.BlockLoader;
import com.github.ra2.block.sj_mcvBlock;
import com.github.ra2.creativetab.CreativeTabsLoader;
import com.github.ra2.item.ItemLoader;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event)
    {
        new CreativeTabsLoader(event);
        new ItemLoader(event);
        new BlockLoader(event);
        ClientRegistry.bindTileEntitySpecialRenderer(sj_mcvBlock.class, new sj_mcvBlock.TESRsj_mcvBlock());
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
