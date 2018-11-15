package com.elisis.boilerplate;

import org.apache.logging.log4j.Logger;

import com.elisis.boilerplate.block.ModBlocks;
import com.elisis.boilerplate.item.ModItems;
import com.elisis.boilerplate.proxy.CommonProxy;
import com.elisis.boilerplate.tab.BoilerplateTab;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, /*dependencies = "required-after:Forge@[11.16.0.1865,)",*/ useMetadata = true)
public class Main {
	
	public static final String MODID = "boilerplate";
	public static final String MODNAME = "Boilerplate Mod";
	public static final String VERSION = "1.0";
	
	public static final BoilerplateTab creativeTab = new BoilerplateTab();

	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = "com.elisis.boilerplate.proxy.ClientProxy", serverSide = "com.elisis.boilerplate.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	
	public static Logger logger;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		
		logger = e.getModLog();
		proxy.preInit(e);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		
		proxy.init(e);
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
		proxy.postInit(e);
		
	}
	
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());
		
		}
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			
			ModBlocks.register(event.getRegistry());
			
		}
		
		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event) {
			
			ModItems.registerModels();
			ModBlocks.registerModels();
			
		}
		
	}
	
	
	
}
