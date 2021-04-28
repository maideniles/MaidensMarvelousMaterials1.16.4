package com.maideniles.maidensmaterials.entity.model;// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports


import com.maideniles.maidensmaterials.entity.FairyFlyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.ModelUtils;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class FairyFlyModel<T extends FairyFlyEntity> extends EntityModel<T> {
	private final ModelRenderer SparkBug;
	private final ModelRenderer Head;
	private final ModelRenderer Head_r1;
	private final ModelRenderer ArmRight;
	private final ModelRenderer ArmLeft;
	private final ModelRenderer Body;
	private final ModelRenderer WingRight;
	private final ModelRenderer WingLeft;
	private float bodyPitch;

	public FairyFlyModel() {
		textureWidth = 64;
		textureHeight = 64;

		SparkBug = new ModelRenderer(this);
		SparkBug.setRotationPoint(0.0F, 17.0F, -1.0F);
		

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 2.0F, 1.0F);
		SparkBug.addChild(Head);
		Head.setTextureOffset(21, 8).addBox(-2.0F, -8.0F, -8.0F, 0.0F, 4.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(17, 21).addBox(2.0F, -8.0F, -8.0F, 0.0F, 4.0F, 5.0F, 0.0F, false);

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0F, 0.0F, -0.0436F);
		Head_r1.setTextureOffset(0, 26).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 4.0F, 5.0F, 0.0F, false);

		ArmRight = new ModelRenderer(this);
		ArmRight.setRotationPoint(-2.0F, 2.0F, 1.0F);
		SparkBug.addChild(ArmRight);
		setRotationAngle(ArmRight, 1.0472F, 1.1345F, 0.0F);
		ArmRight.setTextureOffset(0, 13).addBox(0.0F, 0.0F, -5.0F, 2.0F, 0.0F, 5.0F, 0.0F, false);

		ArmLeft = new ModelRenderer(this);
		ArmLeft.setRotationPoint(2.0F, 2.0F, 1.0F);
		SparkBug.addChild(ArmLeft);
		setRotationAngle(ArmLeft, 1.0472F, -1.1345F, 0.0F);
		ArmLeft.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -4.9F, 2.0F, 0.0F, 5.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 1.0F);
		SparkBug.addChild(Body);
		setRotationAngle(Body, -0.4363F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 13).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 4.0F, 9.0F, -0.5F, false);

		WingRight = new ModelRenderer(this);
		WingRight.setRotationPoint(-2.0F, -2.0F, 0.0F);
		Body.addChild(WingRight);
		setRotationAngle(WingRight, 1.1345F, 0.0F, -0.5236F);
		WingRight.setTextureOffset(24, 0).addBox(-3.0F, 0.0F, 0.0F, 5.0F, 0.0F, 10.0F, 0.0F, false);

		WingLeft = new ModelRenderer(this);
		WingLeft.setRotationPoint(2.0F, -2.0F, 0.0F);
		Body.addChild(WingLeft);
		setRotationAngle(WingLeft, 1.1345F, 0.0F, 0.5236F);
		WingLeft.setTextureOffset(20, 20).addBox(-2.0F, 0.0F, 0.0F, 5.0F, 0.0F, 10.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(T  entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){

		this.WingRight.rotateAngleX = 1F;
		this.WingLeft.rotateAngleX = 1F;
		this.WingRight.rotateAngleY = 0.1F;
		this.WingLeft.rotateAngleY = 0.1F;
		this.Head.rotateAngleX = 0.0F;
		this.ArmRight.rotateAngleX = 0.0F;
		this.ArmLeft.rotateAngleX = 0.0F;
		this.Body.rotateAngleX = 0.6F;
		this.Body.rotationPointY = 0.0F;


		boolean flag = entity.isOnGround() && entity.getMotion().lengthSquared() < 1.0E-7D;
		if (flag) {
			this.WingRight.rotateAngleY = -0.2618F;
			this.WingRight.rotateAngleZ = 0.0F;
			this.WingLeft.rotateAngleX = 0.0F;
			this.WingLeft.rotateAngleY = 0.2618F;
			this.WingLeft.rotateAngleZ = 0.0F;
			this.ArmRight.rotateAngleX = 1F;
			this.ArmLeft.rotateAngleX = 1F;
			this.Body.rotateAngleX = 0.0F;

		} else {
			float f = ageInTicks * 2.1F;
			this.WingRight.rotateAngleY = 0.2F;
			this.WingRight.rotateAngleZ = MathHelper.cos(f) * (float)Math.PI * 0.15F;
			this.WingLeft.rotateAngleX = this.WingRight.rotateAngleX;
			this.WingLeft.rotateAngleY = this.WingRight.rotateAngleY;
			this.WingLeft.rotateAngleZ = -this.WingRight.rotateAngleZ;
			this.ArmRight.rotateAngleX = ((float)Math.PI / 3F);
			this.ArmLeft.rotateAngleX = ((float)Math.PI / 3F);

			this.Body.rotateAngleX = -0.6F;
			this.Body.rotateAngleY = 0.0F;
			this.Body.rotateAngleZ = 0.0F;
		}



		if (this.bodyPitch > 0.0F) {
			this.Body.rotateAngleX = ModelUtils.func_228283_a_(this.Body.rotateAngleX, 0.0F, this.bodyPitch);
		}

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		SparkBug.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}