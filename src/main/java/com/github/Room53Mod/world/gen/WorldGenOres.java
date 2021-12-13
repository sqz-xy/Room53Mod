package com.github.Room53Mod.world.gen;

import com.github.Room53Mod.init.BlockInit;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGenOres implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimension() == 0) {
            generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateOverworld(Random pRandom, int pChunkX, int pChunkZ, World pWorld, IChunkGenerator pChunkGenerator, IChunkProvider pChunkProvider) {
        // Add more ores here
        generateOre(BlockInit.CUMIUM_ORE.getDefaultState(), pWorld, pRandom, pChunkX * 16, pChunkZ * 16, 3, 25, pRandom.nextInt(3) + 1, 1);
    }

    private void generateOre(IBlockState pOre, World pWorld, Random pRandom, int pX, int pZ, int pMinY, int pMaxY, int pSize, int pChance) {
        int deltaY = pMaxY - pMinY;

        for (int i = 0; i < pChance; i++) {
            BlockPos pos = new BlockPos(pX + pRandom.nextInt(16), pMinY + pRandom.nextInt(deltaY), pZ + pRandom.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(pOre, pSize);
            generator.generate(pWorld, pRandom, pos);
        }
    }
}
