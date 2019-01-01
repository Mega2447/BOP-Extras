package mod.Mega_CS.bopex.init;

import java.util.ArrayList;
import java.util.List;

import mod.Mega_CS.bopex.objects.items.tools.ToolAxe;
import mod.Mega_CS.bopex.objects.items.tools.ToolHoe;
import mod.Mega_CS.bopex.objects.items.tools.ToolPickaxe;
import mod.Mega_CS.bopex.objects.items.tools.ToolSpade;
import mod.Mega_CS.bopex.objects.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_MUD = EnumHelper.addToolMaterial("material_mud", 0, 80, 3.0F, 0.4F, 8);
	
	//Items
	
	
	//Tools
	public static final ItemSword SWORD_MUD = new ToolSword("sword_mud", MATERIAL_MUD);
	public static final ItemSpade SPADE_MUD = new ToolSpade("spade_mud", MATERIAL_MUD);
	public static final ItemPickaxe PICKAXE_MUD = new ToolPickaxe("pickaxe_mud", MATERIAL_MUD);
	public static final ItemAxe AXE_MUD = new ToolAxe("axe_mud", MATERIAL_MUD);
	public static final ItemHoe HOE_MUD = new ToolHoe("hoe_mud", MATERIAL_MUD);
	
}
