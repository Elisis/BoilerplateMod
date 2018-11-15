package com.elisis.boilerplate.tab;

import com.elisis.boilerplate.Main;
import com.elisis.boilerplate.item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BoilerplateTab extends CreativeTabs {
	
	public BoilerplateTab() {
		
		super(Main.MODID);
		
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ModItems.copper_ingot);
	}

}
