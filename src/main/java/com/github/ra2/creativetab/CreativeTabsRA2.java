package com.github.ra2.creativetab;

import com.github.ra2.item.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsRA2 extends CreativeTabs {
    public CreativeTabsRA2() {
        super("RA2");
        this.setBackgroundImageName("ra2.png");
    }

    @Override
    public Item getTabIconItem() {
        return ItemLoader.sjmcv;
    }
}
