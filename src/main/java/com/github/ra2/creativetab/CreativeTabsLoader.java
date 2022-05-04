package com.github.ra2.creativetab;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabsLoader {
    public static CreativeTabs tabRA2;

    public CreativeTabsLoader(FMLPreInitializationEvent event) {
        tabRA2 = new CreativeTabsRA2();
    }
}