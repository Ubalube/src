package com.ubalube.scifiaddon;

import com.ubalube.scifiaddon.entity.EntityBullet;
import com.ubalube.scifiaddon.init.EntityInit;
import com.ubalube.scifiaddon.init.ModItems;
import com.ubalube.scifiaddon.professions.ModProfessions;
import com.ubalube.scifiaddon.proxy.CommonProxy;
import com.ubalube.scifiaddon.tabs.Armor;
import com.ubalube.scifiaddon.tabs.Decor;
import com.ubalube.scifiaddon.tabs.Guns;
import com.ubalube.scifiaddon.tabs.Parts;
import com.ubalube.scifiaddon.util.Reference;
import com.ubalube.scifiaddon.util.handlers.RegistryHandler;
import com.ubalube.scifiaddon.util.handlers.RenderHandler;
import com.ubalube.scifiaddon.world.WorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.GameRules.ValueType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerCareer;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class main 
{
	
	public static final Guns gunTab = new Guns();
	public static final Parts partTab = new Parts();
	public static final Armor armorTab = new Armor();
	public static final Decor decorTab = new Decor();
	
	@Instance
	public static main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static ModItems ITEMS = new ModItems();
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent e) 
	{
		MinecraftForge.EVENT_BUS.register(ITEMS);
	}
	
	@EventHandler
	public static void preinit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries();
		GameRegistry.registerWorldGenerator(new WorldGen(), 3);
	}
	
	@SideOnly(Side.CLIENT)
	@EventHandler
	public static void preinitOne(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistriesOne();
	}
	
	//GAMERULES
	@EventHandler
	public void serverStart(FMLServerStartingEvent event) 
	{
		World world = event.getServer().getEntityWorld();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent e) 
	{
		RegistryHandler.initRegistries();
		ModProfessions.associateCareersAndTrades();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent e) 
	{
		
	}

}
