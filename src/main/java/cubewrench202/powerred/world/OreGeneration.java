package cubewrench202.powerred.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import cubewrench202.powerred.common.PRBlocks;

public class OreGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX, chunkZ);
			break;
		case 0:
			generateOverWorld(world, random, chunkX, chunkZ);
			break;
		case 1:
			generateEnd(world, random, chunkX, chunkZ);
			break;
		}
	}

	public void generateNether(World world, Random rand, int x, int z) {

	}

	public void generateOverWorld(World world, Random rand, int x, int z) {
		// generateOre(PowerRed.blockHerePlease, world, rand, x, z, minVeinSize,
		// maxVeinSize, chance,
		// minLevelSpawn, maxLevelSpawn, whereCanGenerate
		generateOre(PRBlocks.blockRubyOre, world, rand, x, z, 1, 3, 20, 0, 30,
				Blocks.stone);
		generateOre(PRBlocks.blockSapphireOre, world, rand, x, z, 1, 3, 20, 0,
				30, Blocks.stone);
		generateOre(PRBlocks.blockPeridiotOre, world, rand, x, z, 1, 3, 20, 0,
				30, Blocks.stone);
		generateOre(PRBlocks.blockCopperOre, world, rand, x, z, 2, 5, 20, 0,
				64, Blocks.stone);
		generateOre(PRBlocks.blockTinOre, world, rand, x, z, 2, 5, 20, 0, 55,
				Blocks.stone);
		generateOre(PRBlocks.blockNikoliteOre, world, rand, x, z, 2, 6, 20, 0,
				20, Blocks.stone);
		generateOre(PRBlocks.blockSilverOre, world, rand, x, z, 2, 5, 20, 0,
				28, Blocks.stone);

	}

	public void generateEnd(World world, Random rand, int x, int z) {

	}

	public void generateOre(Block block, World world, Random random,

	int ChunkX, int ChunkZ, int minVeinSize, int maxVeinSize, int chance,
			int minY, int maxY, Block generateIn) {
		int veinSize = minVeinSize + random.nextInt(maxVeinSize = minVeinSize);
		int heightRange = maxY - minY;
		WorldGenMinable gen = new WorldGenMinable(block, veinSize, generateIn);
		for (int i = 0; i < chance; i++) {
			int xRand = ChunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(heightRange) + minY;
			int zRand = ChunkZ * 16 + random.nextInt(16);
			gen.generate(world, random, xRand, yRand, zRand);
		}
	}
}
