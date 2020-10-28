package corgiaoc.byg.common.world.feature.overworld.trees.oak;

import com.mojang.serialization.Codec;
import corgiaoc.byg.common.world.feature.config.BYGTreeConfig;
import corgiaoc.byg.common.world.feature.overworld.trees.util.BYGAbstractTreeFeature;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;

import java.util.Random;
import java.util.Set;

public class OakTree3 extends BYGAbstractTreeFeature<BYGTreeConfig> {

    public OakTree3(Codec<BYGTreeConfig> configIn) {
        super(configIn);
    }

    protected boolean generate(Set<BlockPos> changedBlocks, ISeedReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling, BYGTreeConfig config) {

        int randTreeHeight = config.getMinHeight() + rand.nextInt(config.getMaxPossibleHeight());
        BlockPos.Mutable mainmutable = new BlockPos.Mutable().setPos(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getHeight()) {
            if (!isDesiredGroundwDirtTag(worldIn, pos.down(), config)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 7, 5, 5, isSapling)) {
                return false;
            } else {
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 0, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 1, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 2, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 3, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 4, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 5, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 6, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 3, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 3, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 3, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 4, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 5, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 5, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 5, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 6, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 6, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 6, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 6, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 6, -3), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 6, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 6, -3), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-4, 7, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-4, 7, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 7, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 7, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 7, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 7, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 7, 3), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 8, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 8, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 9, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 9, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 9, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 10, -3), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 10, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 10, -3), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 10, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 11, -4), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 11, -3), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 11, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 2, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 2, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 2, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 3, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 3, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 3, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 3, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 3, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 3, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 3, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 3, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 4, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 4, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 4, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 4, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 4, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 4, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 5, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 5, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 5, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 5, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 5, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 5, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 5, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 5, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 5, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 5, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 5, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 5, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 5, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 5, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 5, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-5, 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-5, 6, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-4, 6, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-4, 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-4, 6, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 6, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 6, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 6, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 6, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 6, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 6, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 6, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 6, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 6, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 6, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 6, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 6, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 6, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 6, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 6, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 6, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 6, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 6, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 6, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 6, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 6, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 6, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 6, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 6, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 6, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-5, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-5, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-4, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-4, 7, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 7, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 7, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 7, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 7, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 7, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 7, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 7, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 7, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 7, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 7, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-4, 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-4, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-4, 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 8, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 8, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-4, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-4, 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 9, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 9, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 9, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-4, 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-4, 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 10, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 10, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 10, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 11, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 11, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 11, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 11, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 11, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 11, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 11, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 11, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 11, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 11, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 11, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 11, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 11, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 11, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 11, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 11, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 11, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 11, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 12, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 12, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 12, -3), boundsIn);
            }
        }
        return true;
    }
}