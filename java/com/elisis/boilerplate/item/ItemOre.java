package com.elisis.boilerplate.item;

import net.minecraftforge.oredict.OreDictionary;

public class ItemOre extends ItemBase {
	
	private String oreId;
	
	public ItemOre(String name, String id) {
		
		super(name);
		this.oreId = id;
		
	}
	
	public void initOreDict() {
		
		OreDictionary.registerOre(oreId, this);
	}

}
