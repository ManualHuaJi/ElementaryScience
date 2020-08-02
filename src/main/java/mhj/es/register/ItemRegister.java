package mhj.es.register;

import mhj.es.items.ItemElementarySubstance;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class ItemRegister {
    public static final Item itemElementarySubstance = new ItemElementarySubstance();

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
        init(event.getRegistry());
    }

    private static void init(IForgeRegistry<Item> registry) {
        registry.register(itemElementarySubstance);
    }
}
