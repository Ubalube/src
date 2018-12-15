package com.ubalube.scifiaddon.entity;

import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.ubalube.scifiaddon.items.CGunAimingBase;
import com.ubalube.scifiaddon.items.CGunBase;
import com.ubalube.scifiaddon.items.CGunHelper;
import com.ubalube.scifiaddon.items.CGunPDW;
import com.ubalube.scifiaddon.items.CGunPistol;
import com.ubalube.scifiaddon.items.CGunSniper;

import net.minecraft.client.model.ModelBiped;

@EventBusSubscriber
public class Player
{
	@SubscribeEvent
    public static void EntityRender(RenderLivingEvent.Pre event) {
        
        EntityLivingBase entity = event.getEntity();
        
        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)entity;
            if (player.getHeldItemMainhand().getItem() instanceof CGunBase || player.getHeldItemMainhand().getItem() instanceof CGunAimingBase ||
            		player.getHeldItemMainhand().getItem() instanceof CGunHelper || player.getHeldItemMainhand().getItem() instanceof CGunPDW ||
            		player.getHeldItemMainhand().getItem() instanceof CGunSniper || player.getHeldItemMainhand().getItem() instanceof CGunPistol) 
            {
            
                RenderLivingBase renderer = event.getRenderer();
                
                ModelPlayer model = (ModelPlayer) renderer.getMainModel();
                
                model.leftArmPose = ModelBiped.ArmPose.BOW_AND_ARROW;
                model.rightArmPose = ModelBiped.ArmPose.BOW_AND_ARROW;
            }
        }
        
    }
}