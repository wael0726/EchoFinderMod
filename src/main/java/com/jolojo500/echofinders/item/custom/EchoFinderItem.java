package com.jolojo500.echofinders.item.custom;

import com.jolojo500.echofinders.block.ModBlocks;
import com.jolojo500.echofinders.component.ModDataComponents;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class EchoFinderItem extends Item {
    public EchoFinderItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        var pos = context.getClickedPos();
        if(!level.isClientSide()){
            BlockPos nearestOre = findNearestMalekiumOre(level, pos);

            if(nearestOre != null){
                context.getItemInHand().set(ModDataComponents.COORDINATES,nearestOre);
                //some render here ? or a trigger gets set off?
            }
        }

        return super.useOn(context);
    }


    private BlockPos findNearestMalekiumOre(Level level, BlockPos origin) {
        int searchRadius = 40;
        BlockPos nearestOre = null;
        double shortestDistance = Double.MAX_VALUE; //Could be replaced with 40?

        for (BlockPos pos : BlockPos.betweenClosed(origin.offset(-searchRadius, -searchRadius, -searchRadius), origin.offset(searchRadius, searchRadius, searchRadius))) {
            if (level.getBlockState(pos).is(ModBlocks.MALEKIUM_ORE_BLOCK.get())) {
                double distance = origin.distSqr(pos);
                if (distance < shortestDistance) {
                    shortestDistance = distance;
                    nearestOre = pos.immutable();
                }
            }
        }

        return nearestOre;
    }


    // check implementations etc in vanilla code to get it
    // maybe also check cake to see dynamic rendering
    //BlockEntityWithoutLevelRenderer
}
