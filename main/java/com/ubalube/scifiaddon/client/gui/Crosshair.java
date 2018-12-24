package com.ubalube.scifiaddon.client.gui;

import java.awt.Color;

import org.lwjgl.opengl.GL11;

import com.ubalube.scifiaddon.BooleanHelper;
import com.ubalube.scifiaddon.main;
import com.ubalube.scifiaddon.items.CGunAimingBase;
import com.ubalube.scifiaddon.items.CGunBase;
import com.ubalube.scifiaddon.items.CGunGrenadeLauncher;
import com.ubalube.scifiaddon.items.CGunHelper;
import com.ubalube.scifiaddon.items.CGunPDW;
import com.ubalube.scifiaddon.items.CGunPistol;
import com.ubalube.scifiaddon.items.CGunSkinnable;
import com.ubalube.scifiaddon.items.CGunSniper;
import com.ubalube.scifiaddon.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class Crosshair extends Gui
{
	
	
	
	@SubscribeEvent
    public static void onRenderGameOverlayEvent(RenderGameOverlayEvent event) {
        Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer p = mc.player;
        if (event.getType() == RenderGameOverlayEvent.ElementType.CROSSHAIRS) 
        {
        	if (p.getHeldItemMainhand().getItem() instanceof CGunBase || p.getHeldItemMainhand().getItem() instanceof CGunAimingBase ||
            		p.getHeldItemMainhand().getItem() instanceof CGunHelper || p.getHeldItemMainhand().getItem() instanceof CGunPDW ||
            		p.getHeldItemMainhand().getItem() instanceof CGunSniper || p.getHeldItemMainhand().getItem() instanceof CGunPistol ||
            		p.getHeldItemMainhand().getItem() instanceof CGunSkinnable || p.getHeldItemMainhand().getItem() instanceof CGunGrenadeLauncher) 
            {
        		event.setCanceled(true);
            }
        	
        	
        	
        }
        
    }
	
}
