package net.ddns.mrjolly.test.init;

import net.ddns.mrjolly.test.help.RegisterHelper;
import net.minecraft.item.Item;

public class ModItems {
	
	public static Item copper = new ItemTest().setUnlocalizedName("copper");

	public static void registerItems()
	{
		RegisterHelper.registerItemRenderer(copper);
	}

	public static void registerItemRenderer()
	{

	}

}
