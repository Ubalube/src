package com.ubalube.scifiaddon.init;

import java.util.ArrayList;
import java.util.List;

import com.ubalube.scifiaddon.blocks.Airdrop;
import com.ubalube.scifiaddon.blocks.BarbedWire;
import com.ubalube.scifiaddon.blocks.BlockBase;
import com.ubalube.scifiaddon.blocks.BlockCrateMedic;
import com.ubalube.scifiaddon.blocks.BlockCrateSupplies;
import com.ubalube.scifiaddon.blocks.BlockCrateWeapon;
import com.ubalube.scifiaddon.blocks.BlockFan;
import com.ubalube.scifiaddon.blocks.BlockOre;
import com.ubalube.scifiaddon.blocks.NodeBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = "caliber")
public class ModBlocks 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block CRATE = new BlockCrateWeapon("crate", Material.SAND);
	public static final Block MCRATE = new BlockCrateMedic("mcrate", Material.SAND);
	public static final Block LCRATE = new BlockCrateSupplies("lcrate", Material.SAND);
	
	public static final Block FAN = new BlockFan("fan", Material.IRON, 2.0F);
	public static final Block NODEBLOCK = new NodeBlock("nodeblock", Material.ROCK, 10000.0F);
	
	public static final Block SANDBAGS = new BlockBase("sandbags", Material.ROCK, 1.5F);
	public static final Block ASPHALT = new BlockBase("asphalt", Material.ROCK, 1.5F);
	public static final Block CONCRETEBRICKS = new BlockBase("concretebricks", Material.ROCK, 1.5F);
	public static final Block CONCRETEBRICK = new BlockBase("concretebrick", Material.ROCK, 1.5F);
	
	public static final Block BARBEDWIRE = new BarbedWire("barbedwire", Material.WEB);
	
	public static final Block STEELORE = new BlockOre("steelore", Material.ROCK, ModItems.STEEL);
	
	public static final Block ASPHALT_POLISHED = new BlockBase("asphalt_polished", Material.ROCK, 1.5F);
	public static final Block ASPHALT_POLISHED_CRACKED = new BlockBase("asphalt_polished_cracked", Material.ROCK, 1.5F);
}
