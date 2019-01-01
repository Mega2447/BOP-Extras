package mod.Mega_CS.bopex.tabs;

import mod.Mega_CS.bopex.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CustomTab extends CreativeTabs{

	public CustomTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.PICKAXE_MUD);
	}

}
