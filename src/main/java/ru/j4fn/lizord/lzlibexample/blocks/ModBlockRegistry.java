package ru.j4fn.lizord.lzlibexample.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import ru.j4fn.lizord.lzlib.blocks.BlockRegistry;

@Mod.EventBusSubscriber
public class ModBlockRegistry{
    @SubscribeEvent
    public static void onBlockRegistry(RegistryEvent.Register<Block> e){
        BlockRegistry.registerModBlocks(e.getRegistry(), "lzlibexample");
    }
    @SubscribeEvent
    public static void onItemBlockRegistry(RegistryEvent.Register<Item> e){
        BlockRegistry.registerModItemBlocks(e.getRegistry(), "lzlibexample");
    }
    @SubscribeEvent
    public static void onModelRegistry(ModelRegistryEvent e){
        BlockRegistry.registerModBlockModels("lzlibexample");
    }
}
