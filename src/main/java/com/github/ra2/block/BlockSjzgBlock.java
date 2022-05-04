package com.github.ra2.block;

import com.github.ra2.ra2;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSjzgBlock extends Block {
    public BlockSjzgBlock() {
        super(Material.rock);
        setBlockName("sj_zgBlock");
        setBlockTextureName(ra2.MODID + ":sj_zgBlock");
        setHardness(0.5F);
        setStepSound(soundTypeStone);
    }
}