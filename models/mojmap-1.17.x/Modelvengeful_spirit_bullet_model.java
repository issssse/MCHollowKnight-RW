// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelvengeful_spirit_bullet_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "vengeful_spirit_bullet_model"), "main");
	private final ModelPart Spirit;

	public Modelvengeful_spirit_bullet_model(ModelPart root) {
		this.Spirit = root.getChild("Spirit");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Spirit = partdefinition.addOrReplaceChild("Spirit",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, 7.0F, -3.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, 6.0F, -4.5F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(19, 14)
						.addBox(-3.0F, 4.0F, -5.0F, 6.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-2.0F, 3.0F, -4.0F, 4.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-2.0F, 4.0F, -5.25F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.0F, 4.0F, -5.25F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 16.0F, 0.0F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition cube_r1 = Spirit
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(21, 0).addBox(-1.0F, 1.0F, -2.0F, 1.0F, 2.0F, 11.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Spirit.render(poseStack, buffer, packedLight, packedOverlay);
	}
}