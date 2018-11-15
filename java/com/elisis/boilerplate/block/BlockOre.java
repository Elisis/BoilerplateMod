package com.elisis.boilerplate.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOre extends BlockBase {
	
	public BlockOre(String name, float hardness, float resistance) {
		
		super(name, Material.ROCK);
		
		this.setHardness(hardness);
		this.setResistance(resistance);
		
		
	}
	
	public BlockOre(String name) {
		
		super(name, Material.ROCK);
		
		this.setHardness(3.0f);
		this.setResistance(5.0f);
		
	}
	
	
	@Override
	public BlockOre setCreativeTab(CreativeTabs tab) {
		
		super.setCreativeTab(tab);
		return this;
		
	}


}
