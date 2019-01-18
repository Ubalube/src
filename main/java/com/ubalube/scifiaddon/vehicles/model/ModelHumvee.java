package com.ubalube.scifiaddon.vehicles.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Humvee - VampireRedEye
 * Created using Tabula 7.0.0
 */
public class ModelHumvee extends ModelBase {
    public ModelRenderer truck1;
    public ModelRenderer truck2;
    public ModelRenderer truck3;
    public ModelRenderer truck4;
    public ModelRenderer truck5;
    public ModelRenderer truck6;
    public ModelRenderer truck7;
    public ModelRenderer truck8;
    public ModelRenderer truck9;
    public ModelRenderer truck10doorfl;
    public ModelRenderer truck10doorfr;
    public ModelRenderer truck13;
    public ModelRenderer truck14;
    public ModelRenderer truck15;
    public ModelRenderer truck16;
    public ModelRenderer truck17;
    public ModelRenderer truck18;
    public ModelRenderer truck20;
    public ModelRenderer truck21;
    public ModelRenderer wheelfl;
    public ModelRenderer wheelfr;
    public ModelRenderer wheelbr;
    public ModelRenderer wheelbl;
    public ModelRenderer steeringwheel1;
    public ModelRenderer seat1;
    public ModelRenderer seat2;
    public ModelRenderer seat3;
    public ModelRenderer seat4;
    public ModelRenderer truck22;
    public ModelRenderer truck23;
    public ModelRenderer gun1;
    public ModelRenderer shield;
    public ModelRenderer steeringwheel1_1;
    public ModelRenderer seat5;
    public ModelRenderer seat6;
    public ModelRenderer seat7;
    public ModelRenderer seat8;
    public ModelRenderer gun2;
    public ModelRenderer gun3barrel1;
    public ModelRenderer gun3barrel2;
    public ModelRenderer gun3barrel3;
    public ModelRenderer gun4clip1;
    public ModelRenderer gun4clip2;
    public ModelRenderer gun5handles;

