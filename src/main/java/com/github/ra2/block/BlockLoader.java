package com.github.ra2.block;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockLoader {
    public static Block sjmcvBlock = new BlockSjmcvBlock();
    public static Block sjzgBlock = new BlockSjzgBlock();

    public BlockLoader(FMLPreInitializationEvent event) {
        register(sjmcvBlock, "sj_mcvblock");
    }

    private static void register(Block block, String name) {
        GameRegistry.registerBlock(sjmcvBlock, "sj_mcvblock");
        GameRegistry.registerBlock(sjzgBlock, "sj_zgblock");
    }

}
