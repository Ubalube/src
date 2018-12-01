package com.ubalube.scifiaddon.armor;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

public class ArmorBaseSkin extends ArmorBase {
	
	private String armorTexturePath;
	private String skinType;
	
	public ArmorBaseSkin(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
		super(name, material, renderIndex, equipmentSlot);
		this.setPaths(material.getName());
	}

	
	private void setPaths(final String input)
    {
        String[] str = input.split(":", 2);
        this.armorTexturePath = str[0] + ":" + "textures/models/armor/";

        str = str[1].split("");

        for (int i = 0; i < str.length; i++)
            this.armorTexturePath += str[i] + "_";

        this.skinType = "default";
    }

	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {		 
		return this.armorTexturePath + this.skinType + "_layer_" + this.renderIndex + ".png";
	}
	
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
		if(itemStack != ItemStack.EMPTY && itemStack.getItem() instanceof ArmorBaseSkin) {
			this.skinType = ((AbstractClientPlayer) entityLiving).getSkinType();			
			ModelPlayer model = new ModelPlayer(0f, this.skinType == "slim");			
			
			model.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
			model.bipedBody.showModel = armorSlot == EntityEquipmentSlot.CHEST;
			model.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
			model.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
			model.bipedLeftLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
			model.bipedRightLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
			
			model.isChild = _default.isChild;
			model.isRiding = _default.isRiding;
			model.isSneak = _default.isSneak;
			model.rightArmPose = _default.rightArmPose;
			model.leftArmPose = _default.leftArmPose;	 
		 	return model;
		}
		return null;
	}	
}
