package com.elisis.boilerplate.item;

import com.elisis.boilerplate.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
	
	protected String name;
	
	public ItemBase(String name) {
		
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		
		this.setCreativeTab(Main.creativeTab);
	
	}
	
	public void registerItemModel() {
		
		Main.proxy.registerItemRenderer(this, 0, name);
		
	}

}
