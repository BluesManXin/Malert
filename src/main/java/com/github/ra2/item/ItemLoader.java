package com.github.ra2.item;

import com.github.ra2.creativetab.CreativeTabsLoader;
import com.github.ra2.ra2;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemLoader {
    public static Item sjmcv = new ItemSjmcv()
            .setUnlocalizedName("sj_mcv")
            .setTextureName(ra2.MODID + ":sj_mcv")
            .setCreativeTab(CreativeTabsLoader.tabRA2);
    public static Item sjzg = new ItemSjzg()
            .setUnlocalizedName("sj_zg")
            .setTextureName(ra2.MODID + ":sj_zg")
            .setCreativeTab(CreativeTabsLoader.tabRA2);
    public static Item sjby = new ItemSjby()
            .setUnlocalizedName("sj_by")
            .setTextureName(ra2.MODID + ":sj_by")
            .setCreativeTab(CreativeTabsLoader.tabRA2);


    public ItemLoader(FMLPreInitializationEvent event) {
        register(sjmcv, "sj_mcv");
        register(sjzg, "sj_zg");
        register(sjby, "sj_by");
    }

    private static void register(Item item, String name) {
        GameRegistry.registerItem(sjmcv, "sj_mcv");
        GameRegistry.registerItem(sjzg, "sj_zg");
        GameRegistry.registerItem(sjby, "sj_by");
    }

}
