package mhj.es.items;

import mhj.es.ElementaryScience;
import mhj.es.api.elements.Element;
import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.FMLLog;

public class ItemElementarySubstance extends Item {
    public ItemElementarySubstance() {
        this.setHasSubtypes(true);
        this.setUnlocalizedName("itemElementarySubstance");
        this.setRegistryName("itemElementarySubstance");
        this.setCreativeTab(ElementaryScience.TABIES);

    }

    @Override
    public void getSubItems(CreativeTabs tabs, NonNullList<ItemStack> stacks) {
        super.getSubItems(tabs, stacks);
        if ((tabs == ElementaryScience.TABIES) || (tabs == CreativeTabs.SEARCH)) {
            for (int meta = 0; meta < Element.elements.size(); meta++) {
                FMLLog.warning(String.valueOf(meta));
                stacks.add(new ItemStack(this, 1, meta));
                FMLLog.warning(Element.elements.get(meta + 1).getName());
            }
        }
    }

    /*@Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format(super.getUnlocalizedName(stack) + ".%s", Element.elements.get(stack.getMetadata()+1).getAbbr());
    }
*/
    @Override
    public String getItemStackDisplayName(ItemStack stack) {
//        assert I18n.format("item." + this.getUnlocalizedName() + ".name").equals(Element.elements.get(stack.getMetadata()).getAbbr());
        return Element.elements.get(stack.getMetadata() + 1).getAbbr();
    }
}


