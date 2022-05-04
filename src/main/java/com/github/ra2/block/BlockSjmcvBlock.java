package com.github.ra2.block;

import com.github.ra2.ra2;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSjmcvBlock extends BlockContainer {
    public BlockSjmcvBlock() {
        super(Material.rock);
        setBlockName("sj_mcvBlock");
        setBlockTextureName(ra2.MODID + ":sj_mcvblock");
        setHardness(0.5F);
        setStepSound(soundTypeStone);
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
        return new sj_mcvBlock();
    }
}
