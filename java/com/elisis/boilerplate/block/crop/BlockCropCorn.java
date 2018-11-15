package com.elisis.boilerplate.block.crop;

import com.elisis.boilerplate.item.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropCorn extends BlockCrops {
	
	public BlockCropCorn() {
		
		this.setUnlocalizedName("corn_crop");
		this.setRegistryName("corn_crop");
		
		
		
	}
	
	@Override
	protected Item getSeed() {
		
		return ModItems.corn_seed;
		
	}
	
	@Override
	protected Item getCrop() {
		
		return ModItems.corn;
		
	}

}
