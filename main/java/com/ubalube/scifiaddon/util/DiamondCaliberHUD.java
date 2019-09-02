package com.ubalube.scifiaddon.util;

import com.mojang.realmsclient.gui.ChatFormatting;
import com.ubalube.scifiaddon.items.GunAimable;
import com.ubalube.scifiaddon.items.GunBase;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DiamondCaliberHUD extends Gui
{
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=false)
    public void onRenderGameOverlayEvent(RenderGameOverlayEvent event) {
        EntityPlayer player = Minecraft.getMinecraft().player;
        if (event.getType() == RenderGameOverlayEvent.ElementType.CROSSHAIRS) {
            if(player.getHeldItemMainhand().getItem() instanceof GunBase)
            {
            	Minecraft mc = Minecraft.getMinecraft();
            	ScaledResolution sr = new ScaledResolution(mc);
            	ItemStack stack = player.getHeldItemMainhand();
        		
        		if(stack.getItem() instanceof GunBase)
        		{
    				event.setCanceled(true);
        			NBTTagCompound nbt2 = ((GunAimable) stack.getItem()).checkNBTTags(stack);
        			if (!nbt2.getBoolean("ADS")) 
        			{
        				Minecraft.getMinecraft().getTextureManager().bindTexture(Gui.ICONS);
					    GlStateManager.enableBlend();
		
		                GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.ONE_MINUS_DST_COLOR, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		                GlStateManager.enableAlpha();
		                
		                float gunDamage = (int)((GunBase) stack.getItem()).getGunDamage();
		                
		                int x = sr.getScaledWidth() / 2;
		    			int y = sr.getScaledHeight() / 2;
		                
		                int spacing = MathHelper.clamp(Math.round(100*gunDamage),1,10);
		                
		                Gui gui = new Gui();
		                
		                gui.drawTexturedModalRect(x - (4+spacing) , y,3,7,4,1);
		                gui.drawTexturedModalRect(x + (1+spacing) , y,8,7,4,1);
		                gui.drawTexturedModalRect(x , y,7,7,1,1);
		                
		                
		                
		                gui.drawTexturedModalRect(x, y - (4+spacing), 7, 3, 1,4);
		                gui.drawTexturedModalRect(x, y + (1+spacing), 7, 8, 1,4);
                    }
        		}
            }
        }
    }
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=false)
	public void onRenderGameOverlyEvent(RenderGameOverlayEvent event){
		if(event.isCancelable() || event.getType() != ElementType.EXPERIENCE) return;
		
		Minecraft mc = Minecraft.getMinecraft();
		
		EntityPlayer playerIn = mc.player;
		ScaledResolution sr = new ScaledResolution(mc);
		ItemStack item =playerIn.getHeldItemMainhand();
		
		if(!item.isEmpty() && item.getItem() instanceof GunBase)
		{
			GunBase gb = ((GunBase) item.getItem());
			
			this.drawAmmo(mc, sr, gb, item, playerIn, 0);
			
		}
		
	}
	@SideOnly(Side.CLIENT)
	public void drawKillNotifier(Minecraft mc, Entity victim, EntityPlayer attacker, ScaledResolution scaled)
	{
		if(attacker.getHeldItemMainhand().getItem() instanceof GunBase)
		{
			
			int width = scaled.getScaledWidth();
	        int height = scaled.getScaledHeight();
			
			String Victim = ChatFormatting.RED + "Killed " + victim.getDisplayName();
			String ScoreAmount = ChatFormatting.GREEN + "[ " + TextFormatting.YELLOW + attacker.getHeldItemMainhand().getDisplayName() + ChatFormatting.GREEN + " ]";
			
			drawCenteredString(mc.fontRenderer, Victim, width / 2, (height / 2) - 4, Integer.parseInt("FFAA00", 16));
			drawCenteredString(mc.fontRenderer, ScoreAmount, width / 2, (height / 2) - 14, Integer.parseInt("FFAA00", 16));
		}
		
	}
    
    
	@SubscribeEvent(priority=EventPriority.HIGH, receiveCanceled=false)
    public void doStatTrack(LivingDeathEvent e)
    {
    	DamageSource source = e.getSource();
    	
    	if(source.getImmediateSource() instanceof EntityPlayer)
    	{
    		EntityPlayer attacker = (EntityPlayer) source.getImmediateSource();
    		Entity victim = e.getEntity();
    		if(attacker.getHeldItemMainhand().getItem() instanceof GunBase)
    		{
    			GunBase gb = (GunBase) attacker.getHeldItemMainhand().getItem();
    			
    			if(gb.hasStatTrack(attacker.getHeldItemMainhand()))
    			{
    				gb.addStatTrackKill(1, attacker.getHeldItemMainhand());
    			}
    		}
    	}
    	
    }

	private void drawAmmo(Minecraft mc, ScaledResolution sr, GunBase gb, ItemStack item, EntityPlayer playerIn,
			int i) {
		ItemStack ammo = new ItemStack(gb.ammo);
		
		int currentAmmo = item.getMaxDamage() - item.getItemDamage();
		int maxAmmo = item.getMaxDamage();
		
		int ammoPercent = (int)(currentAmmo * 100.0f) / maxAmmo;
		
		String ammoText = "";
		
		String GunName = ChatFormatting.GREEN + item.getDisplayName();
		
		NBTTagCompound nbt2 = ((GunAimable) item.getItem()).checkNBTTags(item);
		
		if (nbt2.getBoolean("reload")) 
		{
			ammoText = ChatFormatting.YELLOW + "-RELOADING-";
        }
		else
		{
			if(ammoPercent > 50)
			{
				ammoText = ChatFormatting.GREEN + "" + currentAmmo + ChatFormatting.WHITE + "/" + ChatFormatting.GREEN + maxAmmo;
			}
			else
			{
				if(ammoPercent <= 50 && ammoPercent > 25)
				{
					ammoText = ChatFormatting.YELLOW + "" + currentAmmo + ChatFormatting.WHITE + "/" + ChatFormatting.GREEN + maxAmmo;
				}
				else
				{
					if(ammoPercent <= 25 && ammoPercent > 0)
					{
						ammoText = ChatFormatting.RED + "" + currentAmmo + ChatFormatting.WHITE + "/" + ChatFormatting.GREEN + maxAmmo;
					}
					else
					{
						if(ammoPercent <= 0)
						{
							ammoText = ChatFormatting.DARK_RED + "" + ChatFormatting.BOLD + "OUT OF AMMO";
						}
					}
				}
			}
		}
		
		if(gb.hasStatTrack(item))
		{
			String StatTrack = ChatFormatting.YELLOW + "x " + gb.getStatTrackCount(item);
			mc.fontRenderer.drawString(StatTrack, sr.getScaledWidth()-15-ammoText.length()*6,sr.getScaledHeight()-mc.fontRenderer.FONT_HEIGHT-2+i , 0xFFFFFFFF);
		}
		
		mc.fontRenderer.drawString(GunName, sr.getScaledWidth()-7-ammoText.length()*6,sr.getScaledHeight()-mc.fontRenderer.FONT_HEIGHT-12+i , 0xFFFFFFFF);
		mc.fontRenderer.drawString(ammoText, sr.getScaledWidth()-7-ammoText.length()*6,sr.getScaledHeight()-mc.fontRenderer.FONT_HEIGHT-2+i , 0xFFFFFFFF);
		
	}
	
}