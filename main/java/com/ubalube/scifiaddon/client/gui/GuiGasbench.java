package com.ubalube.scifiaddon.client.gui;

import com.ubalube.scifiaddon.tileentity.ContainerGasbench;
import com.ubalube.scifiaddon.tileentity.ContainerSkinner;
import com.ubalube.scifiaddon.tileentity.TileEntityGasbench;
import com.ubalube.scifiaddon.tileentity.TileEntitySkinner;
import com.ubalube.scifiaddon.util.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiGasbench extends GuiContainer
{
	private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/gui/gasmaker.png");
	private final InventoryPlayer player;
	private final TileEntityGasbench tileentity;
	
	public GuiGasbench(InventoryPlayer player, TileEntityGasbench tileentity) 
	{
		super(new ContainerGasbench(player, tileentity));
		this.player = player;
		this.tileentity = tileentity;
		
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) 
	{
		String tileName = this.tileentity.getDisplayName().getUnformattedText();
		this.fontRenderer.drawString(tileName, (this.xSize / 2 - this.fontRenderer.getStringWidth(tileName) / 2) + 3, 8, 4210752);
		this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 122, this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(TEXTURES);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
		
		if(TileEntitySkinner.isBurning(tileentity))
		{
			int k = this.getBurnLeftScaled(13);
			this.drawTexturedModalRect(this.guiLeft + 8, this.guiTop + 54 + 12 - k, 176, 12 - k, 14, k + 1);
		}
		
		int l = this.getCookProgressScaled(24);
		this.drawTexturedModalRect(this.guiLeft + 44, this.guiTop + 36, 176, 14, l + 1, 16);
	}
	
	private int getBurnLeftScaled(int pixels)
	{
		int i = this.tileentity.getField(1);
		if(i == 0) i = 200;
		return this.tileentity.getField(0) * pixels / i;
	}
	
	private int getCookProgressScaled(int pixels)
	{
		int i = this.tileentity.getField(2);
		int j = this.tileentity.getField(3);
		return j != 0 && i != 0 ? i * pixels / j : 0;
	}
}
