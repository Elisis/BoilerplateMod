package com.elisis.boilerplate.item;

import com.elisis.boilerplate.item.crop.ItemCornSeed;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBase copper_ingot = new ItemBase("copper_ingot").setCreativeTab(null);
	
	public static ItemCornSeed corn_seed = new ItemCornSeed();
	
	public static ItemBase corn = new ItemBase("corn").setCreativeTab(CreativeTabs.FOOD);
	
	public static void register(IForgeRegistry<Item> registry) {
		
		registry.registerAll(
				
				copper_ingot,
				corn,
				corn_seed
				
			);
		
	}
	
	public static void registerModels() {
		
		copper_ingot.registerItemModel();
		corn.registerItemModel();
		corn_seed.registerItemModel();
		
	}

}
