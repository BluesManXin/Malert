package com.github.ra2;


import com.github.ra2.block.BlockSjmcvBlock;
import com.github.ra2.common.CommonProxy;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = ra2.MODID, version = ra2.VERSION)
public class ra2
{
    public static final String MODID = "ra2";
    public static final String VERSION = "1.0.0";
    @SidedProxy(clientSide = "com.github.ra2.client.ClientProxy",
            serverSide = "com.github.ra2.common.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }


}