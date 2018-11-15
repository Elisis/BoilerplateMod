package com.elisis.boilerplate.item.crop;

import com.elisis.boilerplate.Main;
import com.elisis.boilerplate.block.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class ItemCornSeed extends ItemSeeds {

	public ItemCornSeed() {
		
		super(ModBlocks.corn_crop, Blocks.FARMLAND);
		this.setUnlocalizedName("corn_seed");
		this.setRegistryName("corn_seed");
		
		this.setCreativeTab(Main.creativeTab);
		
	}
	
	public void registerItemModel() {
		
		Main.proxy.registerItemRenderer(this, 0, "corn_seed");
	}

}
