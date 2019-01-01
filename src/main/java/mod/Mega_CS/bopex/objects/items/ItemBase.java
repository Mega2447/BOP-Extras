package mod.Mega_CS.bopex.objects.items;

import mod.Mega_CS.bopex.Main;
import mod.Mega_CS.bopex.init.ItemInit;
import mod.Mega_CS.bopex.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MODTAB);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