    public ModelHumvee() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.truck6 = new ModelRenderer(this, 0, 140);
        this.truck6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck6.addBox(-15.0F, 12.0F, 22.0F, 30, 4, 4, 0.0F);
        this.truck10doorfr = new ModelRenderer(this, 140, 80);
        this.truck10doorfr.setRotationPoint(-14.0F, 5.0F, -4.0F);
        this.truck10doorfr.addBox(-1.0F, -1.0F, 0.0F, 2, 12, 26, 0.0F);
        this.wheelbr = new ModelRenderer(this, 0, 30);
        this.wheelbr.setRotationPoint(-12.0F, 17.5F, 30.5F);
        this.wheelbr.addBox(-2.9F, -6.0F, -6.0F, 3, 12, 12, 0.0F);
        this.seat3 = new ModelRenderer(this, 36, 40);
        this.seat3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.seat3.addBox(-10.0F, 10.0F, 2.0F, 8, 4, 8, 0.0F);
        this.gun2 = new ModelRenderer(this, 32, 154);
        this.gun2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gun2.addBox(-1.5F, -3.0F, -6.0F, 3, 3, 4, 0.0F);
        this.truck2 = new ModelRenderer(this, 0, 100);
        this.truck2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck2.addBox(-13.0F, 14.0F, -4.0F, 26, 2, 26, 0.0F);
        this.gun4clip2 = new ModelRenderer(this, 50, 168);
        this.gun4clip2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gun4clip2.addBox(2.7F, -1.5F, -5.5F, 0, 2, 3, 0.0F);
        this.setRotateAngle(gun4clip2, 0.0F, 0.0F, -0.6829473363053812F);
        this.truck15 = new ModelRenderer(this, 180, 34);
        this.truck15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck15.addBox(4.5F, -15.0F, 1.0F, 3, 30, 23, 0.0F);
        this.setRotateAngle(truck15, 0.0F, 0.0F, -1.5707963267948966F);
        this.truck9 = new ModelRenderer(this, 0, 84);
        this.truck9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck9.addBox(-12.0F, 12.0F, 26.0F, 24, 4, 9, 0.0F);
        this.seat1 = new ModelRenderer(this, 36, 40);
        this.seat1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.seat1.addBox(-10.0F, 10.0F, 13.8F, 8, 4, 8, 0.0F);
        this.gun3barrel2 = new ModelRenderer(this, 64, 156);
        this.gun3barrel2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gun3barrel2.addBox(-0.5F, -2.7F, -14.0F, 1, 1, 8, 0.0F);
        this.truck4 = new ModelRenderer(this, 0, 72);
        this.truck4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck4.addBox(-15.0F, 12.0F, -10.0F, 30, 4, 6, 0.0F);
        this.shield = new ModelRenderer(this, 0, 176);
        this.shield.setRotationPoint(0.0F, -8.0F, 11.0F);
        this.shield.addBox(-9.0F, -7.4F, -7.0F, 16, 8, 16, 0.0F);
        this.setRotateAngle(shield, 0.0F, 0.7853981633974483F, 0.0F);
        this.truck20 = new ModelRenderer(this, 114, 64);
        this.truck20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck20.addBox(-4.0F, -7.0F, 14.0F, 24, 12, 0, 0.0F);
        this.setRotateAngle(truck20, 0.0F, -1.5707963267948966F, 0.0F);
        this.seat7 = new ModelRenderer(this, 60, 30);
        this.seat7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.seat7.addBox(2.0F, 2.1F, 18.8F, 8, 8, 2, 0.0F);
        this.truck18 = new ModelRenderer(this, 90, 36);
        this.truck18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck18.addBox(-14.0F, -7.0F, -2.0F, 28, 14, 0, 0.0F);
        this.setRotateAngle(truck18, -0.4886921905584123F, 0.0F, 0.0F);
        this.seat2 = new ModelRenderer(this, 36, 40);
        this.seat2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.seat2.addBox(2.0F, 10.0F, 13.8F, 8, 4, 8, 0.0F);
        this.truck7 = new ModelRenderer(this, 106, 0);
        this.truck7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck7.addBox(-14.5F, 4.0F, 22.0F, 29, 8, 21, 0.0F);
        this.seat4 = new ModelRenderer(this, 36, 40);
        this.seat4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.seat4.addBox(2.0F, 10.0F, 2.0F, 8, 4, 8, 0.0F);
        this.truck23 = new ModelRenderer(this, 96, 162);
        this.truck23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck23.addBox(-15.0F, 10.0F, 24.1F, 30, 2, 13, 0.0F);
        this.seat5 = new ModelRenderer(this, 60, 30);
        this.seat5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.seat5.addBox(2.0F, 2.1F, 8.0F, 8, 8, 2, 0.0F);
        this.steeringwheel1 = new ModelRenderer(this, 0, 8);
        this.steeringwheel1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.steeringwheel1.addBox(4.0F, 4.0F, -6.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(steeringwheel1, 0.3490658503988659F, 0.0F, 0.0F);
        this.wheelfr = new ModelRenderer(this, 0, 30);
        this.wheelfr.setRotationPoint(-12.0F, 17.5F, -15.0F);
        this.wheelfr.addBox(-2.9F, -6.0F, -6.0F, 3, 12, 12, 0.0F);
        this.truck17 = new ModelRenderer(this, 102, 0);
        this.truck17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck17.addBox(-14.8F, -7.0F, 20.0F, 2, 14, 2, 0.0F);
        this.truck5 = new ModelRenderer(this, 0, 84);
        this.truck5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck5.addBox(-12.0F, 12.0F, -21.0F, 24, 4, 9, 0.0F);
        this.wheelfl = new ModelRenderer(this, 0, 30);
        this.wheelfl.setRotationPoint(12.0F, 17.5F, -15.0F);
        this.wheelfl.addBox(-0.1F, -6.0F, -6.0F, 3, 12, 12, 0.0F);
        this.gun4clip1 = new ModelRenderer(this, 32, 168);
        this.gun4clip1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gun4clip1.addBox(1.5F, -1.5F, -5.5F, 2, 2, 3, 0.0F);
        this.gun3barrel1 = new ModelRenderer(this, 48, 156);
        this.gun3barrel1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gun3barrel1.addBox(-0.5F, -1.5F, -12.0F, 1, 1, 6, 0.0F);
        this.truck14 = new ModelRenderer(this, 90, 0);
        this.truck14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck14.addBox(12.8F, -7.0F, -3.0F, 2, 14, 2, 0.0F);
        this.setRotateAngle(truck14, -0.4886921905584123F, 0.0F, 0.0F);
        this.truck13 = new ModelRenderer(this, 90, 0);
        this.truck13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck13.addBox(-14.8F, -7.0F, -3.0F, 2, 14, 2, 0.0F);
        this.setRotateAngle(truck13, -0.4886921905584123F, 0.0F, 0.0F);
        this.seat6 = new ModelRenderer(this, 60, 30);
        this.seat6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.seat6.addBox(-10.0F, 2.1F, 8.0F, 8, 8, 2, 0.0F);
        this.truck22 = new ModelRenderer(this, 106, 122);
        this.truck22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck22.addBox(-15.0F, -15.0F, 19.0F, 30, 12, 23, 0.0F);
        this.setRotateAngle(truck22, -0.3490658503988659F, 0.0F, 0.0F);
        this.gun1 = new ModelRenderer(this, 12, 154);
        this.gun1.setRotationPoint(0.0F, -8.0F, 11.0F);
        this.gun1.addBox(-2.0F, -3.0F, -2.0F, 4, 4, 4, 0.0F);
        this.gun5handles = new ModelRenderer(this, 88, 154);
        this.gun5handles.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gun5handles.addBox(-1.5F, -3.0F, 2.0F, 3, 3, 4, 0.0F);
        this.truck8 = new ModelRenderer(this, 0, 56);
        this.truck8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck8.addBox(-15.0F, 12.0F, 35.0F, 30, 4, 8, 0.0F);
        this.truck1 = new ModelRenderer(this, 0, 130);
        this.truck1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck1.addBox(-15.0F, 12.0F, -23.0F, 30, 4, 4, 0.0F);
        this.truck16 = new ModelRenderer(this, 102, 0);
        this.truck16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck16.addBox(12.8F, -7.0F, 20.0F, 2, 14, 2, 0.0F);
        this.truck21 = new ModelRenderer(this, 114, 64);
        this.truck21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck21.addBox(-4.0F, -7.0F, -14.0F, 24, 12, 0, 0.0F);
        this.setRotateAngle(truck21, 0.0F, -1.5707963267948966F, 0.0F);
        this.gun3barrel3 = new ModelRenderer(this, 64, 156);
        this.gun3barrel3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gun3barrel3.addBox(-0.5F, -3.7F, -13.0F, 1, 1, 1, 0.0F);
        this.truck3 = new ModelRenderer(this, 0, 0);
        this.truck3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.truck3.addBox(-15.0F, 2.1F, -23.0F, 30, 10, 19, 0.0F);
        this.wheelbl = new ModelRenderer(this, 0, 30);
        this.wheelbl.setRotationPoint(12.0F, 17.5F, 30.5F);
        this.wheelbl.addBox(-0.1F, -6.0F, -6.0F, 3, 12, 12, 0.0F);
        this.truck10doorfl = new ModelRenderer(this, 80, 80);
        this.truck10doorfl.setRotationPoint(14.0F, 5.0F, -4.0F);
        this.truck10doorfl.addBox(-1.0F, -1.0F, 0.0F, 2, 12, 26, 0.0F);
        this.seat8 = new ModelRenderer(this, 60, 30);
        this.seat8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.seat8.addBox(-10.0F, 2.1F, 18.8F, 8, 8, 2, 0.0F);
        this.steeringwheel1_1 = new ModelRenderer(this, 0, 0);
        this.steeringwheel1_1.setRotationPoint(5.5F, 5.4F, -3.5F);
        this.steeringwheel1_1.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 1, 0.0F);
        this.truck1.addChild(this.truck6);
        this.truck1.addChild(this.truck10doorfr);
        this.truck1.addChild(this.wheelbr);
        this.truck1.addChild(this.seat3);
        this.gun1.addChild(this.gun2);
        this.truck1.addChild(this.truck2);
        this.gun1.addChild(this.gun4clip2);
        this.truck1.addChild(this.truck15);
        this.truck1.addChild(this.truck9);
        this.truck1.addChild(this.seat1);
        this.gun1.addChild(this.gun3barrel2);
        this.truck1.addChild(this.truck4);
        this.truck1.addChild(this.shield);
        this.truck1.addChild(this.truck20);
        this.seat3.addChild(this.seat7);
        this.truck1.addChild(this.truck18);
        this.truck1.addChild(this.seat2);
        this.truck1.addChild(this.truck7);
        this.truck1.addChild(this.seat4);
        this.truck1.addChild(this.truck23);
        this.seat1.addChild(this.seat5);
        this.truck1.addChild(this.steeringwheel1);
        this.truck1.addChild(this.wheelfr);
        this.truck1.addChild(this.truck17);
        this.truck1.addChild(this.truck5);
        this.truck1.addChild(this.wheelfl);
        this.gun1.addChild(this.gun4clip1);
        this.gun1.addChild(this.gun3barrel1);
        this.truck1.addChild(this.truck14);
        this.truck1.addChild(this.truck13);
        this.seat2.addChild(this.seat6);
        this.truck1.addChild(this.truck22);
        this.truck1.addChild(this.gun1);
        this.gun1.addChild(this.gun5handles);
        this.truck1.addChild(this.truck8);
        this.truck1.addChild(this.truck16);
        this.truck1.addChild(this.truck21);
        this.gun1.addChild(this.gun3barrel3);
        this.truck1.addChild(this.truck3);
        this.truck1.addChild(this.wheelbl);
        this.truck1.addChild(this.truck10doorfl);
        this.seat4.addChild(this.seat8);
        this.steeringwheel1.addChild(this.steeringwheel1_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.truck1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
