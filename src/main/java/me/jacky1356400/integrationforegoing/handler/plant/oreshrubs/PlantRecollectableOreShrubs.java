package me.jacky1356400.integrationforegoing.handler.plant.oreshrubs;

import com.buuz135.industrial.api.plant.PlantRecollectable;
import me.jacky1356400.integrationforegoing.util.ModUtils;
import me.jacky1356400.integrationforegoing.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.List;

public class PlantRecollectableOreShrubs {

    @SubscribeEvent
    public void register(RegistryEvent.Register<PlantRecollectable> event) {
        IForgeRegistry<PlantRecollectable> registry = event.getRegistry();
        registry.register(new PlantRecollectable("oreshrubs") {
            @Override
            public boolean canBeHarvested(World world, BlockPos pos, IBlockState blockState) {
                Block block = blockState.getBlock();
                if (block.getMetaFromState(blockState) != 4) return false;
                ResourceLocation registryName = block.getRegistryName();
                return registryName.getResourceDomain().equals("oreshrubs")
                        && registryName.getResourcePath().startsWith("oreshrub_");
            }

            @Override
            public List<ItemStack> doHarvestOperation(World world, BlockPos pos, IBlockState blockState) {
                NonNullList<ItemStack> stacks = NonNullList.create();
                String name = blockState.getBlock().getRegistryName().getResourcePath().substring(9);
                if (!name.equals("random")) {
                    //int maxBerries = OreShrubVariant.getMaxHarvestedBerries();
                    int maxBerries = world.rand.nextInt(3) + 1;
                    int size = maxBerries <= 1 ? 1 : world.rand.nextInt(maxBerries) + 1;
                    ItemStack berries = ModUtils.getItemStackByObject("oreshrubs", "oreberries", size, 0);
                    berries.setTagCompound(new NBTTagCompound());
                    NBTTagCompound tag = new NBTTagCompound();
                    tag.setString("Name", name);
                    berries.getTagCompound().setTag("OreShrubVariant", tag);
                    stacks.add(0, berries);
                    world.setBlockState(pos, blockState.withProperty(Reference.ORESHRUBS_AGE, 3));
                } else {
                    //int maxBerries = OreShrubVariant.getMaxHarvestedBerries();
                    int maxBerries = world.rand.nextInt(3) + 1;
                    int size = maxBerries <= 1 ? 1 : world.rand.nextInt(maxBerries) + 1;
                    stacks.add(0, ModUtils.getItemStackByObject("oreshrubs", "oreberries_random", size, 0));
                    world.setBlockState(pos, blockState.withProperty(Reference.ORESHRUBS_AGE, 3));
                }
                return stacks;
            }

            @Override
            public boolean shouldCheckNextPlant(World world, BlockPos pos, IBlockState blockState) {
                return true;
            }
        });
    }

}