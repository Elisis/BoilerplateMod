package com.elisis.boilerplate.block;

import com.elisis.boilerplate.block.crop.BlockCropCorn;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static BlockOre copper_ore = new BlockOre("copper_ore", "oreCopper");
	
	public static BlockCropCorn corn_crop = new BlockCropCorn();
	
	public static void register(IForgeRegistry<Block> registry) {
		
		registry.registerAll(
				
				copper_ore,
				corn_crop
			
			);
		
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		
		registry.registerAll(
				
				copper_ore.createItemBlock()
			
			);
		
	}
	
	public static void registerModels() {
		
		copper_ore.registerItemModel(Item.getItemFromBlock(copper_ore));
		
	}

}
