package com.elisis.boilerplate.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOre extends BlockBase {
	
	private String oreId;
	
	public BlockOre(String name, String oreId, float hardness, float resistance) {
		
		super(name, Material.ROCK);
		
		
		this.setHardness(hardness);
		this.setResistance(resistance);
		
		
	}
	
	/**
	 * For creating an 'ore' with an OreDictionary id and set hardness & resistance
	 * @param name The name of the ore
	 * @param oreId The OreDictionary id of the ore
	 */
	
	public BlockOre(String name, String oreId) {
		
		super(name, Material.ROCK);
		
		this.oreId = oreId;
		this.setHardness(3.0f);
		this.setResistance(5.0f);
		
	}
	
	/**
	 * For creating an 'ore' without an OreDictionary id with explicit hardness & resistance
	 * @param name The name of the ore
	 * @param hardness The hardness of the ore
	 * @param resistance The resistance of the ore
	 */
	
	public BlockOre(String name, float hardness, float resistance) {
		
		super(name, Material.ROCK);
		
		this.setHardness(3.0f);
		this.setResistance(5.0f);
		
	}

}
