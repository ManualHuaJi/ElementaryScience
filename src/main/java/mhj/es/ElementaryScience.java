package mhj.es;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ElementaryScience.MODID, name = ElementaryScience.MODNAME, version = ElementaryScience.VERSION)
public class ElementaryScience {
    @SidedProxy(clientSide = "mhj.es.ClientProxy", serverSide = "mhj.es.CommonProxy")
    public static CommonProxy proxy;
    public static final String MODID = "es";
    public static final String MODNAME = "ElementaryScience";
    public static final String VERSION = "0.0.1";

    public static void preEvent(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    public static void initEvent(FMLInitializationEvent event) {
        proxy.Init(event);
    }

    public static void postEvent(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    public static final CreativeTabs TABIES = new CreativeTabs(MODID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.BOOK);
        }

    };
}
