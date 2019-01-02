package mod.Mega_CS.bopex.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesInit {
	public static void init() {
		GameRegistry.addSmelting(ItemInit.FLESH_CHUNK, new ItemStack(ItemInit.COOKED_FLESH, 1), 0.1f);
	}
}
